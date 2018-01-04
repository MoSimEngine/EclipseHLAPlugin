/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switches Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAutoProvide <em>Auto Provide</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getConveyRegionDesignatorSets <em>Convey Region Designator Sets</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getConveyProducingFederate <em>Convey Producing Federate</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAttributeScopeAdvisory <em>Attribute Scope Advisory</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAttributeRelevanceAdvisory <em>Attribute Relevance Advisory</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getObjectClassRelevanceAdvisory <em>Object Class Relevance Advisory</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getInteractionRelevanceAdvisory <em>Interaction Relevance Advisory</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getServiceReporting <em>Service Reporting</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getExceptionReporting <em>Exception Reporting</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getDelaySubscriptionEvaluation <em>Delay Subscription Evaluation</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAutomaticResignAction <em>Automatic Resign Action</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType()
 * @model extendedMetaData="name='switchesType' kind='elementOnly'"
 * @generated
 */
public interface SwitchesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Provide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Provide</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Provide</em>' containment reference.
	 * @see #setAutoProvide(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_AutoProvide()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='autoProvide' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getAutoProvide();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAutoProvide <em>Auto Provide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Provide</em>' containment reference.
	 * @see #getAutoProvide()
	 * @generated
	 */
	void setAutoProvide(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Convey Region Designator Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convey Region Designator Sets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convey Region Designator Sets</em>' containment reference.
	 * @see #setConveyRegionDesignatorSets(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_ConveyRegionDesignatorSets()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conveyRegionDesignatorSets' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getConveyRegionDesignatorSets();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getConveyRegionDesignatorSets <em>Convey Region Designator Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convey Region Designator Sets</em>' containment reference.
	 * @see #getConveyRegionDesignatorSets()
	 * @generated
	 */
	void setConveyRegionDesignatorSets(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Convey Producing Federate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convey Producing Federate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convey Producing Federate</em>' containment reference.
	 * @see #setConveyProducingFederate(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_ConveyProducingFederate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conveyProducingFederate' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getConveyProducingFederate();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getConveyProducingFederate <em>Convey Producing Federate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convey Producing Federate</em>' containment reference.
	 * @see #getConveyProducingFederate()
	 * @generated
	 */
	void setConveyProducingFederate(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Attribute Scope Advisory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Scope Advisory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Scope Advisory</em>' containment reference.
	 * @see #setAttributeScopeAdvisory(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_AttributeScopeAdvisory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attributeScopeAdvisory' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getAttributeScopeAdvisory();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAttributeScopeAdvisory <em>Attribute Scope Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Scope Advisory</em>' containment reference.
	 * @see #getAttributeScopeAdvisory()
	 * @generated
	 */
	void setAttributeScopeAdvisory(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Attribute Relevance Advisory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Relevance Advisory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Relevance Advisory</em>' containment reference.
	 * @see #setAttributeRelevanceAdvisory(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_AttributeRelevanceAdvisory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attributeRelevanceAdvisory' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getAttributeRelevanceAdvisory();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAttributeRelevanceAdvisory <em>Attribute Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Relevance Advisory</em>' containment reference.
	 * @see #getAttributeRelevanceAdvisory()
	 * @generated
	 */
	void setAttributeRelevanceAdvisory(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Object Class Relevance Advisory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class Relevance Advisory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class Relevance Advisory</em>' containment reference.
	 * @see #setObjectClassRelevanceAdvisory(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_ObjectClassRelevanceAdvisory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='objectClassRelevanceAdvisory' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getObjectClassRelevanceAdvisory();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getObjectClassRelevanceAdvisory <em>Object Class Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class Relevance Advisory</em>' containment reference.
	 * @see #getObjectClassRelevanceAdvisory()
	 * @generated
	 */
	void setObjectClassRelevanceAdvisory(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Interaction Relevance Advisory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Relevance Advisory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Relevance Advisory</em>' containment reference.
	 * @see #setInteractionRelevanceAdvisory(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_InteractionRelevanceAdvisory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interactionRelevanceAdvisory' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getInteractionRelevanceAdvisory();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getInteractionRelevanceAdvisory <em>Interaction Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Relevance Advisory</em>' containment reference.
	 * @see #getInteractionRelevanceAdvisory()
	 * @generated
	 */
	void setInteractionRelevanceAdvisory(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Service Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Reporting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reporting</em>' containment reference.
	 * @see #setServiceReporting(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_ServiceReporting()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='serviceReporting' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getServiceReporting();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getServiceReporting <em>Service Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Reporting</em>' containment reference.
	 * @see #getServiceReporting()
	 * @generated
	 */
	void setServiceReporting(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Exception Reporting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Reporting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Reporting</em>' containment reference.
	 * @see #setExceptionReporting(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_ExceptionReporting()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='exceptionReporting' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getExceptionReporting();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getExceptionReporting <em>Exception Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Reporting</em>' containment reference.
	 * @see #getExceptionReporting()
	 * @generated
	 */
	void setExceptionReporting(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Delay Subscription Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Subscription Evaluation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Subscription Evaluation</em>' containment reference.
	 * @see #setDelaySubscriptionEvaluation(SwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_DelaySubscriptionEvaluation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='delaySubscriptionEvaluation' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchType getDelaySubscriptionEvaluation();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getDelaySubscriptionEvaluation <em>Delay Subscription Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Subscription Evaluation</em>' containment reference.
	 * @see #getDelaySubscriptionEvaluation()
	 * @generated
	 */
	void setDelaySubscriptionEvaluation(SwitchType value);

	/**
	 * Returns the value of the '<em><b>Automatic Resign Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Resign Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Resign Action</em>' containment reference.
	 * @see #setAutomaticResignAction(ResignSwitchType)
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_AutomaticResignAction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='automaticResignAction' namespace='##targetNamespace'"
	 * @generated
	 */
	ResignSwitchType getAutomaticResignAction();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getAutomaticResignAction <em>Automatic Resign Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Resign Action</em>' containment reference.
	 * @see #getAutomaticResignAction()
	 * @generated
	 */
	void setAutomaticResignAction(ResignSwitchType value);

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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='strict'"
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.SwitchesType#getNotes <em>Notes</em>}' attribute.
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
	 * @see edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage#getSwitchesType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':14' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SwitchesType
