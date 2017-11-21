/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi;

import hla.rti1516e.FederateAmbassador;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Federate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate#getHLAFederateAmbassador <em>HLA Federate Ambassador</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage#getFederate()
 * @model
 * @generated
 */
public interface Federate extends EObject {
	/**
	 * Returns the value of the '<em><b>HLA Federate Ambassador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HLA Federate Ambassador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HLA Federate Ambassador</em>' attribute.
	 * @see #setHLAFederateAmbassador(FederateAmbassador)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage#getFederate_HLAFederateAmbassador()
	 * @model dataType="edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.HLAFederateAmbassador"
	 * @generated
	 */
	FederateAmbassador getHLAFederateAmbassador();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate#getHLAFederateAmbassador <em>HLA Federate Ambassador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HLA Federate Ambassador</em>' attribute.
	 * @see #getHLAFederateAmbassador()
	 * @generated
	 */
	void setHLAFederateAmbassador(FederateAmbassador value);

} // Federate
