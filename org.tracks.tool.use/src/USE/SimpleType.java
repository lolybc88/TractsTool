/**
 */
package USE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link USE.SimpleType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see USE.USEPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link USE.SimpleTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see USE.SimpleTypes
	 * @see #setType(SimpleTypes)
	 * @see USE.USEPackage#getSimpleType_Type()
	 * @model
	 * @generated
	 */
	SimpleTypes getType();

	/**
	 * Sets the value of the '{@link USE.SimpleType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see USE.SimpleTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleTypes value);

} // SimpleType
