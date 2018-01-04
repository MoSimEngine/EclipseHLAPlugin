/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.BasicDataType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.EndianType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.IdentifierType;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.OmtPackage;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.Size;

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
 * An implementation of the model object '<em><b>Basic Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getEndian <em>Endian</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.impl.BasicDataTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicDataTypeImpl extends MinimalEObjectImpl.Container implements BasicDataType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected IdentifierType name;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String interpretation;

	/**
	 * The cached value of the '{@link #getEndian() <em>Endian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndian()
	 * @generated
	 * @ordered
	 */
	protected EndianType endian;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String encoding;

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
	protected BasicDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmtPackage.eINSTANCE.getBasicDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(IdentifierType newName, NotificationChain msgs) {
		IdentifierType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IdentifierType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Size newSize, NotificationChain msgs) {
		Size oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Size newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpretation(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newInterpretation, NotificationChain msgs) {
		edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__INTERPRETATION, oldInterpretation, newInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newInterpretation) {
		if (newInterpretation != interpretation) {
			NotificationChain msgs = null;
			if (interpretation != null)
				msgs = ((InternalEObject)interpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__INTERPRETATION, null, msgs);
			if (newInterpretation != null)
				msgs = ((InternalEObject)newInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__INTERPRETATION, null, msgs);
			msgs = basicSetInterpretation(newInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__INTERPRETATION, newInterpretation, newInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType getEndian() {
		return endian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndian(EndianType newEndian, NotificationChain msgs) {
		EndianType oldEndian = endian;
		endian = newEndian;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__ENDIAN, oldEndian, newEndian);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndian(EndianType newEndian) {
		if (newEndian != endian) {
			NotificationChain msgs = null;
			if (endian != null)
				msgs = ((InternalEObject)endian).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__ENDIAN, null, msgs);
			if (newEndian != null)
				msgs = ((InternalEObject)newEndian).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__ENDIAN, null, msgs);
			msgs = basicSetEndian(newEndian, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__ENDIAN, newEndian, newEndian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncoding(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newEncoding, NotificationChain msgs) {
		edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__ENCODING, oldEncoding, newEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String newEncoding) {
		if (newEncoding != encoding) {
			NotificationChain msgs = null;
			if (encoding != null)
				msgs = ((InternalEObject)encoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__ENCODING, null, msgs);
			if (newEncoding != null)
				msgs = ((InternalEObject)newEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OmtPackage.BASIC_DATA_TYPE__ENCODING, null, msgs);
			msgs = basicSetEncoding(newEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__ENCODING, newEncoding, newEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, OmtPackage.BASIC_DATA_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OmtPackage.BASIC_DATA_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE);
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
			case OmtPackage.BASIC_DATA_TYPE__NAME:
				return basicSetName(null, msgs);
			case OmtPackage.BASIC_DATA_TYPE__SIZE:
				return basicSetSize(null, msgs);
			case OmtPackage.BASIC_DATA_TYPE__INTERPRETATION:
				return basicSetInterpretation(null, msgs);
			case OmtPackage.BASIC_DATA_TYPE__ENDIAN:
				return basicSetEndian(null, msgs);
			case OmtPackage.BASIC_DATA_TYPE__ENCODING:
				return basicSetEncoding(null, msgs);
			case OmtPackage.BASIC_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.BASIC_DATA_TYPE__NAME:
				return getName();
			case OmtPackage.BASIC_DATA_TYPE__SIZE:
				return getSize();
			case OmtPackage.BASIC_DATA_TYPE__INTERPRETATION:
				return getInterpretation();
			case OmtPackage.BASIC_DATA_TYPE__ENDIAN:
				return getEndian();
			case OmtPackage.BASIC_DATA_TYPE__ENCODING:
				return getEncoding();
			case OmtPackage.BASIC_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case OmtPackage.BASIC_DATA_TYPE__IDTAG:
				return getIdtag();
			case OmtPackage.BASIC_DATA_TYPE__NOTES:
				return getNotes();
			case OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.BASIC_DATA_TYPE__NAME:
				setName((IdentifierType)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__SIZE:
				setSize((Size)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__INTERPRETATION:
				setInterpretation((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ENDIAN:
				setEndian((EndianType)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ENCODING:
				setEncoding((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.BASIC_DATA_TYPE__NAME:
				setName((IdentifierType)null);
				return;
			case OmtPackage.BASIC_DATA_TYPE__SIZE:
				setSize((Size)null);
				return;
			case OmtPackage.BASIC_DATA_TYPE__INTERPRETATION:
				setInterpretation((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)null);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ENDIAN:
				setEndian((EndianType)null);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ENCODING:
				setEncoding((edu.kit.ipd.sdq.modsim.hla.ieee1516.omt.String)null);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ANY:
				getAny().clear();
				return;
			case OmtPackage.BASIC_DATA_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case OmtPackage.BASIC_DATA_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE:
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
			case OmtPackage.BASIC_DATA_TYPE__NAME:
				return name != null;
			case OmtPackage.BASIC_DATA_TYPE__SIZE:
				return size != null;
			case OmtPackage.BASIC_DATA_TYPE__INTERPRETATION:
				return interpretation != null;
			case OmtPackage.BASIC_DATA_TYPE__ENDIAN:
				return endian != null;
			case OmtPackage.BASIC_DATA_TYPE__ENCODING:
				return encoding != null;
			case OmtPackage.BASIC_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case OmtPackage.BASIC_DATA_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case OmtPackage.BASIC_DATA_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case OmtPackage.BASIC_DATA_TYPE__ANY_ATTRIBUTE:
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

} //BasicDataTypeImpl
