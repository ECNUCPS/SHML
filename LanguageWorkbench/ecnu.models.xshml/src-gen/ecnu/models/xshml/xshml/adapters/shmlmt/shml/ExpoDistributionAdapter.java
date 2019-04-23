package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ExpoDistributionAdapter extends EObjectAdapter<ExpoDistribution> implements shml.ExpoDistribution {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public ExpoDistributionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getLambda() {
    return adaptee.getLambda();
  }
  
  @Override
  public void setLambda(final float o) {
    adaptee.setLambda(o);
  }
  
  protected final static float LAMBDA_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getExpoDistribution();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		return new java.lang.Float(getLambda());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		return getLambda() != LAMBDA_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.EXPO_DISTRIBUTION__LAMBDA:
    		setLambda(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
