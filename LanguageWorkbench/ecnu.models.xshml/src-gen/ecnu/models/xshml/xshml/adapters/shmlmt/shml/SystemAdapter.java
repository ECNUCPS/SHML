package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import shml.Clock;
import shml.Event;
import shml.TSHS;
import shml.Variable;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<ecnu.models.xshml.xshml.shml.System> implements shml.System {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
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
  
  private EList<TSHS> tshss_;
  
  @Override
  public EList<TSHS> getTshss() {
    if (tshss_ == null)
    	tshss_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTshss(), adaptersFactory, eResource);
    return tshss_;
  }
  
  private EList<Variable> globalvariables_;
  
  @Override
  public EList<Variable> getGlobalvariables() {
    if (globalvariables_ == null)
    	globalvariables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGlobalvariables(), adaptersFactory, eResource);
    return globalvariables_;
  }
  
  private EList<Clock> globalclocks_;
  
  @Override
  public EList<Clock> getGlobalclocks() {
    if (globalclocks_ == null)
    	globalclocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGlobalclocks(), adaptersFactory, eResource);
    return globalclocks_;
  }
  
  private EList<Event> globalevents_;
  
  @Override
  public EList<Event> getGlobalevents() {
    if (globalevents_ == null)
    	globalevents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getGlobalevents(), adaptersFactory, eResource);
    return globalevents_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.SYSTEM__NAME:
    		return getName();
    	case shml.ShmlPackage.SYSTEM__TSHSS:
    		return getTshss();
    	case shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		return getGlobalvariables();
    	case shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		return getGlobalclocks();
    	case shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		return getGlobalevents();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.SYSTEM__TSHSS:
    		return getTshss() != null && !getTshss().isEmpty();
    	case shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		return getGlobalvariables() != null && !getGlobalvariables().isEmpty();
    	case shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		return getGlobalclocks() != null && !getGlobalclocks().isEmpty();
    	case shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		return getGlobalevents() != null && !getGlobalevents().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.SYSTEM__TSHSS:
    		getTshss().clear();
    		getTshss().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		getGlobalvariables().clear();
    		getGlobalvariables().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		getGlobalclocks().clear();
    		getGlobalclocks().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		getGlobalevents().clear();
    		getGlobalevents().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
