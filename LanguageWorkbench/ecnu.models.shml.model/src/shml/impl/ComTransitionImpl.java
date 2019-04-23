/**
 */
package shml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shml.ComTransition;
import shml.ShmlPackage;
import shml.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shml.impl.ComTransitionImpl#getCsrc <em>Csrc</em>}</li>
 *   <li>{@link shml.impl.ComTransitionImpl#getCtgt <em>Ctgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComTransitionImpl extends TransitionImpl implements ComTransition {
	/**
	 * The cached value of the '{@link #getCsrc() <em>Csrc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsrc()
	 * @generated
	 * @ordered
	 */
	protected State csrc;

	/**
	 * The cached value of the '{@link #getCtgt() <em>Ctgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtgt()
	 * @generated
	 * @ordered
	 */
	protected State ctgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShmlPackage.Literals.COM_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCsrc() {
		if (csrc != null && csrc.eIsProxy()) {
			InternalEObject oldCsrc = (InternalEObject)csrc;
			csrc = (State)eResolveProxy(oldCsrc);
			if (csrc != oldCsrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.COM_TRANSITION__CSRC, oldCsrc, csrc));
			}
		}
		return csrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCsrc() {
		return csrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsrc(State newCsrc, NotificationChain msgs) {
		State oldCsrc = csrc;
		csrc = newCsrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShmlPackage.COM_TRANSITION__CSRC, oldCsrc, newCsrc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsrc(State newCsrc) {
		if (newCsrc != csrc) {
			NotificationChain msgs = null;
			if (csrc != null)
				msgs = ((InternalEObject)csrc).eInverseRemove(this, ShmlPackage.STATE__OUTGOINGCT, State.class, msgs);
			if (newCsrc != null)
				msgs = ((InternalEObject)newCsrc).eInverseAdd(this, ShmlPackage.STATE__OUTGOINGCT, State.class, msgs);
			msgs = basicSetCsrc(newCsrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.COM_TRANSITION__CSRC, newCsrc, newCsrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getCtgt() {
		if (ctgt != null && ctgt.eIsProxy()) {
			InternalEObject oldCtgt = (InternalEObject)ctgt;
			ctgt = (State)eResolveProxy(oldCtgt);
			if (ctgt != oldCtgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShmlPackage.COM_TRANSITION__CTGT, oldCtgt, ctgt));
			}
		}
		return ctgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetCtgt() {
		return ctgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtgt(State newCtgt, NotificationChain msgs) {
		State oldCtgt = ctgt;
		ctgt = newCtgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShmlPackage.COM_TRANSITION__CTGT, oldCtgt, newCtgt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtgt(State newCtgt) {
		if (newCtgt != ctgt) {
			NotificationChain msgs = null;
			if (ctgt != null)
				msgs = ((InternalEObject)ctgt).eInverseRemove(this, ShmlPackage.STATE__INCOMINGCT, State.class, msgs);
			if (newCtgt != null)
				msgs = ((InternalEObject)newCtgt).eInverseAdd(this, ShmlPackage.STATE__INCOMINGCT, State.class, msgs);
			msgs = basicSetCtgt(newCtgt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShmlPackage.COM_TRANSITION__CTGT, newCtgt, newCtgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShmlPackage.COM_TRANSITION__CSRC:
				if (csrc != null)
					msgs = ((InternalEObject)csrc).eInverseRemove(this, ShmlPackage.STATE__OUTGOINGCT, State.class, msgs);
				return basicSetCsrc((State)otherEnd, msgs);
			case ShmlPackage.COM_TRANSITION__CTGT:
				if (ctgt != null)
					msgs = ((InternalEObject)ctgt).eInverseRemove(this, ShmlPackage.STATE__INCOMINGCT, State.class, msgs);
				return basicSetCtgt((State)otherEnd, msgs);
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
			case ShmlPackage.COM_TRANSITION__CSRC:
				return basicSetCsrc(null, msgs);
			case ShmlPackage.COM_TRANSITION__CTGT:
				return basicSetCtgt(null, msgs);
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
			case ShmlPackage.COM_TRANSITION__CSRC:
				if (resolve) return getCsrc();
				return basicGetCsrc();
			case ShmlPackage.COM_TRANSITION__CTGT:
				if (resolve) return getCtgt();
				return basicGetCtgt();
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
			case ShmlPackage.COM_TRANSITION__CSRC:
				setCsrc((State)newValue);
				return;
			case ShmlPackage.COM_TRANSITION__CTGT:
				setCtgt((State)newValue);
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
			case ShmlPackage.COM_TRANSITION__CSRC:
				setCsrc((State)null);
				return;
			case ShmlPackage.COM_TRANSITION__CTGT:
				setCtgt((State)null);
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
			case ShmlPackage.COM_TRANSITION__CSRC:
				return csrc != null;
			case ShmlPackage.COM_TRANSITION__CTGT:
				return ctgt != null;
		}
		return super.eIsSet(featureID);
	}

} //ComTransitionImpl
