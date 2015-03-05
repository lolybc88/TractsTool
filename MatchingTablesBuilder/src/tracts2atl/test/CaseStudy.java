package tracts2atl.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class CaseStudy {

	
	protected static String[] getConstraints(String path) throws IOException {
		
		LinkedList<String> list = new LinkedList<String>();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String text = br.readLine();
		
		while (text!=null){
			if (!text.startsWith("--")){
				list.add(text);
			}
			text = br.readLine();
		}	
		br.close();
		fr.close();
		return list.toArray(new String[list.size()]);
	}
}
