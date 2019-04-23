/**
 */
package shml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shml.System#getName <em>Name</em>}</li>
 *   <li>{@link shml.System#getTshss <em>Tshss</em>}</li>
 *   <li>{@link shml.System#getGlobalvariables <em>Globalvariables</em>}</li>
 *   <li>{@link shml.System#getGlobalclocks <em>Globalclocks</em>}</li>
 *   <li>{@link shml.System#getGlobalevents <em>Globalevents</em>}</li>
 * </ul>
 *
 * @see shml.ShmlPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
	 * @see shml.ShmlPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shml.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tshss</b></em>' containment reference list.
	 * The list contents are of type {@link shml.TSHS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tshss</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tshss</em>' containment reference list.
	 * @see shml.ShmlPackage#getSystem_Tshss()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSHS> getTshss();

	/**
	 * Returns the value of the '<em><b>Globalvariables</b></em>' containment reference list.
	 * The list contents are of type {@link shml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalvariables</em>' containment reference list.
	 * @see shml.ShmlPackage#getSystem_Globalvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getGlobalvariables();

	/**
	 * Returns the value of the '<em><b>Globalclocks</b></em>' containment reference list.
	 * The list contents are of type {@link shml.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalclocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalclocks</em>' containment reference list.
	 * @see shml.ShmlPackage#getSystem_Globalclocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clock> getGlobalclocks();

	/**
	 * Returns the value of the '<em><b>Globalevents</b></em>' containment reference list.
	 * The list contents are of type {@link shml.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globalevents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalevents</em>' containment reference list.
	 * @see shml.ShmlPackage#getSystem_Globalevents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getGlobalevents();

} // System
