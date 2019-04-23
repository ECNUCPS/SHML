package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ComTransition;
import ecnu.models.xshml.xshmlmt.shml.Action;
import ecnu.models.xshml.xshmlmt.shml.EvaluateGuard;
import ecnu.models.xshml.xshmlmt.shml.Event;
import ecnu.models.xshml.xshmlmt.shml.State;
import ecnu.models.xshml.xshmlmt.shml.TemporalGuard;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ComTransitionAdapter extends EObjectAdapter<ComTransition> implements ecnu.models.xshml.xshmlmt.shml.ComTransition {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public ComTransitionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
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
  public Event getTriggerevent() {
    return (Event) adaptersFactory.createAdapter(adaptee.getTriggerevent(), eResource);
  }
  
  @Override
  public void setTriggerevent(final Event o) {
    if (o != null)
    	adaptee.setTriggerevent(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EventAdapter) o).getAdaptee());
    else adaptee.setTriggerevent(null);
  }
  
  @Override
  public Action getTaction() {
    return (Action) adaptersFactory.createAdapter(adaptee.getTaction(), eResource);
  }
  
  @Override
  public void setTaction(final Action o) {
    if (o != null)
    	adaptee.setTaction(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ActionAdapter) o).getAdaptee());
    else adaptee.setTaction(null);
  }
  
  @Override
  public EvaluateGuard getEvaluateguard() {
    return (EvaluateGuard) adaptersFactory.createAdapter(adaptee.getEvaluateguard(), eResource);
  }
  
  @Override
  public void setEvaluateguard(final EvaluateGuard o) {
    if (o != null)
    	adaptee.setEvaluateguard(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.EvaluateGuardAdapter) o).getAdaptee());
    else adaptee.setEvaluateguard(null);
  }
  
  @Override
  public TemporalGuard getTemporalguard() {
    return (TemporalGuard) adaptersFactory.createAdapter(adaptee.getTemporalguard(), eResource);
  }
  
  @Override
  public void setTemporalguard(final TemporalGuard o) {
    if (o != null)
    	adaptee.setTemporalguard(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TemporalGuardAdapter) o).getAdaptee());
    else adaptee.setTemporalguard(null);
  }
  
  @Override
  public State getCsrc() {
    return (State) adaptersFactory.createAdapter(adaptee.getCsrc(), eResource);
  }
  
  @Override
  public void setCsrc(final State o) {
    if (o != null)
    	adaptee.setCsrc(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setCsrc(null);
  }
  
  @Override
  public State getCtgt() {
    return (State) adaptersFactory.createAdapter(adaptee.getCtgt(), eResource);
  }
  
  @Override
  public void setCtgt(final State o) {
    if (o != null)
    	adaptee.setCtgt(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setCtgt(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getComTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TRIGGEREVENT:
    		return getTriggerevent();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TACTION:
    		return getTaction();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__EVALUATEGUARD:
    		return getEvaluateguard();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TEMPORALGUARD:
    		return getTemporalguard();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CSRC:
    		return getCsrc();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CTGT:
    		return getCtgt();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TRIGGEREVENT:
    		return getTriggerevent() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TACTION:
    		return getTaction() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__EVALUATEGUARD:
    		return getEvaluateguard() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TEMPORALGUARD:
    		return getTemporalguard() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CSRC:
    		return getCsrc() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CTGT:
    		return getCtgt() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TRIGGEREVENT:
    		setTriggerevent(
    		(ecnu.models.xshml.xshmlmt.shml.Event)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TACTION:
    		setTaction(
    		(ecnu.models.xshml.xshmlmt.shml.Action)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__EVALUATEGUARD:
    		setEvaluateguard(
    		(ecnu.models.xshml.xshmlmt.shml.EvaluateGuard)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__TEMPORALGUARD:
    		setTemporalguard(
    		(ecnu.models.xshml.xshmlmt.shml.TemporalGuard)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CSRC:
    		setCsrc(
    		(ecnu.models.xshml.xshmlmt.shml.State)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.COM_TRANSITION__CTGT:
    		setCtgt(
    		(ecnu.models.xshml.xshmlmt.shml.State)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
