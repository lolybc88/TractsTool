/**
 */
package ruletypesmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MM Names</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ruletypesmm.MMNames#getInputMM <em>Input MM</em>}</li>
 *   <li>{@link ruletypesmm.MMNames#getOutputMM <em>Output MM</em>}</li>
 * </ul>
 * </p>
 *
 * @see ruletypesmm.RuletypesmmPackage#getMMNames()
 * @model
 * @generated
 */
public interface MMNames extends EObject {
	/**
	 * Returns the value of the '<em><b>Input MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input MM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input MM</em>' attribute.
	 * @see #setInputMM(String)
	 * @see ruletypesmm.RuletypesmmPackage#getMMNames_InputMM()
	 * @model required="true"
	 * @generated
	 */
	String getInputMM();

	/**
	 * Sets the value of the '{@link ruletypesmm.MMNames#getInputMM <em>Input MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input MM</em>' attribute.
	 * @see #getInputMM()
	 * @generated
	 */
	void setInputMM(String value);

	/**
	 * Returns the value of the '<em><b>Output MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output MM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output MM</em>' attribute.
	 * @see #setOutputMM(String)
	 * @see ruletypesmm.RuletypesmmPackage#getMMNames_OutputMM()
	 * @model required="true"
	 * @generated
	 */
	String getOutputMM();

	/**
	 * Sets the value of the '{@link ruletypesmm.MMNames#getOutputMM <em>Output MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output MM</em>' attribute.
	 * @see #getOutputMM()
	 * @generated
	 */
	void setOutputMM(String value);

} // MMNames
