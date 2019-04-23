package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.TSHS;
import ecnu.models.xshml.xshmlmt.shml.Action;
import ecnu.models.xshml.xshmlmt.shml.Clock;
import ecnu.models.xshml.xshmlmt.shml.Event;
import ecnu.models.xshml.xshmlmt.shml.ExpoDistribution;
import ecnu.models.xshml.xshmlmt.shml.Guard;
import ecnu.models.xshml.xshmlmt.shml.ODE;
import ecnu.models.xshml.xshmlmt.shml.State;
import ecnu.models.xshml.xshmlmt.shml.Transition;
import ecnu.models.xshml.xshmlmt.shml.UnifDistribution;
import ecnu.models.xshml.xshmlmt.shml.Variable;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TSHSAdapter extends EObjectAdapter<TSHS> implements ecnu.models.xshml.xshmlmt.shml.TSHS {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public TSHSAdapter() {
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
  
  private EList<ODE> ownedodes_;
  
  @Override
  public EList<ODE> getOwnedodes() {
    if (ownedodes_ == null)
    	ownedodes_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedodes(), adaptersFactory, eResource);
    return ownedodes_;
  }
  
  private EList<State> ownedstates_;
  
  @Override
  public EList<State> getOwnedstates() {
    if (ownedstates_ == null)
    	ownedstates_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedstates(), adaptersFactory, eResource);
    return ownedstates_;
  }
  
  private EList<Transition> ownedtransitions_;
  
  @Override
  public EList<Transition> getOwnedtransitions() {
    if (ownedtransitions_ == null)
    	ownedtransitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedtransitions(), adaptersFactory, eResource);
    return ownedtransitions_;
  }
  
  private EList<Variable> localvariables_;
  
  @Override
  public EList<Variable> getLocalvariables() {
    if (localvariables_ == null)
    	localvariables_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocalvariables(), adaptersFactory, eResource);
    return localvariables_;
  }
  
  private EList<Clock> localclocks_;
  
  @Override
  public EList<Clock> getLocalclocks() {
    if (localclocks_ == null)
    	localclocks_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocalclocks(), adaptersFactory, eResource);
    return localclocks_;
  }
  
  private EList<Event> localevents_;
  
  @Override
  public EList<Event> getLocalevents() {
    if (localevents_ == null)
    	localevents_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getLocalevents(), adaptersFactory, eResource);
    return localevents_;
  }
  
  @Override
  public State getInitialstate() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialstate(), eResource);
  }
  
  @Override
  public void setInitialstate(final State o) {
    if (o != null)
    	adaptee.setInitialstate(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setInitialstate(null);
  }
  
  private EList<ExpoDistribution> ownedexpos_;
  
  @Override
  public EList<ExpoDistribution> getOwnedexpos() {
    if (ownedexpos_ == null)
    	ownedexpos_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedexpos(), adaptersFactory, eResource);
    return ownedexpos_;
  }
  
  private EList<Action> ownedactions_;
  
  @Override
  public EList<Action> getOwnedactions() {
    if (ownedactions_ == null)
    	ownedactions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedactions(), adaptersFactory, eResource);
    return ownedactions_;
  }
  
  private EList<Guard> ownedguards_;
  
  @Override
  public EList<Guard> getOwnedguards() {
    if (ownedguards_ == null)
    	ownedguards_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedguards(), adaptersFactory, eResource);
    return ownedguards_;
  }
  
  private EList<UnifDistribution> ownedunifs_;
  
  @Override
  public EList<UnifDistribution> getOwnedunifs() {
    if (ownedunifs_ == null)
    	ownedunifs_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedunifs(), adaptersFactory, eResource);
    return ownedunifs_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getTSHS();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDODES:
    		return getOwnedodes();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDSTATES:
    		return getOwnedstates();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDTRANSITIONS:
    		return getOwnedtransitions();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALVARIABLES:
    		return getLocalvariables();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALCLOCKS:
    		return getLocalclocks();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALEVENTS:
    		return getLocalevents();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__INITIALSTATE:
    		return getInitialstate();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDEXPOS:
    		return getOwnedexpos();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDACTIONS:
    		return getOwnedactions();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDGUARDS:
    		return getOwnedguards();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDUNIFS:
    		return getOwnedunifs();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDODES:
    		return getOwnedodes() != null && !getOwnedodes().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDSTATES:
    		return getOwnedstates() != null && !getOwnedstates().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDTRANSITIONS:
    		return getOwnedtransitions() != null && !getOwnedtransitions().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALVARIABLES:
    		return getLocalvariables() != null && !getLocalvariables().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALCLOCKS:
    		return getLocalclocks() != null && !getLocalclocks().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALEVENTS:
    		return getLocalevents() != null && !getLocalevents().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__INITIALSTATE:
    		return getInitialstate() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDEXPOS:
    		return getOwnedexpos() != null && !getOwnedexpos().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDACTIONS:
    		return getOwnedactions() != null && !getOwnedactions().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDGUARDS:
    		return getOwnedguards() != null && !getOwnedguards().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDUNIFS:
    		return getOwnedunifs() != null && !getOwnedunifs().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDODES:
    		getOwnedodes().clear();
    		getOwnedodes().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDSTATES:
    		getOwnedstates().clear();
    		getOwnedstates().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDTRANSITIONS:
    		getOwnedtransitions().clear();
    		getOwnedtransitions().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALVARIABLES:
    		getLocalvariables().clear();
    		getLocalvariables().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALCLOCKS:
    		getLocalclocks().clear();
    		getLocalclocks().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__LOCALEVENTS:
    		getLocalevents().clear();
    		getLocalevents().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__INITIALSTATE:
    		setInitialstate(
    		(ecnu.models.xshml.xshmlmt.shml.State)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDEXPOS:
    		getOwnedexpos().clear();
    		getOwnedexpos().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDACTIONS:
    		getOwnedactions().clear();
    		getOwnedactions().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDGUARDS:
    		getOwnedguards().clear();
    		getOwnedguards().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.TSHS__OWNEDUNIFS:
    		getOwnedunifs().clear();
    		getOwnedunifs().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
