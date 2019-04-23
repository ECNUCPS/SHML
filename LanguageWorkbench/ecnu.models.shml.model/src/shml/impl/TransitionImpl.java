/**
 */
package shml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shml.Action;
import shml.EvaluateGuard;
import shml.Event;
import shml.ShmlPackage;
import shml.TemporalGuard;
import shml.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shml.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link shml.impl.TransitionImpl#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link shml.impl.TransitionImpl#getTaction <em>Taction</em>}</li>
 *   <li>{@link shml.impl.TransitionImpl#getEvaluateguard <em>Evaluateguard</em>}</li>
 *   <li>{@link shml.impl.TransitionImpl#getTemporalguard <em>Temporalguard</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggerevent() <em>Triggerevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerevent()
	 * @generated
	 * @ordered
	 */
	protected Event triggerevent;

	/**
	 * The cached value of the '{@link #getTaction() <em>Taction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaction()
	 * @generated
	 * @ordered
	 */
	protected Action taction;

	/**
	 * The cached value of the '{@link #getEvaluateguard() <em>Evaluateguard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluateguard()
	 * @generated
	 * @ordered
	 */
	protected EvaluateGuard evaluateguard;

	/**
	 * The cached value of the '{@link #getTemporalguard() <em>Temporalguard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalguard()
	 * @generated
	 * @ordered
	 */
	protected TemporalGuard temporalguard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTriggerevent() {
		if (triggerevent != null && triggerevent.eIsProxy()) {
			InternalEObject oldTriggerevent = (InternalEObject)triggerevent;
			triggerevent = (Event)eResolveProxy(oldTriggerevent);
			if (triggerevent != oldTriggerevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TRANSITION__TRIGGEREVENT, oldTriggerevent, triggerevent));
			}
		}
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTriggerevent() {
		return triggerevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerevent(Event newTriggerevent) {
		Event oldTriggerevent = triggerevent;
		triggerevent = newTriggerevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TRANSITION__TRIGGEREVENT, oldTriggerevent, triggerevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getTaction() {
		if (taction != null && taction.eIsProxy()) {
			InternalEObject oldTaction = (InternalEObject)taction;
			taction = (Action)eResolveProxy(oldTaction);
			if (taction != oldTaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TRANSITION__TACTION, oldTaction, taction));
			}
		}
		return taction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetTaction() {
		return taction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaction(Action newTaction) {
		Action oldTaction = taction;
		taction = newTaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TRANSITION__TACTION, oldTaction, taction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard getEvaluateguard() {
		if (evaluateguard != null && evaluateguard.eIsProxy()) {
			InternalEObject oldEvaluateguard = (InternalEObject)evaluateguard;
			evaluateguard = (EvaluateGuard)eResolveProxy(oldEvaluateguard);
			if (evaluateguard != oldEvaluateguard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TRANSITION__EVALUATEGUARD, oldEvaluateguard, evaluateguard));
			}
		}
		return evaluateguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard basicGetEvaluateguard() {
		return evaluateguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluateguard(EvaluateGuard newEvaluateguard) {
		EvaluateGuard oldEvaluateguard = evaluateguard;
		evaluateguard = newEvaluateguard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TRANSITION__EVALUATEGUARD, oldEvaluateguard, evaluateguard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard getTemporalguard() {
		if (temporalguard != null && temporalguard.eIsProxy()) {
			InternalEObject oldTemporalguard = (InternalEObject)temporalguard;
			temporalguard = (TemporalGuard)eResolveProxy(oldTemporalguard);
			if (temporalguard != oldTemporalguard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TRANSITION__TEMPORALGUARD, oldTemporalguard, temporalguard));
			}
		}
		return temporalguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard basicGetTemporalguard() {
		return temporalguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporalguard(TemporalGuard newTemporalguard) {
		TemporalGuard oldTemporalguard = temporalguard;
		temporalguard = newTemporalguard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TRANSITION__TEMPORALGUARD, oldTemporalguard, temporalguard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShmlPackage.TRANSITION__NAME:
				return getName();
			case ShmlPackage.TRANSITION__TRIGGEREVENT:
				if (resolve) return getTriggerevent();
				return basicGetTriggerevent();
			case ShmlPackage.TRANSITION__TACTION:
				if (resolve) return getTaction();
				return basicGetTaction();
			case ShmlPackage.TRANSITION__EVALUATEGUARD:
				if (resolve) return getEvaluateguard();
				return basicGetEvaluateguard();
			case ShmlPackage.TRANSITION__TEMPORALGUARD:
				if (resolve) return getTemporalguard();
				return basicGetTemporalguard();
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
			case ShmlPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case ShmlPackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent((Event)newValue);
				return;
			case ShmlPackage.TRANSITION__TACTION:
				setTaction((Action)newValue);
				return;
			case ShmlPackage.TRANSITION__EVALUATEGUARD:
				setEvaluateguard((EvaluateGuard)newValue);
				return;
			case ShmlPackage.TRANSITION__TEMPORALGUARD:
				setTemporalguard((TemporalGuard)newValue);
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
			case ShmlPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShmlPackage.TRANSITION__TRIGGEREVENT:
				setTriggerevent((Event)null);
				return;
			case ShmlPackage.TRANSITION__TACTION:
				setTaction((Action)null);
				return;
			case ShmlPackage.TRANSITION__EVALUATEGUARD:
				setEvaluateguard((EvaluateGuard)null);
				return;
			case ShmlPackage.TRANSITION__TEMPORALGUARD:
				setTemporalguard((TemporalGuard)null);
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
			case ShmlPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShmlPackage.TRANSITION__TRIGGEREVENT:
				return triggerevent != null;
			case ShmlPackage.TRANSITION__TACTION:
				return taction != null;
			case ShmlPackage.TRANSITION__EVALUATEGUARD:
				return evaluateguard != null;
			case ShmlPackage.TRANSITION__TEMPORALGUARD:
				return temporalguard != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
