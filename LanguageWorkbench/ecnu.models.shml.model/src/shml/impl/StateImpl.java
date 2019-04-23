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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shml.ComTransition;
import shml.ExpoDistribution;
import shml.ODE;
import shml.ProbTransition;
import shml.ShmlPackage;
import shml.State;
import shml.TSHS;
import shml.UnifDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shml.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getOutgoingct <em>Outgoingct</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getIncomingct <em>Incomingct</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getOutgoingpt <em>Outgoingpt</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getIncomingpt <em>Incomingpt</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getSubdiagram <em>Subdiagram</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getFatherstate <em>Fatherstate</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getSlavelambda <em>Slavelambda</em>}</li>
 *   <li>{@link shml.impl.StateImpl#getSlaveunif <em>Slaveunif</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getSlaveode() <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveode()
	 * @generated
	 * @ordered
	 */
	protected ODE slaveode;

	/**
	 * The cached value of the '{@link #getOutgoingct() <em>Outgoingct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingct()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> outgoingct;

	/**
	 * The cached value of the '{@link #getIncomingct() <em>Incomingct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingct()
	 * @generated
	 * @ordered
	 */
	protected EList<ComTransition> incomingct;

	/**
	 * The cached value of the '{@link #getOutgoingpt() <em>Outgoingpt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingpt()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> outgoingpt;

	/**
	 * The cached value of the '{@link #getIncomingpt() <em>Incomingpt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingpt()
	 * @generated
	 * @ordered
	 */
	protected EList<ProbTransition> incomingpt;

	/**
	 * The cached value of the '{@link #getSubdiagram() <em>Subdiagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdiagram()
	 * @generated
	 * @ordered
	 */
	protected TSHS subdiagram;

	/**
	 * The cached value of the '{@link #getFatherstate() <em>Fatherstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFatherstate()
	 * @generated
	 * @ordered
	 */
	protected State fatherstate;

	/**
	 * The cached value of the '{@link #getSlavelambda() <em>Slavelambda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlavelambda()
	 * @generated
	 * @ordered
	 */
	protected ExpoDistribution slavelambda;

	/**
	 * The cached value of the '{@link #getSlaveunif() <em>Slaveunif</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveunif()
	 * @generated
	 * @ordered
	 */
	protected UnifDistribution slaveunif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE getSlaveode() {
		if (slaveode != null && slaveode.eIsProxy()) {
			InternalEObject oldSlaveode = (InternalEObject)slaveode;
			slaveode = (ODE)eResolveProxy(oldSlaveode);
			if (slaveode != oldSlaveode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.STATE__SLAVEODE, oldSlaveode, slaveode));
			}
		}
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE basicGetSlaveode() {
		return slaveode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveode(ODE newSlaveode) {
		ODE oldSlaveode = slaveode;
		slaveode = newSlaveode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__SLAVEODE, oldSlaveode, slaveode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getOutgoingct() {
		if (outgoingct == null) {
			outgoingct = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, ShmlPackage.STATE__OUTGOINGCT, ShmlPackage.COM_TRANSITION__CSRC);
		}
		return outgoingct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComTransition> getIncomingct() {
		if (incomingct == null) {
			incomingct = new EObjectWithInverseResolvingEList<ComTransition>(ComTransition.class, this, ShmlPackage.STATE__INCOMINGCT, ShmlPackage.COM_TRANSITION__CTGT);
		}
		return incomingct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getOutgoingpt() {
		if (outgoingpt == null) {
			outgoingpt = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, ShmlPackage.STATE__OUTGOINGPT, ShmlPackage.PROB_TRANSITION__PSRC);
		}
		return outgoingpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProbTransition> getIncomingpt() {
		if (incomingpt == null) {
			incomingpt = new EObjectWithInverseResolvingEList<ProbTransition>(ProbTransition.class, this, ShmlPackage.STATE__INCOMINGPT, ShmlPackage.PROB_TRANSITION__PTGT);
		}
		return incomingpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS getSubdiagram() {
		if (subdiagram != null && subdiagram.eIsProxy()) {
			InternalEObject oldSubdiagram = (InternalEObject)subdiagram;
			subdiagram = (TSHS)eResolveProxy(oldSubdiagram);
			if (subdiagram != oldSubdiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.STATE__SUBDIAGRAM, oldSubdiagram, subdiagram));
			}
		}
		return subdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS basicGetSubdiagram() {
		return subdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubdiagram(TSHS newSubdiagram) {
		TSHS oldSubdiagram = subdiagram;
		subdiagram = newSubdiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__SUBDIAGRAM, oldSubdiagram, subdiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getFatherstate() {
		if (fatherstate != null && fatherstate.eIsProxy()) {
			InternalEObject oldFatherstate = (InternalEObject)fatherstate;
			fatherstate = (State)eResolveProxy(oldFatherstate);
			if (fatherstate != oldFatherstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.STATE__FATHERSTATE, oldFatherstate, fatherstate));
			}
		}
		return fatherstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetFatherstate() {
		return fatherstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFatherstate(State newFatherstate) {
		State oldFatherstate = fatherstate;
		fatherstate = newFatherstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__FATHERSTATE, oldFatherstate, fatherstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpoDistribution getSlavelambda() {
		if (slavelambda != null && slavelambda.eIsProxy()) {
			InternalEObject oldSlavelambda = (InternalEObject)slavelambda;
			slavelambda = (ExpoDistribution)eResolveProxy(oldSlavelambda);
			if (slavelambda != oldSlavelambda) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.STATE__SLAVELAMBDA, oldSlavelambda, slavelambda));
			}
		}
		return slavelambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpoDistribution basicGetSlavelambda() {
		return slavelambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlavelambda(ExpoDistribution newSlavelambda) {
		ExpoDistribution oldSlavelambda = slavelambda;
		slavelambda = newSlavelambda;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__SLAVELAMBDA, oldSlavelambda, slavelambda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifDistribution getSlaveunif() {
		if (slaveunif != null && slaveunif.eIsProxy()) {
			InternalEObject oldSlaveunif = (InternalEObject)slaveunif;
			slaveunif = (UnifDistribution)eResolveProxy(oldSlaveunif);
			if (slaveunif != oldSlaveunif) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.STATE__SLAVEUNIF, oldSlaveunif, slaveunif));
			}
		}
		return slaveunif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifDistribution basicGetSlaveunif() {
		return slaveunif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveunif(UnifDistribution newSlaveunif) {
		UnifDistribution oldSlaveunif = slaveunif;
		slaveunif = newSlaveunif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.STATE__SLAVEUNIF, oldSlaveunif, slaveunif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShmlPackage.STATE__OUTGOINGCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingct()).basicAdd(otherEnd, msgs);
			case ShmlPackage.STATE__INCOMINGCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingct()).basicAdd(otherEnd, msgs);
			case ShmlPackage.STATE__OUTGOINGPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingpt()).basicAdd(otherEnd, msgs);
			case ShmlPackage.STATE__INCOMINGPT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingpt()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShmlPackage.STATE__OUTGOINGCT:
				return ((InternalEList<?>)getOutgoingct()).basicRemove(otherEnd, msgs);
			case ShmlPackage.STATE__INCOMINGCT:
				return ((InternalEList<?>)getIncomingct()).basicRemove(otherEnd, msgs);
			case ShmlPackage.STATE__OUTGOINGPT:
				return ((InternalEList<?>)getOutgoingpt()).basicRemove(otherEnd, msgs);
			case ShmlPackage.STATE__INCOMINGPT:
				return ((InternalEList<?>)getIncomingpt()).basicRemove(otherEnd, msgs);
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
			case ShmlPackage.STATE__NAME:
				return getName();
			case ShmlPackage.STATE__SLAVEODE:
				if (resolve) return getSlaveode();
				return basicGetSlaveode();
			case ShmlPackage.STATE__OUTGOINGCT:
				return getOutgoingct();
			case ShmlPackage.STATE__INCOMINGCT:
				return getIncomingct();
			case ShmlPackage.STATE__OUTGOINGPT:
				return getOutgoingpt();
			case ShmlPackage.STATE__INCOMINGPT:
				return getIncomingpt();
			case ShmlPackage.STATE__SUBDIAGRAM:
				if (resolve) return getSubdiagram();
				return basicGetSubdiagram();
			case ShmlPackage.STATE__FATHERSTATE:
				if (resolve) return getFatherstate();
				return basicGetFatherstate();
			case ShmlPackage.STATE__SLAVELAMBDA:
				if (resolve) return getSlavelambda();
				return basicGetSlavelambda();
			case ShmlPackage.STATE__SLAVEUNIF:
				if (resolve) return getSlaveunif();
				return basicGetSlaveunif();
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
			case ShmlPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case ShmlPackage.STATE__SLAVEODE:
				setSlaveode((ODE)newValue);
				return;
			case ShmlPackage.STATE__OUTGOINGCT:
				getOutgoingct().clear();
				getOutgoingct().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case ShmlPackage.STATE__INCOMINGCT:
				getIncomingct().clear();
				getIncomingct().addAll((Collection<? extends ComTransition>)newValue);
				return;
			case ShmlPackage.STATE__OUTGOINGPT:
				getOutgoingpt().clear();
				getOutgoingpt().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case ShmlPackage.STATE__INCOMINGPT:
				getIncomingpt().clear();
				getIncomingpt().addAll((Collection<? extends ProbTransition>)newValue);
				return;
			case ShmlPackage.STATE__SUBDIAGRAM:
				setSubdiagram((TSHS)newValue);
				return;
			case ShmlPackage.STATE__FATHERSTATE:
				setFatherstate((State)newValue);
				return;
			case ShmlPackage.STATE__SLAVELAMBDA:
				setSlavelambda((ExpoDistribution)newValue);
				return;
			case ShmlPackage.STATE__SLAVEUNIF:
				setSlaveunif((UnifDistribution)newValue);
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
			case ShmlPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShmlPackage.STATE__SLAVEODE:
				setSlaveode((ODE)null);
				return;
			case ShmlPackage.STATE__OUTGOINGCT:
				getOutgoingct().clear();
				return;
			case ShmlPackage.STATE__INCOMINGCT:
				getIncomingct().clear();
				return;
			case ShmlPackage.STATE__OUTGOINGPT:
				getOutgoingpt().clear();
				return;
			case ShmlPackage.STATE__INCOMINGPT:
				getIncomingpt().clear();
				return;
			case ShmlPackage.STATE__SUBDIAGRAM:
				setSubdiagram((TSHS)null);
				return;
			case ShmlPackage.STATE__FATHERSTATE:
				setFatherstate((State)null);
				return;
			case ShmlPackage.STATE__SLAVELAMBDA:
				setSlavelambda((ExpoDistribution)null);
				return;
			case ShmlPackage.STATE__SLAVEUNIF:
				setSlaveunif((UnifDistribution)null);
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
			case ShmlPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShmlPackage.STATE__SLAVEODE:
				return slaveode != null;
			case ShmlPackage.STATE__OUTGOINGCT:
				return outgoingct != null && !outgoingct.isEmpty();
			case ShmlPackage.STATE__INCOMINGCT:
				return incomingct != null && !incomingct.isEmpty();
			case ShmlPackage.STATE__OUTGOINGPT:
				return outgoingpt != null && !outgoingpt.isEmpty();
			case ShmlPackage.STATE__INCOMINGPT:
				return incomingpt != null && !incomingpt.isEmpty();
			case ShmlPackage.STATE__SUBDIAGRAM:
				return subdiagram != null;
			case ShmlPackage.STATE__FATHERSTATE:
				return fatherstate != null;
			case ShmlPackage.STATE__SLAVELAMBDA:
				return slavelambda != null;
			case ShmlPackage.STATE__SLAVEUNIF:
				return slaveunif != null;
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

} //StateImpl
