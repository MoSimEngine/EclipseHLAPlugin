/**
 */
package edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl;

import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.Federate;
import edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.RtiapiPackage;

import hla.rti1516e.FederateAmbassador;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Federate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.modsim.hla.ieee1516.rtiapi.impl.FederateImpl#getHLAFederateAmbassador <em>HLA Federate Ambassador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FederateImpl extends MinimalEObjectImpl.Container implements Federate {
	/**
	 * The default value of the '{@link #getHLAFederateAmbassador() <em>HLA Federate Ambassador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLAFederateAmbassador()
	 * @generated
	 * @ordered
	 */
	protected static final FederateAmbassador HLA_FEDERATE_AMBASSADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHLAFederateAmbassador() <em>HLA Federate Ambassador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHLAFederateAmbassador()
	 * @generated
	 * @ordered
	 */
	protected FederateAmbassador hlaFederateAmbassador = HLA_FEDERATE_AMBASSADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FederateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtiapiPackage.Literals.FEDERATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateAmbassador getHLAFederateAmbassador() {
		return hlaFederateAmbassador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHLAFederateAmbassador(FederateAmbassador newHLAFederateAmbassador) {
		FederateAmbassador oldHLAFederateAmbassador = hlaFederateAmbassador;
		hlaFederateAmbassador = newHLAFederateAmbassador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtiapiPackage.FEDERATE__HLA_FEDERATE_AMBASSADOR, oldHLAFederateAmbassador, hlaFederateAmbassador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtiapiPackage.FEDERATE__HLA_FEDERATE_AMBASSADOR:
				return getHLAFederateAmbassador();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtiapiPackage.FEDERATE__HLA_FEDERATE_AMBASSADOR:
				setHLAFederateAmbassador((FederateAmbassador)newValue);
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
			case RtiapiPackage.FEDERATE__HLA_FEDERATE_AMBASSADOR:
				setHLAFederateAmbassador(HLA_FEDERATE_AMBASSADOR_EDEFAULT);
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
			case RtiapiPackage.FEDERATE__HLA_FEDERATE_AMBASSADOR:
				return HLA_FEDERATE_AMBASSADOR_EDEFAULT == null ? hlaFederateAmbassador != null : !HLA_FEDERATE_AMBASSADOR_EDEFAULT.equals(hlaFederateAmbassador);
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
		result.append(" (HLAFederateAmbassador: ");
		result.append(hlaFederateAmbassador);
		result.append(')');
		return result.toString();
	}

} //FederateImpl
