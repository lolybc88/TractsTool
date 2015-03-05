package transformations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class FileOperations {
	public static String procedures(String path){
		String procedures="", linea;
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			linea = br.readLine();
			while(linea!=null){
				if (linea.contains("procedure")){
					linea = linea.replace("procedure ", "");
					procedures += linea + "#\n"; 
				}
				linea=br.readLine();
			}
			br.close();
			//System.out.println(procedures);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return procedures;
	}
	
	public static String generateCMD(String console, String random, String out){
		String procedures="", linea;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(out+"/cmd.cmd"));
			StringTokenizer st = new StringTokenizer(console,"\n");
			while(st.hasMoreTokens()){
				linea = st.nextToken();
				int sp = linea.indexOf("#")+1;
				String cant = linea.substring(sp);
				String func = linea.substring(0,sp-1);
				if (func.contains("count:Integer")){
					func = func.replace("count:Integer", cant);
					bw.write("gen start -r "+ random + " " + out + "/procedure.assl " + func);
					//bw.write("gen start "+ out + "/procedure.assl " + func);
					bw.newLine();
					bw.write("gen result");
					bw.newLine();
					bw.write("gen result accept");
					bw.newLine();
				}else{
					func = func.replace("()", "("+cant+")");
					bw.write("gen start "+out+"/procedure.assl "+func);
					bw.newLine();
					bw.write("gen result");
					bw.newLine();
					bw.write("gen result accept");
					bw.newLine();
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return procedures;
	}
	
	public static void generatePRO(String model, String out){
		String linea;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(out+"/model.pro"));
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
	
	public static void preProcessAbstractClassMetaModel(String metamodel, String out){
		try {
			LinkedList<String> abstractClass = new LinkedList<String>();
			BufferedReader br = new BufferedReader(new FileReader(metamodel));
			String linea = br.readLine();
			while(linea!=null){
				if(linea.contains("abstract=\"true\"") && linea.contains("<eClassifiers xsi:type=\"ecore:EClass\"")){
					StringTokenizer st = new StringTokenizer(linea);
					while(st.hasMoreTokens()){
						String token = st.nextToken();
						if(token.contains("name")){
							token = token.substring(token.indexOf('\"')+1);
							token = token.substring(0, token.length()-1);
							abstractClass.add(token);
							//System.out.println(token);
						}
					}
				}
				linea = br.readLine();
			}
			br.close();	
			
			br = new BufferedReader(new FileReader(out+"/metamodel.use"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(out+"/finalMetamodel.use"));
			linea=br.readLine();
			
			while(linea!=null){
				if(linea.startsWith("class")){
					StringTokenizer st = new StringTokenizer(linea);
					st.nextToken();
					String clase = st.nextToken();
					if (abstractClass.contains(clase)){
						linea = linea.replace("class", "abstract class");
					}
				}
				bw.write(linea);
				bw.newLine();
				linea=br.readLine();
			}
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void preProcessAbstractClassProcedure(String metamodel, String out){
		try {
			LinkedList<String> abstractClass = new LinkedList<String>();
			BufferedReader br = new BufferedReader(new FileReader(metamodel));
			String linea = br.readLine();
			while(linea!=null){
				if(linea.contains("abstract=\"true\"") && linea.contains("<eClassifiers xsi:type=\"ecore:EClass\"")){
					StringTokenizer st = new StringTokenizer(linea);
					while(st.hasMoreTokens()){
						String token = st.nextToken();
						if(token.contains("name")){
							token = token.substring(token.indexOf('\"')+1);
							token = token.substring(0, token.length()-1);
							abstractClass.add(token);
							//System.out.println(token);
						}
					}
				}
				linea = br.readLine();
			}
			br.close();	
			
			br = new BufferedReader(new FileReader(out+"/procedure.assl"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(out+"/finalProcedure.assl"));
			linea=br.readLine();
			
			while(linea!=null){
				if(linea.startsWith("procedure")){
					String clase = linea;
					clase = clase.replace("procedure generate", "");
					clase = clase.substring(0,clase.indexOf("("));
					if (abstractClass.contains(clase)){
						while(!linea.equals("end; ")){
							linea = br.readLine();
						}
						linea=br.readLine();
					}
				}
				bw.write(linea);
				bw.newLine();
				linea=br.readLine();
			}
			
			br.close();
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void FileCopyAndDeleteSource(String sourceFile, String destinationFile) { 
		try {
			File inFile = new File(sourceFile);
			File outFile = new File(destinationFile);
 
			FileInputStream in = new FileInputStream(inFile);
			FileOutputStream out = new FileOutputStream(outFile);
 
			int c;
			while( (c = in.read() ) != -1)
				out.write(c);
 
			in.close();
			out.close();
			inFile.delete();
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void fileCopyInOrder(String sourceFile, String destinationFile) { 
		try {
			BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile));
			String linea = br.readLine();
			while(linea != null){
				if (linea.startsWith("!create")){
					bw.write(linea);
					bw.newLine();
				}
				linea = br.readLine();
			}
			br.close();
			bw.close();
			
			br = new BufferedReader(new FileReader(sourceFile));
			bw = new BufferedWriter(new FileWriter(destinationFile,true));
			linea = br.readLine();
			while(linea != null){
				if (linea.startsWith("!set")){
					bw.write(linea);
					bw.newLine();
				}
				linea = br.readLine();
			}
			br.close();
			bw.close();
			
			br = new BufferedReader(new FileReader(sourceFile));
			bw = new BufferedWriter(new FileWriter(destinationFile,true));
			linea = br.readLine();
			while(linea != null){
				if (linea.startsWith("!insert")){
					bw.write(linea);
					bw.newLine();
				}
				linea = br.readLine();
			}
			br.close();
			bw.close();
			
			
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static String noBlancosInic(String cadena){
		while (cadena.startsWith(" ")){
			cadena = cadena.substring(1); 
		}
		return cadena;
	}
	
	public static void txt2pro(String file){
		try {
			String cadena;			
			BufferedReader bf = new BufferedReader(new FileReader(file));
			
			String sFichero = file.substring(0, file.indexOf("."))+".pro";
			//File fichero = new File(sFichero);
			BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
			
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			bw.write("<pro:Model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:pro=\"http://pro/1.0\">\n");
			
			while ((cadena = bf.readLine())!=null) {
				cadena = noBlancosInic(cadena);
				cadena = cadena.replace(".", " . ");
				cadena = cadena.replace("('", " ('");
				cadena = cadena.replace("!@", "!@ ");
				StringTokenizer st = new StringTokenizer(cadena);
				if (cadena.startsWith("!create")){
					int i=0;
					String c1="", c2="";
					while (st.hasMoreTokens()){
						if (i==1){
							c1 = st.nextToken();
						}else if (i==3){
							c2 = st.nextToken();
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println("<creates object=\""+c1+"\" type=\""+c2+"\"/>");
					//<creates object="FemaleP1" type="FemaleP"/>
					bw.write("<creates object=\""+c1+"\" type=\""+c2+"\"/>\n");
				}
				if (cadena.startsWith("!set")){
					int i=0;
					String c1="", c2="", c3="";
					while (st.hasMoreTokens()){
						if (i==1){
							c1 = st.nextToken();
						}else if (i==3){
							c2 = st.nextToken();
						}else if (i==5){
							boolean encontrado = false;
							while (st.hasMoreTokens()&&!encontrado){
								String aux=st.nextToken();
								if (aux.contains("'") && aux.indexOf("'")>0){
									encontrado=true;
								}
								if (aux.length()>0){
									c3 = c3 +" "+ aux;
								}
								c3=noBlancosInic(c3);
								c3 = c3.replace("'", "");
							}
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println("<sets object=\""+c1+"\" attribute=\""+c2+"\" value=\""+c3+"\"/>");
					//<sets object="FemaleP1" attribute="age" value="48"/>
					bw.write("<sets object=\""+c1+"\" attribute=\""+c2+"\" value=\""+c3+"\"/>\n");
				}
				if (cadena.startsWith("!insert")&&!cadena.contains("@")){
					int i=0;
					String c1="", c2="", ob1="", ob2="";
					while (st.hasMoreTokens()){
						if (i==1){
							c1 = st.nextToken();
							c1 = c1.substring(1, c1.length()-1);
							ob1= c1.substring(0, c1.indexOf(","));
							ob2= c1.substring(c1.indexOf(",")+1); 
						}else if (i==3){
							c2 = st.nextToken();
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println(ob1);
					//System.out.println(ob2);
					//System.out.println("<inserts obj1=\""+ob1+"\" obj2=\""+ob2+"\" rel=\""+ c2 +"\"/>");
					bw.write("<inserts obj1=\""+ob1+"\" obj2=\""+ob2+"\" rel=\""+ c2 +"\"/>\n");
					//<inserts obj1="FemaleP1" obj2="MaleP1" rel="Marriage"/>
				}
				if (cadena.startsWith("!new")){
					int i=0;
					String tipo="", ob="";
					while (st.hasMoreTokens()){
						if (i==1){
							tipo = st.nextToken();
						}else if (i==2){
							ob = st.nextToken();
							ob = ob.substring(2, ob.length()-2);
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println("<creates object=\""+c1+"\" type=\""+c2+"\"/>");
					//<creates object="FemaleP1" type="FemaleP"/>
					bw.write("<creates object=\""+ob+"\" type=\""+tipo+"\"/>\n");
				}
				if (cadena.startsWith("!@")){
					int i=0;
					String c1="", c2="", c3="";
					while (st.hasMoreTokens()){
						if (i==1){
							c1 = st.nextToken();
						}else if (i==3){
							c2 = st.nextToken();
						}else if (i==5){
							boolean encontrado = false;
							while (st.hasMoreTokens()&&!encontrado){
								String aux=st.nextToken();
								if (aux.contains("'") && aux.indexOf("'")>0){
									encontrado=true;
								}
								if (aux.length()>0){
									c3 = c3 +" "+ aux;
								}
								c3=noBlancosInic(c3);
								c3 = c3.replace("'", "");
							}
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println("<sets object=\""+c1+"\" attribute=\""+c2+"\" value=\""+c3+"\"/>");
					//<sets object="FemaleP1" attribute="age" value="48"/>
					bw.write("<sets object=\""+c1+"\" attribute=\""+c2+"\" value=\""+c3+"\"/>\n");
				}
				if (cadena.startsWith("!insert")&&cadena.contains("@")){
					int i=0;
					String c1="", c2="", ob1="", ob2="";
					while (st.hasMoreTokens()){
						if (i==1){
							c1 = st.nextToken();
							c1 = c1.substring(1, c1.length()-1);
							ob1= c1.substring(0, c1.indexOf(","));
							ob1=ob1.substring(1);
							ob2= c1.substring(c1.indexOf(",")+1);
							ob2=ob2.substring(1);
						}else if (i==3){
							c2 = st.nextToken();
						}else{
							st.nextToken();
						}
						i++;
					}
					//System.out.println(ob1);
					//System.out.println(ob2);
					//System.out.println("<inserts obj1=\""+ob1+"\" obj2=\""+ob2+"\" rel=\""+ c2 +"\"/>");
					bw.write("<inserts obj1=\""+ob1+"\" obj2=\""+ob2+"\" rel=\""+ c2 +"\"/>\n");
					//<inserts obj1="FemaleP1" obj2="MaleP1" rel="Marriage"/>
				}
			}
			bw.write("</pro:Model>\n");
			bf.close();
			bw.close();
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
