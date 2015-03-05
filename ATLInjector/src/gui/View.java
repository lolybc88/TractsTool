package gui;
import java.awt.event.ActionListener;

public interface View {
	
	final String EXEC_USE = "EXEC_USE";
	final String ATL_TRANS = "ATL_TRANS";
	final String OUT_FILE = "OUT_FILE";
	final String GET_OUT = "GET_OUT";

	
	void controller(ActionListener controller);
	void atlTransformationClick();
	void outFileClick();
	void getOutClick();
}
