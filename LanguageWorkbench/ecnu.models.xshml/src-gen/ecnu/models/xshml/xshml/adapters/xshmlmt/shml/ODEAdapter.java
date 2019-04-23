package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ODE;
import ecnu.models.xshml.xshmlmt.shml.Condition;
import ecnu.models.xshml.xshmlmt.shml.Function;
import ecnu.models.xshml.xshmlmt.shml.Interval;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ODEAdapter extends EObjectAdapter<ODE> implements ecnu.models.xshml.xshmlmt.shml.ODE {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public ODEAdapter() {
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
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Interval getInterval() {
    return (Interval) adaptersFactory.createAdapter(adaptee.getInterval(), eResource);
  }
  
  @Override
  public void setInterval(final Interval o) {
    if (o != null)
    	adaptee.setInterval(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IntervalAdapter) o).getAdaptee());
    else adaptee.setInterval(null);
  }
  
  @Override
  public Function getFunction() {
    return (Function) adaptersFactory.createAdapter(adaptee.getFunction(), eResource);
  }
  
  @Override
  public void setFunction(final Function o) {
    if (o != null)
    	adaptee.setFunction(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FunctionAdapter) o).getAdaptee());
    else adaptee.setFunction(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getODE();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__CONDITION:
    		return getCondition();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__INTERVAL:
    		return getInterval();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__FUNCTION:
    		return getFunction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__CONDITION:
    		return getCondition() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__INTERVAL:
    		return getInterval() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__FUNCTION:
    		return getFunction() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__CONDITION:
    		setCondition(
    		(ecnu.models.xshml.xshmlmt.shml.Condition)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__INTERVAL:
    		setInterval(
    		(ecnu.models.xshml.xshmlmt.shml.Interval)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ODE__FUNCTION:
    		setFunction(
    		(ecnu.models.xshml.xshmlmt.shml.Function)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
