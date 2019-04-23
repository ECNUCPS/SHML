/**
 */
package shml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shml.Clock;
import shml.Event;
import shml.ShmlPackage;
import shml.TSHS;
import shml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shml.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link shml.impl.SystemImpl#getTshss <em>Tshss</em>}</li>
 *   <li>{@link shml.impl.SystemImpl#getGlobalvariables <em>Globalvariables</em>}</li>
 *   <li>{@link shml.impl.SystemImpl#getGlobalclocks <em>Globalclocks</em>}</li>
 *   <li>{@link shml.impl.SystemImpl#getGlobalevents <em>Globalevents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements shml.System {
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
	 * The cached value of the '{@link #getTshss() <em>Tshss</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTshss()
	 * @generated
	 * @ordered
	 */
	protected EList<TSHS> tshss;

	/**
	 * The cached value of the '{@link #getGlobalvariables() <em>Globalvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> globalvariables;

	/**
	 * The cached value of the '{@link #getGlobalclocks() <em>Globalclocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalclocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> globalclocks;

	/**
	 * The cached value of the '{@link #getGlobalevents() <em>Globalevents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalevents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> globalevents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSHS> getTshss() {
		if (tshss == null) {
			tshss = new EObjectContainmentEList<TSHS>(TSHS.class, this, ShmlPackage.SYSTEM__TSHSS);
		}
		return tshss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getGlobalvariables() {
		if (globalvariables == null) {
			globalvariables = new EObjectContainmentEList<Variable>(Variable.class, this, ShmlPackage.SYSTEM__GLOBALVARIABLES);
		}
		return globalvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getGlobalclocks() {
		if (globalclocks == null) {
			globalclocks = new EObjectContainmentEList<Clock>(Clock.class, this, ShmlPackage.SYSTEM__GLOBALCLOCKS);
		}
		return globalclocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getGlobalevents() {
		if (globalevents == null) {
			globalevents = new EObjectContainmentEList<Event>(Event.class, this, ShmlPackage.SYSTEM__GLOBALEVENTS);
		}
		return globalevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShmlPackage.SYSTEM__TSHSS:
				return ((InternalEList<?>)getTshss()).basicRemove(otherEnd, msgs);
			case ShmlPackage.SYSTEM__GLOBALVARIABLES:
				return ((InternalEList<?>)getGlobalvariables()).basicRemove(otherEnd, msgs);
			case ShmlPackage.SYSTEM__GLOBALCLOCKS:
				return ((InternalEList<?>)getGlobalclocks()).basicRemove(otherEnd, msgs);
			case ShmlPackage.SYSTEM__GLOBALEVENTS:
				return ((InternalEList<?>)getGlobalevents()).basicRemove(otherEnd, msgs);
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
			case ShmlPackage.SYSTEM__NAME:
				return getName();
			case ShmlPackage.SYSTEM__TSHSS:
				return getTshss();
			case ShmlPackage.SYSTEM__GLOBALVARIABLES:
				return getGlobalvariables();
			case ShmlPackage.SYSTEM__GLOBALCLOCKS:
				return getGlobalclocks();
			case ShmlPackage.SYSTEM__GLOBALEVENTS:
				return getGlobalevents();
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
			case ShmlPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ShmlPackage.SYSTEM__TSHSS:
				getTshss().clear();
				getTshss().addAll((Collection<? extends TSHS>)newValue);
				return;
			case ShmlPackage.SYSTEM__GLOBALVARIABLES:
				getGlobalvariables().clear();
				getGlobalvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ShmlPackage.SYSTEM__GLOBALCLOCKS:
				getGlobalclocks().clear();
				getGlobalclocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case ShmlPackage.SYSTEM__GLOBALEVENTS:
				getGlobalevents().clear();
				getGlobalevents().addAll((Collection<? extends Event>)newValue);
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
			case ShmlPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShmlPackage.SYSTEM__TSHSS:
				getTshss().clear();
				return;
			case ShmlPackage.SYSTEM__GLOBALVARIABLES:
				getGlobalvariables().clear();
				return;
			case ShmlPackage.SYSTEM__GLOBALCLOCKS:
				getGlobalclocks().clear();
				return;
			case ShmlPackage.SYSTEM__GLOBALEVENTS:
				getGlobalevents().clear();
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
			case ShmlPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShmlPackage.SYSTEM__TSHSS:
				return tshss != null && !tshss.isEmpty();
			case ShmlPackage.SYSTEM__GLOBALVARIABLES:
				return globalvariables != null && !globalvariables.isEmpty();
			case ShmlPackage.SYSTEM__GLOBALCLOCKS:
				return globalclocks != null && !globalclocks.isEmpty();
			case ShmlPackage.SYSTEM__GLOBALEVENTS:
				return globalevents != null && !globalevents.isEmpty();
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

} //SystemImpl
