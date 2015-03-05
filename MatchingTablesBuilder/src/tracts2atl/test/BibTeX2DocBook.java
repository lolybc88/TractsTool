package tracts2atl.test;

import tracts2atl.MatchingTablesBuilder;
import tracts2atl.MatchingTablesBuilder_Old;


public class BibTeX2DocBook extends CaseStudy {

	public static void main(String[] argv) throws Exception{
		
									
		String [] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Bibtex2Docbook/Bibtex2Docbook.txt");
		
//		String aux = "src_Unpublished.allInstances->forAll(b |	b.authors_Author_AuthoredEntry->iterate(e; str : String = '' | str + e.author + '') = '')";
//		String [] exprs = {aux};
		
		for (String e: exprs){
			System.out.println(e);
		}
		
		MatchingTablesBuilder t2a = new MatchingTablesBuilder(exprs,
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Bibtex2Docbook/BibTeX2DocBookTypes.xmi", 
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Bibtex2Docbook/BibTeX.ecore", 
				"C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Bibtex2Docbook/DocBook.ecore");
		t2a.build();
		t2a.print();
		t2a.applyThreashold(0.1);
		t2a.printReport(t2a.generateReport());
	}
}
