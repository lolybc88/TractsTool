package tracts2atl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.MathContext;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CyclicBarrier;

import main.FootprintReader;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.tracts.tool.use2text.files.Use2Text;
import org.tzi.use.main.shell.NoSystemException;

import transformations.AddPrefixMM;
import transformations.FileOperations;
import transformations.MergeUseMM;
import behaviour.Model;

public class MatchingTablesBuilder {

	List<List<String>> constraintElements, ruleElements;
	// List<Integer> inheritanceIntegers;
	// Map<String, Double> selfInformation;
	// private List<List<String>> constantsInConstraints;
	// private List<List<String>> constantsInRules;
	String srcMMPath, trgMMPath;
	double cc[][], rc[][], rcr[][];
	double inhWeight = 0.5;
	double threshold = 0.1;

	final String SRC = "src_";
	final String TRG = "trg_";

	public MatchingTablesBuilder(String[] constraints,
			String ruleTypesModel, String srcMMPath, String trgMMPath)
			throws Exception {

		this.srcMMPath = srcMMPath;
		this.trgMMPath = trgMMPath;

		String tempFolder = getClass().getClassLoader().getResource(".")
				.getPath()
				+ "temp";
		System.out.println(tempFolder);
		String useMMPath = joinMMs(srcMMPath, trgMMPath, tempFolder);

		ConstraintsTypeExtractor cte = new ConstraintsTypeExtractor(
				constraints, useMMPath);
		constraintElements = cte.getConstraintTypes();
		System.out.println("\nConstraints: " + constraintElements);

		String path = ruleTypesModel;
		Files.copy(new File(path).toPath(), new File(tempFolder
				+ "/ruleTypes.xmi").toPath(),
				StandardCopyOption.REPLACE_EXISTING);
		FootprintReader fr = new FootprintReader(tempFolder + "/ruleTypes.xmi");
		ruleElements = fr.getFootprints();
		System.out.println("Rules: " + ruleElements + "\n");

		cc = new double[constraintElements.size()][ruleElements.size()];
		rc = new double[constraintElements.size()][ruleElements.size()];
		rcr = new double[constraintElements.size()][ruleElements.size()];

		

	}
	
	public int numConstraints(){
		return constraintElements.size();
	}
	
	public int numRules(){
		return ruleElements.size();
	}
	
	public void build() throws Exception{
		matchForConstraints();
		matchForRules();
		matchForConstraintsAndRules();
	}
	
	public void print(){
		System.out.println("CC:");
		print(cc);
		System.out.println("RC:");
		print(rc);
		System.out.println("RCR:");
		print(rcr);
	}

	private String joinMMs(String pathSrcEcoreMMFile,
			String pathTrgEcoreMMFile, String pathTempFolder)
			throws ATLCoreException, IOException {

		/* Metamodel operations */
		String pathSrcUseMMFile = pathTempFolder + "/srcMM.xmi";
		Model.transformEcoreMMToUseMM(pathSrcEcoreMMFile, pathSrcUseMMFile);

		String pathTrgUseMMFile = pathTempFolder + "/trgMM.xmi";
		Model.transformEcoreMMToUseMM(pathTrgEcoreMMFile, pathTrgUseMMFile);

		// This is the xmi file
		String pathSrcTrgMMUseFile = pathTempFolder + "/joinedMM.xmi";

		AddPrefixMM.transform("file:/" + pathSrcUseMMFile, SRC);
		AddPrefixMM.transform("file:/" + pathTrgUseMMFile, TRG);
		new MergeUseMM().mergeUSEMM(pathSrcUseMMFile, pathTrgUseMMFile,
				"file:/" + pathSrcTrgMMUseFile);

		// The text file with the USE metamodel is stored in temp/MM.use
		Use2Text runner2 = new Use2Text();
		runner2.loadModels("file:/" + pathSrcTrgMMUseFile);
		runner2.doUse2Text(new NullProgressMonitor());

		String pathSrcTrgMMUseFile_TXT = pathTempFolder + "/joinedMM.use";
		FileOperations.FileCopyAndDeleteSource("temp/MM.use",
				pathSrcTrgMMUseFile_TXT);

		File f = new File(pathSrcUseMMFile);
		f.delete();
		f = new File(pathTrgUseMMFile);
		f.delete();
		f = new File(pathSrcTrgMMUseFile);
		f.delete();

		return pathSrcTrgMMUseFile_TXT;
	}

	public Resource getResourceFromPath(String path) {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		// Factory fuer Resourcen
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();

		Resource metamodel = resSet.getResource(URI.createURI("file:" + path),
				true);
		// EPackage ep0 = (EPackage) metamodel.getContents().get(0);

		return metamodel;
	}

	public void matchForConstraints() throws Exception {

		for (int i = 0; i < constraintElements.size(); i++) {
			List<String> cList = constraintElements.get(i);
			for (int j = 0; j < ruleElements.size(); j++) {
				List<String> rList = ruleElements.get(j);

				cc[i][j] = getRelativeRatingForConstraints(cList, rList,
						srcMMPath, trgMMPath);
			}
		}
	}

	public void matchForRules() throws Exception {
		for (int i = 0; i < constraintElements.size(); i++) {
			List<String> cList = constraintElements.get(i);
			for (int j = 0; j < ruleElements.size(); j++) {
				List<String> rList = ruleElements.get(j);
				rc[i][j] = getRelativeRatingForRules(i, j, cList, rList);
			}
		}
	}

	public void matchForConstraintsAndRules() throws Exception {
		for (int i = 0; i < constraintElements.size(); i++) {
			List<String> cList = constraintElements.get(i);
			for (int j = 0; j < ruleElements.size(); j++) {
				List<String> rList = ruleElements.get(j);
				rcr[i][j] = getRelativeRatingForConstraintsAndRules(i, j,
						cList, rList, srcMMPath, trgMMPath);
			}
		}
	}

	private void print(double[][] table) {
		for (int i = 0; i < constraintElements.size(); i++) {
			for (int j = 0; j < ruleElements.size(); j++) {

				if (table[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(String.valueOf(table[i][j]).replace('.',
							',')
							+ "\t");
				}
			}
			System.out.println();
		}

	}

	private double getRelativeRatingForConstraints(
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath) throws Exception {
		
		double r = getAbsoluteRating(cTypes, rTypes);
		r = r / cTypes.size();
		return r;
	}

	private double getRelativeRatingForRules(int constr, int rule,
			List<String> cTypes, List<String> rTypes) throws Exception {
		
		double r = getAbsoluteRating(cTypes, rTypes);
		r = r / rTypes.size();
		return r;
	}

	private double getRelativeRatingForConstraintsAndRules(int constr,
			int rule, List<String> cTypes, List<String> rTypes,
			String srcMMPath, String trgMMPath) throws Exception {
		
		double r = getAbsoluteRating(cTypes, rTypes);
		r = r / union(rTypes, cTypes).size();
		return r;
	}

	private double getAbsoluteRating(List<String> cElems, List<String> rElems) throws Exception {
		
		double r = 0;
		
		// We don't want to update the original collections so we create a copy. Furthermore, Java doesn't allow to iterate over a collection and inside the for to remove elements
		List<String> cElemsAux = new LinkedList<String>(cElems);
		List<String> rElemsAux = new LinkedList<String>(rElems);
		
		// Elements (types and features) existing in both sets -> direct match
		for (String e : cElems){
			if (rElemsAux.contains(e)){
				r++;
				cElemsAux.remove(e);
				rElemsAux.remove(e);
			}
		}
		
		// Elements related by inheritance -> indirect match
		r = r + ratingForIndirectMatches(cElemsAux, rElemsAux);	
		
		return r;
	}

	private double ratingForIndirectMatches(List<String> cElems, List<String> rElems) throws Exception {
		/** It is assumed that between the input collections there are no direct matches */	
		double r = 0;
		
		List<String> cElemsAux = new LinkedList<String>(cElems);
		List<String> rElemsAux = new LinkedList<String>(rElems);
		for (String e : cElems){
			
			EClass clazz;
			List<EClass> subSuperTypes;
			if (isClass(e)){
				if (fromSRC(e)) {
					clazz = getEClass4Name(e.substring(SRC.length()), srcMMPath);
					subSuperTypes = getAllSubAndSuperTypes(clazz, srcMMPath);
				} else {
					clazz = getEClass4Name(e.substring(TRG.length()), trgMMPath);
					subSuperTypes = getAllSubAndSuperTypes(clazz, trgMMPath);
				}
			} else { // e is a feature
				if (fromSRC(e)) {
					String className = e
							.substring(SRC.length(), e.indexOf("."));
					clazz = getEClass4Name(className, srcMMPath);
					subSuperTypes = getAllSubAndSuperTypes(clazz, srcMMPath);
				} else {
					clazz = getEClass4Name(
							e.substring(TRG.length(), e.indexOf(".")),
							trgMMPath);
					subSuperTypes = getAllSubAndSuperTypes(clazz, trgMMPath);
				}
			}
			
			if (subSuperTypes != null){
				for (int i=0; i<subSuperTypes.size(); i++){ //sub and super elements of clazz (clazz belonging to the constraint set)
					if (isClass(e) && fromSRC(e)) {
						r = r + aux(cElemsAux, rElemsAux, subSuperTypes, SRC, "");
					} else if (isClass(e) && !fromSRC(e)) {
						r = r + aux(cElemsAux, rElemsAux, subSuperTypes, TRG, "");
					} else if (!isClass(e) && fromSRC(e)) {
						String featureName = e.substring(e.indexOf(".") + 1, e.length());
						r = r + aux(cElemsAux, rElemsAux, subSuperTypes, SRC, "."+featureName);
					} else {
						String featureName = e.substring(e.indexOf(".") + 1, e.length());
						r = r + aux(cElemsAux, rElemsAux, subSuperTypes, TRG, "."+featureName);
					}				
				}
			}
		}
		return r;
	}

	private double aux(List<String> cElemsAux, List<String> rElemsAux,
			List<EClass> subSuperTypes, String prefix, String featureName) {
		double w = 0;
		
		EClass type = null;
		int t=0; boolean found1=false;
		while (!found1 && t<subSuperTypes.size()){
			if (cElemsAux.contains(prefix+subSuperTypes.get(t).getName()+featureName)){
				found1 = true;
				type = subSuperTypes.get(t); 
			}
			t++;
		}
		if (found1){
			int k=0; boolean found=false;
			while (!found && k<subSuperTypes.size()){
				String elem = prefix+subSuperTypes.get(k).getName()+featureName;
				if (rElemsAux.contains(elem)){
					found = true;
					w = weight(type, subSuperTypes.get(k));
					cElemsAux.remove(prefix+type.getName()+featureName);
					rElemsAux.remove(prefix+subSuperTypes.get(k).getName()+featureName);
				}
				k++;
			}
		}
		return w;
	}
	
	private double weight(EClass c1, EClass c2) {
		/** It is assumed that between c1 and c2 there is a inheritance relationship */
		
		double w = 0;
		
		int numFeaturesC1 = c1.getEAllAttributes().size();
		int numFeaturesC2 = c2.getEAllAttributes().size();
		
		if (numFeaturesC1 > numFeaturesC2){ // c1 is a subClass of c2
				w = ((double)numFeaturesC2) / ((double)numFeaturesC1);
		} else if (numFeaturesC1 < numFeaturesC2){
				w = ((double)numFeaturesC1) / ((double)numFeaturesC2);
		} else { // numFeaturesC1 == numFeaturesC2
			if (numFeaturesC1 == 0){
				w = 0;
			} else {
				w = 1;
			}
		}
		return w;
	}

	private List<EClass> getAllSubAndSuperTypes(EClass clazz, String mmPath) {
		/** 
		 * Return an ordered list. In the index 0 there is the more specific type and in the higher index the more general type
		 */
		
		List<EClass> classes = new LinkedList<>();
		
		if (clazz==null) {
			return null;
		} else {
			
			List<EClass> subclClasses = putInOrder(getAllSubClasses(clazz, mmPath));
			classes.addAll(subclClasses);
			
			classes.add(clazz);
			
			List<EClass> superClasses = clazz.getEAllSuperTypes(); //The first element is the more general type
			classes.addAll(reverse(superClasses));
			
			return classes;
		}
	}

	private List<EClass> reverse(List<EClass> superClasses) {
		List<EClass> newList = new LinkedList<EClass>();
		for(int i=superClasses.size()-1; i>=0; i--){
			newList.add(superClasses.get(i));
		}
		return newList;
	}

	private boolean isClass(String e) {
		return !e.contains(".");
	}

	private boolean fromSRC(String e) {
		if (e.startsWith(SRC)){
			return true;
		} else {
			return false;
		}
	}

	private Set<String> union(List<String> types, List<String> types2) {
		Set<String> set = new HashSet<String>();
		for (String s : types) {
			set.add(s);
		}
		for (String s : types2) {
			set.add(s);
		}
		return set;
	}

	public EClass getEClass4Name(String className, String metamodelPath)
			throws Exception {
		Resource res = getResourceFromPath(metamodelPath);

		for (Iterator<EObject> it = res.getAllContents(); it.hasNext();) {
			EObject object = it.next();
			if (object instanceof EClass) {
				EClass clazz = (EClass) object;
				if (clazz.getName().equals(className)) {
					return clazz;
				}
			} else if (object instanceof EEnum) {
				return null;
			}
		}
		throw new Exception(className + " not found in the metamodel "
				+ metamodelPath); // return null;
	}

	public List<EClass> getAllSubClasses(EClass clazz, String metamodelPath) {
		Resource res = getResourceFromPath(metamodelPath);

		List<EClass> subclasses = new LinkedList<EClass>();
		for (Iterator<EObject> it = res.getAllContents(); it.hasNext();) {
			EObject object = it.next();
			if (object instanceof EClass) {
				EClass cl = (EClass) object;
				if (names(cl.getEAllSuperTypes()).contains(clazz.getName())) {
					subclasses.add(cl);
				}
			}
		}
		return subclasses;
	}

	private List<EClass> putInOrder(List<EClass> subclasses) {
		/**
		 * in order from the more specific to the more generic
		 */
		List<EClass> orderedSubClasses = new LinkedList<EClass>();
		if (subclasses.size()!=0){
			EClass c =	subclasses.get(0); 
			int numSuperClasses = subclasses.get(0).getEAllSuperTypes().size();
			int numIterationes = subclasses.size(); 
			for (int k=0; k<numIterationes; k++){
				int numIt2 = subclasses.size();
				for (int it2=0; it2<numIt2; it2++){
						EClass e = subclasses.get(it2);
						if (e.getEAllSuperTypes().size() > numSuperClasses){
							c = e;
							numSuperClasses = e.getEAllSuperTypes().size();
						}
				}
				orderedSubClasses.add(c);
				subclasses.remove(c);
				if (subclasses.size()>0){ // otherwise this is the last iteration and we're done
					numSuperClasses = 0;
					c = subclasses.get(0);
				}
			}
		}
		return orderedSubClasses;
	}

	private List<String> names(EList<EClass> superTypes) {
		List<String> l = new LinkedList<String>();
		if (superTypes != null && !superTypes.isEmpty()) {
			for (EClass c : superTypes) {
				l.add(c.getName());
			}
		}
		return l;
	}

	public void generateCSV(String path) throws FileNotFoundException,
			UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter(path, "UTF-8");
		writer.print("CC\n");
		for (int i = 0; i < constraintElements.size(); i++) {
			for (int j = 0; j < ruleElements.size(); j++) {
				if (cc[i][j] >= threshold && rcr[i][j] >= threshold) {
					writer.print(String.valueOf(cc[i][j]).replace(".", ",") + ";");
				} else {
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.print("\n");
		writer.print("\n");

		writer.print("RC\n");
		for (int i = 0; i < constraintElements.size(); i++) {
			for (int j = 0; j < ruleElements.size(); j++) {
				if (rc[i][j] >= threshold && rcr[i][j] >= threshold) {
					writer.print(String.valueOf(rc[i][j]).replace(".", ",")
							+ ";");
				} else {
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.print("\n");
		writer.print("\n");

		writer.print("RCR\n");
		for (int i = 0; i < constraintElements.size(); i++) {
			for (int j = 0; j < ruleElements.size(); j++) {
				if (rcr[i][j] >= threshold) {
					writer.print(String.valueOf(rcr[i][j]).replace(".", ",") + ";");
				} else {
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.close();
	}
	
	public int[][] generateReport() {
		int[][] report = new int[constraintElements.size()][ruleElements.size()];
		for (int i=0; i<constraintElements.size(); i++){
			int[] array = generateReportForConstraint(i);
			report[i] = array;
		}
		return report;
	}
	
	public void printReport(int[][] report) {
		for (int i=0; i<constraintElements.size(); i++){
			System.out.print("C"+(i+1)+": ");
			for (int j=0; j<ruleElements.size(); j++){
				if (report[i][j]!=-1){
					if (j==(report[0].length-1) || report[i][j+1]==-1){
						System.out.print("R"+(report[i][j]+1));
					} else {
						System.out.print("R"+(report[i][j]+1)+", ");
					}
				}
			}
			System.out.print("\n");
		}
	}

	private int[] generateReportForConstraint(int i) {
		double[] rowCopy = copy(cc[i]);
		int[] reportConstraintI = new int[rowCopy.length];
		for (int j=0; j<rowCopy.length; j++){
			int index = getIndexOfHigherValue(rowCopy, i);
			reportConstraintI[j] = index;
			if (index != -1){
				rowCopy[index] = 0;
			}
		}
		return reportConstraintI;
	}
	
	private double[] copy(double[] ds) {
		double[] copy = new double[ds.length];
		for(int i=0; i<ds.length; i++){
			copy[i] = ds[i];
		}
		return copy;
	}

	private int getIndexOfHigherValue(double[] rowCopy, int rowIndex){
		double higherValue = 0;
		int higherIndex = 0;
		if (allZero(rowCopy)){
			higherIndex = -1;
		} else {
			for (int i=0; i<ruleElements.size(); i++){
				
					if (rowCopy[i]>higherValue){
						higherValue = rowCopy[i]; 
						higherIndex = i;
					} else if (rowCopy[i]!=0 && rowCopy[i]==higherValue){
						if (rcr[rowIndex][i] > rcr[rowIndex][higherIndex]){
							higherValue = cc[rowIndex][i]; 
							higherIndex = i;
						}
					}
			}
			
		}
		return higherIndex;
	}

	private boolean allZero(double[] rowCopy) {
		boolean allZero = true;
		int i=0;
		while (i<rowCopy.length && allZero){
			if (rowCopy[i]!=0){
				allZero = false;
			}
			i++;
		}
		return allZero;
	}

	public void applyThreashold(double threshold){
		if (threshold<0 || threshold>1){
			System.out.println("Invalid threshold. It must be a value between 0 and 1 both inclusive.");
		} else {
			for (int i = 0; i < constraintElements.size(); i++) {
				for (int j = 0; j < ruleElements.size(); j++) {
	
					if (rcr[i][j] < threshold) {
						rcr[i][j] = 0;
						cc[i][j] = 0;
						rc[i][j] = 0;
					}
				}
			}
		}
	}

}
