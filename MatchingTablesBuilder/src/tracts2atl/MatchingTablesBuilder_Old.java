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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import main.FootprintReader;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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

public class MatchingTablesBuilder_Old {

	List<List<String>> constraintTypes, ruleTypes;
	// List<Integer> inheritanceIntegers;
	// Map<String, Double> selfInformation;
	// private List<List<String>> constantsInConstraints;
	// private List<List<String>> constantsInRules;
	String srcMMPath, trgMMPath;
	double cc[][], rc[][], rcr[][];
	double inhWeight = 0.5;
	double threshold = 0.1;

	public MatchingTablesBuilder_Old(String[] constraints,
			String ruleTypesModel, String srcMMPath, String trgMMPath)
			throws Exception {

		this.srcMMPath = srcMMPath;
		this.trgMMPath = trgMMPath;

		String tempFolder = getClass().getClassLoader().getResource(".").getPath()+"temp";
		System.out.println(tempFolder);
		String useMMPath = joinMMs(srcMMPath, trgMMPath, tempFolder);

		ConstraintsTypeExtractor cte = new ConstraintsTypeExtractor(
				constraints, useMMPath);
		constraintTypes = cte.getConstraintTypes();
		System.out.println("\nConstraints: " + constraintTypes);

		String path = ruleTypesModel;
		Files.copy(new File(path).toPath(), 
				new File(tempFolder+"/ruleTypes.xmi").toPath(),
				StandardCopyOption.REPLACE_EXISTING);
		FootprintReader fr = new FootprintReader(
				tempFolder+"/ruleTypes.xmi");
		ruleTypes = fr.getFootprints();
		System.out.println("Rules: " + ruleTypes + "\n");
		
		cc = new double[constraintTypes.size()][ruleTypes.size()];
		rc = new double[constraintTypes.size()][ruleTypes.size()];
		rcr = new double[constraintTypes.size()][ruleTypes.size()];
		
		boolean types = true, features = true, inheritance = true, selfInformation = false;
		matchForConstraints(types, features, inheritance, selfInformation);
		matchForRules(types, features, inheritance, selfInformation);
		matchForConstraintsAndRules(types, features, inheritance, selfInformation);
		
		System.out.println("CC:"); print(cc);
		System.out.println("RC:"); print(rc);
		System.out.println("RCR:"); print(rcr);

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

		AddPrefixMM.transform("file:/" + pathSrcUseMMFile, "src_");
		AddPrefixMM.transform("file:/" + pathTrgUseMMFile, "trg_");
		new MergeUseMM().mergeUSEMM(pathSrcUseMMFile, pathTrgUseMMFile,
				"file:/" + pathSrcTrgMMUseFile);

		//The text file with the USE metamodel is stored in temp/MM.use 
		Use2Text runner2 = new Use2Text();
		runner2.loadModels("file:/" + pathSrcTrgMMUseFile);
		runner2.doUse2Text(new NullProgressMonitor());
		
		String pathSrcTrgMMUseFile_TXT = pathTempFolder + "/joinedMM.use";
		FileOperations.FileCopyAndDeleteSource("temp/MM.use",
				pathSrcTrgMMUseFile_TXT);

		File f = new File(pathSrcUseMMFile); f.delete();
		f = new File(pathTrgUseMMFile); f.delete();
		f = new File(pathSrcTrgMMUseFile); f.delete();
		
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

	public void matchForConstraints(boolean types, boolean features,
			boolean inheritance, boolean theoryInformation) throws Exception {

		if (types == false && features == false) {
			System.out
					.println("ERROR. At least one between types and features must be true.");
		} else {

			for (int i = 0; i < constraintTypes.size(); i++) {
				List<String> cList = constraintTypes.get(i);
				for (int j = 0; j < ruleTypes.size(); j++) {
					List<String> rList = ruleTypes.get(j);
					
					cc[i][j] =  getRelativeRatingForConstraints(i, j, cList, rList,
							srcMMPath, trgMMPath, types, features,
							inheritance, theoryInformation);

				}
			}
		}

		// Selection
		// Set<ConstraintRuleValue> solution = selection(threshold, ratings);
		// System.out.println("Solution C = " + solution);

	}

	public void matchForRules(boolean types, boolean features,
			boolean inheritance, boolean selfInformation) throws Exception {

		if (types == false && features == false) {
			System.out
					.println("ERROR. At least one between types and features must be true.");
		} else {

			for (int i = 0; i < constraintTypes.size(); i++) {
				List<String> cList = constraintTypes.get(i);
				for (int j = 0; j < ruleTypes.size(); j++) {
					List<String> rList = ruleTypes.get(j);
					rc[i][j] = getRelativeRatingForRules(i, j, cList, rList,
							srcMMPath, trgMMPath, types, features,
							inheritance, selfInformation);
				}
			}
		}

		// Selection
		// Set<ConstraintRuleValue> solution = selection(threshold, ratings);
		// System.out.println("Solution R = " + solution);

	}

	public void matchForConstraintsAndRules(boolean types, boolean features,
			boolean inheritance, boolean selfInformation) throws Exception {

		if (types == false && features == false) {
			System.out
					.println("ERROR. At least one between types and features must be true.");
		} else {

			for (int i = 0; i < constraintTypes.size(); i++) {
				List<String> cList = constraintTypes.get(i);
				for (int j = 0; j < ruleTypes.size(); j++) {
					List<String> rList = ruleTypes.get(j);
					rcr[i][j] =getRelativeRatingForConstraintsAndRules(i, j,
							cList, rList, srcMMPath, trgMMPath, types,
							features, inheritance, selfInformation);

				}
			}
		}

		// Selection
		// Set<ConstraintRuleValue> solution = selection(threshold, ratings);
		// System.out.println("Solution C&R = " + solution);

	}

	private void print(double[][] table) {
		for (int i = 0; i < constraintTypes.size(); i++) {
			for (int j = 0; j < ruleTypes.size(); j++) {

				if (table[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(String.valueOf(table[i][j]).replace('.',',')+ "\t");
				}
			}
			System.out.println();
		}

	}

	private double getRelativeRatingForConstraints(int constr, int rule,
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath, boolean types, boolean features,
			boolean inheritance, boolean selfInformation)
			throws Exception {
		double r = 0;
		// if (inheritance == false){
		// if (types == true && features == false){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfTypes(cTypes);
		// } else if (types == false && features == true){
		// r = getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfFeatures(cTypes);
		// } else if (types==true && features==true){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation) +
		// getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / cTypes.size();
		// }
		// }else{
		List<String> rTypesAux = addRuleInheritance(rTypes, rule);
		if (types == true && features == false) {
			r = getAbsoluteRatingForTypesWithInheritance(constr, rule, cTypes,
					rTypesAux, selfInformation);
			r = r / numOfTypes(cTypes);
		} else if (types == false && features == true) {
			r = getAbsoluteRatingForFeaturesWithInheritance(cTypes, rTypesAux,
					srcMMPath, trgMMPath, selfInformation);
			r = r / numOfFeatures(cTypes);
		} else if (types == true && features == true) {
			double r1 = getAbsoluteRatingForTypesWithInheritance(constr, rule,
					cTypes, rTypesAux, selfInformation);
			double r2 = getAbsoluteRatingForFeaturesWithInheritance(cTypes,
					rTypesAux, srcMMPath, trgMMPath, selfInformation);
			r = r1 + r2;
			r = r / cTypes.size();
		}
		// }

		return r;
	}

	private double numOfFeatures(Collection<String> cTypes) {
		int n = 0;
		for (String s : cTypes) {
			if (isFeature(s)) {
				n++;
			}
		}
		return n;
	}

	private double numOfTypes(Collection<String> cTypes) {
		return cTypes.size() - numOfFeatures(cTypes);
	}

	private double getRelativeRatingForRules(int constr, int rule,
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath, boolean types, boolean features,
			boolean inheritance, boolean selfInformation)
			throws Exception {
		double r = 0;
		// if (inheritance == false){
		// if (types == true && features == false){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfTypes(rTypes);
		// } else if (types == false && features == true){
		// r = getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfFeatures(rTypes);
		// } else if (types==true && features==true){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation) +
		// getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / rTypes.size();
		// }
		// }else{
		List<String> rTypesAux = addRuleInheritance(rTypes, rule);
		if (types == true && features == false) {
			r = getAbsoluteRatingForTypesWithInheritance(constr, rule, cTypes,
					rTypesAux, selfInformation);
			r = r / numOfTypes(rTypesAux);
		} else if (types == false && features == true) {
			r = getAbsoluteRatingForFeaturesWithInheritance(cTypes, rTypesAux,
					srcMMPath, trgMMPath, selfInformation);
			r = r / numOfFeatures(rTypesAux);
		} else if (types == true && features == true) {
			r = getAbsoluteRatingForTypesWithInheritance(constr, rule, cTypes,
					rTypesAux, selfInformation)
					+ getAbsoluteRatingForFeaturesWithInheritance(cTypes,
							rTypesAux, srcMMPath, trgMMPath, selfInformation);
			r = r / rTypesAux.size();
		}
		// }

		return r;
	}

	private double getRelativeRatingForConstraintsAndRules(int constr,
			int rule, List<String> cTypes, List<String> rTypes,
			String srcMMPath, String trgMMPath, boolean types,
			boolean features, boolean inheritance, boolean selfInformation) throws Exception {
		double r = 0;
		// if (inheritance == false){
		// if (types == true && features == false){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfTypes(union(rTypes, cTypes));
		// } else if (types == false && features == true){
		// r = getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / numOfFeatures(union(rTypes, cTypes));
		// } else if (types==true && features==true){
		// r = getAbsoluteRatingForTypesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation) +
		// getAbsoluteRatingForFeaturesWithoutInheritance(cTypes, rTypes,
		// srcMMPath, trgMMPath, selfInformation);
		// r = r / union(rTypes, cTypes).size();
		// }
		// }else{
		// List<String> rTypesAux = addRuleInheritance(rTypes, rule);
		if (types == true && features == false) {
			r = getAbsoluteRatingForTypesWithInheritance(constr, rule, cTypes,
					rTypes, selfInformation);
			r = r / numOfTypes(union(rTypes, cTypes));
		} else if (types == false && features == true) {
			r = getAbsoluteRatingForFeaturesWithInheritance(cTypes, rTypes,
					srcMMPath, trgMMPath, selfInformation);
			r = r / numOfFeatures(union(rTypes, cTypes));
		} else if (types == true && features == true) {
			r = getAbsoluteRatingForTypesWithInheritance(constr, rule, cTypes,
					rTypes, selfInformation)
					+ getAbsoluteRatingForFeaturesWithInheritance(cTypes,
							rTypes, srcMMPath, trgMMPath, selfInformation);
			r = r / union(rTypes, cTypes).size();
		}
		// }
		return r;
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

	private double getAbsoluteRatingForTypesWithoutInheritance(
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath, boolean selfInformation) {
		/**
		 * Without considering inheritance For features and types
		 */
		double r = 0;
		for (String s : cTypes) {
			if (rTypes.contains(s) && isType(s)) {
				if (selfInformation == true) {
					// r = r + matchWeightForTypes(numOfTypes(cTypes), s);
				} else {
					r++;
				}
			}
		}
		return r;
	}

	private double getAbsoluteRatingForFeaturesWithoutInheritance(
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath, boolean selfInformation) {
		/**
		 * Without considering inheritance For features and types
		 */
		double r = 0;
		for (String s : cTypes) {
			if (rTypes.contains(s) && isFeature(s)) {
				if (selfInformation == true) {
					// r = r + matchsWeightForFeatures(numOfFeatures(cTypes),
					// s);
				} else {
					r++;
				}
			}
		}
		return r;
	}

	// private double matchWeightForTypes(double numOfTypes, String s) {
	// double v;
	// if (numOfTypes > typeAverageInConstraints){
	// if (selfInformation.get(s) <= 0.25){
	// v = 0;
	// } else if (selfInformation.get(s)<1){
	// v = selfInformation.get(s)-0.25;
	// } else {
	// v = 1;
	// }
	// }else{
	// v = 1;
	// }
	// // System.out.println("SelfInfo "+ s + ": " + v);
	// return v;
	// }

	// private double matchWeightForFeatures(double numOfFeatures, String s) {
	// if (numOfFeatures > featureAverageInConstraints){
	// if (selfInformation.get(s) <= 0.25){
	// return 0;
	// } else if (selfInformation.get(s)<1){
	// return selfInformation.get(s)-0.25;
	// } else {
	// return 1;
	// }
	// }else{
	// return 1;
	// }
	// }

	private double getAbsoluteRatingForTypesWithInheritance(int constr,
			int rule, List<String> cTypes, List<String> rTypes,
			boolean selfInformation) throws Exception {
		/** Considering inheritance for types */

		double r = 0;
		List<String> cTypesAux = new LinkedList<String>(cTypes);
		List<String> rTypesAux = new LinkedList<String>(rTypes);

		List<String> removed = new LinkedList<String>();
		for (String s : cTypesAux) {
			if (rTypesAux.contains(s) && isType(s)) {
				// if (selfInformation == true){
				// r = r + matchWeightForTypes(numOfTypes(cTypesAux), s);
				// }else{
				r++;
				// }
				rTypesAux.remove(s);
				removed.add(s);
			}
		}

		cTypesAux.removeAll(removed);

		for (String s : cTypesAux) {

			if (isType(s)) { // Only types (not features)

				boolean isSuperType = false;
				String typeName;
				if (s.startsWith("src_") || s.startsWith("trg_")) {
					typeName = s.substring(4, s.length());
				} // Remove the prefix src_ or trg_
				else {
					typeName = s;
				}

				if (s.startsWith("src_")) { // superType from the source MM
					EClass clazz = getEClass4ClassName(typeName, srcMMPath);
					if (clazz != null) { // If it is null, It was not a Class,
											// it was an EEnum
						List<String> superTypes = getIntersectionTypes(rTypesAux,
								clazz.getEAllSuperTypes(), "src_");
						if (superTypes != null && superTypes.size() > 0) {
							// if (selfInformation == true){
							// r = r +
							// matchWeightForTypes(numOfTypes(cTypesAux),
							// s)*inheritanceWeight;
							// }else{
							r = r + rForSubOrSuperClasses(clazz, superTypes, "src_");
							// }
							rTypesAux.removeAll(superTypes);
							isSuperType = true;
						}
					}
				} else if (s.startsWith("trg_")) { // superType from the target
													// MM
					EClass clazz = getEClass4ClassName(typeName, trgMMPath);
					if (clazz != null) {
						List<String> superTypes = getIntersectionTypes(rTypesAux,
								clazz.getEAllSuperTypes(), "trg_");
						if (superTypes != null && superTypes.size() > 0) {
							// if (selfInformation == true){
							// r = r +
							// matchWeightForTypes(numOfTypes(cTypesAux),
							// s)*inheritanceWeight;
							// }else{
							r = r + rForSubOrSuperClasses(clazz, superTypes, "trg_");
							// }
							rTypesAux.removeAll(superTypes);
							isSuperType = true;
						}
					}
				}

				if (!isSuperType) {
					if (s.startsWith("src_")) { // subType from the source MM
						EClass clazz = getEClass4ClassName(typeName, srcMMPath);
						if (clazz != null) {
							List<String> subTypes = getIntersectionTypes(
									rTypesAux,
									getAllSubClasses(clazz, srcMMPath), "src_");
							if (subTypes != null && subTypes.size() > 0) {
								// if (selfInformation == true){
								// r = r +
								// matchWeightForTypes(numOfTypes(cTypesAux),
								// s)*inheritanceWeight;
								// }else{
								r = r + rForSubOrSuperClasses(clazz, subTypes, "src_");
								// }
								rTypesAux.removeAll(subTypes);
								isSuperType = true;
							}
						}
					} else if (s.startsWith("trg_")) { // superType from the
														// target MM
						EClass clazz = getEClass4ClassName(typeName, trgMMPath);
						if (clazz != null) {
							List<String> subTypes = getIntersectionTypes(
									rTypesAux,
									getAllSubClasses(clazz, trgMMPath), "trg_"); 
							if (subTypes != null && subTypes.size() > 0) {
								// if (selfInformation == true){
								// r = r +
								// matchWeightForTypes(numOfTypes(cTypesAux),
								// s)*inheritanceWeight;
								// }else{
								r = r + rForSubOrSuperClasses(clazz, subTypes, "trg_");
								// }
								rTypesAux.removeAll(subTypes);
								isSuperType = true;
							}
						}
					}
				}
			}
		}
		return r;
	}

	private double rForSubOrSuperClasses(EClass clazz, List<String> subOrSuperTypes, String prefix) throws Exception {
		double r = 0;
		for (String t : subOrSuperTypes){
			EClass superClazz;
			if (prefix.equals("src_")){
				superClazz = getEClass4ClassName(t, srcMMPath);
			} else {
				superClazz = getEClass4ClassName(t, trgMMPath);
			}
			if (superClazz != null) {
				r += inhWeight(clazz, superClazz);
			}
		}
		return r;
	}
		
	private double inhWeight (EClass clazz, EClass superClazz){
		double inhWeight = (1 + superClazz.getEAllAttributes().size()) / (1 + clazz.getEAllAttributes().size());
		if (inhWeight>1){ inhWeight = 1;}
		return inhWeight;
	}

	private List<String> addRuleInheritance(List<String> rTypes, int rule) {

		// List<String> rTypesAux = new LinkedList<>(rTypes);
		//
		// int superRule = inheritanceIntegers.get(rule);
		// if (superRule != -1){
		// while(superRule != -1){
		// List<String> aux = this.ruleTypes.get(superRule);
		// for (String s : aux){
		// if (!rTypesAux.contains(s)){
		// rTypesAux.add(s);
		// }
		// }
		// superRule = inheritanceIntegers.get(superRule);
		// }
		// }
		// return rTypesAux;

		return rTypes;
	}

	private double getAbsoluteRatingForFeaturesWithInheritance(
			List<String> cTypes, List<String> rTypes, String srcMMPath,
			String trgMMPath, boolean selfInformation)
			throws Exception {
		/**
		 * Considering inheritance for types
		 */

		double r = 0;
		List<String> cTypesAux = new LinkedList<String>(cTypes);
		List<String> rTypesAux = new LinkedList<String>(rTypes);

		List<String> removed = new LinkedList<String>();
		for (String s : cTypesAux) {
			if (rTypesAux.contains(s) && isFeature(s)) {
				if (selfInformation == true) {
					// r = r + matchWeightForFeatures(numOfFeatures(cTypes), s);
				} else {
					r++;
				}
				rTypesAux.remove(s);
				removed.add(s);
			}
		}

		cTypesAux.removeAll(removed);
		for (String s : cTypesAux) {
			if (isFeature(s)) {
				boolean isSuperFeature = false;
				String sType;
				if (s.startsWith("src_") || s.startsWith("trg_")) {
					sType = s.substring(4, s.indexOf("."));
				} else {
					sType = s.substring(0, s.indexOf("."));
				}

				String sFeatureName = s.substring(s.indexOf(".") + 1,
						s.length());
				if (s.startsWith("src_")) {
					List<String> superFeatures = getIntersectionTypes(rTypesAux,
							getEClass4ClassName(sType, srcMMPath)
									.getEAllSuperTypes(), sFeatureName); // ----->>>> WRONGGGG!!!!!
					if (superFeatures != null) {
						if (selfInformation == true) {
							// r = r +
							// matchWeightForFeatures(numOfFeatures(cTypes),
							// s)*inheritanceWeight;
						} else {
							r = r + inhWeight * superFeatures.size();
						}
						rTypesAux.removeAll(superFeatures);
						isSuperFeature = true;
					}
				} else if (s.startsWith("trg_")) {
					List<String> superFeatures = getIntersectionTypes(rTypesAux,
							getEClass4ClassName(sType, trgMMPath)
									.getEAllSuperTypes(), sFeatureName); // ----->>>> WRONGGGG!!!!!
					if (superFeatures != null) {
						if (selfInformation == true) {
							// r = r +
							// matchWeightForFeatures(numOfFeatures(cTypes),
							// s)*inheritanceWeight;
						} else {
							r = r + inhWeight * superFeatures.size();
						}
						rTypesAux.removeAll(superFeatures);
						isSuperFeature = true;
					}
				}

				if (!isSuperFeature) {
					if (sType.startsWith("src_")) { // subType from the source
													// MM
						List<String> subFeatures = getIntersectionTypes(
								rTypesAux,
								getAllSubClasses(
										getEClass4ClassName(sType, srcMMPath),
										srcMMPath), sFeatureName);
						if (subFeatures != null) {
							if (selfInformation == true) {
								// r = r +
								// matchWeightForFeatures(numOfFeatures(cTypes),
								// s)*inheritanceWeight;
							} else {
								r = r + inhWeight * subFeatures.size();
							}
							rTypesAux.removeAll(subFeatures);
						}
					} else if (sType.startsWith("trg_")) { // subType from the
															// targetMM
						List<String> subFeatures = getIntersectionTypes(
								rTypesAux,
								getAllSubClasses(
										getEClass4ClassName(sType, trgMMPath),
										trgMMPath), sFeatureName); 
						if (subFeatures != null) {
							if (selfInformation == true) {
								// r = r +
								// matchWeightForFeatures(numOfFeatures(cTypes),
								// s)*inheritanceWeight;
							} else {
								r = r + inhWeight * subFeatures.size();
							}
							rTypesAux.removeAll(subFeatures);
						}
					}
				}
			}
		}
		return r;
	}

	private boolean isType(String s) {
		/** if s is not a type, s is a feature */
		if (s.contains("."))
			return false;
		else
			return true;
		// return !s.contains(".");
	}

	private boolean isFeature(String s) {
		/** if s is not a feature, s is a type */
		if (s.contains("."))
			return true;
		else
			return false;
		// return !isType(s);
	}

	private String containsAtLeastOne(List<String> types,
			List<EClass> allSuperTypes, String sFeatureName, String prefix) {
		if (allSuperTypes == null) {
			return null;
		} else {
			for (EClass ec : allSuperTypes) {
				if (types.contains(prefix + ec.getName() + "." + sFeatureName)) {
					return ec.getName() + "." + sFeatureName;
				}
			}
		}
		return null;
	}

	private List<String> getIntersectionTypes(List<String> types,
			List<EClass> allSuperTypes, String prefix) {
		List<String> superTypes = new LinkedList<String>();

		if (allSuperTypes == null) {
			return null;
		} else {
			for (EClass ec : allSuperTypes) {
				if (types.contains(prefix + ec.getName())) {
					superTypes.add(ec.getName());
				}
			}
			return superTypes;
		}
	}

	public EClass getEClass4ClassName(String className, String metamodelPath)
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

	private List<String> names(EList<EClass> superTypes) {
		List<String> l = new LinkedList<String>();
		if (superTypes == null || superTypes.isEmpty()) {

		} else {
			for (EClass c : superTypes) {
				l.add(c.getName());
			}
		}
		return l;
	}
	
	public void generateCSV(String path) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer = new PrintWriter(path, "UTF-8");
		writer.print("CC\n");
		for (int i=0; i<constraintTypes.size(); i++){
			for (int j=0; j<ruleTypes.size(); j++){
				if (cc[i][j]>=threshold && rcr[i][j]>=threshold){
					writer.print(String.valueOf(cc[i][j]).replace(".", ",")+";");
				} else {
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.print("\n");
		writer.print("\n");
		
		writer.print("RC\n");
		for (int i=0; i<constraintTypes.size(); i++){
			for (int j=0; j<ruleTypes.size(); j++){
				if (rc[i][j]>=threshold && rcr[i][j]>=threshold){
					writer.print(String.valueOf(rc[i][j]).replace(".", ",")+";");
				} else {
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.print("\n");
		writer.print("\n");
		
		writer.print("RCR\n");
		for (int i=0; i<constraintTypes.size(); i++){
			for (int j=0; j<ruleTypes.size(); j++){
				if (rcr[i][j]>=threshold){
					writer.print(String.valueOf(rcr[i][j]).replace(".", ",")+";");
				} else{
					writer.print("0;");
				}
			}
			writer.print("\n");
		}
		writer.close();
	}

}
