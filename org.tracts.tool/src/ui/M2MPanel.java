package ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class M2MPanel {

	Button atlTransformationButton, srcMMEcoreButton, trgMMEcoreButton,
		tractsButton, asslButton, tempFolderButton,
		checkButton;
	
	JLabel invocationAsslLabel, numExecAsslLabel, resultLabel, errorLabel;
	
	JFileChooser atlTransformationChooser, srcMMEcoreChooser,
		trgMMEcoreChooser, tractsChooser, execUseChooser, asslChooser,
		tempFolderChooser;
	
	public Button getAtlTransformationButton() {
		return atlTransformationButton;
	}

	public void setAtlTransformationButton(Button atlTransformationButton) {
		this.atlTransformationButton = atlTransformationButton;
	}

	public Button getSrcMMEcoreButton() {
		return srcMMEcoreButton;
	}

	public void setSrcMMEcoreButton(Button srcMMEcoreButton) {
		this.srcMMEcoreButton = srcMMEcoreButton;
	}

	public Button getTrgMMEcoreButton() {
		return trgMMEcoreButton;
	}

	public void setTrgMMEcoreButton(Button trgMMEcoreButton) {
		this.trgMMEcoreButton = trgMMEcoreButton;
	}

	public Button getTractsButton() {
		return tractsButton;
	}

	public void setTractsButton(Button tractsButton) {
		this.tractsButton = tractsButton;
	}

	public Button getAsslButton() {
		return asslButton;
	}

	public void setAsslButton(Button asslButton) {
		this.asslButton = asslButton;
	}

	public Button getTempFolderButton() {
		return tempFolderButton;
	}

	public void setTempFolderButton(Button tempFolderButton) {
		this.tempFolderButton = tempFolderButton;
	}

	public Button getCheckButton() {
		return checkButton;
	}

	public void setCheckButton(Button checkButton) {
		this.checkButton = checkButton;
	}

	public JLabel getInvocationAsslLabel() {
		return invocationAsslLabel;
	}

	public void setInvocationAsslLabel(JLabel invocationAsslLabel) {
		this.invocationAsslLabel = invocationAsslLabel;
	}

	public JLabel getNumExecAsslLabel() {
		return numExecAsslLabel;
	}

	public void setNumExecAsslLabel(JLabel numExecAsslLabel) {
		this.numExecAsslLabel = numExecAsslLabel;
	}

	public JLabel getResultLabel() {
		return resultLabel;
	}

	public void setResultLabel(JLabel resultLabel) {
		this.resultLabel = resultLabel;
	}

	public JLabel getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(JLabel errorLabel) {
		this.errorLabel = errorLabel;
	}

	public JFileChooser getAtlTransformationChooser() {
		return atlTransformationChooser;
	}

	public void setAtlTransformationChooser(JFileChooser atlTransformationChooser) {
		this.atlTransformationChooser = atlTransformationChooser;
	}

	public JFileChooser getSrcMMEcoreChooser() {
		return srcMMEcoreChooser;
	}

	public void setSrcMMEcoreChooser(JFileChooser srcMMEcoreChooser) {
		this.srcMMEcoreChooser = srcMMEcoreChooser;
	}

	public JFileChooser getTrgMMEcoreChooser() {
		return trgMMEcoreChooser;
	}

	public void setTrgMMEcoreChooser(JFileChooser trgMMEcoreChooser) {
		this.trgMMEcoreChooser = trgMMEcoreChooser;
	}

	public JFileChooser getTractsChooser() {
		return tractsChooser;
	}

	public void setTractsChooser(JFileChooser tractsChooser) {
		this.tractsChooser = tractsChooser;
	}

	public JFileChooser getExecUseChooser() {
		return execUseChooser;
	}

	public void setExecUseChooser(JFileChooser execUseChooser) {
		this.execUseChooser = execUseChooser;
	}

	public JFileChooser getAsslChooser() {
		return asslChooser;
	}

	public void setAsslChooser(JFileChooser asslChooser) {
		this.asslChooser = asslChooser;
	}

	public JFileChooser getTempFolderChooser() {
		return tempFolderChooser;
	}

	public void setTempFolderChooser(JFileChooser tempFolderChooser) {
		this.tempFolderChooser = tempFolderChooser;
	}

	public JTextField getAtlTransformationTField() {
		return atlTransformationTField;
	}

	public void setAtlTransformationTField(JTextField atlTransformationTField) {
		this.atlTransformationTField = atlTransformationTField;
	}

	public JTextField getSrcMMEcoreTField() {
		return srcMMEcoreTField;
	}

	public void setSrcMMEcoreTField(JTextField srcMMEcoreTField) {
		this.srcMMEcoreTField = srcMMEcoreTField;
	}

	public JTextField getTrgMMEcoreTField() {
		return trgMMEcoreTField;
	}

	public void setTrgMMEcoreTField(JTextField trgMMEcoreTField) {
		this.trgMMEcoreTField = trgMMEcoreTField;
	}

	public JTextField getTractsTField() {
		return tractsTField;
	}

	public void setTractsTField(JTextField tractsTField) {
		this.tractsTField = tractsTField;
	}

	public JTextField getAsslTField() {
		return asslTField;
	}

	public void setAsslTField(JTextField asslTField) {
		this.asslTField = asslTField;
	}

	public JTextField getInvocationAsslTField() {
		return invocationAsslTField;
	}

	public void setInvocationAsslTField(JTextField invocationAsslTField) {
		this.invocationAsslTField = invocationAsslTField;
	}

	public JTextField getNumExecAsslTField() {
		return numExecAsslTField;
	}

	public void setNumExecAsslTField(JTextField numExecAsslTField) {
		this.numExecAsslTField = numExecAsslTField;
	}

	public JTextField getTempFolderTField() {
		return tempFolderTField;
	}

	public void setTempFolderTField(JTextField tempFolderTField) {
		this.tempFolderTField = tempFolderTField;
	}

	public JTextArea getResultTArea() {
		return resultTArea;
	}

	public void setResultTArea(JTextArea resultTArea) {
		this.resultTArea = resultTArea;
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	JTextField atlTransformationTField, srcMMEcoreTField, trgMMEcoreTField,
		tractsTField, asslTField, invocationAsslTField,
		numExecAsslTField, tempFolderTField;
	
	JTextArea resultTArea;
	
	Panel panel;
	
	public M2MPanel(){
		
		Dimension buttonsDimension = new Dimension(300, 25);

		srcMMEcoreButton = new Button("Select source metamodel (.ecore or URI)");
		srcMMEcoreButton.setPreferredSize(buttonsDimension);
		srcMMEcoreTField = new JTextField();
		srcMMEcoreTField.setPreferredSize(buttonsDimension);

		trgMMEcoreButton = new Button("Select target metamodel (.ecore or URI)");
		trgMMEcoreButton.setPreferredSize(buttonsDimension);
		trgMMEcoreTField = new JTextField();
		trgMMEcoreTField.setPreferredSize(buttonsDimension);

		tractsButton = new Button("Select the tracts file");
		tractsButton.setPreferredSize(buttonsDimension);
		tractsTField = new JTextField();
		tractsTField.setPreferredSize(buttonsDimension);

		asslButton = new Button("Select ASSL or src model file (.xmi or .ecore)");
		asslButton.setPreferredSize(buttonsDimension);
		asslTField = new JTextField();
		asslTField.setPreferredSize(buttonsDimension);

		invocationAsslLabel = new JLabel("Signature of the invocation to ASSL file:");
		invocationAsslTField = new JTextField();
		invocationAsslTField.setPreferredSize(buttonsDimension);
		
		atlTransformationButton = new Button("Select ATL transfo (.atl) or trg model file (.xmi or .ecore)");
		atlTransformationButton.setPreferredSize(buttonsDimension);
		atlTransformationTField = new JTextField();
		atlTransformationTField.setPreferredSize(buttonsDimension);

		tempFolderButton = new Button("Select a temporal folder");
		tempFolderButton.setPreferredSize(buttonsDimension);
		tempFolderTField = new JTextField();
		tempFolderTField.setPreferredSize(buttonsDimension);

		checkButton = new Button("Check");

		resultLabel = new JLabel("Result:");
		resultTArea = new JTextArea("", 25, 28);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(resultTArea);

		errorLabel = new JLabel("");
		errorLabel.setForeground(Color.red);

		
		Panel panelLeft = new Panel(new FlowLayout());
		panelLeft.add(srcMMEcoreButton);
		panelLeft.add(srcMMEcoreTField);
		panelLeft.add(trgMMEcoreButton);
		panelLeft.add(trgMMEcoreTField);
		panelLeft.add(tractsButton);
		panelLeft.add(tractsTField);
		panelLeft.add(asslButton);
		panelLeft.add(asslTField);
		panelLeft.add(invocationAsslLabel);
		panelLeft.add(invocationAsslTField);
		panelLeft.add(atlTransformationButton);
		panelLeft.add(atlTransformationTField);
		panelLeft.add(tempFolderButton);
		panelLeft.add(tempFolderTField);
		panelLeft.add(checkButton);

		Panel panelRight = new Panel(new FlowLayout());
		panelRight.add(resultLabel);
		panelRight.add(scroll);

		Panel panelTop = new Panel(new GridLayout(1, 2));
		panelTop.add(panelLeft);
		panelTop.add(panelRight);

		panel = new Panel(new BorderLayout());
		panel.add(panelTop, BorderLayout.CENTER);
		panel.add(errorLabel, BorderLayout.SOUTH);	
	}
	
	public Panel getM2MPanel(){
		return panel;
	}
}
