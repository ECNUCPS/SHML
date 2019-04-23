package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Event;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EventAdapter extends EObjectAdapter<Event> implements shml.Event {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public EventAdapter() {
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
  public int getSend() {
    return adaptee.getSend();
  }
  
  @Override
  public void setSend(final int o) {
    adaptee.setSend(o);
  }
  
  @Override
  public int getReceive() {
    return adaptee.getReceive();
  }
  
  @Override
  public void setReceive(final int o) {
    adaptee.setReceive(o);
  }
  
  @Override
  public int getActive() {
    return adaptee.getActive();
  }
  
  @Override
  public void setActive(final int o) {
    adaptee.setActive(o);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static int SEND_EDEFAULT = 0;
  
  protected final static int RECEIVE_EDEFAULT = 0;
  
  protected final static int ACTIVE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.EVENT__NAME:
    		return getName();
    	case shml.ShmlPackage.EVENT__SEND:
    		return new java.lang.Integer(getSend());
    	case shml.ShmlPackage.EVENT__RECEIVE:
    		return new java.lang.Integer(getReceive());
    	case shml.ShmlPackage.EVENT__ACTIVE:
    		return new java.lang.Integer(getActive());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.EVENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.EVENT__SEND:
    		return getSend() != SEND_EDEFAULT;
    	case shml.ShmlPackage.EVENT__RECEIVE:
    		return getReceive() != RECEIVE_EDEFAULT;
    	case shml.ShmlPackage.EVENT__ACTIVE:
    		return getActive() != ACTIVE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.EVENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.EVENT__SEND:
    		setSend(((java.lang.Integer) newValue).intValue());
    		return;
    	case shml.ShmlPackage.EVENT__RECEIVE:
    		setReceive(((java.lang.Integer) newValue).intValue());
    		return;
    	case shml.ShmlPackage.EVENT__ACTIVE:
    		setActive(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
