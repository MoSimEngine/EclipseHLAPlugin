/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.TagsType;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tags Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getUpdateReflectTag <em>Update Reflect Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getSendReceiveTag <em>Send Receive Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getDeleteRemoveTag <em>Delete Remove Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getDivestitureRequestTag <em>Divestiture Request Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getDivestitureCompletionTag <em>Divestiture Completion Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getAcquisitionRequestTag <em>Acquisition Request Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getRequestUpdateTag <em>Request Update Tag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.TagsTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagsTypeImpl extends MinimalEObjectImpl.Container implements TagsType {
	/**
	 * The cached value of the '{@link #getUpdateReflectTag() <em>Update Reflect Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateReflectTag()
	 * @generated
	 * @ordered
	 */
	protected TagType updateReflectTag;

	/**
	 * The cached value of the '{@link #getSendReceiveTag() <em>Send Receive Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendReceiveTag()
	 * @generated
	 * @ordered
	 */
	protected TagType sendReceiveTag;

	/**
	 * The cached value of the '{@link #getDeleteRemoveTag() <em>Delete Remove Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteRemoveTag()
	 * @generated
	 * @ordered
	 */
	protected TagType deleteRemoveTag;

	/**
	 * The cached value of the '{@link #getDivestitureRequestTag() <em>Divestiture Request Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivestitureRequestTag()
	 * @generated
	 * @ordered
	 */
	protected TagType divestitureRequestTag;

	/**
	 * The cached value of the '{@link #getDivestitureCompletionTag() <em>Divestiture Completion Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivestitureCompletionTag()
	 * @generated
	 * @ordered
	 */
	protected TagType divestitureCompletionTag;

	/**
	 * The cached value of the '{@link #getAcquisitionRequestTag() <em>Acquisition Request Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionRequestTag()
	 * @generated
	 * @ordered
	 */
	protected TagType acquisitionRequestTag;

	/**
	 * The cached value of the '{@link #getRequestUpdateTag() <em>Request Update Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUpdateTag()
	 * @generated
	 * @ordered
	 */
	protected TagType requestUpdateTag;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected static final String IDTAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected String idtag = IDTAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected List<String> notes = NOTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmtPackage.eINSTANCE.getTagsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getUpdateReflectTag() {
		return updateReflectTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateReflectTag(TagType newUpdateReflectTag, NotificationChain msgs) {
		TagType oldUpdateReflectTag = updateReflectTag;
		updateReflectTag = newUpdateReflectTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG, oldUpdateReflectTag, newUpdateReflectTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateReflectTag(TagType newUpdateReflectTag) {
		if (newUpdateReflectTag != updateReflectTag) {
			NotificationChain msgs = null;
			if (updateReflectTag != null)
				msgs = ((InternalEObject)updateReflectTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG, null, msgs);
			if (newUpdateReflectTag != null)
				msgs = ((InternalEObject)newUpdateReflectTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG, null, msgs);
			msgs = basicSetUpdateReflectTag(newUpdateReflectTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG, newUpdateReflectTag, newUpdateReflectTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getSendReceiveTag() {
		return sendReceiveTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendReceiveTag(TagType newSendReceiveTag, NotificationChain msgs) {
		TagType oldSendReceiveTag = sendReceiveTag;
		sendReceiveTag = newSendReceiveTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG, oldSendReceiveTag, newSendReceiveTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendReceiveTag(TagType newSendReceiveTag) {
		if (newSendReceiveTag != sendReceiveTag) {
			NotificationChain msgs = null;
			if (sendReceiveTag != null)
				msgs = ((InternalEObject)sendReceiveTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG, null, msgs);
			if (newSendReceiveTag != null)
				msgs = ((InternalEObject)newSendReceiveTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG, null, msgs);
			msgs = basicSetSendReceiveTag(newSendReceiveTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG, newSendReceiveTag, newSendReceiveTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getDeleteRemoveTag() {
		return deleteRemoveTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteRemoveTag(TagType newDeleteRemoveTag, NotificationChain msgs) {
		TagType oldDeleteRemoveTag = deleteRemoveTag;
		deleteRemoveTag = newDeleteRemoveTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG, oldDeleteRemoveTag, newDeleteRemoveTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteRemoveTag(TagType newDeleteRemoveTag) {
		if (newDeleteRemoveTag != deleteRemoveTag) {
			NotificationChain msgs = null;
			if (deleteRemoveTag != null)
				msgs = ((InternalEObject)deleteRemoveTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG, null, msgs);
			if (newDeleteRemoveTag != null)
				msgs = ((InternalEObject)newDeleteRemoveTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG, null, msgs);
			msgs = basicSetDeleteRemoveTag(newDeleteRemoveTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG, newDeleteRemoveTag, newDeleteRemoveTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getDivestitureRequestTag() {
		return divestitureRequestTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivestitureRequestTag(TagType newDivestitureRequestTag, NotificationChain msgs) {
		TagType oldDivestitureRequestTag = divestitureRequestTag;
		divestitureRequestTag = newDivestitureRequestTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG, oldDivestitureRequestTag, newDivestitureRequestTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivestitureRequestTag(TagType newDivestitureRequestTag) {
		if (newDivestitureRequestTag != divestitureRequestTag) {
			NotificationChain msgs = null;
			if (divestitureRequestTag != null)
				msgs = ((InternalEObject)divestitureRequestTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG, null, msgs);
			if (newDivestitureRequestTag != null)
				msgs = ((InternalEObject)newDivestitureRequestTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG, null, msgs);
			msgs = basicSetDivestitureRequestTag(newDivestitureRequestTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG, newDivestitureRequestTag, newDivestitureRequestTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getDivestitureCompletionTag() {
		return divestitureCompletionTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivestitureCompletionTag(TagType newDivestitureCompletionTag, NotificationChain msgs) {
		TagType oldDivestitureCompletionTag = divestitureCompletionTag;
		divestitureCompletionTag = newDivestitureCompletionTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG, oldDivestitureCompletionTag, newDivestitureCompletionTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivestitureCompletionTag(TagType newDivestitureCompletionTag) {
		if (newDivestitureCompletionTag != divestitureCompletionTag) {
			NotificationChain msgs = null;
			if (divestitureCompletionTag != null)
				msgs = ((InternalEObject)divestitureCompletionTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG, null, msgs);
			if (newDivestitureCompletionTag != null)
				msgs = ((InternalEObject)newDivestitureCompletionTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG, null, msgs);
			msgs = basicSetDivestitureCompletionTag(newDivestitureCompletionTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG, newDivestitureCompletionTag, newDivestitureCompletionTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getAcquisitionRequestTag() {
		return acquisitionRequestTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcquisitionRequestTag(TagType newAcquisitionRequestTag, NotificationChain msgs) {
		TagType oldAcquisitionRequestTag = acquisitionRequestTag;
		acquisitionRequestTag = newAcquisitionRequestTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG, oldAcquisitionRequestTag, newAcquisitionRequestTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquisitionRequestTag(TagType newAcquisitionRequestTag) {
		if (newAcquisitionRequestTag != acquisitionRequestTag) {
			NotificationChain msgs = null;
			if (acquisitionRequestTag != null)
				msgs = ((InternalEObject)acquisitionRequestTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG, null, msgs);
			if (newAcquisitionRequestTag != null)
				msgs = ((InternalEObject)newAcquisitionRequestTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG, null, msgs);
			msgs = basicSetAcquisitionRequestTag(newAcquisitionRequestTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG, newAcquisitionRequestTag, newAcquisitionRequestTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType getRequestUpdateTag() {
		return requestUpdateTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestUpdateTag(TagType newRequestUpdateTag, NotificationChain msgs) {
		TagType oldRequestUpdateTag = requestUpdateTag;
		requestUpdateTag = newRequestUpdateTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG, oldRequestUpdateTag, newRequestUpdateTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestUpdateTag(TagType newRequestUpdateTag) {
		if (newRequestUpdateTag != requestUpdateTag) {
			NotificationChain msgs = null;
			if (requestUpdateTag != null)
				msgs = ((InternalEObject)requestUpdateTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG, null, msgs);
			if (newRequestUpdateTag != null)
				msgs = ((InternalEObject)newRequestUpdateTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG, null, msgs);
			msgs = basicSetRequestUpdateTag(newRequestUpdateTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG, newRequestUpdateTag, newRequestUpdateTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, OmtPackage.TAGS_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdtag() {
		return idtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdtag(String newIdtag) {
		String oldIdtag = idtag;
		idtag = newIdtag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(List<String> newNotes) {
		List<String> oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.TAGS_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
				return basicSetUpdateReflectTag(null, msgs);
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
				return basicSetSendReceiveTag(null, msgs);
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
				return basicSetDeleteRemoveTag(null, msgs);
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
				return basicSetDivestitureRequestTag(null, msgs);
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
				return basicSetDivestitureCompletionTag(null, msgs);
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
				return basicSetAcquisitionRequestTag(null, msgs);
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
				return basicSetRequestUpdateTag(null, msgs);
			case OmtPackage.TAGS_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
				return getUpdateReflectTag();
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
				return getSendReceiveTag();
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
				return getDeleteRemoveTag();
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
				return getDivestitureRequestTag();
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
				return getDivestitureCompletionTag();
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
				return getAcquisitionRequestTag();
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
				return getRequestUpdateTag();
			case OmtPackage.TAGS_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case OmtPackage.TAGS_TYPE__IDTAG:
				return getIdtag();
			case OmtPackage.TAGS_TYPE__NOTES:
				return getNotes();
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
				setUpdateReflectTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
				setSendReceiveTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
				setDeleteRemoveTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
				setDivestitureRequestTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
				setDivestitureCompletionTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
				setAcquisitionRequestTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
				setRequestUpdateTag((TagType)newValue);
				return;
			case OmtPackage.TAGS_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case OmtPackage.TAGS_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case OmtPackage.TAGS_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
				setUpdateReflectTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
				setSendReceiveTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
				setDeleteRemoveTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
				setDivestitureRequestTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
				setDivestitureCompletionTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
				setAcquisitionRequestTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
				setRequestUpdateTag((TagType)null);
				return;
			case OmtPackage.TAGS_TYPE__ANY:
				getAny().clear();
				return;
			case OmtPackage.TAGS_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case OmtPackage.TAGS_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case OmtPackage.TAGS_TYPE__UPDATE_REFLECT_TAG:
				return updateReflectTag != null;
			case OmtPackage.TAGS_TYPE__SEND_RECEIVE_TAG:
				return sendReceiveTag != null;
			case OmtPackage.TAGS_TYPE__DELETE_REMOVE_TAG:
				return deleteRemoveTag != null;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_REQUEST_TAG:
				return divestitureRequestTag != null;
			case OmtPackage.TAGS_TYPE__DIVESTITURE_COMPLETION_TAG:
				return divestitureCompletionTag != null;
			case OmtPackage.TAGS_TYPE__ACQUISITION_REQUEST_TAG:
				return acquisitionRequestTag != null;
			case OmtPackage.TAGS_TYPE__REQUEST_UPDATE_TAG:
				return requestUpdateTag != null;
			case OmtPackage.TAGS_TYPE__ANY:
				return any != null && !any.isEmpty();
			case OmtPackage.TAGS_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case OmtPackage.TAGS_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case OmtPackage.TAGS_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (any: ");
		result.append(any);
		result.append(", idtag: ");
		result.append(idtag);
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TagsTypeImpl
