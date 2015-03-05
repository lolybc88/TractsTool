package transformations;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import pro.CreateG;
import pro.InsertG;
import pro.ProPackage;
import pro.SetG;

public class DelPrefixM {

	
	public static void transform(String pathProMFile, String prefix) {
		
		ProPackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("pro", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI(pathProMFile), true);
        pro.Model model = (pro.Model) resource.getContents().get(0);

        
		EList<CreateG> creates = model.getCreates();
		EList<SetG> sets = model.getSets();
		EList<InsertG> inserts = model.getInserts();
		
		
		Iterator<CreateG> createsIter = creates.iterator();
		while(createsIter.hasNext()){
			CreateG create = createsIter.next();
			create.setType(create.getType().replaceFirst(prefix, ""));
		}
		
		Iterator<InsertG> insertsIter = inserts.iterator();
		while(insertsIter.hasNext()){
			InsertG insert = insertsIter.next();
			insert.setRel(insert.getRel().replaceFirst(prefix, ""));
		}
		
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
        
	}
	
}
