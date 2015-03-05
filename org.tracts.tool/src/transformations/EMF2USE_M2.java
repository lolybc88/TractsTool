package transformations;

import java.io.IOException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.tracts.tool.ecore2use.files.Ecore2Use;

public class EMF2USE_M2 {

	public static void ecore2use_M2(String eMM, String uMM)
			throws IOException, ATLCoreException {
		
		Ecore2Use runner = new Ecore2Use();
		if (eMM.contains("http://") || eMM.contains("www.")){
			runner.loadModels(eMM);	
		}else{
			runner.loadModels("file:/"+eMM);			
		}
		runner.doEcore2Use(new NullProgressMonitor());
		runner.saveModels("file:/"+uMM);		
		
		// Add Prefix
//		AddPrefixMM.transform("file:/"+uMM, prefix);
//		
//		// Generate USE Class Diagram (M2T)
//		Use2Text runner2 = new Use2Text();
//		runner2.loadModels("file:/"+uMM);
//		runner2.doUse2Text(new NullProgressMonitor());
		
//		FileOperations.FileCopyAndDeleteSource("temp/MM.use", uMM);

	}

}
