/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getEnumerator <em>Enumerator</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType()
 * @model extendedMetaData="name='enumeratedDataType' kind='elementOnly'"
 * @generated
 */
public interface EnumeratedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(IdentifierType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getName();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the basic data representation that forms the basis of this datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(ReferenceType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Representation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getRepresentation();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Semantics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semantics' namespace='##targetNamespace'"
	 * @generated
	 */
	edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getSemantics();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getSemantics <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' containment reference.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String value);

	/**
	 * Returns the value of the '<em><b>Enumerator</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines the enumerators associated with this datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerator</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Enumerator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumerator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumeratorType> getEnumerator();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Idtag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idtag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idtag</em>' attribute.
	 * @see #setIdtag(String)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(List)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EnumeratedDataType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List<String> value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getEnumeratedDataType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // EnumeratedDataType
