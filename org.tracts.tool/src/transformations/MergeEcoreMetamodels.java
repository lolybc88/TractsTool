package transformations;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MergeEcoreMetamodels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String srcMM = "example_4\\Ecore.ecore";
		String trgMM = "example_4\\Use.ecore";
		String mergedMM = "example_4\\merged.ecore";
//		merge(srcMM, trgMM, mergedMM);
	}
	
	public void merge(String MM1, String MM2, String mergedMM){
		/**
		 *Merge 2 MM in 1 
		 */
		EcorePackage.eINSTANCE.eClass();
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ecore", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        
        Resource srcMM_res = null;
		try{
			srcMM_res = resSet.getResource(URI.createFileURI(MM1), true);
		}catch(Exception e){
			//System.out.println("Ecore file not a metamodel: " +  e.toString());
		}
		
        Resource trgMM_res = null;
		try{
			trgMM_res = resSet.getResource(URI.createFileURI(MM2), true);
		}catch(Exception e){
			//System.out.println("Ecore file not a metamodel: " +  e.toString());
		}
		
		EPackage ePackageSrc = (EPackage) srcMM_res.getContents().get(0);
		EPackage ePackageTrg = (EPackage) trgMM_res.getContents().get(0);
		
		ePackageSrc.getEClassifiers().addAll(ePackageTrg.getEClassifiers());
		
		
		 Resource rsc_merge = resSet.createResource(URI
			        .createURI(mergedMM));
			    rsc_merge.getContents().add(ePackageSrc);
		
	    try {
	    	rsc_merge.save(Collections.EMPTY_MAP);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	
	}


}
