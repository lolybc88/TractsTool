package transformations;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;


public class EMF2USE_M1 {
	 
	
	public static HashMap<EObject, String> objects = new HashMap<EObject, String>();
	public static HashSet<EObject> visitedObjects = new HashSet<EObject>();
	public static String useTXT  = "";
	public static int objID = 0;
	public static String prefix;
	
	public static void emf2use(String pathEcoreMMFile, String pathEcoreMFile, String pathUseMFile, String prefix2) {
		
		useTXT = "";
		prefix = prefix2;

		ResourceSet resSet = readInModel(pathEcoreMMFile);
		Resource model = resSet.getResource(
				URI.createURI("file:/" + pathEcoreMFile), true);

		// System.out.println(model.getURI());

		 
		 for (int k=0; k<model.getContents().size(); k++) {
		 
			 EObject currentObject = (EObject)model.getContents().get(k);
			 
			/* Generate Objects */
			useTXT = useTXT + genObj(currentObject);
			objects.put(currentObject, currentObject.eClass().getName() + "_" + objID++);
			for (Iterator<EObject> it = currentObject.eAllContents(); it.hasNext();) {
				EObject object = it.next();
				useTXT = useTXT + genObj(object);
				objects.put(object, object.eClass().getName() + "_" + objID++);
			}

			/* Generate Attribute Values and Links */
			for (Iterator it2 = currentObject.eClass().getEAllAttributes().iterator(); it2.hasNext();) {
				useTXT = createValues(currentObject, it2);
			}

			for (Iterator it2 = currentObject.eClass().getEAllReferences().iterator(); it2.hasNext();) {
				useTXT = createLinks(currentObject, it2);
			}
			visitedObjects.add(currentObject);

			for (Iterator<EObject> it = currentObject.eAllContents(); it.hasNext();) {
				EObject object = it.next();

				for (Iterator it2 = object.eClass().getEAllAttributes()
						.iterator(); it2.hasNext();) {
					useTXT = createValues(object, it2);
				}

				for (Iterator it2 = object.eClass().getEAllReferences()
						.iterator(); it2.hasNext();) {
					useTXT = createLinks(object, it2);
				}
				visitedObjects.add(object);
			}
		 }
		writeUseModel(pathUseMFile);
	}

	private static void writeUseModel(String pathUseMFile) {
		try {
			FileOutputStream fos = new FileOutputStream(pathUseMFile);
			fos.write(useTXT.getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}
	
	private static String createValues(EObject object,
			Iterator it2) {
		EAttribute attribute = (EAttribute) it2.next();
		useTXT = useTXT + genValue(object, attribute);
		return useTXT;
	}

	private static String createLinks(EObject object, Iterator it2) {
		EReference reference= (EReference) it2.next();
		EReference inverse = reference.getEOpposite();
		if(object.eIsSet(reference) && inverse != null){
			Object linkedObjs = (Object) object.eGet(reference);
			if (linkedObjs instanceof EList){
				EList list = (EList) linkedObjs;
				for(Iterator it3 = list.iterator(); it3.hasNext();){
					EObject linkedObj = (EObject) it3.next();
					if(!visitedObjects.contains(linkedObj) && (!(linkedObjs.equals(object) && 
							object.eClass().getEAllReferences().indexOf(reference) > object.eClass().getEAllReferences().indexOf(inverse)))){
						useTXT = useTXT + genLink(object, linkedObj, reference);
					}
				}
			}
			else
				if(!visitedObjects.contains(linkedObjs) && (!(linkedObjs.equals(object) && 
						object.eClass().getEAllReferences().indexOf(reference) > object.eClass().getEAllReferences().indexOf(inverse)))){
					useTXT = useTXT + genLink(object, ((EObject)linkedObjs), reference);
				}
		}
		

		if(object.eIsSet(reference) && inverse == null){
			Object linkedObjs = (Object) object.eGet(reference);
			if (linkedObjs instanceof EList){
				EList list = (EList) linkedObjs;
				for(Iterator it3 = list.iterator(); it3.hasNext();){
					EObject linkedObj = (EObject) it3.next();
					useTXT = useTXT + genLink(object, linkedObj, reference);
				}
			}
			else
				useTXT = useTXT + genLink(object, ((EObject)linkedObjs), reference);
		}
		return useTXT;
	}

	/* String Producer Methods */
	public static String genObj(EObject obj){
		return "!new " + prefix +obj.eClass().getName() + " ('" + obj.eClass().getName()+"_" + objID + "')\n";
	}
	
	public static String genValue(EObject obj, EAttribute att){
		return "!@"+objects.get(obj)+"."+ _getName(att)+" := "+getUseValue(obj, att)+"\n";
		
	}

	public static String _getName(EAttribute att){
		if(att.getName().equals("ordered") || att.getName().equals("abstract")){
			return "_"+att.getName();
		}
		return att.getName();
	}
	
	private static String getUseValue(EObject obj, EAttribute att) {
		String value = "";
		if(obj.eGet(att) != null){
			if (att.getEType().getName().equals("EString")
					&& att.getUpperBound() == 1) {
				value = "'" + obj.eGet(att).toString() + "'";
			} else if (att.getEType().getName().equals("EInt")
					&& att.getUpperBound() == 1) {
				value = obj.eGet(att).toString();
			} else if (att.getEType().getName().equals("EBoolean")
					&& att.getUpperBound() == 1) {
				value = obj.eGet(att).toString();
			} else if (att.getUpperBound() > 1 && att.isOrdered()) {
				if (att.getEType().getName().equals("EString")) {
					value = "Sequence{"
							+ stringCollectionToString(obj.eGet(att)) + "}";
				} else if (att.getEType().getName().equals("EInt")
						|| att.getEType().getName().equals("EBoolean")) {
					value = "Sequence{"
							+ integerOrBooleanCollectionToString(obj.eGet(att))
							+ "}";
				} else if (att.getEType() instanceof EEnum) {
					value = "Sequence{" + enumCollectionToString(obj.eGet(att))
							+ "}";
				} else {
					value = "null";
				}
			} else if (att.getUpperBound() > 1 && !att.isOrdered() && att.isUnique()) {
				if (att.getEType().getName().equals("EString")) {
					value = "Set{" + stringCollectionToString(obj.eGet(att))
							+ "}";
				} else if (att.getEType().getName().equals("EInt")
						|| att.getEType().getName().equals("EBoolean")) {
					value = "Set{"
							+ integerOrBooleanCollectionToString(obj.eGet(att))
							+ "}";
				} else if (att.getEType() instanceof EEnum) {
					value = "Set{" + enumCollectionToString(obj.eGet(att))
							+ "}";
				} else {
					value = "null";
				}
			} else if (att.getUpperBound() > 1 && !att.isOrdered()
					&& !att.isUnique()) {
				if (att.getEType().getName().equals("EString")) {
					value = "Bag{" + stringCollectionToString(obj.eGet(att))
							+ "}";
				} else if (att.getEType().getName().equals("EInt")
						|| att.getEType().getName().equals("EBoolean")) {
					value = "Bag{"
							+ integerOrBooleanCollectionToString(obj.eGet(att))
							+ "}";
				} else if (att.getEType() instanceof EEnum) {
					value = "Bag{" + enumCollectionToString(obj.eGet(att))
							+ "}";
				} else {
					value = "null";
				}
			} else if ((att.getEType() instanceof EEnum)) {
				value = "#" + _literalName(obj.eGet(att).toString());
			} else {
				value = "null";
			}
		}else{
			value = "null";
		}
		return value;
	}
	
	public static String _literalName(String name){
		if(name.equals("Set") || name.equals("Bag") || name.equals("Sequence")){
			return "_"+name;
		}
		return name;
	}
	
	private static String enumCollectionToString(Object obj) {
		String result = ""; int i = 1;
		String s = obj.toString();
		StringTokenizer st = new StringTokenizer(s, " ,[]");
		while (st.hasMoreTokens()){
			String token = st.nextToken();
			if (i==1){
				result += '#' + token;
			}else{
				result += ",#" + token;
			} 
			i++;
		}
		return result;
	}

	private static String integerOrBooleanCollectionToString(Object obj) {
		String result = ""; int i = 1;
		String s = obj.toString();
		StringTokenizer st = new StringTokenizer(s, " ,[]");
		while (st.hasMoreTokens()){
			String token = st.nextToken();
			if (i==1){
				result += token;
			}else{
				result += "," + token;
			} 
			i++;
		}
		return result;
	}
	
	private static String stringCollectionToString(Object obj) {
		String result = ""; int i = 1;
		String s = obj.toString();
		StringTokenizer st = new StringTokenizer(s, " ,[]");
		while (st.hasMoreTokens()){
			String token = st.nextToken();
			if (i==1){
				result += "'" + token + "'";
			}else{
				result += ",'" + token + "'";
			} 
			i++;
		}
		return result;
	}

	public static String genLink(EObject obj, EObject linkedObj, EReference reference){
		
		if(objects.get(linkedObj) == null){
			return "";
		}
		
		if(reference.getEOpposite() == null){
			String s = "!insert (@"+objects.get(obj)+",@"+objects.get(linkedObj)+") into " + 
					prefix + reference.getName() + "_";
			if (reference.getEContainingClass().getName().compareTo(reference.getEType().getName())<0){
				s += reference.getEContainingClass().getName() + "_" + reference.getEType().getName() + "\n";
			}else{
				s += reference.getEType().getName() + "_" + reference.getEContainingClass().getName() + "\n";
			}
			return s;
		}else{
			String s = "!insert (@"+objects.get(obj)+",@"+objects.get(linkedObj)+") into " + 
					prefix;
			
			if (reference.getName().compareTo(reference.getEOpposite().getName())<0){
				s += reference.getName() + "_" + reference.getEOpposite().getName() + "_";
			}else{
				s += reference.getEOpposite().getName() + "_" + reference.getName() + "_";
			}
			
			if (reference.getEOpposite().getEType().getName().compareTo(reference.getEType().getName())<0){
				s += reference.getEOpposite().getEType().getName() + "_" + reference.getEType().getName() + "\n";
			}else{
				s += reference.getEType().getName() + "_" +  reference.getEOpposite().getEType().getName() + "\n";
			}
			return s;
		}
	}
	
	/* Model Loader */
	private static ResourceSet readInModel(String pathEcoreMMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE; //Factory fuer Resourcen
		Map m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource metamodel;
		if (pathEcoreMMFile.contains("http://") || pathEcoreMMFile.contains("www.")){
			metamodel = resSet.getResource(URI.createURI(pathEcoreMMFile), true);
		}else{
			metamodel = resSet.getResource(URI.createURI("file:/"+pathEcoreMMFile), true);
		}
		EPackage ep0 = (EPackage) metamodel.getContents().get(0); 
		resSet.getPackageRegistry().put(ep0.getNsURI(), ep0);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
		("xmi", new XMIResourceFactoryImpl(){ public Resource createResource(URI uri)
		{   XMIResource xmiResource = new XMIResourceImpl(uri);
			return xmiResource;
		} });
		return resSet;
	}
}