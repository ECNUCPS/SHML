package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class ShmlFactoryAdapter extends EFactoryImpl implements ShmlFactory {
  private XSHMLMTAdaptersFactory adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
  
  private ecnu.models.xshml.xshml.shml.ShmlFactory shmlAdaptee = ecnu.models.xshml.xshml.shml.ShmlFactory.eINSTANCE;
  
  @Override
  public ecnu.models.xshml.xshmlmt.shml.System createSystem() {
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
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE;
  }
}
