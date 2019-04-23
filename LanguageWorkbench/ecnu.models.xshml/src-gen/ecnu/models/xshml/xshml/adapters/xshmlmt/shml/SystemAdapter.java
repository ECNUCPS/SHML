package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshmlmt.shml.Clock;
import ecnu.models.xshml.xshmlmt.shml.Event;
import ecnu.models.xshml.xshmlmt.shml.TSHS;
import ecnu.models.xshml.xshmlmt.shml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class SystemAdapter extends EObjectAdapter<ecnu.models.xshml.xshml.shml.System> implements ecnu.models.xshml.xshmlmt.shml.System {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public SystemAdapter() {
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
  
  @Override
  public void RealizeInitializeModel(final org.eclipse.emf.common.util.EList<java.lang.String> arguments) {
    ecnu.models.xshml.xshml.aspects.SystemAspect.RealizeInitializeModel(adaptee, arguments
    );
  }
  
  @Override
  public void callscilab() {
    ecnu.models.xshml.xshml.aspects.SystemAspect.callscilab(adaptee);
  }
  
  @Override
  public void dojump() {
    ecnu.models.xshml.xshml.aspects.SystemAspect.dojump(adaptee);
  }
  
  @Override
  public void doprintconfiguration() {
    ecnu.models.xshml.xshml.aspects.SystemAspect.doprintconfiguration(adaptee);
  }
  
  @Override
  public void main() {
    ecnu.models.xshml.xshml.aspects.SystemAspect.main(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getSystem();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__TSHSS:
    		return getTshss();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		return getGlobalvariables();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		return getGlobalclocks();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		return getGlobalevents();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__TSHSS:
    		return getTshss() != null && !getTshss().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		return getGlobalvariables() != null && !getGlobalvariables().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		return getGlobalclocks() != null && !getGlobalclocks().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		return getGlobalevents() != null && !getGlobalevents().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__TSHSS:
    		getTshss().clear();
    		getTshss().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALVARIABLES:
    		getGlobalvariables().clear();
    		getGlobalvariables().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALCLOCKS:
    		getGlobalclocks().clear();
    		getGlobalclocks().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.SYSTEM__GLOBALEVENTS:
    		getGlobalevents().clear();
    		getGlobalevents().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
