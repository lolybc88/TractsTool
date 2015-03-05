/**
 */
package USE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link USE.ReferenceType#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see USE.USEPackage#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends Type {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(USE.Class)
	 * @see USE.USEPackage#getReferenceType_Class()
	 * @model required="true"
	 * @generated
	 */
	USE.Class getClass_();

	/**
	 * Sets the value of the '{@link USE.ReferenceType#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(USE.Class value);

} // ReferenceType
