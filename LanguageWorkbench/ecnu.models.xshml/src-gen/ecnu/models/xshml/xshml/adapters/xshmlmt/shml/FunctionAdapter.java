package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Function;
import ecnu.models.xshml.xshmlmt.shml.DeVariable;
import ecnu.models.xshml.xshmlmt.shml.Fright;
import ecnu.models.xshml.xshmlmt.shml.IndeVariable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FunctionAdapter extends EObjectAdapter<Function> implements ecnu.models.xshml.xshmlmt.shml.Function {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public FunctionAdapter() {
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
  public IndeVariable getIndevariable() {
    return (IndeVariable) adaptersFactory.createAdapter(adaptee.getIndevariable(), eResource);
  }
  
  @Override
  public void setIndevariable(final IndeVariable o) {
    if (o != null)
    	adaptee.setIndevariable(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.IndeVariableAdapter) o).getAdaptee());
    else adaptee.setIndevariable(null);
  }
  
  @Override
  public DeVariable getDevariable() {
    return (DeVariable) adaptersFactory.createAdapter(adaptee.getDevariable(), eResource);
  }
  
  @Override
  public void setDevariable(final DeVariable o) {
    if (o != null)
    	adaptee.setDevariable(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.DeVariableAdapter) o).getAdaptee());
    else adaptee.setDevariable(null);
  }
  
  @Override
  public Fright getFright() {
    return (Fright) adaptersFactory.createAdapter(adaptee.getFright(), eResource);
  }
  
  @Override
  public void setFright(final Fright o) {
    if (o != null)
    	adaptee.setFright(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.FrightAdapter) o).getAdaptee());
    else adaptee.setFright(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getFunction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__FRIGHT:
    		return getFright();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__FRIGHT:
    		return getFright() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		setIndevariable(
    		(ecnu.models.xshml.xshmlmt.shml.IndeVariable)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		setDevariable(
    		(ecnu.models.xshml.xshmlmt.shml.DeVariable)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.FUNCTION__FRIGHT:
    		setFright(
    		(ecnu.models.xshml.xshmlmt.shml.Fright)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
