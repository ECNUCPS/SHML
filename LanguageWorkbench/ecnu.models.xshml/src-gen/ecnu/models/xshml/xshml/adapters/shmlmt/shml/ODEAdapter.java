package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ODE;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import shml.Condition;
import shml.Function;
import shml.Interval;

@SuppressWarnings("all")
public class ODEAdapter extends EObjectAdapter<ODE> implements shml.ODE {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public ODEAdapter() {
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
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Interval getInterval() {
    return (Interval) adaptersFactory.createAdapter(adaptee.getInterval(), eResource);
  }
  
  @Override
  public void setInterval(final Interval o) {
    if (o != null)
    	adaptee.setInterval(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.IntervalAdapter) o).getAdaptee());
    else adaptee.setInterval(null);
  }
  
  @Override
  public Function getFunction() {
    return (Function) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final Function o) {
    if (o != null)
    	adaptee.setFunction(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.FunctionAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getODE();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.ODE__NAME:
    		return getName();
    	case shml.ShmlPackage.ODE__CONDITION:
    		return getCondition();
    	case shml.ShmlPackage.ODE__INTERVAL:
    		return getInterval();
    	case shml.ShmlPackage.ODE__FUNCTION:
    		return getFunction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.ODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.ODE__CONDITION:
    		return getCondition() != null;
    	case shml.ShmlPackage.ODE__INTERVAL:
    		return getInterval() != null;
    	case shml.ShmlPackage.ODE__FUNCTION:
    		return getFunction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.ODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.ODE__CONDITION:
    		setCondition(
    		(shml.Condition)
    		 newValue);
    		return;
    	case shml.ShmlPackage.ODE__INTERVAL:
    		setInterval(
    		(shml.Interval)
    		 newValue);
    		return;
    	case shml.ShmlPackage.ODE__FUNCTION:
    		setFunction(
    		(shml.Function)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
