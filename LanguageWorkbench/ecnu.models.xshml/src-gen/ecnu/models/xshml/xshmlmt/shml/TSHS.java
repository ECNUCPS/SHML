/**
 */
package ecnu.models.xshml.xshmlmt.shml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TSHS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getName <em>Name</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedodes <em>Ownedodes</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedstates <em>Ownedstates</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedtransitions <em>Ownedtransitions</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getLocalvariables <em>Localvariables</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getLocalclocks <em>Localclocks</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getLocalevents <em>Localevents</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getInitialstate <em>Initialstate</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedexpos <em>Ownedexpos</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedactions <em>Ownedactions</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedguards <em>Ownedguards</em>}</li>
 *   <li>{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getOwnedunifs <em>Ownedunifs</em>}</li>
 * </ul>
 *
 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS()
 * @model
 * @generated
 */
public interface TSHS extends EObject {
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
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ownedodes</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.ODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedodes</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODE> getOwnedodes();

	/**
	 * Returns the value of the '<em><b>Ownedstates</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedstates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedstates</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedstates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedstates();

	/**
	 * Returns the value of the '<em><b>Ownedtransitions</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedtransitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedtransitions</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedtransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOwnedtransitions();

	/**
	 * Returns the value of the '<em><b>Localvariables</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localvariables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localvariables</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Localvariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getLocalvariables();

	/**
	 * Returns the value of the '<em><b>Localclocks</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Clock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localclocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localclocks</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Localclocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clock> getLocalclocks();

	/**
	 * Returns the value of the '<em><b>Localevents</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localevents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localevents</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Localevents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getLocalevents();

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(State)
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Initialstate()
	 * @model required="true"
	 * @generated
	 */
	State getInitialstate();

	/**
	 * Sets the value of the '{@link ecnu.models.xshml.xshmlmt.shml.TSHS#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(State value);

	/**
	 * Returns the value of the '<em><b>Ownedexpos</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.ExpoDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedexpos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedexpos</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedexpos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpoDistribution> getOwnedexpos();

	/**
	 * Returns the value of the '<em><b>Ownedactions</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedactions</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getOwnedactions();

	/**
	 * Returns the value of the '<em><b>Ownedguards</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.Guard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedguards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedguards</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedguards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Guard> getOwnedguards();

	/**
	 * Returns the value of the '<em><b>Ownedunifs</b></em>' containment reference list.
	 * The list contents are of type {@link ecnu.models.xshml.xshmlmt.shml.UnifDistribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownedunifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownedunifs</em>' containment reference list.
	 * @see ecnu.models.xshml.xshmlmt.shml.ShmlPackage#getTSHS_Ownedunifs()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnifDistribution> getOwnedunifs();

} // TSHS
