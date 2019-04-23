package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.EvaluateGuard;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import shml.Variable;

@SuppressWarnings("all")
public class EvaluateGuardAdapter extends EObjectAdapter<EvaluateGuard> implements shml.EvaluateGuard {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public EvaluateGuardAdapter() {
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
  public String getVcondition() {
    return adaptee.getVcondition();
  }
  
  @Override
  public void setVcondition(final String o) {
    adaptee.setVcondition(o);
  }
  
  @Override
  public Variable getOnvariable() {
    return (Variable) adaptersFactory.createAdapter(adaptee.getOnvariable(), eResource);
  }
  
  @Override
  public void setOnvariable(final Variable o) {
    if (o != null)
    	adaptee.setOnvariable(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.VariableAdapter) o).getAdaptee());
    else adaptee.setOnvariable(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static String VCONDITION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getEvaluateGuard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.EVALUATE_GUARD__NAME:
    		return getName();
    	case shml.ShmlPackage.EVALUATE_GUARD__VCONDITION:
    		return getVcondition();
    	case shml.ShmlPackage.EVALUATE_GUARD__ONVARIABLE:
    		return getOnvariable();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.EVALUATE_GUARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.EVALUATE_GUARD__VCONDITION:
    		return getVcondition() != VCONDITION_EDEFAULT;
    	case shml.ShmlPackage.EVALUATE_GUARD__ONVARIABLE:
    		return getOnvariable() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.EVALUATE_GUARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.EVALUATE_GUARD__VCONDITION:
    		setVcondition(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.EVALUATE_GUARD__ONVARIABLE:
    		setOnvariable(
    		(shml.Variable)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
