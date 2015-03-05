package gui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.tzi.use.main.shell.NoSystemException;

import tracts2atl.MatchingTablesBuilder;

public class Window extends JFrame implements View {

	private static final long serialVersionUID = 1L;

	Button srcMMEcoreButton, trgMMEcoreButton, constraintsButton, ruleTypesButton,
			outputFileButton, mtButton;

	JTextField srcMMEcoreTField, trgMMEcoreTField, constraintsTField, ruleTypesTField,
			outputFileTField, thresholdTField;

	JTextArea messageLabel, messageLabel2;

	JFileChooser srcMMecoreChooser, trgMMecoreChooser, ruleTypesChooser, constraintsChooser,
			csvChooser;
	
	JLabel thresholdLabel;

	public Window() {
		
		Dimension buttonsDimension = new Dimension(300, 25);
		// Components of the panels: Buttons and TFields
		srcMMEcoreButton = new Button("Select source metamodel (.ecore file)");
		srcMMEcoreButton.setPreferredSize(buttonsDimension);
		srcMMEcoreTField = new JTextField();
		srcMMEcoreTField.setPreferredSize(buttonsDimension);

		trgMMEcoreButton = new Button("Select target metamodel (.ecore file)");
		trgMMEcoreButton.setPreferredSize(buttonsDimension);
		trgMMEcoreTField = new JTextField();
		trgMMEcoreTField.setPreferredSize(buttonsDimension);

		constraintsButton = new Button(
				"Select constraints (.txt file)");
		constraintsButton.setPreferredSize(buttonsDimension);
		constraintsTField = new JTextField();
		constraintsTField.setPreferredSize(buttonsDimension);
		
		ruleTypesButton = new Button(
				"Select model with the ATL types (.xmi file)");
		ruleTypesButton.setPreferredSize(buttonsDimension);
		ruleTypesTField = new JTextField();
		ruleTypesTField.setPreferredSize(buttonsDimension);

		outputFileButton = new Button("Select directory for output file");
		outputFileButton.setPreferredSize(buttonsDimension);
		outputFileTField = new JTextField();
		outputFileTField.setPreferredSize(buttonsDimension);
		
		thresholdLabel = new JLabel("Threshold value:");
		thresholdTField = new JTextField("0.1", 5);

		messageLabel = new JTextArea("");
		messageLabel.setForeground(Color.black);
		messageLabel2 = new JTextArea("");
		// JScrollPane scroll = new JScrollPane();
		// scroll.setViewportView(messageLabel);

		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(messageLabel);


		mtButton = new Button("Build Matching Tables");
		Font newButtonFont = new Font("DIALOG", Font.BOLD, 12);
		mtButton.setFont(newButtonFont);

		Panel panelLeft = new Panel(new BorderLayout());
		panelLeft.add(srcMMEcoreButton, BorderLayout.NORTH);

		BorderLayout bl1 = new BorderLayout();
		bl1.setVgap(10);
		Panel panelbl1 = new Panel(bl1);
		panelLeft.add(panelbl1, BorderLayout.CENTER);
		panelbl1.add(srcMMEcoreTField, BorderLayout.NORTH);

		BorderLayout bl2 = new BorderLayout();
		Panel panelbl2 = new Panel(bl2);
		panelbl1.add(panelbl2, BorderLayout.CENTER);
		panelbl2.add(trgMMEcoreButton, BorderLayout.NORTH);

		BorderLayout bl3 = new BorderLayout();
		bl3.setVgap(10);
		Panel panelbl3 = new Panel(bl3);
		panelbl2.add(panelbl3, BorderLayout.CENTER);
		panelbl3.add(trgMMEcoreTField, BorderLayout.NORTH);

		BorderLayout bl4 = new BorderLayout();
		Panel panelbl4 = new Panel(bl4);
		panelbl3.add(panelbl4, BorderLayout.CENTER);
		panelbl4.add(constraintsButton, BorderLayout.NORTH);

		BorderLayout bl5 = new BorderLayout();
		bl5.setVgap(10);
		Panel panelbl5 = new Panel(bl5);
		panelbl4.add(panelbl5, BorderLayout.CENTER);
		panelbl5.add(constraintsTField, BorderLayout.NORTH);
		
		BorderLayout bl6 = new BorderLayout();
		Panel panelbl6 = new Panel(bl6);
		panelbl5.add(panelbl6, BorderLayout.CENTER);
		panelbl6.add(ruleTypesButton, BorderLayout.NORTH);

		BorderLayout bl7 = new BorderLayout();
		bl7.setVgap(10);
		Panel panelbl7 = new Panel(bl7);
		panelbl6.add(panelbl7, BorderLayout.CENTER);
		panelbl7.add(ruleTypesTField, BorderLayout.NORTH);

		BorderLayout bl8 = new BorderLayout();
		Panel panelbl8 = new Panel(bl8);
		panelbl7.add(panelbl8, BorderLayout.CENTER);
		panelbl8.add(outputFileButton, BorderLayout.NORTH);

		BorderLayout bl9 = new BorderLayout();
		bl9.setVgap(10);
		Panel panelbl9 = new Panel(bl9);
		panelbl8.add(panelbl9, BorderLayout.CENTER);
		panelbl9.add(outputFileTField, BorderLayout.NORTH);
		
		BorderLayout b10 = new BorderLayout();
		b10.setVgap(10);
		Panel panelbl10 = new Panel(b10);
		panelbl9.add(panelbl10, BorderLayout.CENTER);
		FlowLayout fl = new FlowLayout();
		Panel flPanel = new Panel(fl);
		panelbl10.add(flPanel, BorderLayout.NORTH);
		flPanel.add(thresholdLabel); flPanel.add(thresholdTField);

		BorderLayout bl11 = new BorderLayout();
		Panel panelbl11 = new Panel(bl11);
		panelbl10.add(panelbl11, BorderLayout.CENTER);
		panelbl11.add(mtButton, BorderLayout.NORTH);
		
		

		BorderLayout bl15 = new BorderLayout();
		bl15.setVgap(10);
		Panel panelRight = new Panel(bl15);
		messageLabel.setBackground(null);
		messageLabel.setEditable(false);
		messageLabel.setBorder(null);
		messageLabel.setLineWrap(true);
		messageLabel.setWrapStyleWord(true);
		messageLabel.setFocusable(false);
		JScrollPane sp = new JScrollPane(messageLabel);
		panelRight.add(sp, BorderLayout.CENTER);
		// panelRight.add(scroll, BorderLayout.CENTER);

		// BorderLayout bl16 = new BorderLayout(); bl16.setVgap(10);
		// Panel panelRightDown = new Panel(bl16);
		messageLabel2.setBackground(null);
		messageLabel2.setEditable(false);
		messageLabel2.setBorder(null);
		messageLabel2.setLineWrap(true);
		messageLabel2.setWrapStyleWord(true);
		messageLabel2.setFocusable(false);
		panelRight.add(messageLabel2, BorderLayout.SOUTH);

		BorderLayout bl = new BorderLayout();
		bl.setVgap(100);
		bl.setHgap(10);
		Panel panelTop = new Panel(bl);
		panelTop.add(panelLeft, BorderLayout.WEST);
		panelTop.add(panelRight, BorderLayout.CENTER);

		Panel panel = new Panel(new BorderLayout());
		panel.add(panelTop, BorderLayout.CENTER);

		BorderLayout blFinal = new BorderLayout();
		blFinal.setVgap(10);
		Panel pFinal = new Panel(blFinal);
		pFinal.add(panel, BorderLayout.CENTER);

		add("Center", pFinal);

		this.setTitle("Matching Tables Builder");
		this.pack();
		this.setVisible(true);
		this.setSize(650, 410);
		this.setLocation(300, 300);
		// this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void controller(ActionListener controller) {

		constraintsButton.addActionListener(controller);
		constraintsButton.setActionCommand(CONSTRAINTS);
		
		ruleTypesButton.addActionListener(controller);
		ruleTypesButton.setActionCommand(RULE_TYPES);

		srcMMEcoreButton.addActionListener(controller);
		srcMMEcoreButton.setActionCommand(SRC_MM);

		trgMMEcoreButton.addActionListener(controller);
		trgMMEcoreButton.setActionCommand(TRG_MM);

		outputFileButton.addActionListener(controller);
		outputFileButton.setActionCommand(CSV_FILE);

		mtButton.addActionListener(controller);
		mtButton.setActionCommand(GET_MT);
	}
	
	public void constraintsClick() {
		constraintsChooser = new JFileChooser();
		constraintsChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".txt")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "txt";
					}
				});
		constraintsChooser.setCurrentDirectory(new File("."));
		constraintsChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = constraintsChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			constraintsTField.setText(constraintsChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	public void ruleTypesClick() {
		ruleTypesChooser = new JFileChooser();
		ruleTypesChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".xmi")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "atl";
					}
				});
		ruleTypesChooser.setCurrentDirectory(new File("."));
		ruleTypesChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = ruleTypesChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			ruleTypesTField.setText(ruleTypesChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	public void srcMMEcoreClick() {
		srcMMecoreChooser = new JFileChooser();
		srcMMecoreChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".ecore")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "ecore";
					}
				});
		srcMMecoreChooser.setCurrentDirectory(new File("."));
		srcMMecoreChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = srcMMecoreChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			srcMMEcoreTField.setText(srcMMecoreChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	public void trgMMEcoreClick() {
		trgMMecoreChooser = new JFileChooser();
		trgMMecoreChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".ecore")
								|| f.isDirectory();
					}

					public String getDescription() {
						return "ecore";
					}
				});
		trgMMecoreChooser.setCurrentDirectory(new File("."));
		trgMMecoreChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int s = trgMMecoreChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			trgMMEcoreTField.setText(trgMMecoreChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	public void csvFileClick() {
		csvChooser = new JFileChooser();
		csvChooser.setCurrentDirectory(new File("."));
		csvChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int s = csvChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			outputFileTField.setText(csvChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}

	/*
	 * Button that executes the whole thing. First, the ATL file is injected
	 * into a model.Then, types from the model are extracted. Finally, the
	 * Similarity Matrix is calculated
	 */
	public void getMatchingTablesClick() {

		messageLabel.setText("");
		messageLabel.update(messageLabel.getGraphics());
		messageLabel2.setText("");
		messageLabel2.update(messageLabel.getGraphics());

		boolean ok = true;

		try {
			getConstraints(constraintsTField.getText());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ok = checkFields(ruleTypesTField.getText(), srcMMEcoreTField.getText(),
				trgMMEcoreTField.getText(), outputFileTField.getText());

		try {
			if (ok) {
				
				messageLabel.append("Building Matching Tables... \n");
				messageLabel.update(messageLabel.getGraphics());
				
				String[] exprs = getConstraints(constraintsTField.getText());
				
				MatchingTablesBuilder t2a;
		
				t2a = new MatchingTablesBuilder(exprs, ruleTypesTField.getText(), srcMMEcoreTField.getText(), trgMMEcoreTField.getText());
				t2a.build();
				String pathCSV = outputFileTField.getText() + "/" + 
						srcMMecoreChooser.getSelectedFile().getName().substring(0, srcMMecoreChooser.getSelectedFile().getName().lastIndexOf('.'))+
						"2"+
						trgMMecoreChooser.getSelectedFile().getName().substring(0, trgMMecoreChooser.getSelectedFile().getName().lastIndexOf('.'))+
						"MT.csv";
				System.out.println(pathCSV);
				t2a.generateCSV(pathCSV);
				t2a.applyThreashold(Double.parseDouble(thresholdTField.getText()));
				t2a.print();
				t2a.printReport(t2a.generateReport());
				
				messageLabel.append("Matching Tables Built successfully \n");
				messageLabel.update(messageLabel.getGraphics());
				messageLabel.append("\n--- Report ---\nIn the following, for every constraint, it is provided the list of ATL rules ordered according the chances they have of being the guilty rule:\n");
				messageLabel.update(messageLabel.getGraphics());
				String report = printReport(t2a.generateReport());
				messageLabel.append(report);
				messageLabel.update(messageLabel.getGraphics());
				
			}
		} catch (NoSystemException e) {
			messageLabel.setText("ERROR. "+ e.getMessage());
			e.printStackTrace();
		} catch (ATLCoreException e) {
			messageLabel.setText("ERROR. "+ e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			messageLabel.setText("ERROR. "+ e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			messageLabel.setText("ERROR. "+ e.getMessage());
			e.printStackTrace();
		}

	}

	public String printReport(int[][] report) {
		String reportS = "";
		for (int i=0; i<report.length; i++){
			reportS += "  C"+(i+1)+": ";
			for (int j=0; j<report[0].length; j++){
				if (report[i][j]!=-1){
					if (j==(report[0].length-1) || report[i][j+1]==-1){
						reportS += "R"+(report[i][j]+1);
					} else {
						reportS += "R"+(report[i][j]+1)+", ";
					}
				}
			}
			reportS += "\n";
		}
		return reportS;
	}
	
	private String[] getConstraints(String path) throws IOException {
		
		LinkedList<String> list = new LinkedList<String>();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String text = br.readLine();
		
		while (text!=null){
			if (!text.startsWith("--")){
				list.add(text);
			}
			text = br.readLine();
		}
		
	
			
//		while (text!=null && text.contains("inv:")){
//			String expr = text.substring(0, text.indexOf("inv:"));
//			list.add(expr);
//			text = text.substring(text.indexOf("inv:")+4, text.length());
//		}
	
		br.close();
		fr.close();
		return list.toArray(new String[list.size()]);
	}

	private boolean checkFields(String pathSrcMMEcoreFile,
			String pathTrgMMEcoreFile, String pathATLTransformation,
			String csvPath) {

		boolean ok = true;

		if (!new File(pathATLTransformation).exists()) {
			messageLabel
					.setText("  ERROR. File for the XMI model with the transformation types not found.");
			ok = false;
		} else if (!new File(pathSrcMMEcoreFile).exists()
				&& !pathSrcMMEcoreFile.startsWith("http://")) {
			messageLabel
					.setText("  ERROR. File for source metamodel not found.");
			ok = false;
		} else if (!new File(pathTrgMMEcoreFile).exists()
				&& !pathTrgMMEcoreFile.startsWith("http://")) {
			messageLabel
					.setText("  ERROR. File for the target metamodel not found.");
			ok = false;
		} else if (!new File(csvPath).exists() && !csvPath.contains(" ")) {
			File file = new File(csvPath);
			file.mkdir();
		} else if (Double.parseDouble(thresholdTField.getText())<0 || Double.parseDouble(thresholdTField.getText())>1){
			messageLabel
			.setText("  ERROR. Threshold must be a value between 0 and 1 both inclusive.");
			ok = false;
		}

		return ok;

	}
}
