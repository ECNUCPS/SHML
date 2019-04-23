package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Function;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import shml.DeVariable;
import shml.Fright;
import shml.IndeVariable;

@SuppressWarnings("all")
public class FunctionAdapter extends EObjectAdapter<Function> implements shml.Function {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public FunctionAdapter() {
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
  public IndeVariable getIndevariable() {
    return (IndeVariable) adaptersFactory.createAdapter(adaptee.getIndevariable(), eResource);
  }
  
  @Override
  public void setIndevariable(final IndeVariable o) {
    if (o != null)
    	adaptee.setIndevariable(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.IndeVariableAdapter) o).getAdaptee());
    else adaptee.setIndevariable(null);
  }
  
  @Override
  public DeVariable getDevariable() {
    return (DeVariable) adaptersFactory.createAdapter(adaptee.getDevariable(), eResource);
  }
  
  @Override
  public void setDevariable(final DeVariable o) {
    if (o != null)
    	adaptee.setDevariable(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.DeVariableAdapter) o).getAdaptee());
    else adaptee.setDevariable(null);
  }
  
  @Override
  public Fright getFright() {
    return (Fright) adaptersFactory.createAdapter(adaptee.getFright(), eResource);
  }
  
  @Override
  public void setFright(final Fright o) {
    if (o != null)
    	adaptee.setFright(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.FrightAdapter) o).getAdaptee());
    else adaptee.setFright(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getFunction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.FUNCTION__NAME:
    		return getName();
    	case shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable();
    	case shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable();
    	case shml.ShmlPackage.FUNCTION__FRIGHT:
    		return getFright();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.FUNCTION__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		return getIndevariable() != null;
    	case shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		return getDevariable() != null;
    	case shml.ShmlPackage.FUNCTION__FRIGHT:
    		return getFright() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.FUNCTION__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.FUNCTION__INDEVARIABLE:
    		setIndevariable(
    		(shml.IndeVariable)
    		 newValue);
    		return;
    	case shml.ShmlPackage.FUNCTION__DEVARIABLE:
    		setDevariable(
    		(shml.DeVariable)
    		 newValue);
    		return;
    	case shml.ShmlPackage.FUNCTION__FRIGHT:
    		setFright(
    		(shml.Fright)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
