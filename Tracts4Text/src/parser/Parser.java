package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import text.Folder;
import text.Line;
import text.Project;
import text.TextFactory;

public class Parser {


	//static final File dir = new File("test_cases/test1/File.ext");
	//static final File dir = new File("test_cases/test2/");
//	static final File dir = new File("test_cases/testHotel_Java/");
	
	static Vector<File> allElements = new Vector<File>();
	static HashMap<File,text.File> fileMap = new HashMap<File, text.File>();
	static HashMap<File,text.Folder> folderMap = new HashMap<File, text.Folder>();
		
	
	public static void main(String[] args) throws IOException {
		Parser p = new Parser();
		p.parse("C:/Users/Atenea/Desktop/testHotel_Java", "C:/Users/Atenea/Desktop/out.xmi");
	}

	public void parse(String pathDir, String pathOutFile) throws IOException{

		File dir = new File(pathDir);
		
		if (dir.isDirectory()) {
			loadFiles(dir);
		}
		allElements.add(dir);

		TextFactory factory = TextFactory.eINSTANCE;
		Project project = factory.createProject();

		Iterator<File> allElementsIter = allElements.iterator();
		while (allElementsIter.hasNext()) {
			File f = allElementsIter.next();
			if (f.isDirectory()) {
				Folder folder = factory.createFolder();
				folder.setName(f.getName());
				folder.setAbsoluteName(f.getAbsolutePath());
				folderMap.put(f, folder);
			} else {
				text.File file = factory.createFile();
				file.setName(f.getName().substring(0,
						f.getName().lastIndexOf(".")));
				file.setAbsoluteName(f.getAbsolutePath());
				file.setExtension(f.getName().substring(
						f.getName().lastIndexOf(".") + 1, f.getName().length()));
				fileMap.put(f, file);
				String content = FileUtils.readFileToString(f, "UTF-8");
				String[] lines = content.split("\n", -1);
				for (int i = 0; i < lines.length; i++) {
					Line line = factory.createLine();
					if (lines[i].length()>0){
						line.setText(StringEscapeUtils.escapeXml(lines[i].substring(0, lines[i].length()-1)));
					} else {
						line.setText(StringEscapeUtils.escapeXml(lines[i]));
					}
					file.getLines().add(line);
				}
			}
		}

		Iterator<File> allElementsIter2 = allElements.iterator();
		while (allElementsIter2.hasNext()) {
			File f = allElementsIter2.next();
			if (f.isDirectory()) {
				Folder folder = folderMap.get(f);
				if (f.getAbsolutePath().equals(dir.getAbsolutePath())) {
					project.setRoot(folder);
				} else {
					folder.setContainer(folderMap.get(f.getParentFile()));
				}
			} else {
				text.File file = fileMap.get(f);
				if (f.getAbsolutePath().equals(dir.getAbsolutePath())) {
					project.setRoot(file);
				} else {
					file.setContainer(folderMap.get(f.getParentFile()));
				}
			}
		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("text", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("output/textAsModel.text"));
		// 
		resource.getContents().add(project);

		try {
			resource.save(Collections.EMPTY_MAP);
			copyFile("output/textAsModel.text", pathOutFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done!");
		    
	}
	
	public static void copyFile(String sourceFile, String targetFile) throws IOException {
			File inFile = new File(sourceFile);
			File outFile = new File(targetFile);

			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1){
				out.write(c);
			}
			in.close();
			out.close();
	}
	
	private static void loadFiles(File dir) throws FileNotFoundException {		
		File[] files = dir.listFiles();
		if (files != null){
			for (int i=0; i<files.length; i++){
				File file = files[i];
				allElements.add(file);
				if(file.isDirectory()){
					loadFiles(file);
				}
			}
		}
	}

}
