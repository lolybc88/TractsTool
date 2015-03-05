package tracts2atl.test;

import tracts2atl.MatchingTablesBuilder;
import tracts2atl.MatchingTablesBuilder_Old;


public class CPL2SPL extends CaseStudy {

	public static void main(String[] argv) throws Exception{

		
		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/CPL2SPL/CPL2SPL.txt");
		int i = 1;
		for (String e: exprs){
			System.out.println(e);
			i++;
		}
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/CPL2SPL/CPL2SPLTypes.xmi",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/CPL2SPL/CPL.ecore",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/CPL2SPL/SPL.ecore");
		t2a.build();
		t2a.applyThreashold(0.1);
		t2a.print();
		t2a.printReport(t2a.generateReport());
				
	}

}
