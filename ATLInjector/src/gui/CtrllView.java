package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrllView implements ActionListener{

	Window w;
	
	public CtrllView(Window w){
		this.w = w;
	}	

	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals(View.ATL_TRANS)){
			w.atlTransformationClick();
		} else if(e.getActionCommand().equals(View.OUT_FILE)){
			w.outFileClick();
		} else if(e.getActionCommand().equals(View.GET_OUT)){
			w.getOutClick();
		} 
	}	
}
