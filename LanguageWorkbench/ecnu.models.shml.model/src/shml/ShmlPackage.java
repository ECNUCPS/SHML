/**
 */
package shml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see shml.ShmlFactory
 * @model kind="package"
 * @generated
 */
public interface ShmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/shml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShmlPackage eINSTANCE = shml.impl.ShmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link shml.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.SystemImpl
	 * @see shml.impl.ShmlPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tshss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TSHSS = 1;

	/**
	 * The feature id for the '<em><b>Globalvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALVARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Globalclocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALCLOCKS = 3;

	/**
	 * The feature id for the '<em><b>Globalevents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GLOBALEVENTS = 4;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.TSHSImpl <em>TSHS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.TSHSImpl
	 * @see shml.impl.ShmlPackageImpl#getTSHS()
	 * @generated
	 */
	int TSHS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ownedodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDODES = 1;

	/**
	 * The feature id for the '<em><b>Ownedstates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDSTATES = 2;

	/**
	 * The feature id for the '<em><b>Ownedtransitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDTRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Localvariables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALVARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Localclocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALCLOCKS = 5;

	/**
	 * The feature id for the '<em><b>Localevents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__LOCALEVENTS = 6;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__INITIALSTATE = 7;

	/**
	 * The feature id for the '<em><b>Ownedexpos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDEXPOS = 8;

	/**
	 * The feature id for the '<em><b>Ownedactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDACTIONS = 9;

	/**
	 * The feature id for the '<em><b>Ownedguards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDGUARDS = 10;

	/**
	 * The feature id for the '<em><b>Ownedunifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS__OWNEDUNIFS = 11;

	/**
	 * The number of structural features of the '<em>TSHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>TSHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.VariableImpl
	 * @see shml.impl.ShmlPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ClockImpl
	 * @see shml.impl.ShmlPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__TIME = 1;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.EventImpl
	 * @see shml.impl.ShmlPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEND = 1;

	/**
	 * The feature id for the '<em><b>Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__RECEIVE = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIVE = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.TransitionImpl
	 * @see shml.impl.ShmlPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGEREVENT = 1;

	/**
	 * The feature id for the '<em><b>Taction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TACTION = 2;

	/**
	 * The feature id for the '<em><b>Evaluateguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVALUATEGUARD = 3;

	/**
	 * The feature id for the '<em><b>Temporalguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TEMPORALGUARD = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.GuardImpl
	 * @see shml.impl.ShmlPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.TemporalGuardImpl
	 * @see shml.impl.ShmlPackageImpl#getTemporalGuard()
	 * @generated
	 */
	int TEMPORAL_GUARD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Tcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__TCONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onclock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD__ONCLOCK = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shml.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.EvaluateGuardImpl
	 * @see shml.impl.ShmlPackageImpl#getEvaluateGuard()
	 * @generated
	 */
	int EVALUATE_GUARD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__NAME = GUARD__NAME;

	/**
	 * The feature id for the '<em><b>Vcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__VCONDITION = GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Onvariable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD__ONVARIABLE = GUARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_FEATURE_COUNT = GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Evaluate Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_GUARD_OPERATION_COUNT = GUARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shml.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.StateImpl
	 * @see shml.impl.ShmlPackageImpl#getState()
	 * @generated
	 */
	int STATE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Slaveode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SLAVEODE = 1;

	/**
	 * The feature id for the '<em><b>Outgoingct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGCT = 2;

	/**
	 * The feature id for the '<em><b>Incomingct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMINGCT = 3;

	/**
	 * The feature id for the '<em><b>Outgoingpt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOINGPT = 4;

	/**
	 * The feature id for the '<em><b>Incomingpt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMINGPT = 5;

	/**
	 * The feature id for the '<em><b>Subdiagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SUBDIAGRAM = 6;

	/**
	 * The feature id for the '<em><b>Fatherstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FATHERSTATE = 7;

	/**
	 * The feature id for the '<em><b>Slavelambda</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SLAVELAMBDA = 8;

	/**
	 * The feature id for the '<em><b>Slaveunif</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SLAVEUNIF = 9;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.ComTransitionImpl <em>Com Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ComTransitionImpl
	 * @see shml.impl.ShmlPackageImpl#getComTransition()
	 * @generated
	 */
	int COM_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__TRIGGEREVENT = TRANSITION__TRIGGEREVENT;

	/**
	 * The feature id for the '<em><b>Taction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__TACTION = TRANSITION__TACTION;

	/**
	 * The feature id for the '<em><b>Evaluateguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__EVALUATEGUARD = TRANSITION__EVALUATEGUARD;

	/**
	 * The feature id for the '<em><b>Temporalguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__TEMPORALGUARD = TRANSITION__TEMPORALGUARD;

	/**
	 * The feature id for the '<em><b>Csrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CSRC = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION__CTGT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Com Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shml.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ProbTransitionImpl
	 * @see shml.impl.ShmlPackageImpl#getProbTransition()
	 * @generated
	 */
	int PROB_TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__NAME = TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Triggerevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__TRIGGEREVENT = TRANSITION__TRIGGEREVENT;

	/**
	 * The feature id for the '<em><b>Taction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__TACTION = TRANSITION__TACTION;

	/**
	 * The feature id for the '<em><b>Evaluateguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__EVALUATEGUARD = TRANSITION__EVALUATEGUARD;

	/**
	 * The feature id for the '<em><b>Temporalguard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__TEMPORALGUARD = TRANSITION__TEMPORALGUARD;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PROBABILITY = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Psrc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PSRC = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ptgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION__PTGT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Prob Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROB_TRANSITION_OPERATION_COUNT = TRANSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shml.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.FunctionImpl
	 * @see shml.impl.ShmlPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Indevariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INDEVARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Devariable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Fright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FRIGHT = 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.IndeVariableImpl
	 * @see shml.impl.ShmlPackageImpl#getIndeVariable()
	 * @generated
	 */
	int INDE_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inde Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.DeVariableImpl <em>De Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.DeVariableImpl
	 * @see shml.impl.ShmlPackageImpl#getDeVariable()
	 * @generated
	 */
	int DE_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>De Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.FrightImpl <em>Fright</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.FrightImpl
	 * @see shml.impl.ShmlPackageImpl#getFright()
	 * @generated
	 */
	int FRIGHT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fright</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.ODEImpl <em>ODE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ODEImpl
	 * @see shml.impl.ShmlPackageImpl#getODE()
	 * @generated
	 */
	int ODE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE__FUNCTION = 3;

	/**
	 * The number of structural features of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ODE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ConditionImpl
	 * @see shml.impl.ShmlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shml.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.IntervalImpl
	 * @see shml.impl.ShmlPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__LEFT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Subinterval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__SUBINTERVAL = 3;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link shml.impl.ExpoDistributionImpl <em>Expo Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ExpoDistributionImpl
	 * @see shml.impl.ShmlPackageImpl#getExpoDistribution()
	 * @generated
	 */
	int EXPO_DISTRIBUTION = 19;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO_DISTRIBUTION__LAMBDA = 0;

	/**
	 * The number of structural features of the '<em>Expo Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO_DISTRIBUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expo Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPO_DISTRIBUTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link shml.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.ActionImpl
	 * @see shml.impl.ShmlPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 20;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link shml.impl.UnifDistributionImpl <em>Unif Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shml.impl.UnifDistributionImpl
	 * @see shml.impl.ShmlPackageImpl#getUnifDistribution()
	 * @generated
	 */
	int UNIF_DISTRIBUTION = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIF_DISTRIBUTION__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIF_DISTRIBUTION__B = 1;

	/**
	 * The number of structural features of the '<em>Unif Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIF_DISTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unif Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIF_DISTRIBUTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link shml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see shml.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link shml.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.System#getTshss <em>Tshss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tshss</em>'.
	 * @see shml.System#getTshss()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Tshss();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.System#getGlobalvariables <em>Globalvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalvariables</em>'.
	 * @see shml.System#getGlobalvariables()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalvariables();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.System#getGlobalclocks <em>Globalclocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalclocks</em>'.
	 * @see shml.System#getGlobalclocks()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalclocks();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.System#getGlobalevents <em>Globalevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globalevents</em>'.
	 * @see shml.System#getGlobalevents()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Globalevents();

	/**
	 * Returns the meta object for class '{@link shml.TSHS <em>TSHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSHS</em>'.
	 * @see shml.TSHS
	 * @generated
	 */
	EClass getTSHS();

	/**
	 * Returns the meta object for the attribute '{@link shml.TSHS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.TSHS#getName()
	 * @see #getTSHS()
	 * @generated
	 */
	EAttribute getTSHS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedodes <em>Ownedodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedodes</em>'.
	 * @see shml.TSHS#getOwnedodes()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedodes();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedstates <em>Ownedstates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedstates</em>'.
	 * @see shml.TSHS#getOwnedstates()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedstates();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedtransitions <em>Ownedtransitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedtransitions</em>'.
	 * @see shml.TSHS#getOwnedtransitions()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedtransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getLocalvariables <em>Localvariables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localvariables</em>'.
	 * @see shml.TSHS#getLocalvariables()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localvariables();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getLocalclocks <em>Localclocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localclocks</em>'.
	 * @see shml.TSHS#getLocalclocks()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localclocks();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getLocalevents <em>Localevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Localevents</em>'.
	 * @see shml.TSHS#getLocalevents()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Localevents();

	/**
	 * Returns the meta object for the reference '{@link shml.TSHS#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see shml.TSHS#getInitialstate()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Initialstate();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedexpos <em>Ownedexpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedexpos</em>'.
	 * @see shml.TSHS#getOwnedexpos()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedexpos();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedactions <em>Ownedactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedactions</em>'.
	 * @see shml.TSHS#getOwnedactions()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedactions();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedguards <em>Ownedguards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedguards</em>'.
	 * @see shml.TSHS#getOwnedguards()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedguards();

	/**
	 * Returns the meta object for the containment reference list '{@link shml.TSHS#getOwnedunifs <em>Ownedunifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedunifs</em>'.
	 * @see shml.TSHS#getOwnedunifs()
	 * @see #getTSHS()
	 * @generated
	 */
	EReference getTSHS_Ownedunifs();

	/**
	 * Returns the meta object for class '{@link shml.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see shml.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link shml.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link shml.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see shml.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link shml.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see shml.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link shml.Clock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Clock#getName()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Name();

	/**
	 * Returns the meta object for the attribute '{@link shml.Clock#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see shml.Clock#getTime()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Time();

	/**
	 * Returns the meta object for class '{@link shml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see shml.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link shml.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link shml.Event#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see shml.Event#getSend()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Send();

	/**
	 * Returns the meta object for the attribute '{@link shml.Event#getReceive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receive</em>'.
	 * @see shml.Event#getReceive()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Receive();

	/**
	 * Returns the meta object for the attribute '{@link shml.Event#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see shml.Event#getActive()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Active();

	/**
	 * Returns the meta object for class '{@link shml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see shml.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link shml.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link shml.Transition#getTriggerevent <em>Triggerevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggerevent</em>'.
	 * @see shml.Transition#getTriggerevent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Triggerevent();

	/**
	 * Returns the meta object for the reference '{@link shml.Transition#getTaction <em>Taction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taction</em>'.
	 * @see shml.Transition#getTaction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Taction();

	/**
	 * Returns the meta object for the reference '{@link shml.Transition#getEvaluateguard <em>Evaluateguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluateguard</em>'.
	 * @see shml.Transition#getEvaluateguard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Evaluateguard();

	/**
	 * Returns the meta object for the reference '{@link shml.Transition#getTemporalguard <em>Temporalguard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Temporalguard</em>'.
	 * @see shml.Transition#getTemporalguard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Temporalguard();

	/**
	 * Returns the meta object for class '{@link shml.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see shml.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link shml.Guard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Guard#getName()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Name();

	/**
	 * Returns the meta object for class '{@link shml.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Guard</em>'.
	 * @see shml.TemporalGuard
	 * @generated
	 */
	EClass getTemporalGuard();

	/**
	 * Returns the meta object for the attribute '{@link shml.TemporalGuard#getTcondition <em>Tcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcondition</em>'.
	 * @see shml.TemporalGuard#getTcondition()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EAttribute getTemporalGuard_Tcondition();

	/**
	 * Returns the meta object for the reference '{@link shml.TemporalGuard#getOnclock <em>Onclock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onclock</em>'.
	 * @see shml.TemporalGuard#getOnclock()
	 * @see #getTemporalGuard()
	 * @generated
	 */
	EReference getTemporalGuard_Onclock();

	/**
	 * Returns the meta object for class '{@link shml.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Guard</em>'.
	 * @see shml.EvaluateGuard
	 * @generated
	 */
	EClass getEvaluateGuard();

	/**
	 * Returns the meta object for the attribute '{@link shml.EvaluateGuard#getVcondition <em>Vcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcondition</em>'.
	 * @see shml.EvaluateGuard#getVcondition()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EAttribute getEvaluateGuard_Vcondition();

	/**
	 * Returns the meta object for the reference '{@link shml.EvaluateGuard#getOnvariable <em>Onvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Onvariable</em>'.
	 * @see shml.EvaluateGuard#getOnvariable()
	 * @see #getEvaluateGuard()
	 * @generated
	 */
	EReference getEvaluateGuard_Onvariable();

	/**
	 * Returns the meta object for class '{@link shml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see shml.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link shml.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link shml.State#getSlaveode <em>Slaveode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slaveode</em>'.
	 * @see shml.State#getSlaveode()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Slaveode();

	/**
	 * Returns the meta object for the reference list '{@link shml.State#getOutgoingct <em>Outgoingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingct</em>'.
	 * @see shml.State#getOutgoingct()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoingct();

	/**
	 * Returns the meta object for the reference list '{@link shml.State#getIncomingct <em>Incomingct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomingct</em>'.
	 * @see shml.State#getIncomingct()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomingct();

	/**
	 * Returns the meta object for the reference list '{@link shml.State#getOutgoingpt <em>Outgoingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoingpt</em>'.
	 * @see shml.State#getOutgoingpt()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoingpt();

	/**
	 * Returns the meta object for the reference list '{@link shml.State#getIncomingpt <em>Incomingpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomingpt</em>'.
	 * @see shml.State#getIncomingpt()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incomingpt();

	/**
	 * Returns the meta object for the reference '{@link shml.State#getSubdiagram <em>Subdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subdiagram</em>'.
	 * @see shml.State#getSubdiagram()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Subdiagram();

	/**
	 * Returns the meta object for the reference '{@link shml.State#getFatherstate <em>Fatherstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fatherstate</em>'.
	 * @see shml.State#getFatherstate()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Fatherstate();

	/**
	 * Returns the meta object for the reference '{@link shml.State#getSlavelambda <em>Slavelambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slavelambda</em>'.
	 * @see shml.State#getSlavelambda()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Slavelambda();

	/**
	 * Returns the meta object for the reference '{@link shml.State#getSlaveunif <em>Slaveunif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slaveunif</em>'.
	 * @see shml.State#getSlaveunif()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Slaveunif();

	/**
	 * Returns the meta object for class '{@link shml.ComTransition <em>Com Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Transition</em>'.
	 * @see shml.ComTransition
	 * @generated
	 */
	EClass getComTransition();

	/**
	 * Returns the meta object for the reference '{@link shml.ComTransition#getCsrc <em>Csrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Csrc</em>'.
	 * @see shml.ComTransition#getCsrc()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Csrc();

	/**
	 * Returns the meta object for the reference '{@link shml.ComTransition#getCtgt <em>Ctgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ctgt</em>'.
	 * @see shml.ComTransition#getCtgt()
	 * @see #getComTransition()
	 * @generated
	 */
	EReference getComTransition_Ctgt();

	/**
	 * Returns the meta object for class '{@link shml.ProbTransition <em>Prob Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prob Transition</em>'.
	 * @see shml.ProbTransition
	 * @generated
	 */
	EClass getProbTransition();

	/**
	 * Returns the meta object for the attribute '{@link shml.ProbTransition#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see shml.ProbTransition#getProbability()
	 * @see #getProbTransition()
	 * @generated
	 */
	EAttribute getProbTransition_Probability();

	/**
	 * Returns the meta object for the reference '{@link shml.ProbTransition#getPsrc <em>Psrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Psrc</em>'.
	 * @see shml.ProbTransition#getPsrc()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Psrc();

	/**
	 * Returns the meta object for the reference '{@link shml.ProbTransition#getPtgt <em>Ptgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ptgt</em>'.
	 * @see shml.ProbTransition#getPtgt()
	 * @see #getProbTransition()
	 * @generated
	 */
	EReference getProbTransition_Ptgt();

	/**
	 * Returns the meta object for class '{@link shml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see shml.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link shml.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link shml.Function#getIndevariable <em>Indevariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indevariable</em>'.
	 * @see shml.Function#getIndevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Indevariable();

	/**
	 * Returns the meta object for the containment reference '{@link shml.Function#getDevariable <em>Devariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devariable</em>'.
	 * @see shml.Function#getDevariable()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Devariable();

	/**
	 * Returns the meta object for the containment reference '{@link shml.Function#getFright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fright</em>'.
	 * @see shml.Function#getFright()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Fright();

	/**
	 * Returns the meta object for class '{@link shml.IndeVariable <em>Inde Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inde Variable</em>'.
	 * @see shml.IndeVariable
	 * @generated
	 */
	EClass getIndeVariable();

	/**
	 * Returns the meta object for the attribute '{@link shml.IndeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.IndeVariable#getName()
	 * @see #getIndeVariable()
	 * @generated
	 */
	EAttribute getIndeVariable_Name();

	/**
	 * Returns the meta object for class '{@link shml.DeVariable <em>De Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Variable</em>'.
	 * @see shml.DeVariable
	 * @generated
	 */
	EClass getDeVariable();

	/**
	 * Returns the meta object for the attribute '{@link shml.DeVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.DeVariable#getName()
	 * @see #getDeVariable()
	 * @generated
	 */
	EAttribute getDeVariable_Name();

	/**
	 * Returns the meta object for class '{@link shml.Fright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fright</em>'.
	 * @see shml.Fright
	 * @generated
	 */
	EClass getFright();

	/**
	 * Returns the meta object for the attribute '{@link shml.Fright#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Fright#getName()
	 * @see #getFright()
	 * @generated
	 */
	EAttribute getFright_Name();

	/**
	 * Returns the meta object for class '{@link shml.ODE <em>ODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ODE</em>'.
	 * @see shml.ODE
	 * @generated
	 */
	EClass getODE();

	/**
	 * Returns the meta object for the attribute '{@link shml.ODE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.ODE#getName()
	 * @see #getODE()
	 * @generated
	 */
	EAttribute getODE_Name();

	/**
	 * Returns the meta object for the containment reference '{@link shml.ODE#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see shml.ODE#getCondition()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link shml.ODE#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see shml.ODE#getInterval()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link shml.ODE#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see shml.ODE#getFunction()
	 * @see #getODE()
	 * @generated
	 */
	EReference getODE_Function();

	/**
	 * Returns the meta object for class '{@link shml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see shml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link shml.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for class '{@link shml.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see shml.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link shml.Interval#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shml.Interval#getName()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Name();

	/**
	 * Returns the meta object for the attribute '{@link shml.Interval#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see shml.Interval#getLeft()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Left();

	/**
	 * Returns the meta object for the attribute '{@link shml.Interval#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see shml.Interval#getRight()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Right();

	/**
	 * Returns the meta object for the attribute '{@link shml.Interval#getSubinterval <em>Subinterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subinterval</em>'.
	 * @see shml.Interval#getSubinterval()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Subinterval();

	/**
	 * Returns the meta object for class '{@link shml.ExpoDistribution <em>Expo Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expo Distribution</em>'.
	 * @see shml.ExpoDistribution
	 * @generated
	 */
	EClass getExpoDistribution();

	/**
	 * Returns the meta object for the attribute '{@link shml.ExpoDistribution#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see shml.ExpoDistribution#getLambda()
	 * @see #getExpoDistribution()
	 * @generated
	 */
	EAttribute getExpoDistribution_Lambda();

	/**
	 * Returns the meta object for class '{@link shml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see shml.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link shml.Action#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see shml.Action#getAction()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Action();

	/**
	 * Returns the meta object for class '{@link shml.UnifDistribution <em>Unif Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unif Distribution</em>'.
	 * @see shml.UnifDistribution
	 * @generated
	 */
	EClass getUnifDistribution();

	/**
	 * Returns the meta object for the attribute '{@link shml.UnifDistribution#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see shml.UnifDistribution#getA()
	 * @see #getUnifDistribution()
	 * @generated
	 */
	EAttribute getUnifDistribution_A();

	/**
	 * Returns the meta object for the attribute '{@link shml.UnifDistribution#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see shml.UnifDistribution#getB()
	 * @see #getUnifDistribution()
	 * @generated
	 */
	EAttribute getUnifDistribution_B();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShmlFactory getShmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link shml.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.SystemImpl
		 * @see shml.impl.ShmlPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Tshss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TSHSS = eINSTANCE.getSystem_Tshss();

		/**
		 * The meta object literal for the '<em><b>Globalvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALVARIABLES = eINSTANCE.getSystem_Globalvariables();

		/**
		 * The meta object literal for the '<em><b>Globalclocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALCLOCKS = eINSTANCE.getSystem_Globalclocks();

		/**
		 * The meta object literal for the '<em><b>Globalevents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GLOBALEVENTS = eINSTANCE.getSystem_Globalevents();

		/**
		 * The meta object literal for the '{@link shml.impl.TSHSImpl <em>TSHS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.TSHSImpl
		 * @see shml.impl.ShmlPackageImpl#getTSHS()
		 * @generated
		 */
		EClass TSHS = eINSTANCE.getTSHS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSHS__NAME = eINSTANCE.getTSHS_Name();

		/**
		 * The meta object literal for the '<em><b>Ownedodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDODES = eINSTANCE.getTSHS_Ownedodes();

		/**
		 * The meta object literal for the '<em><b>Ownedstates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDSTATES = eINSTANCE.getTSHS_Ownedstates();

		/**
		 * The meta object literal for the '<em><b>Ownedtransitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDTRANSITIONS = eINSTANCE.getTSHS_Ownedtransitions();

		/**
		 * The meta object literal for the '<em><b>Localvariables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALVARIABLES = eINSTANCE.getTSHS_Localvariables();

		/**
		 * The meta object literal for the '<em><b>Localclocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALCLOCKS = eINSTANCE.getTSHS_Localclocks();

		/**
		 * The meta object literal for the '<em><b>Localevents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__LOCALEVENTS = eINSTANCE.getTSHS_Localevents();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__INITIALSTATE = eINSTANCE.getTSHS_Initialstate();

		/**
		 * The meta object literal for the '<em><b>Ownedexpos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDEXPOS = eINSTANCE.getTSHS_Ownedexpos();

		/**
		 * The meta object literal for the '<em><b>Ownedactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDACTIONS = eINSTANCE.getTSHS_Ownedactions();

		/**
		 * The meta object literal for the '<em><b>Ownedguards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDGUARDS = eINSTANCE.getTSHS_Ownedguards();

		/**
		 * The meta object literal for the '<em><b>Ownedunifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSHS__OWNEDUNIFS = eINSTANCE.getTSHS_Ownedunifs();

		/**
		 * The meta object literal for the '{@link shml.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.VariableImpl
		 * @see shml.impl.ShmlPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link shml.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ClockImpl
		 * @see shml.impl.ShmlPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__NAME = eINSTANCE.getClock_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__TIME = eINSTANCE.getClock_Time();

		/**
		 * The meta object literal for the '{@link shml.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.EventImpl
		 * @see shml.impl.ShmlPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__SEND = eINSTANCE.getEvent_Send();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__RECEIVE = eINSTANCE.getEvent_Receive();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ACTIVE = eINSTANCE.getEvent_Active();

		/**
		 * The meta object literal for the '{@link shml.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.TransitionImpl
		 * @see shml.impl.ShmlPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Triggerevent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGEREVENT = eINSTANCE.getTransition_Triggerevent();

		/**
		 * The meta object literal for the '<em><b>Taction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TACTION = eINSTANCE.getTransition_Taction();

		/**
		 * The meta object literal for the '<em><b>Evaluateguard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVALUATEGUARD = eINSTANCE.getTransition_Evaluateguard();

		/**
		 * The meta object literal for the '<em><b>Temporalguard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TEMPORALGUARD = eINSTANCE.getTransition_Temporalguard();

		/**
		 * The meta object literal for the '{@link shml.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.GuardImpl
		 * @see shml.impl.ShmlPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

		/**
		 * The meta object literal for the '{@link shml.impl.TemporalGuardImpl <em>Temporal Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.TemporalGuardImpl
		 * @see shml.impl.ShmlPackageImpl#getTemporalGuard()
		 * @generated
		 */
		EClass TEMPORAL_GUARD = eINSTANCE.getTemporalGuard();

		/**
		 * The meta object literal for the '<em><b>Tcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_GUARD__TCONDITION = eINSTANCE.getTemporalGuard_Tcondition();

		/**
		 * The meta object literal for the '<em><b>Onclock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_GUARD__ONCLOCK = eINSTANCE.getTemporalGuard_Onclock();

		/**
		 * The meta object literal for the '{@link shml.impl.EvaluateGuardImpl <em>Evaluate Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.EvaluateGuardImpl
		 * @see shml.impl.ShmlPackageImpl#getEvaluateGuard()
		 * @generated
		 */
		EClass EVALUATE_GUARD = eINSTANCE.getEvaluateGuard();

		/**
		 * The meta object literal for the '<em><b>Vcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATE_GUARD__VCONDITION = eINSTANCE.getEvaluateGuard_Vcondition();

		/**
		 * The meta object literal for the '<em><b>Onvariable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_GUARD__ONVARIABLE = eINSTANCE.getEvaluateGuard_Onvariable();

		/**
		 * The meta object literal for the '{@link shml.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.StateImpl
		 * @see shml.impl.ShmlPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Slaveode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SLAVEODE = eINSTANCE.getState_Slaveode();

		/**
		 * The meta object literal for the '<em><b>Outgoingct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGCT = eINSTANCE.getState_Outgoingct();

		/**
		 * The meta object literal for the '<em><b>Incomingct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMINGCT = eINSTANCE.getState_Incomingct();

		/**
		 * The meta object literal for the '<em><b>Outgoingpt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOINGPT = eINSTANCE.getState_Outgoingpt();

		/**
		 * The meta object literal for the '<em><b>Incomingpt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMINGPT = eINSTANCE.getState_Incomingpt();

		/**
		 * The meta object literal for the '<em><b>Subdiagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SUBDIAGRAM = eINSTANCE.getState_Subdiagram();

		/**
		 * The meta object literal for the '<em><b>Fatherstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FATHERSTATE = eINSTANCE.getState_Fatherstate();

		/**
		 * The meta object literal for the '<em><b>Slavelambda</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SLAVELAMBDA = eINSTANCE.getState_Slavelambda();

		/**
		 * The meta object literal for the '<em><b>Slaveunif</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SLAVEUNIF = eINSTANCE.getState_Slaveunif();

		/**
		 * The meta object literal for the '{@link shml.impl.ComTransitionImpl <em>Com Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ComTransitionImpl
		 * @see shml.impl.ShmlPackageImpl#getComTransition()
		 * @generated
		 */
		EClass COM_TRANSITION = eINSTANCE.getComTransition();

		/**
		 * The meta object literal for the '<em><b>Csrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CSRC = eINSTANCE.getComTransition_Csrc();

		/**
		 * The meta object literal for the '<em><b>Ctgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_TRANSITION__CTGT = eINSTANCE.getComTransition_Ctgt();

		/**
		 * The meta object literal for the '{@link shml.impl.ProbTransitionImpl <em>Prob Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ProbTransitionImpl
		 * @see shml.impl.ShmlPackageImpl#getProbTransition()
		 * @generated
		 */
		EClass PROB_TRANSITION = eINSTANCE.getProbTransition();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROB_TRANSITION__PROBABILITY = eINSTANCE.getProbTransition_Probability();

		/**
		 * The meta object literal for the '<em><b>Psrc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PSRC = eINSTANCE.getProbTransition_Psrc();

		/**
		 * The meta object literal for the '<em><b>Ptgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROB_TRANSITION__PTGT = eINSTANCE.getProbTransition_Ptgt();

		/**
		 * The meta object literal for the '{@link shml.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.FunctionImpl
		 * @see shml.impl.ShmlPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Indevariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INDEVARIABLE = eINSTANCE.getFunction_Indevariable();

		/**
		 * The meta object literal for the '<em><b>Devariable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__DEVARIABLE = eINSTANCE.getFunction_Devariable();

		/**
		 * The meta object literal for the '<em><b>Fright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FRIGHT = eINSTANCE.getFunction_Fright();

		/**
		 * The meta object literal for the '{@link shml.impl.IndeVariableImpl <em>Inde Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.IndeVariableImpl
		 * @see shml.impl.ShmlPackageImpl#getIndeVariable()
		 * @generated
		 */
		EClass INDE_VARIABLE = eINSTANCE.getIndeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDE_VARIABLE__NAME = eINSTANCE.getIndeVariable_Name();

		/**
		 * The meta object literal for the '{@link shml.impl.DeVariableImpl <em>De Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.DeVariableImpl
		 * @see shml.impl.ShmlPackageImpl#getDeVariable()
		 * @generated
		 */
		EClass DE_VARIABLE = eINSTANCE.getDeVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DE_VARIABLE__NAME = eINSTANCE.getDeVariable_Name();

		/**
		 * The meta object literal for the '{@link shml.impl.FrightImpl <em>Fright</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.FrightImpl
		 * @see shml.impl.ShmlPackageImpl#getFright()
		 * @generated
		 */
		EClass FRIGHT = eINSTANCE.getFright();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIGHT__NAME = eINSTANCE.getFright_Name();

		/**
		 * The meta object literal for the '{@link shml.impl.ODEImpl <em>ODE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ODEImpl
		 * @see shml.impl.ShmlPackageImpl#getODE()
		 * @generated
		 */
		EClass ODE = eINSTANCE.getODE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODE__NAME = eINSTANCE.getODE_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__CONDITION = eINSTANCE.getODE_Condition();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__INTERVAL = eINSTANCE.getODE_Interval();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODE__FUNCTION = eINSTANCE.getODE_Function();

		/**
		 * The meta object literal for the '{@link shml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ConditionImpl
		 * @see shml.impl.ShmlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '{@link shml.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.IntervalImpl
		 * @see shml.impl.ShmlPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__NAME = eINSTANCE.getInterval_Name();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__LEFT = eINSTANCE.getInterval_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__RIGHT = eINSTANCE.getInterval_Right();

		/**
		 * The meta object literal for the '<em><b>Subinterval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__SUBINTERVAL = eINSTANCE.getInterval_Subinterval();

		/**
		 * The meta object literal for the '{@link shml.impl.ExpoDistributionImpl <em>Expo Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ExpoDistributionImpl
		 * @see shml.impl.ShmlPackageImpl#getExpoDistribution()
		 * @generated
		 */
		EClass EXPO_DISTRIBUTION = eINSTANCE.getExpoDistribution();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPO_DISTRIBUTION__LAMBDA = eINSTANCE.getExpoDistribution_Lambda();

		/**
		 * The meta object literal for the '{@link shml.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.ActionImpl
		 * @see shml.impl.ShmlPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION = eINSTANCE.getAction_Action();

		/**
		 * The meta object literal for the '{@link shml.impl.UnifDistributionImpl <em>Unif Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shml.impl.UnifDistributionImpl
		 * @see shml.impl.ShmlPackageImpl#getUnifDistribution()
		 * @generated
		 */
		EClass UNIF_DISTRIBUTION = eINSTANCE.getUnifDistribution();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIF_DISTRIBUTION__A = eINSTANCE.getUnifDistribution_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIF_DISTRIBUTION__B = eINSTANCE.getUnifDistribution_B();

	}

} //ShmlPackage
