package behaviour;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.tracts.tool.use2text.files.Use2Text;

import parser.Parser;
import transformations.AddPrefixMM;
import transformations.EMF2USE_M1;
import transformations.EMF2USE_M2;
import transformations.FileOperations;
import transformations.MergeUseMM;
import transformations.USE2EMF_M1;
import ui.CtrllView;
import ui.Window;
import exceptions.TransformationException;
import exceptions.UseCommandException;

public class Model {

	private static final String TRG = "trg_";
	private static final String SRC = "src_";

	public static void main(String[] args) {
		try{
			runEcoreExample();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runEcoreExample() throws PackageNotFoundException, InterruptedException, IOException, UseCommandException, TransformationException, ATLCoreException{
		
		Window w = new Window();
		CtrllView cv = new CtrllView(w);
		w.controller(cv);
		
//		String path = "C:\\Users\\Atenea\\Desktop\\F2P/";
////		
////		String pathATLTransformation = path + "Ecore2Use.atl";
//		String pathATLTransformation = path + "sampleUSE.xmi";
//		String pathSrcEcoreMMFile ="http://www.eclipse.org/emf/2002/Ecore";
////		String pathSrcEcoreMMFile = path + "Ecore.ecore";
//		String pathTrgEcoreMMFile = path + "Use.ecore";
//		String pathTracts = path + "Tracts_Ecore2Use.ocl";
//		String pathExecUseFile = "C:/Repos/AMT12/MODELS2013/tooling/use-3.0.0_extended/bin/use.bat";
//		String pathAsslFile = path + "EcoreModel.ecore";
//		String invocationAsslFile = "";		
//		String pathTempFolder = path + "temp";
		
//		String pathATLTransformation = path + "Families2Persons.atl";
//		String pathSrcEcoreMMFile = path + "Families.ecore";
//		String pathTrgEcoreMMFile = path + "Persons.ecore";
//		String pathTracts = path + "FamiliesToPersons.ocl";
//		String pathExecUseFile = "C:/Repos/AMT12/MODELS2013/tooling/use-3.0.0_extended/bin/use.bat"; //"C:\\use-3.0.0\\bin/use.bat";
//		String invocationAsslFile = "mkSource2(3, 6, 3, 3)"; //"mkSource(4, 16, 4, 4, 4, 4)";
//		String pathAsslFile = path + "FamiliesToPersons.assl"; //"familyModel.xmi";
//		String pathTempFolder = path + "temp";
//		
//		check(pathATLTransformation, pathSrcEcoreMMFile, pathTrgEcoreMMFile,
//				pathTracts, pathExecUseFile, pathAsslFile, invocationAsslFile, pathTempFolder);
		
		
	}

	public static void transformEcoreMMToUseTextRepresentation(String umlEcore, String umlUse) throws IOException, ATLCoreException {
		transformEcoreMMToUseMM(umlEcore, umlUse);
		Use2Text runner2 = new Use2Text();
		runner2.loadModels("file:/"+ umlUse);
		runner2.doUse2Text(new NullProgressMonitor());
		FileOperations.FileCopyAndDeleteSource("temp/MM.use", umlUse);
	}
	
	public static String check(String pathATLTransformation, String pathSrcEcoreMMFile, String pathTrgEcoreMMFile,
			String pathTracts, String pathExecUseFile, String pathAsslFile, String invocationAsslFile, 
			String pathTempFolder) throws InterruptedException, IOException, UseCommandException, TransformationException, PackageNotFoundException, ATLCoreException {

			long tiempoInicio = System.currentTimeMillis();
		
			deleteTemporaryFiles(pathTempFolder);
			
			/* Metamodel operations */
			String pathSrcUseMMFile = pathTempFolder + "/srcMM.use";
			transformEcoreMMToUseMM(pathSrcEcoreMMFile, pathSrcUseMMFile);
			
			//System.gc(); Thread.sleep(500);
			
			String pathTrgUseMMFile = pathTempFolder + "/trgMM.use";
			transformEcoreMMToUseMM(pathTrgEcoreMMFile, pathTrgUseMMFile);
			
			//System.gc(); Thread.sleep(500);
			
			String pathSrcTrgMMUseFile = pathTempFolder + "/joinedMM.use";
			
			AddPrefixMM.transform("file:/"+pathSrcUseMMFile, SRC);
			AddPrefixMM.transform("file:/"+pathTrgUseMMFile, TRG);
			new MergeUseMM().mergeUSEMM(pathSrcUseMMFile, pathTrgUseMMFile, "file:/"+pathSrcTrgMMUseFile);
			
			Use2Text runner2 = new Use2Text();
			runner2.loadModels("file:/"+pathSrcTrgMMUseFile);
			runner2.doUse2Text(new NullProgressMonitor());
			
			FileOperations.FileCopyAndDeleteSource("temp/MM.use", pathSrcTrgMMUseFile);
			
			String pathUseMMWithTract = pathTempFolder+ "/joinedMMWithTracts.use";
			addTractsToUseMMFile(pathSrcTrgMMUseFile, pathTracts,pathTempFolder, pathUseMMWithTract);
			
			
			/* Model operations */
			String pathSrcUseMFile = pathTempFolder + "/srcUseMFile.pro";
			String pathSrcEcoreMFile = pathTempFolder + "/srcEcoreMFile.ecore";
			if (pathAsslFile.endsWith(".assl")){
				generateUseModelFromAsslFile(pathAsslFile, invocationAsslFile,
					pathExecUseFile, pathSrcTrgMMUseFile, pathTempFolder,
					pathSrcUseMFile);
				
				//System.gc(); Thread.sleep(500);
				
				transformUseMToEcoreM(pathSrcEcoreMMFile, pathSrcUseMFile, pathSrcEcoreMFile, pathTempFolder, SRC);
			}else if (pathAsslFile.endsWith(".xmi") || pathAsslFile.endsWith(".ecore")){
				copyFile(pathAsslFile, pathSrcEcoreMFile);
			}
			
			//System.gc(); Thread.sleep(500);
			
			String pathTrgEcoreMFile = pathTempFolder + "/trgEcoreMFile.ecore";
			if (pathATLTransformation.endsWith(".atl")){
				transformSrcToTarget(pathSrcEcoreMMFile, pathSrcEcoreMFile,
						pathTrgEcoreMMFile, pathTrgEcoreMFile,
						pathATLTransformation, pathTempFolder);
			} else {
				copyFile(pathATLTransformation, pathTrgEcoreMFile);
			}

			if (pathAsslFile.endsWith(".xmi") || pathAsslFile.endsWith(".ecore")){
				transformEcoreMToUseM(pathSrcEcoreMMFile, pathSrcEcoreMFile,
						pathSrcUseMFile, SRC);
			}
			String pathTrgUseMFile = pathTempFolder + "/trgUseMFile.pro";
			transformEcoreMToUseM(pathTrgEcoreMMFile, pathTrgEcoreMFile,
					pathTrgUseMFile, TRG);
			
			//System.gc(); Thread.sleep(500);
								
			String pathSrcTrgMUseFile = pathTempFolder + "/joinedM.use";
			joinMsAndAddCheck(pathSrcUseMFile, pathTrgUseMFile, pathSrcTrgMUseFile);

			String pathResultFile = pathTempFolder + "/result.txt";
			checkConstraints(pathExecUseFile, pathUseMMWithTract,
					pathSrcTrgMUseFile, pathResultFile);
			
			String result = readResultFromFile(pathResultFile);
			deleteTemporaryFiles(pathTempFolder);
			long totalTiempo = System.currentTimeMillis() - tiempoInicio;
			System.out.println("El tiempo de cómputo ha sido: " + totalTiempo / 1000 + " seg");
			return result;
	}

	private static String readResultFromFile(String pathResultFile) throws IOException {
		String result = "";
		FileReader inFile = new FileReader(pathResultFile);
		BufferedReader br = new BufferedReader(inFile);
		
		String line = br.readLine();
		while(line != null && !line.equals("checking structure...")){
			line = br.readLine();
		}
		if (line.equals("checking structure...")){
			while(line != null){
				result += line + "\n";
				line = br.readLine();
			}
			br.close();
			inFile.close();
			return result;
		}
		else{
			br.close();
			inFile.close();
			return "ERROR: During the checking constraints process";
		}
	}

	public static void copyFile(String sourceFile, String targetFile) {
		try {
			File inFile = new File(sourceFile);
			File outFile = new File(targetFile);

			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);

			int c;
			while( (c = in.read() ) != -1)
				out.write(c);

			in.close();
			out.close();
		} catch(IOException e) {
			System.err.println("ERROR. Copying files.");
		}
	}

	private static void deleteTemporaryFiles(String pathTempFolder) {
		File dir = new File(pathTempFolder);
		if (dir.exists()){
			File[] files =  dir.listFiles();
			for (int x=0;x<files.length;x++){
				files[x].delete();
			}		
		}
	}
	
	private static void transformUseMToEcoreM(String pathEcoreMMFile, String pathUseMFile, 
			String pathEcoreMFile, String pathTemp, String prefix) throws InterruptedException, IOException {
		USE2EMF_M1.use2emf(pathEcoreMMFile, pathEcoreMFile, pathUseMFile, prefix);		
	}

	public static void transformEcoreMToUseM(String pathEcoreMMFile, String pathEcoreMFile, 
			String pathUseMFile, String prefix) throws IOException, PackageNotFoundException {
		
		EMF2USE_M1 emf2use = new EMF2USE_M1();
		emf2use.emf2use(pathEcoreMMFile, pathEcoreMFile, pathUseMFile, prefix);
		
	}
	
	private static void transformEcoreMMToUseMM(String pathEcoreMMFile, String pathUseMMFile) throws IOException, ATLCoreException {
		EMF2USE_M2 emf2use = new EMF2USE_M2();
		emf2use.ecore2use_M2(pathEcoreMMFile, pathUseMMFile);
	}

	private static void transformSrcToTarget(String pathSrcEcoreMMFile,
			String pathSrcEcoreMFile, String pathTrgEcoreMMFile,
			String pathTrgEcoreMFile, String pathATLTransformation, String pathTempFolder)
			throws InterruptedException, TransformationException, MalformedURLException, IOException, ATLCoreException {
		
		String asmFile = pathTempFolder+"/transformationToTest.asm";
		
		String srcMMname = extractMMName(pathSrcEcoreMMFile);
		String trgMMname = extractMMName(pathTrgEcoreMMFile);
		
		ATLTransformtionRunner tr = new ATLTransformtionRunner();
		tr.compileTransformation(pathATLTransformation, asmFile);
		
		if (pathSrcEcoreMMFile.contains("http://") || pathSrcEcoreMMFile.contains("www.")){
			tr.runTransformation(pathSrcEcoreMMFile, srcMMname,
					trgMMname, "file:/"+pathTrgEcoreMMFile, 
					"file:/"+pathSrcEcoreMFile, "file:/"+pathTrgEcoreMFile, asmFile);
		}else{
			tr.runTransformation("file:/"+pathSrcEcoreMMFile, srcMMname,
					trgMMname, "file:/"+pathTrgEcoreMMFile, 
					"file:/"+pathSrcEcoreMFile, "file:/"+pathTrgEcoreMFile, asmFile);
		}
	}

	private static String extractMMName(String pathSrcEcoreMMFile) {
		String srcMMname = "";
		if (pathSrcEcoreMMFile.contains("http://") || pathSrcEcoreMMFile.contains("www.")){
			srcMMname = pathSrcEcoreMMFile.substring(pathSrcEcoreMMFile.lastIndexOf("/")+1);
		} else{
			srcMMname = pathSrcEcoreMMFile.substring(pathSrcEcoreMMFile.lastIndexOf("\\")+1, pathSrcEcoreMMFile.lastIndexOf("."));
			if (srcMMname.contains("/")){
				srcMMname = srcMMname.substring(srcMMname.lastIndexOf("/")+1);
			}
		}
		return srcMMname;
	}

	private static String getOutput(String pathResultFile) throws IOException, InterruptedException {
		
		String result = "";
		
		FileReader fRSrc = new FileReader(pathResultFile);
		BufferedReader bRSrc = new BufferedReader(fRSrc);
		
		String line = bRSrc.readLine();
		while(!line.equals("checking structure...")){
			line = bRSrc.readLine();
		}
		while(line != null){
			result += line + "\n";
			line = bRSrc.readLine();
		}
		
		bRSrc.close();
		fRSrc.close();
		return result;
	}

	private static void joinMsAndAddCheck(String pathSrcUseMFile, String pathTrgUseMFile,
			String pathSrcTrgMUseFile) throws IOException {
		FileWriter fW = new FileWriter(pathSrcTrgMUseFile);
		BufferedWriter bW = new BufferedWriter(fW);
		
		FileReader fRSrc = new FileReader(pathSrcUseMFile);
		BufferedReader bRSrc = new BufferedReader(fRSrc);
		
		FileReader fRTrg = new FileReader(pathTrgUseMFile);
		BufferedReader bRTrg = new BufferedReader(fRTrg);
		
		String line = bRSrc.readLine();
		while (line != null){
			bW.write(line);
			bW.newLine();
			line = bRSrc.readLine();
		}
		line = bRTrg.readLine();
		while (line != null){
			bW.write(line);
			bW.newLine();
			line = bRTrg.readLine();
		}
		bW.write("check -d"); //Para que cuando se ejecute en use compruebe las restricciones
		
		bRSrc.close();
		bRTrg.close();
		bW.close();
		fRSrc.close();
		fRTrg.close();
		fW.close();
	}
	
	private static void joinMMs(String pathSrcMMUseFile,
			String pathTrgMMUseFile, String pathSrcTrgMMUseFile) throws IOException{
		FileWriter fW = new FileWriter(pathSrcTrgMMUseFile);
		BufferedWriter bW = new BufferedWriter(fW);
		
		FileReader fRSrc = new FileReader(pathSrcMMUseFile);
		BufferedReader bRSrc = new BufferedReader(fRSrc);
		
		FileReader fRTrg = new FileReader(pathTrgMMUseFile);
		BufferedReader bRTrg = new BufferedReader(fRTrg);
		
		bW.write("model JoinedModel\n");
		
		String line = bRSrc.readLine();
		while (!line.trim().startsWith("model ")){
			line = bRSrc.readLine();
		}
		line = bRSrc.readLine(); //linea en que pone model <Nombre>, la descarto leyendo la siguiente
		while (line != null){
			bW.write(line);
			bW.newLine();
			line = bRSrc.readLine();
		}
		
		line = bRTrg.readLine();
		while (!line.trim().startsWith("model ")){
			line = bRTrg.readLine();
		}
		line = bRTrg.readLine(); //linea en que pone model <Nombre>, la descarto leyendo la siguiente
		while (line != null){
			bW.write(line);
			bW.newLine();
			line = bRTrg.readLine();
		}
		
		bRSrc.close();
		bRTrg.close();
		bW.close();
		fRSrc.close();
		fRTrg.close();
		fW.close();
	}

	private static void checkConstraints(String pathUseFile,
		String pathUseMMWithTract, String pathUseModelFile, String pathResult) throws IOException, UseCommandException, InterruptedException {
		
		String comando = pathUseFile + " " + pathUseMMWithTract + " " +  pathUseModelFile + " -nogui";
		System.out.println(comando);
		Process proc = Runtime.getRuntime().exec(comando);
		
		Thread.sleep(500);
		
		BufferedReader brStdOut = new BufferedReader(new InputStreamReader(proc.getInputStream())); 
		BufferedReader brStdErr = new BufferedReader(new InputStreamReader(proc.getErrorStream())); 
		String str = "";
		
		if (proc.getErrorStream().available()<=0){ //No hay error
			str = brStdOut.readLine();
		}else{ //error o warning
			str = brStdErr.readLine();
			while (str.contains("Warning: ")){
				str = brStdErr.readLine(); 
			}
			if (proc.getErrorStream().available()<=0){ //No hay error
				
			}else{
				throw new UseCommandException("USE error message: "+str);
			}
		}		
		
		FileWriter fW = new FileWriter(pathResult);
		BufferedWriter bW = new BufferedWriter(fW);
		while (!str.startsWith("checked ") && !str.endsWith(" failures.")){
			if (str.startsWith(pathUseMMWithTract+":")){ //Hay error
				throw new UseCommandException(str);
			}
			System.out.println(str);
			bW.write(str);
			bW.newLine();
			str = brStdOut.readLine();
		} 
		bW.write(str + "\n");
		bW.close();
		fW.close();
		
		brStdOut.close(); 
		brStdErr.close();

	}

	private static void addTractsToUseMMFile(String pathMMUseFile, String pathTracts,
			String pathTempFolder, String pathOutputFile) throws IOException {
		
		FileReader fR1 = new FileReader(pathMMUseFile);
		BufferedReader bR1 = new BufferedReader(fR1);
		
		FileReader fR2 = new FileReader(pathTracts);
		BufferedReader bR2 = new BufferedReader(fR2);
		
		FileWriter fW = new FileWriter(pathOutputFile);
		BufferedWriter bW = new BufferedWriter(fW);
		
		String line = bR1.readLine();
		while (line != null){
			bW.newLine();
			bW.write(line);
			line = bR1.readLine();
		}
		
		bW.newLine();
		bW.write("constraints");
		bW.newLine();
		
		line = bR2.readLine();
		while (line != null){
			bW.newLine();
			bW.write(line);
			line = bR2.readLine();
		}
		
		bR1.close();
		fR1.close();
		bR2.close();
		fR2.close();
		bW.close();
		fW.close();		
		
	}

	private static void generateUseModelFromAsslFile(String pathAsslFile,
			String invocationAsslFile, String pathUseFile,
			String pathMMUseFile, String pathTempFolder, String pathOutputFile)
			throws IOException, UseCommandException, InterruptedException {
		
		String nomCmdFile = "cmdFile.cmd";
		String pathCmdFile = pathTempFolder+"/"+nomCmdFile;
		createCmdFile(pathCmdFile, pathAsslFile, invocationAsslFile);
		
		String comando = "\"" + pathUseFile + "\" \"" + pathMMUseFile + "\" \"" +  pathCmdFile + "\" " + "-nogui";
		System.out.println(comando);
		Process proc = Runtime.getRuntime().exec(comando);
		
		Thread.sleep(2000);
		
		BufferedReader brStdOut = new BufferedReader(new InputStreamReader(proc.getInputStream())); 
		BufferedReader brStdErr = new BufferedReader(new InputStreamReader(proc.getErrorStream())); 
		String str = "";
		String model="";
		
		int caracteresErr = proc.getErrorStream().available();
		if (proc.getErrorStream().available()<=0){ //No hay error
			str = brStdOut.readLine();
		}else{ //Hay error
			str = brStdErr.readLine();
			while (str.contains("Warning: ")){
				str = brStdErr.readLine(); 
			}
			if (proc.getErrorStream().available()<=0){ //No hay error
				
			}else{
				throw new UseCommandException("USE error message: "+str);
			}
		}
		
		while (!str.equals(nomCmdFile+"> ")){ //El fichero .cmd no puede contener líneas en blanco sino esta linea aparece antes del final también
			if (str.startsWith(pathAsslFile+":")){
				//Hay error
				throw new UseCommandException(str);
			}else if(str.contains("Result: No valid state found.")){
				throw new UseCommandException("USE cannot generate the model from de .assl file.");
			}
				
			model += str + "\n";
			str = brStdOut.readLine();
		}
		System.out.println ("MODELO:\n"+model+"\nFIN_MODELO");
		brStdOut.close(); 
		brStdErr.close();
		
		generateModelFile(model, pathOutputFile);

	}

	private static void generateModelFile(String model, String path){
		String linea;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			StringTokenizer st = new StringTokenizer(model,"\n");
			while(st.hasMoreTokens()){
				linea = st.nextToken();
				if (linea.startsWith("!new") || linea.startsWith("!@") || linea.startsWith("!insert")){
					bw.write(linea);
					bw.newLine();
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createCmdFile(String pathCmdFile, String pathAssl, 
			String invocationAssl) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(pathCmdFile));
		bw.write("gen start "+ pathAssl + " " + invocationAssl);
		bw.newLine();
		bw.write("gen result");
		bw.newLine();
		bw.write("gen result accept");
		bw.close();
	}

	public void inject(String pathRepositoryFolder, String pathInjectedModel) throws IOException  {
		
			Parser p = new Parser();
			p.parse(pathRepositoryFolder, pathInjectedModel);	
		
		
	}
}
