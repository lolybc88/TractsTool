/**
 */
package USE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link USE.CollectionType#getType <em>Type</em>}</li>
 *   <li>{@link USE.CollectionType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see USE.USEPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link USE.CollectionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see USE.CollectionTypes
	 * @see #setType(CollectionTypes)
	 * @see USE.USEPackage#getCollectionType_Type()
	 * @model
	 * @generated
	 */
	CollectionTypes getType();

	/**
	 * Sets the value of the '{@link USE.CollectionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see USE.CollectionTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(CollectionTypes value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(Type)
	 * @see USE.USEPackage#getCollectionType_BaseType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getBaseType();

	/**
	 * Sets the value of the '{@link USE.CollectionType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(Type value);

} // CollectionType
