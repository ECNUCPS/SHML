/**
 */
package shml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shml.State#getName <em>Name</em>}</li>
 *   <li>{@link shml.State#getSlaveode <em>Slaveode</em>}</li>
 *   <li>{@link shml.State#getOutgoingct <em>Outgoingct</em>}</li>
 *   <li>{@link shml.State#getIncomingct <em>Incomingct</em>}</li>
 *   <li>{@link shml.State#getOutgoingpt <em>Outgoingpt</em>}</li>
 *   <li>{@link shml.State#getIncomingpt <em>Incomingpt</em>}</li>
 *   <li>{@link shml.State#getSubdiagram <em>Subdiagram</em>}</li>
 *   <li>{@link shml.State#getFatherstate <em>Fatherstate</em>}</li>
 *   <li>{@link shml.State#getSlavelambda <em>Slavelambda</em>}</li>
 *   <li>{@link shml.State#getSlaveunif <em>Slaveunif</em>}</li>
 * </ul>
 *
 * @see shml.ShmlPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see shml.ShmlPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shml.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaveode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaveode</em>' reference.
	 * @see #setSlaveode(ODE)
	 * @see shml.ShmlPackage#getState_Slaveode()
	 * @model required="true"
	 * @generated
	 */
	ODE getSlaveode();

	/**
	 * Sets the value of the '{@link shml.State#getSlaveode <em>Slaveode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slaveode</em>' reference.
	 * @see #getSlaveode()
	 * @generated
	 */
	void setSlaveode(ODE value);

	/**
	 * Returns the value of the '<em><b>Outgoingct</b></em>' reference list.
	 * The list contents are of type {@link shml.ComTransition}.
	 * It is bidirectional and its opposite is '{@link shml.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingct</em>' reference list.
	 * @see shml.ShmlPackage#getState_Outgoingct()
	 * @see shml.ComTransition#getCsrc
	 * @model opposite="csrc"
	 * @generated
	 */
	EList<ComTransition> getOutgoingct();

	/**
	 * Returns the value of the '<em><b>Incomingct</b></em>' reference list.
	 * The list contents are of type {@link shml.ComTransition}.
	 * It is bidirectional and its opposite is '{@link shml.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomingct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingct</em>' reference list.
	 * @see shml.ShmlPackage#getState_Incomingct()
	 * @see shml.ComTransition#getCtgt
	 * @model opposite="ctgt"
	 * @generated
	 */
	EList<ComTransition> getIncomingct();

	/**
	 * Returns the value of the '<em><b>Outgoingpt</b></em>' reference list.
	 * The list contents are of type {@link shml.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link shml.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoingpt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoingpt</em>' reference list.
	 * @see shml.ShmlPackage#getState_Outgoingpt()
	 * @see shml.ProbTransition#getPsrc
	 * @model opposite="psrc"
	 * @generated
	 */
	EList<ProbTransition> getOutgoingpt();

	/**
	 * Returns the value of the '<em><b>Incomingpt</b></em>' reference list.
	 * The list contents are of type {@link shml.ProbTransition}.
	 * It is bidirectional and its opposite is '{@link shml.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomingpt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomingpt</em>' reference list.
	 * @see shml.ShmlPackage#getState_Incomingpt()
	 * @see shml.ProbTransition#getPtgt
	 * @model opposite="ptgt"
	 * @generated
	 */
	EList<ProbTransition> getIncomingpt();

	/**
	 * Returns the value of the '<em><b>Subdiagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subdiagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subdiagram</em>' reference.
	 * @see #setSubdiagram(TSHS)
	 * @see shml.ShmlPackage#getState_Subdiagram()
	 * @model required="true"
	 * @generated
	 */
	TSHS getSubdiagram();

	/**
	 * Sets the value of the '{@link shml.State#getSubdiagram <em>Subdiagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subdiagram</em>' reference.
	 * @see #getSubdiagram()
	 * @generated
	 */
	void setSubdiagram(TSHS value);

	/**
	 * Returns the value of the '<em><b>Fatherstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fatherstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fatherstate</em>' reference.
	 * @see #setFatherstate(State)
	 * @see shml.ShmlPackage#getState_Fatherstate()
	 * @model required="true"
	 * @generated
	 */
	State getFatherstate();

	/**
	 * Sets the value of the '{@link shml.State#getFatherstate <em>Fatherstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatherstate</em>' reference.
	 * @see #getFatherstate()
	 * @generated
	 */
	void setFatherstate(State value);

	/**
	 * Returns the value of the '<em><b>Slavelambda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slavelambda</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slavelambda</em>' reference.
	 * @see #setSlavelambda(ExpoDistribution)
	 * @see shml.ShmlPackage#getState_Slavelambda()
	 * @model required="true"
	 * @generated
	 */
	ExpoDistribution getSlavelambda();

	/**
	 * Sets the value of the '{@link shml.State#getSlavelambda <em>Slavelambda</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slavelambda</em>' reference.
	 * @see #getSlavelambda()
	 * @generated
	 */
	void setSlavelambda(ExpoDistribution value);

	/**
	 * Returns the value of the '<em><b>Slaveunif</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slaveunif</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slaveunif</em>' reference.
	 * @see #setSlaveunif(UnifDistribution)
	 * @see shml.ShmlPackage#getState_Slaveunif()
	 * @model required="true"
	 * @generated
	 */
	UnifDistribution getSlaveunif();

	/**
	 * Sets the value of the '{@link shml.State#getSlaveunif <em>Slaveunif</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slaveunif</em>' reference.
	 * @see #getSlaveunif()
	 * @generated
	 */
	void setSlaveunif(UnifDistribution value);

} // State
