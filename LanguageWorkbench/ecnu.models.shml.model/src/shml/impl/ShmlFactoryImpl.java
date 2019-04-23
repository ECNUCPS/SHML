/**
 */
package shml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import shml.Action;
import shml.Clock;
import shml.ComTransition;
import shml.Condition;
import shml.DeVariable;
import shml.EvaluateGuard;
import shml.Event;
import shml.ExpoDistribution;
import shml.Fright;
import shml.Function;
import shml.IndeVariable;
import shml.Interval;
import shml.ODE;
import shml.ProbTransition;
import shml.ShmlFactory;
import shml.ShmlPackage;
import shml.State;
import shml.TSHS;
import shml.TemporalGuard;
import shml.UnifDistribution;
import shml.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShmlFactoryImpl extends EFactoryImpl implements ShmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShmlFactory init() {
		try {
			ShmlFactory theShmlFactory = (ShmlFactory)EPackage.Registry.INSTANCE.getEFactory(ShmlPackage.eNS_URI);
			if (theShmlFactory != null) {
				return theShmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShmlPackage.SYSTEM: return createSystem();
			case ShmlPackage.TSHS: return createTSHS();
			case ShmlPackage.VARIABLE: return createVariable();
			case ShmlPackage.CLOCK: return createClock();
			case ShmlPackage.EVENT: return createEvent();
			case ShmlPackage.TEMPORAL_GUARD: return createTemporalGuard();
			case ShmlPackage.EVALUATE_GUARD: return createEvaluateGuard();
			case ShmlPackage.STATE: return createState();
			case ShmlPackage.COM_TRANSITION: return createComTransition();
			case ShmlPackage.PROB_TRANSITION: return createProbTransition();
			case ShmlPackage.FUNCTION: return createFunction();
			case ShmlPackage.INDE_VARIABLE: return createIndeVariable();
			case ShmlPackage.DE_VARIABLE: return createDeVariable();
			case ShmlPackage.FRIGHT: return createFright();
			case ShmlPackage.ODE: return createODE();
			case ShmlPackage.CONDITION: return createCondition();
			case ShmlPackage.INTERVAL: return createInterval();
			case ShmlPackage.EXPO_DISTRIBUTION: return createExpoDistribution();
			case ShmlPackage.ACTION: return createAction();
			case ShmlPackage.UNIF_DISTRIBUTION: return createUnifDistribution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public shml.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS createTSHS() {
		TSHSImpl tshs = new TSHSImpl();
		return tshs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard() {
		TemporalGuardImpl temporalGuard = new TemporalGuardImpl();
		return temporalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard createEvaluateGuard() {
		EvaluateGuardImpl evaluateGuard = new EvaluateGuardImpl();
		return evaluateGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransition createComTransition() {
		ComTransitionImpl comTransition = new ComTransitionImpl();
		return comTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransition createProbTransition() {
		ProbTransitionImpl probTransition = new ProbTransitionImpl();
		return probTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable createIndeVariable() {
		IndeVariableImpl indeVariable = new IndeVariableImpl();
		return indeVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable createDeVariable() {
		DeVariableImpl deVariable = new DeVariableImpl();
		return deVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright createFright() {
		FrightImpl fright = new FrightImpl();
		return fright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE createODE() {
		ODEImpl ode = new ODEImpl();
		return ode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpoDistribution createExpoDistribution() {
		ExpoDistributionImpl expoDistribution = new ExpoDistributionImpl();
		return expoDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifDistribution createUnifDistribution() {
		UnifDistributionImpl unifDistribution = new UnifDistributionImpl();
		return unifDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShmlPackage getShmlPackage() {
		return (ShmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShmlPackage getPackage() {
		return ShmlPackage.eINSTANCE;
	}

} //ShmlFactoryImpl
