package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Clock;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ClockAdapter extends EObjectAdapter<Clock> implements shml.Clock {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public ClockAdapter() {
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
  public float getTime() {
    return adaptee.getTime();
  }
  
  @Override
  public void setTime(final float o) {
    adaptee.setTime(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static float TIME_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getClock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.CLOCK__NAME:
    		return getName();
    	case shml.ShmlPackage.CLOCK__TIME:
    		return new java.lang.Float(getTime());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.CLOCK__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.CLOCK__TIME:
    		return getTime() != TIME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.CLOCK__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.CLOCK__TIME:
    		setTime(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
