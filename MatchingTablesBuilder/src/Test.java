import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import tracts2atl.MatchingTablesBuilder;
import tracts2atl.MatchingTablesBuilder_Old;

public class Test {

	public static void main(String[] args) throws Exception{
		
//		String[] exprs = getConstraints("C:/Users/Atenea/Dropbox/PhD/MatchingTables/ws1/MatchingTablesBuilder/Examples/Family2Person/F2P.txt");
		String[] exprs = getConstraints("C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/C/C.txt");
		
		MatchingTablesBuilder t2a;
//		t2a = new MatchingTablesBuilder(exprs, "C:/Users/Atenea/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/Family2Person/Families2PersonsTypes.xmi", "C:/Users/Atenea/Dropbox/PhD/MatchingTables/ws1/MatchingTablesBuilder/Examples/Family2Person/Families.ecore", "C:/Users/Atenea/Dropbox/PhD/MatchingTables/ws1/MatchingTablesBuilder/Examples/Family2Person/Persons.ecore");
		t2a = new MatchingTablesBuilder(exprs, "C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/C/CElements.xmi", "C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/C/C.ecore", "C:/Users/Loli/Dropbox/PhD/MatchingTables/ws/MatchingTablesBuilder/Examples/C/C.ecore");
//		String pathCSV = "C:/Users/Atenea/Desktop/F2P.csv";
		String pathCSV = "C:/Users/Loli/Desktop/C.csv";		
		t2a.generateCSV(pathCSV);

	}
	
	private static String[] getConstraints(String path) throws IOException {
		
		LinkedList<String> list = new LinkedList<String>();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String text = br.readLine();
		
		while (text!=null){
			list.add(text);
			text = br.readLine();
		}	
		br.close();
		fr.close();
		return list.toArray(new String[list.size()]);
	}
}
