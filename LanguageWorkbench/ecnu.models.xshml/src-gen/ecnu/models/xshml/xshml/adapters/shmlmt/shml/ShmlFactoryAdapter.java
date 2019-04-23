package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
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

@SuppressWarnings("all")
public class ShmlFactoryAdapter extends EFactoryImpl implements ShmlFactory {
  private SHMLMTAdaptersFactory adaptersFactory = ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance();
  
  private ecnu.models.xshml.xshml.shml.ShmlFactory shmlAdaptee = ecnu.models.xshml.xshml.shml.ShmlFactory.eINSTANCE;
  
  @Override
  public shml.System createSystem() {
    return adaptersFactory.createSystemAdapter(shmlAdaptee.createSystem(), null);
  }
  
  @Override
  public TSHS createTSHS() {
    return adaptersFactory.createTSHSAdapter(shmlAdaptee.createTSHS(), null);
  }
  
  @Override
  public Variable createVariable() {
    return adaptersFactory.createVariableAdapter(shmlAdaptee.createVariable(), null);
  }
  
  @Override
  public Clock createClock() {
    return adaptersFactory.createClockAdapter(shmlAdaptee.createClock(), null);
  }
  
  @Override
  public Event createEvent() {
    return adaptersFactory.createEventAdapter(shmlAdaptee.createEvent(), null);
  }
  
  @Override
  public TemporalGuard createTemporalGuard() {
    return adaptersFactory.createTemporalGuardAdapter(shmlAdaptee.createTemporalGuard(), null);
  }
  
  @Override
  public EvaluateGuard createEvaluateGuard() {
    return adaptersFactory.createEvaluateGuardAdapter(shmlAdaptee.createEvaluateGuard(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(shmlAdaptee.createState(), null);
  }
  
  @Override
  public ComTransition createComTransition() {
    return adaptersFactory.createComTransitionAdapter(shmlAdaptee.createComTransition(), null);
  }
  
  @Override
  public ProbTransition createProbTransition() {
    return adaptersFactory.createProbTransitionAdapter(shmlAdaptee.createProbTransition(), null);
  }
  
  @Override
  public Function createFunction() {
    return adaptersFactory.createFunctionAdapter(shmlAdaptee.createFunction(), null);
  }
  
  @Override
  public IndeVariable createIndeVariable() {
    return adaptersFactory.createIndeVariableAdapter(shmlAdaptee.createIndeVariable(), null);
  }
  
  @Override
  public DeVariable createDeVariable() {
    return adaptersFactory.createDeVariableAdapter(shmlAdaptee.createDeVariable(), null);
  }
  
  @Override
  public Fright createFright() {
    return adaptersFactory.createFrightAdapter(shmlAdaptee.createFright(), null);
  }
  
  @Override
  public ODE createODE() {
    return adaptersFactory.createODEAdapter(shmlAdaptee.createODE(), null);
  }
  
  @Override
  public Condition createCondition() {
    return adaptersFactory.createConditionAdapter(shmlAdaptee.createCondition(), null);
  }
  
  @Override
  public Interval createInterval() {
    return adaptersFactory.createIntervalAdapter(shmlAdaptee.createInterval(), null);
  }
  
  @Override
  public ExpoDistribution createExpoDistribution() {
    return adaptersFactory.createExpoDistributionAdapter(shmlAdaptee.createExpoDistribution(), null);
  }
  
  @Override
  public Action createAction() {
    return adaptersFactory.createActionAdapter(shmlAdaptee.createAction(), null);
  }
  
  @Override
  public UnifDistribution createUnifDistribution() {
    return adaptersFactory.createUnifDistributionAdapter(shmlAdaptee.createUnifDistribution(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getShmlPackage();
  }
  
  public ShmlPackage getShmlPackage() {
    return shml.ShmlPackage.eINSTANCE;
  }
}
