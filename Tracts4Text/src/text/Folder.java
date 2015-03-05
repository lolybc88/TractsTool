/**
 */
package text;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link text.Folder#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see text.TextPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends Entity {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link text.Entity}.
	 * It is bidirectional and its opposite is '{@link text.Entity#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see text.TextPackage#getFolder_Content()
	 * @see text.Entity#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Entity> getContent();

} // Folder
