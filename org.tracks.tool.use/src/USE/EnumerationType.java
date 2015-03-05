/**
 */
package USE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link USE.EnumerationType#getEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see USE.USEPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends Type {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' reference.
	 * @see #setEnum(Enumeration)
	 * @see USE.USEPackage#getEnumerationType_Enum()
	 * @model required="true"
	 * @generated
	 */
	Enumeration getEnum();

	/**
	 * Sets the value of the '{@link USE.EnumerationType#getEnum <em>Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(Enumeration value);

} // EnumerationType
