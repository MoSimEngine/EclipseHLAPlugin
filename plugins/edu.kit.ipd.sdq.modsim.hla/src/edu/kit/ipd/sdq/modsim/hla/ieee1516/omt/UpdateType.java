/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getValue <em>Value</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getUpdateType()
 * @model extendedMetaData="name='updateType' kind='simple'"
 * @generated
 */
public interface UpdateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateEnumerations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateEnumerations
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(UpdateEnumerations)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getUpdateType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	UpdateEnumerations getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateEnumerations
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(UpdateEnumerations value);

	/**
	 * Unsets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(UpdateEnumerations)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(UpdateEnumerations)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getUpdateType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getUpdateType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.UpdateType#getNotes <em>Notes</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getUpdateType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // UpdateType