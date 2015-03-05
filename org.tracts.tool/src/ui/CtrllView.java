package ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrllView implements ActionListener{

	Window w;
	
	public CtrllView(Window w){
		this.w = w;
	}	

	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals(View.CHECK)) {
			w.checkClick();
		} else if(e.getActionCommand().equals(View.ATL_TRANS)){
			w.atlTransformationClick();
		} else if(e.getActionCommand().equals(View.SRC_MM)){
			w.srcMMEcoreClick();
		} else if(e.getActionCommand().equals(View.TRG_MM)){
			w.trgMMEcoreClick();
		} else if(e.getActionCommand().equals(View.TRACTS)){
			w.tractsClick();
		} else if(e.getActionCommand().equals(View.ASSL)){
			w.asslClick();
		} else if(e.getActionCommand().equals(View.TEMP_FOLDER)){
			w.tempFolderClick();
		} else if(e.getActionCommand().equals(View.REPOSITORY)){
			w.repositoryClick();
		} else if(e.getActionCommand().equals(View.INJECTEDMODEL)){
			w.injectedModelClick();
		} else if (e.getActionCommand().equals(View.INJECT)){
			w.injectClick();
		}
	}	
}
