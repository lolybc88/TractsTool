package transformations;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import USE.Model;
import USE.USEPackage;

public class MergeUseMM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String srcMM = "example_4\\Ecore.use";
		String trgMM = "example_4\\Use.use";
		String mergedMM = "example_4\\merged.use";
		
	}
	
	public void mergeUSEMM (String srcMM, String trgMM, String mergedMM){
		USEPackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("use", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    
	    ResourceSet resSet = new ResourceSetImpl();
        
	    Resource srcMM_res = resSet.getResource(URI.createFileURI(srcMM), true);
        Resource trgMM_res = resSet.getResource(URI.createFileURI(trgMM), true);

		
        Model src_model = (Model) srcMM_res.getContents().get(0);
        Model trg_model = (Model) trgMM_res.getContents().get(0);
        
        src_model.getClasses().addAll(trg_model.getClasses());
        src_model.getAssociations().addAll(trg_model.getAssociations());
        src_model.getEnumerations().addAll(trg_model.getEnumerations());		
		
		
		 Resource rsc_merge = resSet.createResource(URI
			        .createURI(mergedMM));
			    rsc_merge.getContents().add(src_model);
		
	    try {
	    	rsc_merge.save(Collections.EMPTY_MAP);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }


	}

}
