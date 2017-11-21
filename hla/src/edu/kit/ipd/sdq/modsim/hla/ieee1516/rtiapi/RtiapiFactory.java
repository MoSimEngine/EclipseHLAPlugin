/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage
 * @generated
 */
public interface RtiapiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtiapiFactory eINSTANCE = edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.RtiapiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Federate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Federate</em>'.
	 * @generated
	 */
	Federate createFederate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtiapiPackage getRtiapiPackage();

} //RtiapiFactory
