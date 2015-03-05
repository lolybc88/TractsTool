package ruleTypeExtraction.files;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ruletypesmm.Rule;
import ruletypesmm.RuletypesmmPackage;
import ruletypesmm.Trafo;


public class SimilarityMatrix {
	
	String typesModel;
	String outFilePath;
	Double deviation;
	Double mean;
	
	/**
	 * Constructor.
	 *
	 */
	public SimilarityMatrix(String tm, String of){
		typesModel = tm;
		outFilePath = of;
	}
	
	public void main(){

		String modelPath = typesModel;
		
		
		RuletypesmmPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI
				.createURI(modelPath), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Trafo trafo = (Trafo) resource.getContents().get(0);
		
		List<List<String>> ruleTypes = new LinkedList<List<String>>();
		List<String> l = new LinkedList<String>();

		for (Rule r : trafo.getRules()){
			l = new LinkedList<String>();
			for (String f : r.getAllFootPrints()){
				l.add(f);				
			}
			ruleTypes.add(l);
		}
		
		
//		computeSimilarityTable(constraintTypes);
//		System.out.println("\n\n\n");
		computeSimilarityTable(ruleTypes);
		
	}
	
	public void computeSimilarityTable(List<List<String>> types){
		 
		double[][] table = new double[types.size()][types.size()];
		for (int i=0; i<types.size(); i++){
			List<String> l1 = types.get(i);
			for (int j=0; j<types.size(); j++){
				List<String> l2 = types.get(j);
				table[i][j] = similarity(l1, l2);
			}
		}
		print(table);
	}
	
	private void print(double[][] table) {
		//Variables for calculating mean and standar deviation
		Double addition = 0.0;
		Integer ocurrences = 0;
		try{
			PrintWriter writer = new PrintWriter(outFilePath, "UTF-8");
			for (int i=0; i<table.length; i++){
				for (int j=0; j<table.length; j++){
					if (i-j >0){ 
						addition += table[i][j];
						ocurrences += 1;
					}
					writer.print(Double.toString(table[i][j]).replace(".", ",")+";");
				}
				writer.print("\n");
			}
			mean = addition / ocurrences;
			writer.print("\n");
			writer.print("\n");
			writer.print("Mean: ; ;" + mean);
			writer.print("\n");
			//For calculating the standard deviation:
			addition = 0.0;
			for (int i=0; i<table.length; i++){
				for (int j=0; j<table.length; j++){
					if (i-j >0){ 
						addition += Math.pow(table[i][j] - mean,2);
					}
				}
			}
			deviation = Math.sqrt(addition/ocurrences);
			writer.print("Standard deviation: ; ;" + deviation);
			writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

	private static double similarity(List<String> l1, List<String> l2) {
		double n = 0;
		for(String s1 : l1){
			if (l2.contains(s1)){
				n++;
			}
		}
		return n / (union(l1, l2).size());
	}
	
	private static Set<String> union(List<String> types, List<String> types2) {
		Set<String> set = new HashSet<String>();
		for (String s : types){
			set.add(s);
		}
		for (String s : types2){
			set.add(s);
		}
		return set;	
	}
	
	public Double getMean(){
		return mean;
	}
	
	public Double getDeviation(){
		return deviation;
	}
	
}
