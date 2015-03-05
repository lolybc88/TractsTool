package transformations;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MakeMMSelfContained {
	
	public static void main(String args[]){
		try {
			transform("C:\\Users\\Wimmer\\workspace_junio\\org.tracts.tool\\temp\\EcoreModel.ecore");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transform(String MM) throws IOException {
		
		EcorePackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ecore", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        
        Resource MM_res = resSet.getResource(URI.createFileURI(MM), true);
		
		EPackage ePackage = (EPackage) MM_res.getContents().get(0);
		
		EcoreFactory factory = EcoreFactory.eINSTANCE;
		EDataType string = factory.createEDataType();
		string.setName("EString");
		string.setInstanceClassName("EString");
		EDataType bool = factory.createEDataType();
		bool.setName("EBoolean");
		bool.setInstanceClassName("EBoolean");
		EDataType integer = factory.createEDataType();
		integer.setName("EInteger");
		integer.setInstanceClassName("EInteger");
		
		ePackage.getEClassifiers().add(string);
		ePackage.getEClassifiers().add(bool);
		ePackage.getEClassifiers().add(integer);
		
		TreeIterator iter = MM_res.getAllContents();
		while(iter.hasNext()){
			EObject object = (EObject) iter.next();
			if(object instanceof EAttribute){
				EAttribute attribute = (EAttribute) object;
				if(attribute.getEType().getName().equals("EString")){
					attribute.setEType(string);
				}else if(attribute.getEType().getName().equals("EBoolean")){
					attribute.setEType(bool);
				}else if(attribute.getEType().getName().equals("EInteger")){
					attribute.setEType(integer);
				}
			}
		}
		//TODO: make change to have a new url
		//Resource rsc_merge = resSet.createResource(URI.createURI(MM));
		//MM_res.getContents().add(ePackage);
	    MM_res.save(Collections.EMPTY_MAP);   
	}
}