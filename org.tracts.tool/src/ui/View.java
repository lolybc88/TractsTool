package ui;
import java.awt.event.ActionListener;

public interface View {
	
	final String EXEC_USE = "EXEC_USE";
	final String ATL_TRANS = "ATL_TRANS";
	final String SRC_MM = "SRC_MM"; 
	final String TRG_MM = "TRG_MM"; 
	final String TRACTS = "TRACTS";
	final String ASSL = "ASSL";
	final String TEMP_FOLDER = "TEMP_FOLDER";
	final String CHECK = "CHECK";
	final String REPOSITORY = "REPOSITORY";
	final String INJECTEDMODEL = "INJECTEDMODEL";
	final String INJECT = "INJECT";
	
	void controller(ActionListener controller);
	void atlTransformationClick();
	void srcMMEcoreClick();
	void trgMMEcoreClick();
	void tractsClick();
	void asslClick();
	void tempFolderClick();
	void checkClick();
	void repositoryClick();
	void injectedModelClick();
	void injectClick();
	
}
