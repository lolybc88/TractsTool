/**
 */
package pro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pro.CreateG;
import pro.InsertG;
import pro.Model;
import pro.ProPackage;
import pro.SetG;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pro.impl.ModelImpl#getCreates <em>Creates</em>}</li>
 *   <li>{@link pro.impl.ModelImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link pro.impl.ModelImpl#getInserts <em>Inserts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getCreates() <em>Creates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreates()
	 * @generated
	 * @ordered
	 */
	protected EList<CreateG> creates;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<SetG> sets;

	/**
	 * The cached value of the '{@link #getInserts() <em>Inserts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserts()
	 * @generated
	 * @ordered
	 */
	protected EList<InsertG> inserts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateG> getCreates() {
		if (creates == null) {
			creates = new EObjectContainmentEList<CreateG>(CreateG.class, this, ProPackage.MODEL__CREATES);
		}
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetG> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentEList<SetG>(SetG.class, this, ProPackage.MODEL__SETS);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsertG> getInserts() {
		if (inserts == null) {
			inserts = new EObjectContainmentEList<InsertG>(InsertG.class, this, ProPackage.MODEL__INSERTS);
		}
		return inserts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProPackage.MODEL__CREATES:
				return ((InternalEList<?>)getCreates()).basicRemove(otherEnd, msgs);
			case ProPackage.MODEL__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case ProPackage.MODEL__INSERTS:
				return ((InternalEList<?>)getInserts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProPackage.MODEL__CREATES:
				return getCreates();
			case ProPackage.MODEL__SETS:
				return getSets();
			case ProPackage.MODEL__INSERTS:
				return getInserts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProPackage.MODEL__CREATES:
				getCreates().clear();
				getCreates().addAll((Collection<? extends CreateG>)newValue);
				return;
			case ProPackage.MODEL__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends SetG>)newValue);
				return;
			case ProPackage.MODEL__INSERTS:
				getInserts().clear();
				getInserts().addAll((Collection<? extends InsertG>)newValue);
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
			case ProPackage.MODEL__CREATES:
				getCreates().clear();
				return;
			case ProPackage.MODEL__SETS:
				getSets().clear();
				return;
			case ProPackage.MODEL__INSERTS:
				getInserts().clear();
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
			case ProPackage.MODEL__CREATES:
				return creates != null && !creates.isEmpty();
			case ProPackage.MODEL__SETS:
				return sets != null && !sets.isEmpty();
			case ProPackage.MODEL__INSERTS:
				return inserts != null && !inserts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
