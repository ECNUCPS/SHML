package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ProbTransition;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import shml.Action;
import shml.EvaluateGuard;
import shml.Event;
import shml.State;
import shml.TemporalGuard;

@SuppressWarnings("all")
public class ProbTransitionAdapter extends EObjectAdapter<ProbTransition> implements shml.ProbTransition {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public ProbTransitionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public float getProbability() {
    return adaptee.getProbability();
  }
  
  @Override
  public void setProbability(final float o) {
    adaptee.setProbability(o);
  }
  
  @Override
  public Event getTriggerevent() {
    return (Event) adaptersFactory.createAdapter(adaptee.getTriggerevent(), eResource);
  }
  
  @Override
  public void setTriggerevent(final Event o) {
    if (o != null)
    	adaptee.setTriggerevent(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.EventAdapter) o).getAdaptee());
    else adaptee.setTriggerevent(null);
  }
  
  @Override
  public Action getTaction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getTaction(), eResource);
  }
  
  @Override
  public void setTaction(final Action o) {
    if (o != null)
    	adaptee.setTaction(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.ActionAdapter) o).getAdaptee());
    else adaptee.setTaction(null);
  }
  
  @Override
  public EvaluateGuard getEvaluateguard() {
    return (EvaluateGuard) adaptersFactory.createAdapter(adaptee.getEvaluateguard(), eResource);
  }
  
  @Override
  public void setEvaluateguard(final EvaluateGuard o) {
    if (o != null)
    	adaptee.setEvaluateguard(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.EvaluateGuardAdapter) o).getAdaptee());
    else adaptee.setEvaluateguard(null);
  }
  
  @Override
  public TemporalGuard getTemporalguard() {
    return (TemporalGuard) adaptersFactory.createAdapter(adaptee.getTemporalguard(), eResource);
  }
  
  @Override
  public void setTemporalguard(final TemporalGuard o) {
    if (o != null)
    	adaptee.setTemporalguard(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.TemporalGuardAdapter) o).getAdaptee());
    else adaptee.setTemporalguard(null);
  }
  
  @Override
  public State getPsrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getPsrc(), eResource);
  }
  
  @Override
  public void setPsrc(final State o) {
    if (o != null)
    	adaptee.setPsrc(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setPsrc(null);
  }
  
  @Override
  public State getPtgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getPtgt(), eResource);
  }
  
  @Override
  public void setPtgt(final State o) {
    if (o != null)
    	adaptee.setPtgt(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setPtgt(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float PROBABILITY_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getProbTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.PROB_TRANSITION__NAME:
    		return getName();
    	case shml.ShmlPackage.PROB_TRANSITION__TRIGGEREVENT:
    		return getTriggerevent();
    	case shml.ShmlPackage.PROB_TRANSITION__TACTION:
    		return getTaction();
    	case shml.ShmlPackage.PROB_TRANSITION__EVALUATEGUARD:
    		return getEvaluateguard();
    	case shml.ShmlPackage.PROB_TRANSITION__TEMPORALGUARD:
    		return getTemporalguard();
    	case shml.ShmlPackage.PROB_TRANSITION__PROBABILITY:
    		return new java.lang.Float(getProbability());
    	case shml.ShmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc();
    	case shml.ShmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.PROB_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.PROB_TRANSITION__TRIGGEREVENT:
    		return getTriggerevent() != null;
    	case shml.ShmlPackage.PROB_TRANSITION__TACTION:
    		return getTaction() != null;
    	case shml.ShmlPackage.PROB_TRANSITION__EVALUATEGUARD:
    		return getEvaluateguard() != null;
    	case shml.ShmlPackage.PROB_TRANSITION__TEMPORALGUARD:
    		return getTemporalguard() != null;
    	case shml.ShmlPackage.PROB_TRANSITION__PROBABILITY:
    		return getProbability() != PROBABILITY_EDEFAULT;
    	case shml.ShmlPackage.PROB_TRANSITION__PSRC:
    		return getPsrc() != null;
    	case shml.ShmlPackage.PROB_TRANSITION__PTGT:
    		return getPtgt() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.PROB_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__TRIGGEREVENT:
    		setTriggerevent(
    		(shml.Event)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__TACTION:
    		setTaction(
    		(shml.Action)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__EVALUATEGUARD:
    		setEvaluateguard(
    		(shml.EvaluateGuard)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__TEMPORALGUARD:
    		setTemporalguard(
    		(shml.TemporalGuard)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__PROBABILITY:
    		setProbability(((java.lang.Float) newValue).floatValue());
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__PSRC:
    		setPsrc(
    		(shml.State)
    		 newValue);
    		return;
    	case shml.ShmlPackage.PROB_TRANSITION__PTGT:
    		setPtgt(
    		(shml.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
