package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.Event;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EventAdapter extends EObjectAdapter<Event> implements ecnu.models.xshml.xshmlmt.shml.Event {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public EventAdapter() {
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
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getEvent();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__SEND:
    		return new java.lang.Integer(getSend());
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__RECEIVE:
    		return new java.lang.Integer(getReceive());
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__ACTIVE:
    		return new java.lang.Integer(getActive());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__SEND:
    		return getSend() != SEND_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__RECEIVE:
    		return getReceive() != RECEIVE_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__ACTIVE:
    		return getActive() != ACTIVE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__SEND:
    		setSend(((java.lang.Integer) newValue).intValue());
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__RECEIVE:
    		setReceive(((java.lang.Integer) newValue).intValue());
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.EVENT__ACTIVE:
    		setActive(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
