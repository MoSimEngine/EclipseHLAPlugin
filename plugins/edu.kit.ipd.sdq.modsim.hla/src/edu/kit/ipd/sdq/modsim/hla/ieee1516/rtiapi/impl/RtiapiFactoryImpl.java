/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtiapiFactoryImpl extends EFactoryImpl implements RtiapiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtiapiFactory init() {
		try {
			RtiapiFactory theRtiapiFactory = (RtiapiFactory)EPackage.Registry.INSTANCE.getEFactory(RtiapiPackage.eNS_URI);
			if (theRtiapiFactory != null) {
				return theRtiapiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtiapiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtiapiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RtiapiPackage.FEDERATE: return createFederate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Federate createFederate() {
		FederateImpl federate = new FederateImpl();
		return federate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtiapiPackage getRtiapiPackage() {
		return (RtiapiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtiapiPackage getPackage() {
		return RtiapiPackage.eINSTANCE;
	}

} //RtiapiFactoryImpl
