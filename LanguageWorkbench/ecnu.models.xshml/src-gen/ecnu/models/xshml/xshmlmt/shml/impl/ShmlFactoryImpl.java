/**
 */
package ecnu.models.xshml.xshmlmt.shml.impl;

import ecnu.models.xshml.xshmlmt.shml.Action;
import ecnu.models.xshml.xshmlmt.shml.Clock;
import ecnu.models.xshml.xshmlmt.shml.ComTransition;
import ecnu.models.xshml.xshmlmt.shml.Condition;
import ecnu.models.xshml.xshmlmt.shml.DeVariable;
import ecnu.models.xshml.xshmlmt.shml.EvaluateGuard;
import ecnu.models.xshml.xshmlmt.shml.Event;
import ecnu.models.xshml.xshmlmt.shml.ExpoDistribution;
import ecnu.models.xshml.xshmlmt.shml.Fright;
import ecnu.models.xshml.xshmlmt.shml.Function;
import ecnu.models.xshml.xshmlmt.shml.IndeVariable;
import ecnu.models.xshml.xshmlmt.shml.Interval;
import ecnu.models.xshml.xshmlmt.shml.ODE;
import ecnu.models.xshml.xshmlmt.shml.ProbTransition;
import ecnu.models.xshml.xshmlmt.shml.ShmlFactory;
import ecnu.models.xshml.xshmlmt.shml.ShmlPackage;
import ecnu.models.xshml.xshmlmt.shml.State;
import ecnu.models.xshml.xshmlmt.shml.TSHS;
import ecnu.models.xshml.xshmlmt.shml.TemporalGuard;
import ecnu.models.xshml.xshmlmt.shml.UnifDistribution;
import ecnu.models.xshml.xshmlmt.shml.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
	public ecnu.models.xshml.xshmlmt.shml.System createSystem() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TSHS createTSHS() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalGuard createTemporalGuard() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluateGuard createEvaluateGuard() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComTransition createComTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbTransition createProbTransition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndeVariable createIndeVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeVariable createDeVariable() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fright createFright() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODE createODE() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpoDistribution createExpoDistribution() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifDistribution createUnifDistribution() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
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
