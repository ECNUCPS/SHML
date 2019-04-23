/**
 */
package ecnu.models.xshml.xshml.shml.util;

import ecnu.models.xshml.xshml.shml.Action;
import ecnu.models.xshml.xshml.shml.Clock;
import ecnu.models.xshml.xshml.shml.ComTransition;
import ecnu.models.xshml.xshml.shml.Condition;
import ecnu.models.xshml.xshml.shml.DeVariable;
import ecnu.models.xshml.xshml.shml.EvaluateGuard;
import ecnu.models.xshml.xshml.shml.Event;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;
import ecnu.models.xshml.xshml.shml.Fright;
import ecnu.models.xshml.xshml.shml.Function;
import ecnu.models.xshml.xshml.shml.Guard;
import ecnu.models.xshml.xshml.shml.IndeVariable;
import ecnu.models.xshml.xshml.shml.Interval;
import ecnu.models.xshml.xshml.shml.ODE;
import ecnu.models.xshml.xshml.shml.ProbTransition;
import ecnu.models.xshml.xshml.shml.ShmlPackage;
import ecnu.models.xshml.xshml.shml.State;
import ecnu.models.xshml.xshml.shml.TSHS;
import ecnu.models.xshml.xshml.shml.TemporalGuard;
import ecnu.models.xshml.xshml.shml.Transition;
import ecnu.models.xshml.xshml.shml.UnifDistribution;
import ecnu.models.xshml.xshml.shml.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ecnu.models.xshml.xshml.shml.ShmlPackage
 * @generated
 */
public class ShmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShmlSwitch<Adapter> modelSwitch =
		new ShmlSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(ecnu.models.xshml.xshml.shml.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseTSHS(TSHS object) {
				return createTSHSAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseClock(Clock object) {
				return createClockAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseGuard(Guard object) {
				return createGuardAdapter();
			}
			@Override
			public Adapter caseTemporalGuard(TemporalGuard object) {
				return createTemporalGuardAdapter();
			}
			@Override
			public Adapter caseEvaluateGuard(EvaluateGuard object) {
				return createEvaluateGuardAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseComTransition(ComTransition object) {
				return createComTransitionAdapter();
			}
			@Override
			public Adapter caseProbTransition(ProbTransition object) {
				return createProbTransitionAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseIndeVariable(IndeVariable object) {
				return createIndeVariableAdapter();
			}
			@Override
			public Adapter caseDeVariable(DeVariable object) {
				return createDeVariableAdapter();
			}
			@Override
			public Adapter caseFright(Fright object) {
				return createFrightAdapter();
			}
			@Override
			public Adapter caseODE(ODE object) {
				return createODEAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseExpoDistribution(ExpoDistribution object) {
				return createExpoDistributionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseUnifDistribution(UnifDistribution object) {
				return createUnifDistributionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.TSHS <em>TSHS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.TSHS
	 * @generated
	 */
	public Adapter createTSHSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Guard
	 * @generated
	 */
	public Adapter createGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.TemporalGuard <em>Temporal Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.TemporalGuard
	 * @generated
	 */
	public Adapter createTemporalGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.EvaluateGuard <em>Evaluate Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.EvaluateGuard
	 * @generated
	 */
	public Adapter createEvaluateGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.ComTransition <em>Com Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.ComTransition
	 * @generated
	 */
	public Adapter createComTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.ProbTransition <em>Prob Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.ProbTransition
	 * @generated
	 */
	public Adapter createProbTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.IndeVariable <em>Inde Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.IndeVariable
	 * @generated
	 */
	public Adapter createIndeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.DeVariable <em>De Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.DeVariable
	 * @generated
	 */
	public Adapter createDeVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Fright <em>Fright</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Fright
	 * @generated
	 */
	public Adapter createFrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.ODE <em>ODE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.ODE
	 * @generated
	 */
	public Adapter createODEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.ExpoDistribution <em>Expo Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.ExpoDistribution
	 * @generated
	 */
	public Adapter createExpoDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ecnu.models.xshml.xshml.shml.UnifDistribution <em>Unif Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ecnu.models.xshml.xshml.shml.UnifDistribution
	 * @generated
	 */
	public Adapter createUnifDistributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShmlAdapterFactory
