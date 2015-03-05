package ui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.engine.injectors.Injector;

import behaviour.Model;
import exceptions.*;;

public class Window extends JFrame implements View {

	private static final long serialVersionUID = 1L;

	/* For M2M panel */
	Button atlTransformationButton, srcMMEcoreButton, trgMMEcoreButton,
			tractsButton, asslButton, tempFolderButton,
			checkButton;

	JLabel invocationAsslLabel, numExecAsslLabel, resultLabel, errorLabel;

	JFileChooser atlTransformationChooser, srcMMEcoreChooser,
			trgMMEcoreChooser, tractsChooser, execUseChooser, asslChooser,
			tempFolderChooser;

	JTextField atlTransformationTField, srcMMEcoreTField, trgMMEcoreTField,
			tractsTField, asslTField, invocationAsslTField, tempFolderTField;

	JTextArea resultTArea;
	
	/* For M2T injector panel */
	Button repositoryFolderButton, injectedModelButton, injectButton;
	
	JFileChooser repositoryFolderChooser, injectedModelChooser;
	
	JTextField repositoryFolderTField, injectedModelTField;
	
	JLabel injectErrorLabel, injectResultLabel;
	
	public Window() {

		Dimension buttonsDimension = new Dimension(300, 25);

		/* begin M2M panel */
		srcMMEcoreButton = new Button("Source metamodel (.ecore or URI)");
		srcMMEcoreButton.setPreferredSize(buttonsDimension);
		srcMMEcoreTField = new JTextField();
		srcMMEcoreTField.setPreferredSize(buttonsDimension);

		trgMMEcoreButton = new Button("Target metamodel (.ecore or URI)");
		trgMMEcoreButton.setPreferredSize(buttonsDimension);
		trgMMEcoreTField = new JTextField();
		trgMMEcoreTField.setPreferredSize(buttonsDimension);

		tractsButton = new Button("Tracts file");
		tractsButton.setPreferredSize(buttonsDimension);
		tractsTField = new JTextField();
		tractsTField.setPreferredSize(buttonsDimension);

		asslButton = new Button("ASSL or src model file (.xmi or .ecore)");
		asslButton.setPreferredSize(buttonsDimension);
		asslTField = new JTextField();
		asslTField.setPreferredSize(buttonsDimension);

		invocationAsslLabel = new JLabel("Signature of the invocation to ASSL file:");
		invocationAsslTField = new JTextField();
		invocationAsslTField.setPreferredSize(buttonsDimension);
		
		atlTransformationButton = new Button("ATL transfo (.atl) or trg model file (.xmi or .ecore)");
		atlTransformationButton.setPreferredSize(buttonsDimension);
		atlTransformationTField = new JTextField();
		atlTransformationTField.setPreferredSize(buttonsDimension);

		tempFolderButton = new Button("Temporal folder");
		tempFolderButton.setPreferredSize(buttonsDimension);
		tempFolderTField = new JTextField();
		tempFolderTField.setPreferredSize(buttonsDimension);

		checkButton = new Button("Check");

		resultLabel = new JLabel("Result:");
//		resultTArea = new JTextArea("", 25, 28);
		resultTArea = new JTextArea("");
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(resultTArea);

		errorLabel = new JLabel("");
		errorLabel.setForeground(Color.red);

		Panel panelLeft = new Panel(new BorderLayout());
		panelLeft.add(srcMMEcoreButton, BorderLayout.NORTH);
		
		BorderLayout bl1 = new BorderLayout(); bl1.setVgap(10);
		Panel panelbl1 = new Panel(bl1);
		panelLeft.add(panelbl1, BorderLayout.CENTER);
		panelbl1.add(srcMMEcoreTField, BorderLayout.NORTH);
		
		
		BorderLayout bl2 = new BorderLayout();
		Panel panelbl2 = new Panel(bl2);
		panelbl1.add(panelbl2, BorderLayout.CENTER);
		panelbl2.add(trgMMEcoreButton, BorderLayout.NORTH);
		
		BorderLayout bl3 = new BorderLayout(); bl3.setVgap(10);
		Panel panelbl3 = new Panel(bl3);
		panelbl2.add(panelbl3, BorderLayout.CENTER);
		panelbl3.add(trgMMEcoreTField, BorderLayout.NORTH);

		BorderLayout bl4 = new BorderLayout();
		Panel panelbl4 = new Panel(bl4);
		panelbl3.add(panelbl4, BorderLayout.CENTER);
		panelbl4.add(tractsButton, BorderLayout.NORTH);
		
		BorderLayout bl5 = new BorderLayout(); bl5.setVgap(10);
		Panel panelbl5 = new Panel(bl5);
		panelbl4.add(panelbl5, BorderLayout.CENTER);
		panelbl5.add(tractsTField, BorderLayout.NORTH);

		BorderLayout bl6 = new BorderLayout();
		Panel panelbl6 = new Panel(bl6);
		panelbl5.add(panelbl6, BorderLayout.CENTER);
		panelbl6.add(asslButton, BorderLayout.NORTH);
		
		BorderLayout bl7 = new BorderLayout(); bl7.setVgap(10);
		Panel panelbl7 = new Panel(bl7);
		panelbl6.add(panelbl7, BorderLayout.CENTER);
		panelbl7.add(asslTField, BorderLayout.NORTH);
		
		BorderLayout bl8 = new BorderLayout();
		Panel panelbl8 = new Panel(bl8);
		panelbl7.add(panelbl8, BorderLayout.CENTER);
		panelbl8.add(invocationAsslLabel, BorderLayout.NORTH);
		
		BorderLayout bl9 = new BorderLayout(); bl9.setVgap(10);
		Panel panelbl9 = new Panel(bl9);
		panelbl8.add(panelbl9, BorderLayout.CENTER);
		panelbl9.add(invocationAsslTField, BorderLayout.NORTH);

		BorderLayout bl10 = new BorderLayout(); 
		Panel panelbl10 = new Panel(bl10);
		panelbl9.add(panelbl10, BorderLayout.CENTER);
		panelbl10.add(atlTransformationButton, BorderLayout.NORTH);

		BorderLayout bl11 = new BorderLayout(); bl11.setVgap(10);
		Panel panelbl11 = new Panel(bl11);
		panelbl10.add(panelbl11, BorderLayout.CENTER);
		panelbl11.add(atlTransformationTField, BorderLayout.NORTH);
		
		BorderLayout bl12 = new BorderLayout(); 
		Panel panelbl12 = new Panel(bl12);
		panelbl11.add(panelbl12, BorderLayout.CENTER);
		panelbl12.add(tempFolderButton, BorderLayout.NORTH);
		
		BorderLayout bl13 = new BorderLayout(); bl13.setVgap(10);
		Panel panelbl13 = new Panel(bl13);
		panelbl12.add(panelbl13, BorderLayout.CENTER);
		panelbl13.add(tempFolderTField, BorderLayout.NORTH);

		BorderLayout bl14 = new BorderLayout(); 
		Panel panelbl14 = new Panel(bl14);
		panelbl13.add(panelbl14, BorderLayout.CENTER);
		FlowLayout fl = new FlowLayout(); Panel flowPanel = new Panel(fl); flowPanel.add(checkButton);
		panelbl14.add(flowPanel, BorderLayout.NORTH);

		BorderLayout bl15 = new BorderLayout(); bl15.setVgap(10);
		Panel panelRight = new Panel(bl15);
		panelRight.add(resultLabel, BorderLayout.NORTH);
		panelRight.add(scroll, BorderLayout.CENTER);

		BorderLayout bl = new BorderLayout(); bl.setVgap(100); bl.setHgap(10);
		Panel panelTop = new Panel(bl);
		panelTop.add(panelLeft, BorderLayout.WEST);
		panelTop.add(panelRight, BorderLayout.CENTER);

		
		Panel panel = new Panel(new BorderLayout());
		panel.add(panelTop, BorderLayout.CENTER);
		panel.add(errorLabel, BorderLayout.SOUTH);
		
		BorderLayout blFinal = new BorderLayout(); blFinal.setVgap(10); Panel pFinal = new Panel(blFinal);
		pFinal.add(panel, BorderLayout.CENTER);
		/* fin M2M panel */
		
		/* begin T2M injector panel */
		repositoryFolderButton = new Button("Repository folder");
		repositoryFolderButton.setPreferredSize(new Dimension(200, 25));
		repositoryFolderTField = new JTextField();
		repositoryFolderTField.setPreferredSize(new Dimension(400, 25));
		injectedModelButton = new Button("Output model (.xmi or .ecore)");
		injectedModelButton.setPreferredSize(new Dimension(200, 25));
		injectedModelTField = new JTextField();
		injectedModelTField.setPreferredSize(new Dimension(400, 25));
		injectButton = new Button("Inject");
		injectButton.setPreferredSize(new Dimension(100, 25));
		injectResultLabel = new JLabel("");
		injectErrorLabel = new JLabel("");
		injectErrorLabel.setForeground(Color.red);
		/* fin T2M injector panel */
		
		
		
		Panel northPanel = new Panel(new FlowLayout());
	
		northPanel.add(repositoryFolderButton);
		northPanel.add(repositoryFolderTField);
		northPanel.add(injectedModelButton);
		northPanel.add(injectedModelTField);
		northPanel.add(injectButton);
		
		Panel southPanel = new Panel(new FlowLayout());
		southPanel.add(injectResultLabel);southPanel.add(injectErrorLabel);
		
		Panel injectorPanel = new Panel(new BorderLayout());
		injectorPanel.add(northPanel, BorderLayout.CENTER);
		injectorPanel.add(southPanel, BorderLayout.SOUTH);

	
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("M2M testing", null, panel, "");
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		tabbedPane.addTab("T2M injector", null, injectorPanel,"");
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		
		add("Center", tabbedPane);
		
		this.setTitle("TractsTool");
		this.pack();
		this.setVisible(true);
		this.setSize(850, 520);
		this.setLocation(300, 300);
//		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	@Override
	public void controller(ActionListener controller) {

		atlTransformationButton.addActionListener(controller);
		atlTransformationButton.setActionCommand(ATL_TRANS);

		srcMMEcoreButton.addActionListener(controller);
		srcMMEcoreButton.setActionCommand(SRC_MM);

		trgMMEcoreButton.addActionListener(controller);
		trgMMEcoreButton.setActionCommand(TRG_MM);

		tractsButton.addActionListener(controller);
		tractsButton.setActionCommand(TRACTS);
		
		asslButton.addActionListener(controller);
		asslButton.setActionCommand(ASSL);

		tempFolderButton.addActionListener(controller);
		tempFolderButton.setActionCommand(TEMP_FOLDER);

		checkButton.addActionListener(controller);
		checkButton.setActionCommand(CHECK);
		
		repositoryFolderButton.addActionListener(controller);
		repositoryFolderButton.setActionCommand(REPOSITORY);
		
		injectedModelButton.addActionListener(controller);
		injectedModelButton.setActionCommand(INJECTEDMODEL);
		
		injectButton.addActionListener(controller);
		injectButton.setActionCommand(INJECT);
		
	}

	@Override
	public void atlTransformationClick() {
		atlTransformationChooser = new JFileChooser();
		atlTransformationChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".atl") ||
							   f.getName().toLowerCase().endsWith(".ecore") ||
							   f.getName().toLowerCase().endsWith(".xmi") ||
							   f.isDirectory();
					}

					public String getDescription() {
						return "atl";
					}
				});
		atlTransformationChooser.setCurrentDirectory(new File("."));
		atlTransformationChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = atlTransformationChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			atlTransformationTField.setText(atlTransformationChooser
					.getSelectedFile().getAbsolutePath());
		}
	}

	@Override
	public void srcMMEcoreClick() {
		srcMMEcoreChooser = new JFileChooser();
		srcMMEcoreChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".ecore")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "ecore";
					}
				});
		srcMMEcoreChooser.setCurrentDirectory(new File("."));
		srcMMEcoreChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = srcMMEcoreChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			srcMMEcoreTField.setText(srcMMEcoreChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	@Override
	public void trgMMEcoreClick() {
		trgMMEcoreChooser = new JFileChooser();
		trgMMEcoreChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".ecore")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "ecore";
					}
				});
		trgMMEcoreChooser.setCurrentDirectory(new File("."));
		trgMMEcoreChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = trgMMEcoreChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			trgMMEcoreTField.setText(trgMMEcoreChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	@Override
	public void tractsClick() {
		tractsChooser = new JFileChooser();
		tractsChooser.setCurrentDirectory(new File("."));
		tractsChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = tractsChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			tractsTField.setText(tractsChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	@Override
	public void asslClick() {
		asslChooser = new JFileChooser();
		asslChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
			public boolean accept(File f) {
				return f.getName().toLowerCase().endsWith(".assl") || f.getName().toLowerCase().endsWith(".xmi")
						|| f.getName().toLowerCase().endsWith(".ecore") || f.isDirectory();
			}

			public String getDescription() {
				return "assl";
			}
		});
		asslChooser.setCurrentDirectory(new File("."));
		asslChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = asslChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			asslTField.setText(asslChooser.getSelectedFile().getAbsolutePath());
		}
	}

	@Override
	public void tempFolderClick() {
		tempFolderChooser = new JFileChooser();
		tempFolderChooser.setCurrentDirectory(new File("."));
		tempFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int s = tempFolderChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			tempFolderTField.setText(tempFolderChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	@Override
	public void checkClick() {

		try {
	
			String pathATLTransformation = atlTransformationTField.getText();
			String pathSrcEcoreMMFile = srcMMEcoreTField.getText();
			String pathTrgEcoreMMFile = trgMMEcoreTField.getText();
			String pathTracts = tractsTField.getText();
			String pathExecUseFile = "C:\\auxTractsTool\\use-3.0.0\\bin\\use.bat"; //execUseTField.getText();
			String pathAsslFile = asslTField.getText();
			String invocationAsslFile = invocationAsslTField.getText();
			String pathTempFolder = tempFolderTField.getText();
			
			boolean ok = checkFields(pathATLTransformation, pathSrcEcoreMMFile,
					pathTrgEcoreMMFile, pathTracts, pathExecUseFile,
					pathAsslFile, invocationAsslFile,
					pathTempFolder);

			if (ok){
				
				Model m = new Model();
	
				String result = m.check(pathATLTransformation, pathSrcEcoreMMFile,
						pathTrgEcoreMMFile, pathTracts, pathExecUseFile,
						pathAsslFile, invocationAsslFile, pathTempFolder);
				resultTArea.setText(result);
				
			}
			else{
				
			}
		} catch (InterruptedException e) {
			errorLabel.setText("ERROR");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			errorLabel.setText("ERROR related to a file.");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (UseCommandException e) {
			errorLabel.setText("ERROR related to USE");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (TransformationException e) {
			errorLabel.setText("ERROR related to the ATL tranformation");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (ParametersException e) {
			errorLabel.setText(e.toString());
			e.printStackTrace();
		} catch (PackageNotFoundException e){
			errorLabel.setText("ERROR. Metamodels must expecify an URI");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (org.eclipse.emf.common.util.WrappedException e){
			errorLabel.setText("ERROR. Metamodels must expecify an URI");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		} catch (ATLCoreException e) {
			errorLabel.setText("ERROR. Related to your ATL transformation");
			resultTArea.setText(e.toString());
			e.printStackTrace();
		}

	}
	
	private boolean checkFields(String pathATLTransformation,
			String pathSrcMMEcoreFile, String pathTrgMMEcoreFile,
			String pathTracts, String pathExecUseFile, String pathAsslFile,
			String invocationAsslFile, String pathTempFolder)
			throws ParametersException {

		try {
			
			boolean ok = true;
			
			if (!new File(pathATLTransformation).exists()) {
				errorLabel
						.setText("  ERROR. File for the ATL transformation not found.");
				ok = false;
			} else if (!new File(pathSrcMMEcoreFile).exists() && !pathSrcMMEcoreFile.startsWith("http://")) {
				errorLabel
						.setText("  ERROR. File for source metamodel not found.");
				ok = false;
			} else if (!new File(pathTrgMMEcoreFile).exists() && !pathTrgMMEcoreFile.startsWith("http://")) {
				errorLabel
						.setText("  ERROR. File for the target metamodel not found.");
				ok = false;
			} else if (!new File(pathTracts).exists()) {
				errorLabel.setText("  ERROR. File for tracts not found.");
				ok = false;
			} else if (!new File(pathExecUseFile).exists()) {
				errorLabel.setText("  ERROR. Executable USE file not found. Check if you put the corresponding files in C:\\auxTractsTool\\use-3.0.0\\");
				ok = false;
			} else if (!new File(pathAsslFile).exists()) {
				errorLabel.setText("  ERROR. File for ASSL code not found.");
				ok = false;
			} else if (!new File(pathTempFolder).exists() && !pathTempFolder.contains(" ")) {
				File file = new File(pathTempFolder);
				file.mkdir();
			} else if (pathATLTransformation.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else if (pathSrcMMEcoreFile.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else if (pathTrgMMEcoreFile.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else if (pathTracts.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else if (pathAsslFile.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else if (pathTempFolder.contains(" ")) {
				errorLabel.setText("  ERROR. The paths cannot contain blanks");
				ok = false;
			} else{
				errorLabel.setText("");
			}
			
			return ok;
			
		} catch (NumberFormatException e) {
			throw new ParametersException(
					"ERROR. Insert a natural number for the number model generated with the ASSL file.");
		}
	}
	
	@Override
	public void repositoryClick(){
		repositoryFolderChooser = new JFileChooser();
		repositoryFolderChooser.setCurrentDirectory(new File("."));
		repositoryFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int s = repositoryFolderChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			repositoryFolderTField.setText(repositoryFolderChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	@Override
	public void injectedModelClick() {
		injectedModelChooser = new JFileChooser();
		injectedModelChooser.setCurrentDirectory(new File("."));
		injectedModelChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int s = injectedModelChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			injectedModelTField.setText(injectedModelChooser.getSelectedFile()
					.getAbsolutePath());
		}
		
	}

	@Override
	public void injectClick() {
		try{
			
			injectErrorLabel.setText("");
			injectResultLabel.setText("");
			String pathRepositoryFolder = repositoryFolderTField.getText();
			String pathInjectedModel = injectedModelTField.getText();
			
			boolean ok = checkFieldsInjectorTab(pathRepositoryFolder, pathInjectedModel);
	
			if (ok){
				Model m = new Model();
				m.inject(pathRepositoryFolder, pathInjectedModel);
				injectResultLabel.setText("Done!");
			} else {
				injectErrorLabel.setText("ERROR. Check that the paths you have provided are correct.");	
			}
		} catch(IOException e){
			injectErrorLabel.setText("ERROR. "+e.toString());
			e.printStackTrace();
		}
	}

	private boolean checkFieldsInjectorTab(String pathRepositoryFolder,
			String pathInjectedModel) {
		
		boolean ok = true;
		if (!new File(pathRepositoryFolder).exists()) {
			injectErrorLabel.setText("  ERROR. Repository folder not valid.");
			ok = false;
		}
		return ok;
	}
}
