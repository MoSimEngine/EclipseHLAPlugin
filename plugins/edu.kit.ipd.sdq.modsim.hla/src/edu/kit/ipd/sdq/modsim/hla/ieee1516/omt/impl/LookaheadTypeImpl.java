/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.LookaheadType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.ReferenceType;

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
 * An implementation of the model object '<em><b>Lookahead Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.LookaheadTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookaheadTypeImpl extends MinimalEObjectImpl.Container implements LookaheadType {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType dataType;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String semantics;

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
	protected LookaheadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmtPackage.eINSTANCE.getLookaheadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(ReferenceType newDataType, NotificationChain msgs) {
		ReferenceType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(ReferenceType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getSemantics() {
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemantics(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newSemantics, NotificationChain msgs) {
		edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String oldSemantics = semantics;
		semantics = newSemantics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__SEMANTICS, oldSemantics, newSemantics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantics(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newSemantics) {
		if (newSemantics != semantics) {
			NotificationChain msgs = null;
			if (semantics != null)
				msgs = ((InternalEObject)semantics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.LOOKAHEAD_TYPE__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject)newSemantics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.LOOKAHEAD_TYPE__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, OmtPackage.LOOKAHEAD_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.LOOKAHEAD_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE);
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
			case OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case OmtPackage.LOOKAHEAD_TYPE__SEMANTICS:
				return basicSetSemantics(null, msgs);
			case OmtPackage.LOOKAHEAD_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE:
				return getDataType();
			case OmtPackage.LOOKAHEAD_TYPE__SEMANTICS:
				return getSemantics();
			case OmtPackage.LOOKAHEAD_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case OmtPackage.LOOKAHEAD_TYPE__IDTAG:
				return getIdtag();
			case OmtPackage.LOOKAHEAD_TYPE__NOTES:
				return getNotes();
			case OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE:
				setDataType((ReferenceType)newValue);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__SEMANTICS:
				setSemantics((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)newValue);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE:
				setDataType((ReferenceType)null);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__SEMANTICS:
				setSemantics((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)null);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__ANY:
				getAny().clear();
				return;
			case OmtPackage.LOOKAHEAD_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.LOOKAHEAD_TYPE__DATA_TYPE:
				return dataType != null;
			case OmtPackage.LOOKAHEAD_TYPE__SEMANTICS:
				return semantics != null;
			case OmtPackage.LOOKAHEAD_TYPE__ANY:
				return any != null && !any.isEmpty();
			case OmtPackage.LOOKAHEAD_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case OmtPackage.LOOKAHEAD_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case OmtPackage.LOOKAHEAD_TYPE__ANY_ATTRIBUTE:
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

} //LookaheadTypeImpl
