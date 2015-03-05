/**
 */
package pro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pro.Model#getCreates <em>Creates</em>}</li>
 *   <li>{@link pro.Model#getSets <em>Sets</em>}</li>
 *   <li>{@link pro.Model#getInserts <em>Inserts</em>}</li>
 * </ul>
 * </p>
 *
 * @see pro.ProPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Creates</b></em>' containment reference list.
	 * The list contents are of type {@link pro.CreateG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creates</em>' containment reference list.
	 * @see pro.ProPackage#getModel_Creates()
	 * @model containment="true"
	 * @generated
	 */
	EList<CreateG> getCreates();

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link pro.SetG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see pro.ProPackage#getModel_Sets()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetG> getSets();

	/**
	 * Returns the value of the '<em><b>Inserts</b></em>' containment reference list.
	 * The list contents are of type {@link pro.InsertG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserts</em>' containment reference list.
	 * @see pro.ProPackage#getModel_Inserts()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsertG> getInserts();

} // Model
