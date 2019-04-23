package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Action;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ActionAdapter extends EObjectAdapter<Action> implements ecnu.models.xshml.xshmlmt.shml.Action {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public ActionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getAction() {
    return adaptee.getAction();
  }
  
  @Override
  public void setAction(final String o) {
    adaptee.setAction(o);
  }
  
  protected final static String ACTION_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getAction();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ACTION__ACTION:
    		return getAction();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ACTION__ACTION:
    		return getAction() != ACTION_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.ACTION__ACTION:
    		setAction(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
