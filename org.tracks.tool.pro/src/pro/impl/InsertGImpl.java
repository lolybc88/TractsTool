/**
 */
package pro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import pro.InsertG;
import pro.ProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert G</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pro.impl.InsertGImpl#getObj1 <em>Obj1</em>}</li>
 *   <li>{@link pro.impl.InsertGImpl#getObj2 <em>Obj2</em>}</li>
 *   <li>{@link pro.impl.InsertGImpl#getRel <em>Rel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertGImpl extends EObjectImpl implements InsertG {
	/**
	 * The default value of the '{@link #getObj1() <em>Obj1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj1()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObj1() <em>Obj1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj1()
	 * @generated
	 * @ordered
	 */
	protected String obj1 = OBJ1_EDEFAULT;

	/**
	 * The default value of the '{@link #getObj2() <em>Obj2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj2()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObj2() <em>Obj2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj2()
	 * @generated
	 * @ordered
	 */
	protected String obj2 = OBJ2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected String rel = REL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProPackage.Literals.INSERT_G;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObj1() {
		return obj1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObj1(String newObj1) {
		String oldObj1 = obj1;
		obj1 = newObj1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProPackage.INSERT_G__OBJ1, oldObj1, obj1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObj2() {
		return obj2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObj2(String newObj2) {
		String oldObj2 = obj2;
		obj2 = newObj2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProPackage.INSERT_G__OBJ2, oldObj2, obj2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(String newRel) {
		String oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProPackage.INSERT_G__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProPackage.INSERT_G__OBJ1:
				return getObj1();
			case ProPackage.INSERT_G__OBJ2:
				return getObj2();
			case ProPackage.INSERT_G__REL:
				return getRel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProPackage.INSERT_G__OBJ1:
				setObj1((String)newValue);
				return;
			case ProPackage.INSERT_G__OBJ2:
				setObj2((String)newValue);
				return;
			case ProPackage.INSERT_G__REL:
				setRel((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProPackage.INSERT_G__OBJ1:
				setObj1(OBJ1_EDEFAULT);
				return;
			case ProPackage.INSERT_G__OBJ2:
				setObj2(OBJ2_EDEFAULT);
				return;
			case ProPackage.INSERT_G__REL:
				setRel(REL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProPackage.INSERT_G__OBJ1:
				return OBJ1_EDEFAULT == null ? obj1 != null : !OBJ1_EDEFAULT.equals(obj1);
			case ProPackage.INSERT_G__OBJ2:
				return OBJ2_EDEFAULT == null ? obj2 != null : !OBJ2_EDEFAULT.equals(obj2);
			case ProPackage.INSERT_G__REL:
				return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (obj1: ");
		result.append(obj1);
		result.append(", obj2: ");
		result.append(obj2);
		result.append(", rel: ");
		result.append(rel);
		result.append(')');
		return result.toString();
	}

} //InsertGImpl
