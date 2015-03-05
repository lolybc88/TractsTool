/**
 */
package pro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pro.ProFactory
 * @model kind="package"
 * @generated
 */
public interface ProPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pro/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProPackage eINSTANCE = pro.impl.ProPackageImpl.init();

	/**
	 * The meta object id for the '{@link pro.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pro.impl.ModelImpl
	 * @see pro.impl.ProPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Creates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CREATES = 0;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SETS = 1;

	/**
	 * The feature id for the '<em><b>Inserts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INSERTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pro.impl.CreateGImpl <em>Create G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pro.impl.CreateGImpl
	 * @see pro.impl.ProPackageImpl#getCreateG()
	 * @generated
	 */
	int CREATE_G = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_G__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_G__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Create G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_G_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link pro.impl.SetGImpl <em>Set G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pro.impl.SetGImpl
	 * @see pro.impl.ProPackageImpl#getSetG()
	 * @generated
	 */
	int SET_G = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_G__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_G__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_G__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Set G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_G_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link pro.impl.InsertGImpl <em>Insert G</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pro.impl.InsertGImpl
	 * @see pro.impl.ProPackageImpl#getInsertG()
	 * @generated
	 */
	int INSERT_G = 3;

	/**
	 * The feature id for the '<em><b>Obj1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_G__OBJ1 = 0;

	/**
	 * The feature id for the '<em><b>Obj2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_G__OBJ2 = 1;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_G__REL = 2;

	/**
	 * The number of structural features of the '<em>Insert G</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_G_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link pro.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see pro.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link pro.Model#getCreates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creates</em>'.
	 * @see pro.Model#getCreates()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Creates();

	/**
	 * Returns the meta object for the containment reference list '{@link pro.Model#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see pro.Model#getSets()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Sets();

	/**
	 * Returns the meta object for the containment reference list '{@link pro.Model#getInserts <em>Inserts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inserts</em>'.
	 * @see pro.Model#getInserts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Inserts();

	/**
	 * Returns the meta object for class '{@link pro.CreateG <em>Create G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create G</em>'.
	 * @see pro.CreateG
	 * @generated
	 */
	EClass getCreateG();

	/**
	 * Returns the meta object for the attribute '{@link pro.CreateG#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see pro.CreateG#getObject()
	 * @see #getCreateG()
	 * @generated
	 */
	EAttribute getCreateG_Object();

	/**
	 * Returns the meta object for the attribute '{@link pro.CreateG#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pro.CreateG#getType()
	 * @see #getCreateG()
	 * @generated
	 */
	EAttribute getCreateG_Type();

	/**
	 * Returns the meta object for class '{@link pro.SetG <em>Set G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set G</em>'.
	 * @see pro.SetG
	 * @generated
	 */
	EClass getSetG();

	/**
	 * Returns the meta object for the attribute '{@link pro.SetG#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see pro.SetG#getObject()
	 * @see #getSetG()
	 * @generated
	 */
	EAttribute getSetG_Object();

	/**
	 * Returns the meta object for the attribute '{@link pro.SetG#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see pro.SetG#getAttribute()
	 * @see #getSetG()
	 * @generated
	 */
	EAttribute getSetG_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link pro.SetG#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pro.SetG#getValue()
	 * @see #getSetG()
	 * @generated
	 */
	EAttribute getSetG_Value();

	/**
	 * Returns the meta object for class '{@link pro.InsertG <em>Insert G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert G</em>'.
	 * @see pro.InsertG
	 * @generated
	 */
	EClass getInsertG();

	/**
	 * Returns the meta object for the attribute '{@link pro.InsertG#getObj1 <em>Obj1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj1</em>'.
	 * @see pro.InsertG#getObj1()
	 * @see #getInsertG()
	 * @generated
	 */
	EAttribute getInsertG_Obj1();

	/**
	 * Returns the meta object for the attribute '{@link pro.InsertG#getObj2 <em>Obj2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj2</em>'.
	 * @see pro.InsertG#getObj2()
	 * @see #getInsertG()
	 * @generated
	 */
	EAttribute getInsertG_Obj2();

	/**
	 * Returns the meta object for the attribute '{@link pro.InsertG#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see pro.InsertG#getRel()
	 * @see #getInsertG()
	 * @generated
	 */
	EAttribute getInsertG_Rel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProFactory getProFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pro.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pro.impl.ModelImpl
		 * @see pro.impl.ProPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Creates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CREATES = eINSTANCE.getModel_Creates();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SETS = eINSTANCE.getModel_Sets();

		/**
		 * The meta object literal for the '<em><b>Inserts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INSERTS = eINSTANCE.getModel_Inserts();

		/**
		 * The meta object literal for the '{@link pro.impl.CreateGImpl <em>Create G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pro.impl.CreateGImpl
		 * @see pro.impl.ProPackageImpl#getCreateG()
		 * @generated
		 */
		EClass CREATE_G = eINSTANCE.getCreateG();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_G__OBJECT = eINSTANCE.getCreateG_Object();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_G__TYPE = eINSTANCE.getCreateG_Type();

		/**
		 * The meta object literal for the '{@link pro.impl.SetGImpl <em>Set G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pro.impl.SetGImpl
		 * @see pro.impl.ProPackageImpl#getSetG()
		 * @generated
		 */
		EClass SET_G = eINSTANCE.getSetG();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_G__OBJECT = eINSTANCE.getSetG_Object();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_G__ATTRIBUTE = eINSTANCE.getSetG_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_G__VALUE = eINSTANCE.getSetG_Value();

		/**
		 * The meta object literal for the '{@link pro.impl.InsertGImpl <em>Insert G</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pro.impl.InsertGImpl
		 * @see pro.impl.ProPackageImpl#getInsertG()
		 * @generated
		 */
		EClass INSERT_G = eINSTANCE.getInsertG();

		/**
		 * The meta object literal for the '<em><b>Obj1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_G__OBJ1 = eINSTANCE.getInsertG_Obj1();

		/**
		 * The meta object literal for the '<em><b>Obj2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_G__OBJ2 = eINSTANCE.getInsertG_Obj2();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_G__REL = eINSTANCE.getInsertG_Rel();

	}

} //ProPackage
