package tracts2atl.test;

import tracts2atl.MatchingTablesBuilder;

public class R2ML2RDM extends CaseStudy {

	public static void main(String[] argv) throws Exception {
		
		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/R2ML2RDM/R2ML2RDM.txt");
		int i = 1; for (String e: exprs){
			System.out.println("C"+i+": "+e);
			i++;
		}
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/R2ML2RDM/R2ML2RDMTypes.xmi",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/R2ML2RDM/r2ml.ecore",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/R2ML2RDM/rdm.ecore");
		t2a.build();
		t2a.print();
		t2a.applyThreashold(0.1);
		t2a.printReport(t2a.generateReport());
	}	
}
