package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.UnifDistribution;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class UnifDistributionAdapter extends EObjectAdapter<UnifDistribution> implements ecnu.models.xshml.xshmlmt.shml.UnifDistribution {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public UnifDistributionAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
    adaptersFactory = ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public float getA() {
    return adaptee.getA();
  }
  
  @Override
  public void setA(final float o) {
    adaptee.setA(o);
  }
  
  @Override
  public float getB() {
    return adaptee.getB();
  }
  
  @Override
  public void setB(final float o) {
    adaptee.setB(o);
  }
  
  protected final static float A_EDEFAULT = 0.0F;
  
  protected final static float B_EDEFAULT = 0.0F;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getUnifDistribution();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__A:
    		return new java.lang.Float(getA());
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__B:
    		return new java.lang.Float(getB());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__A:
    		return getA() != A_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__B:
    		return getB() != B_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__A:
    		setA(((java.lang.Float) newValue).floatValue());
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.UNIF_DISTRIBUTION__B:
    		setB(((java.lang.Float) newValue).floatValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
