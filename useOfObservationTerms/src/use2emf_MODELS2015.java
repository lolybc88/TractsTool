import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;

import behaviour.ATLTransformtionRunner;
import pro.CreateG;
import pro.InsertG;
import pro.ProPackage;
import pro.SetG;
import transformations.EMF2USE_M1;


public class use2emf_MODELS2015 {

	public static void main(String[] args) throws IOException, ATLCoreException {
		
		String path = "C:/Users/Atenea/Dropbox/PhD/wsMartin/";
		String pathTransfo = path + "bite2dobo/bite2dobo.atl";
		String pathAsm = path + "useOfObservationTerms/auxFiles/bite2dobo.asm";
		String pathEcoreSrcMMFile = path + "useOfObservationTerms/BibTeX.ecore";
		String pathEcoreTrgMMFile = path + "bite2dobo/DocBook.ecore";
		
		ATLTransformtionRunner.compileTransformation(pathTransfo, pathAsm);
		
		for (int n=1; n<=8; n++){
		
			System.out.println(n);
				
			String pathSoilMFile = path + "useOfObservationTerms/inFiles/prop2_obs-term-SOL"+n+".soil";
			String pathSoilMFile2 = path + "useOfObservationTerms/auxFiles/prop2_obs-term-SOL"+n+"-Preprocessed.soil";
			String pathProMFile = path + "useOfObservationTerms/auxFiles/prop2_obs-term-SOL"+n+"-pro.xmi";
			String pathXMIMFile = path + "useOfObservationTerms/auxFiles/prop2_obs-term-SOL"+n+".xmi";
			String pathXMIMFileOut = pathXMIMFile+"out.xmi";
			String pathUseMFileOut = path + "useOfObservationTerms/outFiles/prop2_obs-term-SOL"+n+".use";
			
			preprocessBibTeXSoilFile(pathSoilMFile, pathSoilMFile2);
			
			ProPackage.eINSTANCE.eClass();
		    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		    Map<String, Object> m = reg.getExtensionToFactoryMap();
		    m.put("*", new XMIResourceFactoryImpl());
			
			txt2pro(pathSoilMFile2, pathProMFile);
			pro2xmi(pathProMFile, pathXMIMFile, pathEcoreSrcMMFile);
					
			ATLTransformtionRunner.runTransformation("file:/"+pathEcoreSrcMMFile, "MM", "MM1", "file:/"+pathEcoreTrgMMFile, "file:/"+pathXMIMFile, "file:/"+pathXMIMFileOut, pathAsm);
			
			EMF2USE_M1.emf2use(pathEcoreTrgMMFile, pathXMIMFileOut, pathUseMFileOut, "");
			
		}
	    System.out.println("Done!");

	}

	private static void preprocessBibTeXSoilFile(String pathSoilMFile,
			String pathSoilMFile2) throws IOException {
		
		FileReader fR = new FileReader(pathSoilMFile);
		BufferedReader bR = new BufferedReader(fR);
		FileWriter fW = new FileWriter(pathSoilMFile2);
		BufferedWriter bW = new BufferedWriter(fW);
		
		String line = bR.readLine();
		while (line!=null){
			bW.write(line.replace("Editorship", "Editorship_Person_Proc").replace("Authorship", "Authorship_Person_InProc").replace("File_Entry", "FileEntry_BibTeXFile_BibTeXEntry"));
			bW.write("\n");
			line = bR.readLine();
		}
		bW.close(); fW.close();
		bR.close(); fR.close();
	}

	private static void pro2xmi(String pathProMFile, String pathXMIMFile, String pathEcoreMMFile) throws IOException {
		
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
		// Get the resource
	    Resource resource = resSet.getResource(URI.createURI("file:/"+pathProMFile), true);
        pro.Model model = (pro.Model) resource.getContents().get(0);
		
		HashMap<String, EClass> eClassesByName = new HashMap<String, EClass>();
		HashMap<CreateG, EObject> create2object = new HashMap<CreateG, EObject>();
		HashMap<String, EObject> string2object = new HashMap<String, EObject>();
		
		EPackage ePackage = getEPackage(pathEcoreMMFile);
		EFactory factory = ePackage.getEFactoryInstance();
		Iterator<EClassifier> classifiersIter = ePackage.getEClassifiers().iterator();
		while (classifiersIter.hasNext()){
			EClassifier classifier = (EClassifier) classifiersIter.next();
			if(classifier instanceof EClass){
				eClassesByName.put("" + classifier.getName(), (EClass) classifier);
			}
		}
		
		EList<CreateG> creates = model.getCreates();
		EList<SetG> sets = model.getSets();
		EList<InsertG> inserts = model.getInserts();
		
		/* Creates */
		Iterator<CreateG> createsIter = creates.iterator();
		while(createsIter.hasNext()){
			CreateG create = createsIter.next();
			String t = create.getType();
			EClass aux = eClassesByName.get(t);
			EObject object = factory.create(aux);
			create2object.put(create, object);
			string2object.put(create.getObject(), object);
			
			/* Sets */
			Iterator<SetG> setsIter = sets.iterator();
			while(setsIter.hasNext()){
				SetG set = setsIter.next();
				if(set.getObject().equals(create.getObject())){
					EStructuralFeature feature = object.eClass().getEStructuralFeature(set.getAttribute().replaceFirst("_", ""));
					if (!feature.isMany()){
						if(feature.getEType().getName().equals("EString")){
							object.eSet(feature, set.getValue());
						}else if(feature.getEType().getName().equals("EInt")){
							object.eSet(feature, Integer.parseInt(set.getValue()));
						}else if(feature.getEType().getName().equals("EBoolean")){
							if(set.getValue().equals("true")){
								object.eSet(feature, true);
							}else{
								object.eSet(feature, false);
							}
						}else if (feature.getEType() instanceof EEnum){
							String literal = set.getValue().replaceFirst("#_", "");
							literal = set.getValue().replaceFirst("#", "");
							object.eSet(feature, ((EEnum) feature.getEType()).getEEnumLiteral(literal));
						}
					} else if (feature.isMany()) {
						if (feature.getEType().getName().equals("EString")) {
							parseCollectionToAListOfString(set.getValue(), ((List) object.eGet(feature)));
						} else if (feature.getEType().getName().equals("EInt")) {
							parseCollectionToAListOfInteger(set.getValue(), ((List) object.eGet(feature)));
						} else if (feature.getEType().getName().equals("EBoolean")) {
							parseCollectionToAListOfBoolean(set.getValue(), ((List) object.eGet(feature)));
						} else if (feature.getEType() instanceof EEnum) {
							parseCollectionToAListOfEnum(set.getValue(), ((List) object.eGet(feature)));
						}
					}
				}
			}
		}
		
		/* Inserts */
		Iterator<InsertG> insertsIter = inserts.iterator();
		while(insertsIter.hasNext()){
			InsertG insert = insertsIter.next();
			EObject one = string2object.get(insert.getObj1());
			EObject two = string2object.get(insert.getObj2());
			String prefix = "";
			String assoc = insert.getRel().substring(prefix.length()); //We must remove the prefix just in case it contains _
			
			String[] assocParts = assoc.split("_");
			
				String ref1 = assocParts[0];
				String ref2 = assocParts[1];
				
				EStructuralFeature f1 = one.eClass().getEStructuralFeature(ref1);
				EStructuralFeature f2 = two.eClass().getEStructuralFeature(ref1);	
				
				
				if(f1 != null){
					if(f1.isMany()){
						((List)one.eGet(f1)).add(two);
					}else{
						one.eSet(f1, two);
					}
				}else{
					if(f2.isMany()){
						((List)two.eGet(f2)).add(one);
					}else{
						two.eSet(f2, one);
					}
				}
				
		}
		
		Iterator<EObject> objects = string2object.values().iterator();
		EObject root = null;
		while(objects.hasNext()){
			EObject obj = objects.next();
			if(obj.eContainer() == null){
				root = obj;
				break;
			}
		}
		
		ResourceSet resultSet = readInModel(pathEcoreMMFile);
	    Resource resource2 = resultSet.createResource(URI
	        .createURI("file:/"+pathXMIMFile));
//	    resource2.getContents().add(root);
	    /* I've commented the previous line and I've added the next for, it's necessary for models which don't have the root element */
	    for (EObject obj : string2object.values()){
	    	resource2.getContents().add(obj);	    	
	    }
	    
	    resource2.save(Collections.EMPTY_MAP);
	}
	
	private static EPackage getEPackage(String pathEcoreMMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE; //Factory fuer Resourcen
		Map m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource metamodel = resSet.getResource(URI.createURI("file:/"+pathEcoreMMFile), true);
		return (EPackage) metamodel.getContents().get(0); 
	}
	
	private static void parseCollectionToAListOfString(String value, List list) {
		StringTokenizer st = new StringTokenizer(value.substring(value.indexOf("{")), "{}, ");
		while (st.hasMoreTokens()){
			list.add(st.nextToken());
		}
	}
	
	private static void parseCollectionToAListOfEnum(String value, List list) {
		StringTokenizer st = new StringTokenizer(value.substring(value.indexOf("{")), "{},# ");
		while (st.hasMoreTokens()){
			list.add(st.nextToken());
		}
	}

	private static void parseCollectionToAListOfBoolean(String value, List list) {
		StringTokenizer st = new StringTokenizer(value.substring(value.indexOf("{")), "{}, ");
		while (st.hasMoreTokens()){
			if (st.nextToken().equals("false")){
				list.add(false);
			}else{
				list.add(true);
			}
		}
	}

	private static void parseCollectionToAListOfInteger(String value, List list) {
		StringTokenizer st = new StringTokenizer(value.substring(value.indexOf("{")), "{}, ");
		while (st.hasMoreTokens()){
			list.add(Integer.parseInt(st.nextToken()));
		}
	}
	
	private static ResourceSet readInModel(String pathEcoreMMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE; //Factory fuer Resourcen
		Map m = reg.getExtensionToFactoryMap();
		m.put("xmi", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource metamodel = resSet.getResource(URI.createURI("file:/"+pathEcoreMMFile), true);
		EPackage ep0 = (EPackage) metamodel.getContents().get(0); 
		resSet.getPackageRegistry().put(ep0.getNsURI(), ep0);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
		("xmi", new XMIResourceFactoryImpl(){ public Resource createResource(URI uri)
		{   XMIResource xmiResource = new XMIResourceImpl(uri);
			return xmiResource;
		} });
		return resSet;
	}
	
	public static void txt2pro(String pathTxtFile, String pathProFile){
		/* It generates a pro file conform a /metamodels/pro.ecore */ 
		try {
			String cadena;			
			BufferedReader bf = new BufferedReader(new FileReader(pathTxtFile));
			
			String sFichero = pathProFile;
			//File fichero = new File(sFichero);
			BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
			
//			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
//			bw.write("<pro:Model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:pro=\"http://pro/1.0\">\n");
			
			bw.write("<?xml version=\"1.0\" encoding=\"ASCII\"?>");
			bw.write("<pro:Model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:pro=\"http://pro/1.0\" xsi:schemaLocation=\"http://pro/1.0 pro.ecore\">\n");
			
			while ((cadena = bf.readLine())!=null) {
				cadena = noBlancosInic(cadena);
				cadena = cadena.replace(".", " . ");
				cadena = cadena.replace("('", " ('");
				cadena = cadena.replace("!@", "!@ ");
				StringTokenizer st = new StringTokenizer(cadena);
				
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
				} else if (cadena.startsWith("!insert")&&!cadena.contains("@")) {
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
				} else if (cadena.startsWith("!")) {
					int i=0;
					String c1="", c2="", c3="";
					while (st.hasMoreTokens()){
						if (i==0){
							c1 = st.nextToken().substring(1);
						}else if (i==2){
							c2 = st.nextToken();
						}else if (i==4){
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
		
	public static String noBlancosInic(String cadena){
			while (cadena.startsWith(" ")){
				cadena = cadena.substring(1); 
			}
			return cadena;
		}


}
