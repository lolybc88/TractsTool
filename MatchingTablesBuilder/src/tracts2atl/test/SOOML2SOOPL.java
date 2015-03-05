package tracts2atl.test;

import org.tzi.use.main.shell.NoSystemException;

import tracts2atl.MatchingTablesBuilder;
import tracts2atl.MatchingTablesBuilder_Old;

public class SOOML2SOOPL extends CaseStudy {

	public static void main(String[] argv) throws Exception{
							
		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/SOOML2SOOPL/SOOML2SOOPL.txt");
		int i = 1; for (String e: exprs){
			System.out.println("C"+i+": "+e);
			i++;
		}
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/SOOML2SOOPL/SOOML2SOOPL_1Types.xmi",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/SOOML2SOOPL/SOOML.ecore",
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/SOOML2SOOPL/SOOPL.ecore");
		t2a.build();
		t2a.print();
		t2a.applyThreashold(0.1);
		t2a.printReport(t2a.generateReport());
	}
}
