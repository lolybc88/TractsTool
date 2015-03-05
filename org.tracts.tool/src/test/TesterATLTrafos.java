package test;
import java.io.IOException;


import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.tracts.tool.ecore2use.files.Ecore2Use;
import org.tracts.tool.use2text.files.Use2Text;

import behaviour.Model;

import transformations.AddPrefixMM;
import transformations.DelPrefixM;
import transformations.EMF2USE_M1;
import transformations.FileOperations;
import transformations.USE2EMF_M1;
import ui.CtrllView;
import ui.Window;


public class TesterATLTrafos {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
//	try{
//		
//		String eMM = "example_1/Text.ecore";
//		String eM = "example_1/textAsModel.text";
//		String eM_computed = "example_1/gen/textAsModel.xmi";
//		
//		String uMM_temp = "example_1/gen/Text.use";
//		String uM = "example_1/gen/textAsModel.use";
//		
//		String uProM = "example_1/gen/textAsModel.pro";
//		String uProMM = "example_1/pro.ecore";
//		
//		String prefix = "src_";
//		
//		// Transform the Ecore-based MM to USE Class Diagram (M2M)
//		Ecore2Use runner = new Ecore2Use();
//		runner.loadModels(eMM);
//		runner.doEcore2Use(new NullProgressMonitor());
//		runner.saveModels(uMM_temp);
//		
//		// Add Prefix
//		AddPrefixMM.transform(uMM_temp, prefix);
//		
//		// Generate USE Class Diagram (M2T)
//		Use2Text runner2 = new Use2Text();
//		runner2.loadModels(uMM_temp);
//		runner2.doUse2Text(new NullProgressMonitor());
//
//		// Genereate USE Object Diagram (M2T)
//		EMF2USE_M1.emf2use(eMM, eM, uM, prefix);
//		
//		// Genereate USE Object Diagram (T2M)
//		FileOperations.txt2pro(uM);
//		
//		// Del Prefix
//		DelPrefixM.transform(uProM, prefix);
//
//		// Genereate USE Object Diagram (M2M)
//		USE2EMF_M1.use2emf(eMM, eM_computed, uProM, uProMM);
//		
//	} catch (ATLCoreException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	} catch (ATLExecutionException e) {
//		e.printStackTrace();
//	}
	
//	try{
//		
//		String eMM = "example_2/Test.ecore";
//		String eM = "example_2/instance.xmi";
//		String eM_computed = "example_2/gen/instance.xmi";
//		
//		String uMM_temp = "example_2/gen/Text.use";
//		String uM = "example_2/gen/instance.use";
//		
//		String uProM = "example_2/gen/instance.pro";
//		String uProMM = "example_2/pro.ecore";
//		
//		String prefix = "trg_";
//		
//		// Transform the Ecore-based MM to USE Class Diagram (M2M)
//		ecore2use_M2(eMM, uMM_temp);
//		
//		// Add Prefix
//		AddPrefixMM.transform(uMM_temp, prefix);
//		
//		// Generate USE Class Diagram (M2T)
//		Use2Text runner2 = new Use2Text();
//		runner2.loadModels(uMM_temp);
//		runner2.doUse2Text(new NullProgressMonitor());
//
//		// Genereate USE Object Diagram (M2T)
//		EMF2USE_M1.emf2use(eMM, eM, uM, prefix);
//		
//		// Genereate USE Object Diagram (T2M)
//		FileOperations.txt2pro(uM);
//		
//		// Del Prefix
//		DelPrefixM.transform(uProM, prefix);
//
//		// Genereate USE Object Diagram (M2M)
//		USE2EMF_M1.use2emf(eMM, eM_computed, uProM, uProMM);
//		
//		System.out.println("Done!");
//		
//	} catch (ATLCoreException e) {
//		e.printStackTrace();
//	} catch (IOException e) {
//		e.printStackTrace();
//	} catch (ATLExecutionException e) {
//		e.printStackTrace();
//	}
		
		//Run user interface
//		Window w = new Window();
//		CtrllView cv = new CtrllView(w);
//		w.controller(cv);
		
		//Run the procedure
		Model.main(null);
	
	}

	private static void ecore2use_M2(String eMM, String uMM_temp)
			throws IOException, ATLCoreException {
		Ecore2Use runner = new Ecore2Use();
		runner.loadModels(eMM);
		runner.doEcore2Use(new NullProgressMonitor());
		runner.saveModels(uMM_temp);
	}
}
