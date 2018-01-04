/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocType <em>Poc Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocName <em>Poc Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocOrg <em>Poc Org</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocTelephone <em>Poc Telephone</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocEmail <em>Poc Email</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType()
 * @model extendedMetaData="name='pocType' kind='elementOnly'"
 * @generated
 */
public interface PocType extends EObject {
	/**
	 * Returns the value of the '<em><b>Poc Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the role that the POC has with respect to the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poc Type</em>' containment reference.
	 * @see #setPocType(PocTypeType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType_PocType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pocType' namespace='##targetNamespace'"
	 * @generated
	 */
	PocTypeType getPocType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocType <em>Poc Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poc Type</em>' containment reference.
	 * @see #getPocType()
	 * @generated
	 */
	void setPocType(PocTypeType value);

	/**
	 * Returns the value of the '<em><b>Poc Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poc Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poc Name</em>' containment reference.
	 * @see #setPocName(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType_PocName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pocName' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getPocName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocName <em>Poc Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poc Name</em>' containment reference.
	 * @see #getPocName()
	 * @generated
	 */
	void setPocName(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Poc Org</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poc Org</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poc Org</em>' containment reference.
	 * @see #setPocOrg(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType_PocOrg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pocOrg' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getPocOrg();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.PocType#getPocOrg <em>Poc Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poc Org</em>' containment reference.
	 * @see #getPocOrg()
	 * @generated
	 */
	void setPocOrg(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Poc Telephone</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poc Telephone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poc Telephone</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType_PocTelephone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pocTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String> getPocTelephone();

	/**
	 * Returns the value of the '<em><b>Poc Email</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poc Email</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poc Email</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getPocType_PocEmail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pocEmail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String> getPocEmail();

} // PocType
