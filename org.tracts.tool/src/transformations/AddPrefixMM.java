package transformations;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import USE.USEPackage;

public class AddPrefixMM {
	
	public static void transform(String pathUseMFile, String prefix) {
		
		USEPackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("use", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI(pathUseMFile), true);
        USE.Model model = (USE.Model) resource.getContents().get(0);
        

        Iterator<USE.Class> classes = model.getClasses().iterator();
        Iterator<USE.Association> assocs = model.getAssociations().iterator();
        Iterator<USE.Enumeration> enums = model.getEnumerations().iterator();
        
        while(classes.hasNext()){
        	USE.Class cl = classes.next();
        	cl.setName(prefix + cl.getName());
        }
        
        while(assocs.hasNext()){
        	USE.Association cl = assocs.next();
        	cl.setName(prefix + cl.getName());
        }

        while(enums.hasNext()){
        	USE.Enumeration cl = enums.next();
        	cl.setName(prefix + cl.getName());
        	for (EObject e : cl.eContents()){
        		if (e instanceof USE.Literal)
        			((USE.Literal)e).setName(prefix+((USE.Literal)e).getName());
        	}
        }
        
		
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
        
	}

}
