/**
 */
package ecnu.models.xshml.xshmlmt.shml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Transition#getName <em>Name</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTriggerevent <em>Triggerevent</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTaction <em>Taction</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Transition#getEvaluateguard <em>Evaluateguard</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTemporalguard <em>Temporalguard</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition()
 * @model abstract="true"
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggerevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggerevent</em>' reference.
	 * @see #setTriggerevent(Event)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition_Triggerevent()
	 * @model required="true"
	 * @generated
	 */
	Event getTriggerevent();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTriggerevent <em>Triggerevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggerevent</em>' reference.
	 * @see #getTriggerevent()
	 * @generated
	 */
	void setTriggerevent(Event value);

	/**
	 * Returns the value of the '<em><b>Taction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taction</em>' reference.
	 * @see #setTaction(Action)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition_Taction()
	 * @model required="true"
	 * @generated
	 */
	Action getTaction();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTaction <em>Taction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taction</em>' reference.
	 * @see #getTaction()
	 * @generated
	 */
	void setTaction(Action value);

	/**
	 * Returns the value of the '<em><b>Evaluateguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluateguard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluateguard</em>' reference.
	 * @see #setEvaluateguard(EvaluateGuard)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition_Evaluateguard()
	 * @model required="true"
	 * @generated
	 */
	EvaluateGuard getEvaluateguard();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Transition#getEvaluateguard <em>Evaluateguard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluateguard</em>' reference.
	 * @see #getEvaluateguard()
	 * @generated
	 */
	void setEvaluateguard(EvaluateGuard value);

	/**
	 * Returns the value of the '<em><b>Temporalguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporalguard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporalguard</em>' reference.
	 * @see #setTemporalguard(TemporalGuard)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTransition_Temporalguard()
	 * @model required="true"
	 * @generated
	 */
	TemporalGuard getTemporalguard();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.Transition#getTemporalguard <em>Temporalguard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporalguard</em>' reference.
	 * @see #getTemporalguard()
	 * @generated
	 */
	void setTemporalguard(TemporalGuard value);

} // Transition
