/**
 */
package ecnu.models.xshml.xshml.shml.impl;

import ecnu.models.xshml.xshml.shml.Action;
import ecnu.models.xshml.xshml.shml.Clock;
import ecnu.models.xshml.xshml.shml.Event;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;
import ecnu.models.xshml.xshml.shml.Guard;
import ecnu.models.xshml.xshml.shml.ODE;
import ecnu.models.xshml.xshml.shml.ShmlPackage;
import ecnu.models.xshml.xshml.shml.State;
import ecnu.models.xshml.xshml.shml.TSHS;
import ecnu.models.xshml.xshml.shml.Transition;
import ecnu.models.xshml.xshml.shml.UnifDistribution;
import ecnu.models.xshml.xshml.shml.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSHS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedodes <em>Ownedodes</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedstates <em>Ownedstates</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedtransitions <em>Ownedtransitions</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getLocalvariables <em>Localvariables</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getLocalclocks <em>Localclocks</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getLocalevents <em>Localevents</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedexpos <em>Ownedexpos</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedactions <em>Ownedactions</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedguards <em>Ownedguards</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshml.shml.impl.TSHSImpl#getOwnedunifs <em>Ownedunifs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSHSImpl extends EObjectImpl implements TSHS {
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
	 * The cached value of the '{@link #getOwnedodes() <em>Ownedodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODE> ownedodes;

	/**
	 * The cached value of the '{@link #getOwnedstates() <em>Ownedstates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedstates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedstates;

	/**
	 * The cached value of the '{@link #getOwnedtransitions() <em>Ownedtransitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedtransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedtransitions;

	/**
	 * The cached value of the '{@link #getLocalvariables() <em>Localvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localvariables;

	/**
	 * The cached value of the '{@link #getLocalclocks() <em>Localclocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalclocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> localclocks;

	/**
	 * The cached value of the '{@link #getLocalevents() <em>Localevents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalevents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> localevents;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected State initialstate;

	/**
	 * The cached value of the '{@link #getOwnedexpos() <em>Ownedexpos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedexpos()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpoDistribution> ownedexpos;

	/**
	 * The cached value of the '{@link #getOwnedactions() <em>Ownedactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> ownedactions;

	/**
	 * The cached value of the '{@link #getOwnedguards() <em>Ownedguards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedguards()
	 * @generated
	 * @ordered
	 */
	protected EList<Guard> ownedguards;

	/**
	 * The cached value of the '{@link #getOwnedunifs() <em>Ownedunifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedunifs()
	 * @generated
	 * @ordered
	 */
	protected EList<UnifDistribution> ownedunifs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSHSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.TSHS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TSHS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODE> getOwnedodes() {
		if (ownedodes == null) {
			ownedodes = new EObjectContainmentEList<ODE>(ODE.class, this, ShmlPackage.TSHS__OWNEDODES);
		}
		return ownedodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedstates() {
		if (ownedstates == null) {
			ownedstates = new EObjectContainmentEList<State>(State.class, this, ShmlPackage.TSHS__OWNEDSTATES);
		}
		return ownedstates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedtransitions() {
		if (ownedtransitions == null) {
			ownedtransitions = new EObjectContainmentEList<Transition>(Transition.class, this, ShmlPackage.TSHS__OWNEDTRANSITIONS);
		}
		return ownedtransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocalvariables() {
		if (localvariables == null) {
			localvariables = new EObjectContainmentEList<Variable>(Variable.class, this, ShmlPackage.TSHS__LOCALVARIABLES);
		}
		return localvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getLocalclocks() {
		if (localclocks == null) {
			localclocks = new EObjectContainmentEList<Clock>(Clock.class, this, ShmlPackage.TSHS__LOCALCLOCKS);
		}
		return localclocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getLocalevents() {
		if (localevents == null) {
			localevents = new EObjectContainmentEList<Event>(Event.class, this, ShmlPackage.TSHS__LOCALEVENTS);
		}
		return localevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialstate() {
		if (initialstate != null && initialstate.eIsProxy()) {
			InternalEObject oldInitialstate = (InternalEObject)initialstate;
			initialstate = (State)eResolveProxy(oldInitialstate);
			if (initialstate != oldInitialstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.TSHS__INITIALSTATE, oldInitialstate, initialstate));
			}
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(State newInitialstate) {
		State oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.TSHS__INITIALSTATE, oldInitialstate, initialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpoDistribution> getOwnedexpos() {
		if (ownedexpos == null) {
			ownedexpos = new EObjectContainmentEList<ExpoDistribution>(ExpoDistribution.class, this, ShmlPackage.TSHS__OWNEDEXPOS);
		}
		return ownedexpos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getOwnedactions() {
		if (ownedactions == null) {
			ownedactions = new EObjectContainmentEList<Action>(Action.class, this, ShmlPackage.TSHS__OWNEDACTIONS);
		}
		return ownedactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Guard> getOwnedguards() {
		if (ownedguards == null) {
			ownedguards = new EObjectContainmentEList<Guard>(Guard.class, this, ShmlPackage.TSHS__OWNEDGUARDS);
		}
		return ownedguards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnifDistribution> getOwnedunifs() {
		if (ownedunifs == null) {
			ownedunifs = new EObjectContainmentEList<UnifDistribution>(UnifDistribution.class, this, ShmlPackage.TSHS__OWNEDUNIFS);
		}
		return ownedunifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShmlPackage.TSHS__OWNEDODES:
				return ((InternalEList<?>)getOwnedodes()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDSTATES:
				return ((InternalEList<?>)getOwnedstates()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
				return ((InternalEList<?>)getOwnedtransitions()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__LOCALVARIABLES:
				return ((InternalEList<?>)getLocalvariables()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__LOCALCLOCKS:
				return ((InternalEList<?>)getLocalclocks()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__LOCALEVENTS:
				return ((InternalEList<?>)getLocalevents()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDEXPOS:
				return ((InternalEList<?>)getOwnedexpos()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDACTIONS:
				return ((InternalEList<?>)getOwnedactions()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDGUARDS:
				return ((InternalEList<?>)getOwnedguards()).basicRemove(otherEnd, msgs);
			case ShmlPackage.TSHS__OWNEDUNIFS:
				return ((InternalEList<?>)getOwnedunifs()).basicRemove(otherEnd, msgs);
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
			case ShmlPackage.TSHS__NAME:
				return getName();
			case ShmlPackage.TSHS__OWNEDODES:
				return getOwnedodes();
			case ShmlPackage.TSHS__OWNEDSTATES:
				return getOwnedstates();
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
				return getOwnedtransitions();
			case ShmlPackage.TSHS__LOCALVARIABLES:
				return getLocalvariables();
			case ShmlPackage.TSHS__LOCALCLOCKS:
				return getLocalclocks();
			case ShmlPackage.TSHS__LOCALEVENTS:
				return getLocalevents();
			case ShmlPackage.TSHS__INITIALSTATE:
				if (resolve) return getInitialstate();
				return basicGetInitialstate();
			case ShmlPackage.TSHS__OWNEDEXPOS:
				return getOwnedexpos();
			case ShmlPackage.TSHS__OWNEDACTIONS:
				return getOwnedactions();
			case ShmlPackage.TSHS__OWNEDGUARDS:
				return getOwnedguards();
			case ShmlPackage.TSHS__OWNEDUNIFS:
				return getOwnedunifs();
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
			case ShmlPackage.TSHS__NAME:
				setName((String)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDODES:
				getOwnedodes().clear();
				getOwnedodes().addAll((Collection<? extends ODE>)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDSTATES:
				getOwnedstates().clear();
				getOwnedstates().addAll((Collection<? extends State>)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
				getOwnedtransitions().clear();
				getOwnedtransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ShmlPackage.TSHS__LOCALVARIABLES:
				getLocalvariables().clear();
				getLocalvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ShmlPackage.TSHS__LOCALCLOCKS:
				getLocalclocks().clear();
				getLocalclocks().addAll((Collection<? extends Clock>)newValue);
				return;
			case ShmlPackage.TSHS__LOCALEVENTS:
				getLocalevents().clear();
				getLocalevents().addAll((Collection<? extends Event>)newValue);
				return;
			case ShmlPackage.TSHS__INITIALSTATE:
				setInitialstate((State)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDEXPOS:
				getOwnedexpos().clear();
				getOwnedexpos().addAll((Collection<? extends ExpoDistribution>)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDACTIONS:
				getOwnedactions().clear();
				getOwnedactions().addAll((Collection<? extends Action>)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDGUARDS:
				getOwnedguards().clear();
				getOwnedguards().addAll((Collection<? extends Guard>)newValue);
				return;
			case ShmlPackage.TSHS__OWNEDUNIFS:
				getOwnedunifs().clear();
				getOwnedunifs().addAll((Collection<? extends UnifDistribution>)newValue);
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
			case ShmlPackage.TSHS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShmlPackage.TSHS__OWNEDODES:
				getOwnedodes().clear();
				return;
			case ShmlPackage.TSHS__OWNEDSTATES:
				getOwnedstates().clear();
				return;
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
				getOwnedtransitions().clear();
				return;
			case ShmlPackage.TSHS__LOCALVARIABLES:
				getLocalvariables().clear();
				return;
			case ShmlPackage.TSHS__LOCALCLOCKS:
				getLocalclocks().clear();
				return;
			case ShmlPackage.TSHS__LOCALEVENTS:
				getLocalevents().clear();
				return;
			case ShmlPackage.TSHS__INITIALSTATE:
				setInitialstate((State)null);
				return;
			case ShmlPackage.TSHS__OWNEDEXPOS:
				getOwnedexpos().clear();
				return;
			case ShmlPackage.TSHS__OWNEDACTIONS:
				getOwnedactions().clear();
				return;
			case ShmlPackage.TSHS__OWNEDGUARDS:
				getOwnedguards().clear();
				return;
			case ShmlPackage.TSHS__OWNEDUNIFS:
				getOwnedunifs().clear();
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
			case ShmlPackage.TSHS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShmlPackage.TSHS__OWNEDODES:
				return ownedodes != null && !ownedodes.isEmpty();
			case ShmlPackage.TSHS__OWNEDSTATES:
				return ownedstates != null && !ownedstates.isEmpty();
			case ShmlPackage.TSHS__OWNEDTRANSITIONS:
				return ownedtransitions != null && !ownedtransitions.isEmpty();
			case ShmlPackage.TSHS__LOCALVARIABLES:
				return localvariables != null && !localvariables.isEmpty();
			case ShmlPackage.TSHS__LOCALCLOCKS:
				return localclocks != null && !localclocks.isEmpty();
			case ShmlPackage.TSHS__LOCALEVENTS:
				return localevents != null && !localevents.isEmpty();
			case ShmlPackage.TSHS__INITIALSTATE:
				return initialstate != null;
			case ShmlPackage.TSHS__OWNEDEXPOS:
				return ownedexpos != null && !ownedexpos.isEmpty();
			case ShmlPackage.TSHS__OWNEDACTIONS:
				return ownedactions != null && !ownedactions.isEmpty();
			case ShmlPackage.TSHS__OWNEDGUARDS:
				return ownedguards != null && !ownedguards.isEmpty();
			case ShmlPackage.TSHS__OWNEDUNIFS:
				return ownedunifs != null && !ownedunifs.isEmpty();
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

} //TSHSImpl
