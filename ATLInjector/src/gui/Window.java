package gui;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;

import exceptions.*;
import ruleTypeExtraction.files.*;

public class Window extends JFrame implements View {

	private static final long serialVersionUID = 1L;

	Button atlTransButton, outputFileButton, outButton;
	
	JTextField atlTransTField, outputFileTField;
	
	JTextArea messageLabel, messageLabel2;
	
	JFileChooser atlTransformationChooser, outChooser;
	
	String ATLTransName;
	
	public Window() {

		Dimension buttonsDimension = new Dimension(300, 25);
		//Components of the panels: Buttons and TFields
		
		atlTransButton = new Button("Select transformation (.atl file)");
		atlTransButton.setPreferredSize(buttonsDimension);
		atlTransTField = new JTextField();
		atlTransTField.setPreferredSize(buttonsDimension);
		
		outputFileButton = new Button("Select directory for output file");
		outputFileButton.setPreferredSize(buttonsDimension);
		outputFileTField = new JTextField();
		outputFileTField.setPreferredSize(buttonsDimension);
		
		messageLabel = new JTextArea("");
		messageLabel.setForeground(Color.black);
		messageLabel2 = new JTextArea("");
		//JScrollPane scroll = new JScrollPane();
		//scroll.setViewportView(messageLabel);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(messageLabel);
		
		outButton = new Button("Inject Transformation");
		Font newButtonFont= new Font("DIALOG",Font.BOLD,12);
		outButton.setFont(newButtonFont);
		
		Panel panelLeft = new Panel(new BorderLayout());
		panelLeft.add(atlTransButton, BorderLayout.NORTH);
		
		BorderLayout bl1 = new BorderLayout(); bl1.setVgap(10);
		Panel panelbl1 = new Panel(bl1);	
		panelLeft.add(panelbl1, BorderLayout.CENTER);
		panelbl1.add(atlTransTField, BorderLayout.NORTH);
		
		BorderLayout bl2 = new BorderLayout();
		Panel panelbl2 = new Panel(bl2);
		panelbl1.add(panelbl2, BorderLayout.CENTER);
		panelbl2.add(outputFileButton, BorderLayout.NORTH);
		
		BorderLayout bl3 = new BorderLayout(); bl3.setVgap(10);
		Panel panelbl3 = new Panel(bl3);
		panelbl2.add(panelbl3, BorderLayout.CENTER);
		panelbl3.add(outputFileTField, BorderLayout.NORTH);
		
		BorderLayout bl4 = new BorderLayout();
		Panel panelbl4 = new Panel(bl4);
		panelbl3.add(panelbl4, BorderLayout.CENTER);
		panelbl4.add(outButton, BorderLayout.NORTH);
		
		BorderLayout bl15 = new BorderLayout(); bl15.setVgap(10);
		Panel panelRight = new Panel(bl15);
		messageLabel.setBackground(null);
		messageLabel.setEditable(false);
		messageLabel.setBorder(null);
		messageLabel.setLineWrap(true);
		messageLabel.setWrapStyleWord(true);
		messageLabel.setFocusable(false);
		JScrollPane sp = new JScrollPane(messageLabel);
		panelRight.add(sp, BorderLayout.CENTER);
		//panelRight.add(scroll, BorderLayout.CENTER);
		
		//BorderLayout bl16 = new BorderLayout(); bl16.setVgap(10);
		//Panel panelRightDown = new Panel(bl16);
		messageLabel2.setBackground(null);
		messageLabel2.setEditable(false);
		messageLabel2.setBorder(null);
		messageLabel2.setLineWrap(true);
		messageLabel2.setWrapStyleWord(true);
		messageLabel2.setFocusable(false);
		panelRight.add(messageLabel2, BorderLayout.SOUTH);
		
		BorderLayout bl = new BorderLayout(); bl.setVgap(100); bl.setHgap(10);
		Panel panelTop = new Panel(bl);
		panelTop.add(panelLeft, BorderLayout.WEST);
		panelTop.add(panelRight, BorderLayout.CENTER);
		
		Panel panel = new Panel(new BorderLayout());
		panel.add(panelTop, BorderLayout.CENTER);
		
		BorderLayout blFinal = new BorderLayout(); blFinal.setVgap(10); Panel pFinal = new Panel(blFinal);
		pFinal.add(panel, BorderLayout.CENTER);
		
		add("Center", pFinal);
		
		
		this.setTitle("ATL Injector");
		this.pack();
		this.setVisible(true);
		this.setSize(650, 190);
		this.setLocation(300, 300);
//		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void controller(ActionListener controller) {

		atlTransButton.addActionListener(controller);
		atlTransButton.setActionCommand(ATL_TRANS);

		outputFileButton.addActionListener(controller);
		outputFileButton.setActionCommand(OUT_FILE);

		outButton.addActionListener(controller);
		outButton.setActionCommand(GET_OUT);		
	}


	public void atlTransformationClick() {
		atlTransformationChooser = new JFileChooser();
		atlTransformationChooser
				.setFileFilter(new javax.swing.filechooser.FileFilter() {
					public boolean accept(File f) {
						return f.getName().toLowerCase().endsWith(".atl") ||
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
			atlTransTField.setText(atlTransformationChooser
					.getSelectedFile().getAbsolutePath());
			ATLTransName = atlTransformationChooser.getSelectedFile().getName();
		}
	}

	
	public void outFileClick() {
		outChooser = new JFileChooser();
		outChooser.setCurrentDirectory(new File("."));
		outChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int s = outChooser.showSaveDialog(new JFrame());
		if (s == JFileChooser.APPROVE_OPTION) {
			outputFileTField.setText(outChooser.getSelectedFile()
					.getAbsolutePath());
		}
	}	
	
	/*Button that executes the whole thing. First, the ATL file is injected into a model.
	 *Then, types from the model are extracted. Finally, the Similarity Matrix is calculated */
	public void getOutClick() {
		try{
			String pathATLTransformation = atlTransTField.getText();
			String pathOutFile = outputFileTField.getText();

			messageLabel.setText("");
			messageLabel.update(messageLabel.getGraphics());
			messageLabel2.setText("");
			messageLabel2.update(messageLabel.getGraphics());
			
			
			boolean ok = checkFields(pathATLTransformation, pathOutFile);

			if (ok){
				//ATLFile2Model afm = new ATLFile2Model(pathATLTransformation, pathCSVFile + "\trans_injected.xmi");
				ATLFile2Model afm = new ATLFile2Model(pathATLTransformation, 
												ATLTransName.substring(0, ATLTransName.lastIndexOf('.')) + "_Injected.xmi");
				File fl = new File (pathOutFile + "/" +  
						ATLTransName.substring(0, ATLTransName.lastIndexOf('.')) + "_Injected.xmi");
				System.out.println("creado1");
				File f = new File(ATLTransName.substring(0, ATLTransName.lastIndexOf('.')) + "_Injected.xmi");
				System.out.println("creado2");
				
				 InputStream input = null;
				 OutputStream output = null;
				 try {
				     input = new FileInputStream(f);
				     output = new FileOutputStream(fl);
				     byte[] buf = new byte[1024];
				     int bytesRead;
				     while ((bytesRead = input.read(buf)) > 0) {
				             output.write(buf, 0, bytesRead);
				     }
				     input.close();
			         output.close();
			         f.delete();
				} catch (FileNotFoundException e){
					messageLabel.setForeground(Color.red);
					messageLabel.append("FileNotFoundException: " + e.toString());
					messageLabel.update(messageLabel.getGraphics());
					e.printStackTrace();
				} catch (IOException e){
					messageLabel.setForeground(Color.red);
					messageLabel.append("IOException: " + e.toString());
					messageLabel.update(messageLabel.getGraphics());
					e.printStackTrace();
				}

				
				try{
					//messageLabel.setText(afm.injectATLTrafo());
					afm.injectATLTrafo();
					messageLabel.setText("Textual ATL transformation injected into a model --> OK \n --- \n");
					messageLabel.update(messageLabel.getGraphics());
				} catch (FileNotFoundException e){
					messageLabel.setForeground(Color.red);
					messageLabel.append("FileNotFoundException: " + e.toString());
					messageLabel.update(messageLabel.getGraphics());
					e.printStackTrace();
				} catch (ATLCoreException e){
					messageLabel.setForeground(Color.red);
					messageLabel.append("ATLCoreException: " + e.toString());
					messageLabel.update(messageLabel.getGraphics());
					e.printStackTrace();
				}
			}
		} catch (ParametersException e) {
			messageLabel.setText(e.toString());
			e.printStackTrace();
		}

	}
	
	private boolean checkFields(String pathATLTransformation, String outPath)	throws ParametersException {
			boolean ok = true;
			
			if (!new File(pathATLTransformation).exists()) {
				messageLabel
						.setText("  ERROR. File for the ATL transformation not found.");
				ok = false;
			} else if (!new File(outPath).exists() && !outPath.contains(" ")) {
				File file = new File(outPath);
				file.mkdir();
			}
			
			return ok;
	}
}
