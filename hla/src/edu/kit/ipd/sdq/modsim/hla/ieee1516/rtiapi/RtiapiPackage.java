/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiFactory
 * @model kind="package"
 * @generated
 */
public interface RtiapiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rtiapi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kit.edu/ipd/sdq/modsim/hla/ieee1516/rtiapi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtiapiPackage eINSTANCE = edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.FederateImpl <em>Federate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.FederateImpl
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiPackageImpl#getFederate()
	 * @generated
	 */
	int FEDERATE = 0;

	/**
	 * The feature id for the '<em><b>HLA Federate Ambassador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATE__HLA_FEDERATE_AMBASSADOR = 0;

	/**
	 * The number of structural features of the '<em>Federate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Federate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEDERATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>HLA Federate Ambassador</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hla.rti1516e.FederateAmbassador
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiPackageImpl#getHLAFederateAmbassador()
	 * @generated
	 */
	int HLA_FEDERATE_AMBASSADOR = 1;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate <em>Federate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Federate</em>'.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate
	 * @generated
	 */
	EClass getFederate();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate#getHLAFederateAmbassador <em>HLA Federate Ambassador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HLA Federate Ambassador</em>'.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate#getHLAFederateAmbassador()
	 * @see #getFederate()
	 * @generated
	 */
	EAttribute getFederate_HLAFederateAmbassador();

	/**
	 * Returns the meta object for data type '{@link hla.rti1516e.FederateAmbassador <em>HLA Federate Ambassador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>HLA Federate Ambassador</em>'.
	 * @see hla.rti1516e.FederateAmbassador
	 * @model instanceClass="hla.rti1516e.FederateAmbassador"
	 * @generated
	 */
	EDataType getHLAFederateAmbassador();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtiapiFactory getRtiapiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.FederateImpl <em>Federate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.FederateImpl
		 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiPackageImpl#getFederate()
		 * @generated
		 */
		EClass FEDERATE = eINSTANCE.getFederate();

		/**
		 * The meta object literal for the '<em><b>HLA Federate Ambassador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEDERATE__HLA_FEDERATE_AMBASSADOR = eINSTANCE.getFederate_HLAFederateAmbassador();

		/**
		 * The meta object literal for the '<em>HLA Federate Ambassador</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hla.rti1516e.FederateAmbassador
		 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiPackageImpl#getHLAFederateAmbassador()
		 * @generated
		 */
		EDataType HLA_FEDERATE_AMBASSADOR = eINSTANCE.getHLAFederateAmbassador();

	}

} //RtiapiPackage
