package tracts2atl.test;

import tracts2atl.MatchingTablesBuilder;
import tracts2atl.MatchingTablesBuilder_Old;


public class Family2Person extends CaseStudy {

	public static void main(String[] argv) throws Exception{

		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Family2Person/F2P.txt");
		int i = 1;
		for (String e: exprs){
			System.out.println("C"+i+": "+e);
			i++;
		}
		
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Family2Person/Families2PersonsTypes.xmi",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Family2Person/Families.ecore",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Family2Person/Persons.ecore");
		t2a.build();
		t2a.print();
		t2a.applyThreashold(0.1);
		t2a.print();
		t2a.printReport(t2a.generateReport());
				
	}
	
}
