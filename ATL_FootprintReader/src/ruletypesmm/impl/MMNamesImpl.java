/**
 */
package ruletypesmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ruletypesmm.MMNames;
import ruletypesmm.RuletypesmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MM Names</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruletypesmm.impl.MMNamesImpl#getInputMM <em>Input MM</em>}</li>
 *   <li>{@link ruletypesmm.impl.MMNamesImpl#getOutputMM <em>Output MM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMNamesImpl extends EObjectImpl implements MMNames {
	/**
	 * The default value of the '{@link #getInputMM() <em>Input MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMM()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputMM() <em>Input MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMM()
	 * @generated
	 * @ordered
	 */
	protected String inputMM = INPUT_MM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputMM() <em>Output MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMM()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMM() <em>Output MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMM()
	 * @generated
	 * @ordered
	 */
	protected String outputMM = OUTPUT_MM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMNamesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuletypesmmPackage.Literals.MM_NAMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputMM() {
		return inputMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputMM(String newInputMM) {
		String oldInputMM = inputMM;
		inputMM = newInputMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuletypesmmPackage.MM_NAMES__INPUT_MM, oldInputMM, inputMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputMM() {
		return outputMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMM(String newOutputMM) {
		String oldOutputMM = outputMM;
		outputMM = newOutputMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuletypesmmPackage.MM_NAMES__OUTPUT_MM, oldOutputMM, outputMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuletypesmmPackage.MM_NAMES__INPUT_MM:
				return getInputMM();
			case RuletypesmmPackage.MM_NAMES__OUTPUT_MM:
				return getOutputMM();
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
			case RuletypesmmPackage.MM_NAMES__INPUT_MM:
				setInputMM((String)newValue);
				return;
			case RuletypesmmPackage.MM_NAMES__OUTPUT_MM:
				setOutputMM((String)newValue);
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
			case RuletypesmmPackage.MM_NAMES__INPUT_MM:
				setInputMM(INPUT_MM_EDEFAULT);
				return;
			case RuletypesmmPackage.MM_NAMES__OUTPUT_MM:
				setOutputMM(OUTPUT_MM_EDEFAULT);
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
			case RuletypesmmPackage.MM_NAMES__INPUT_MM:
				return INPUT_MM_EDEFAULT == null ? inputMM != null : !INPUT_MM_EDEFAULT.equals(inputMM);
			case RuletypesmmPackage.MM_NAMES__OUTPUT_MM:
				return OUTPUT_MM_EDEFAULT == null ? outputMM != null : !OUTPUT_MM_EDEFAULT.equals(outputMM);
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
		result.append(" (inputMM: ");
		result.append(inputMM);
		result.append(", outputMM: ");
		result.append(outputMM);
		result.append(')');
		return result.toString();
	}

} //MMNamesImpl
