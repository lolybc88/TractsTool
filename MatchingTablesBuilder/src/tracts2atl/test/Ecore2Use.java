package tracts2atl.test;

import tracts2atl.MatchingTablesBuilder;


public class Ecore2Use extends CaseStudy {

	public static void main(String[] argv) throws Exception{

		
		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Ecore2USE/Ecore2Use.txt");
		int i = 1;
		for (String e: exprs){
			System.out.println("C"+i+": "+e);
			i++;
		}
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Ecore2USE/Ecore2UseTypes.xmi",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/metamodels/Ecore.ecore",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Ecore2USE/USE.ecore");
		t2a.build();
		t2a.print();
		t2a.applyThreashold(0.1);
		t2a.print();
		t2a.printReport(t2a.generateReport());
				
	}

}
