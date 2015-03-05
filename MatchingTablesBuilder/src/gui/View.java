package gui;
import java.awt.event.ActionListener;

public interface View {
	
	final String EXEC_USE = "EXEC_USE";
	final String RULE_TYPES = "RULE_TYPES";
	final String CONSTRAINTS = "CONSTRAINTS";
	final String SRC_MM = "SRC_MM"; 
	final String TRG_MM = "TRG_MM"; 
	final String CSV_FILE = "CSV_FILE";
	final String GET_MT = "GET_SM";

	
	void controller(ActionListener controller);
	void constraintsClick();
	void ruleTypesClick();
	void srcMMEcoreClick();
	void trgMMEcoreClick();
	void csvFileClick();
	void getMatchingTablesClick();
}
