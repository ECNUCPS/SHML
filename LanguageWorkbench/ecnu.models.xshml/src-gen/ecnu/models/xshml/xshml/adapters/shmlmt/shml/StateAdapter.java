package ecnu.models.xshml.xshml.adapters.shmlmt.shml;

import ecnu.models.xshml.xshml.adapters.shmlmt.SHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.State;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import shml.ComTransition;
import shml.ExpoDistribution;
import shml.ODE;
import shml.ProbTransition;
import shml.TSHS;
import shml.UnifDistribution;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements shml.State {
  private SHMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  public ODE getSlaveode() {
    return (ODE) adaptersFactory.createAdapter(adaptee.getSlaveode(), eResource);
  }
  
  @Override
  public void setSlaveode(final ODE o) {
    if (o != null)
    	adaptee.setSlaveode(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.ODEAdapter) o).getAdaptee());
    else adaptee.setSlaveode(null);
  }
  
  private EList<ComTransition> outgoingct_;
  
  @Override
  public EList<ComTransition> getOutgoingct() {
    if (outgoingct_ == null)
    	outgoingct_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingct(), adaptersFactory, eResource);
    return outgoingct_;
  }
  
  private EList<ComTransition> incomingct_;
  
  @Override
  public EList<ComTransition> getIncomingct() {
    if (incomingct_ == null)
    	incomingct_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingct(), adaptersFactory, eResource);
    return incomingct_;
  }
  
  private EList<ProbTransition> outgoingpt_;
  
  @Override
  public EList<ProbTransition> getOutgoingpt() {
    if (outgoingpt_ == null)
    	outgoingpt_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingpt(), adaptersFactory, eResource);
    return outgoingpt_;
  }
  
  private EList<ProbTransition> incomingpt_;
  
  @Override
  public EList<ProbTransition> getIncomingpt() {
    if (incomingpt_ == null)
    	incomingpt_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingpt(), adaptersFactory, eResource);
    return incomingpt_;
  }
  
  @Override
  public TSHS getSubdiagram() {
    return (TSHS) adaptersFactory.createAdapter(adaptee.getSubdiagram(), eResource);
  }
  
  @Override
  public void setSubdiagram(final TSHS o) {
    if (o != null)
    	adaptee.setSubdiagram(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.TSHSAdapter) o).getAdaptee());
    else adaptee.setSubdiagram(null);
  }
  
  @Override
  public shml.State getFatherstate() {
    return (shml.State) adaptersFactory.createAdapter(adaptee.getFatherstate(), eResource);
  }
  
  @Override
  public void setFatherstate(final shml.State o) {
    if (o != null)
    	adaptee.setFatherstate(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setFatherstate(null);
  }
  
  @Override
  public ExpoDistribution getSlavelambda() {
    return (ExpoDistribution) adaptersFactory.createAdapter(adaptee.getSlavelambda(), eResource);
  }
  
  @Override
  public void setSlavelambda(final ExpoDistribution o) {
    if (o != null)
    	adaptee.setSlavelambda(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.ExpoDistributionAdapter) o).getAdaptee());
    else adaptee.setSlavelambda(null);
  }
  
  @Override
  public UnifDistribution getSlaveunif() {
    return (UnifDistribution) adaptersFactory.createAdapter(adaptee.getSlaveunif(), eResource);
  }
  
  @Override
  public void setSlaveunif(final UnifDistribution o) {
    if (o != null)
    	adaptee.setSlaveunif(((ecnu.models.xshml.xshml.adapters.shmlmt.shml.UnifDistributionAdapter) o).getAdaptee());
    else adaptee.setSlaveunif(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return shml.ShmlPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case shml.ShmlPackage.STATE__NAME:
    		return getName();
    	case shml.ShmlPackage.STATE__SLAVEODE:
    		return getSlaveode();
    	case shml.ShmlPackage.STATE__OUTGOINGCT:
    		return getOutgoingct();
    	case shml.ShmlPackage.STATE__INCOMINGCT:
    		return getIncomingct();
    	case shml.ShmlPackage.STATE__OUTGOINGPT:
    		return getOutgoingpt();
    	case shml.ShmlPackage.STATE__INCOMINGPT:
    		return getIncomingpt();
    	case shml.ShmlPackage.STATE__SUBDIAGRAM:
    		return getSubdiagram();
    	case shml.ShmlPackage.STATE__FATHERSTATE:
    		return getFatherstate();
    	case shml.ShmlPackage.STATE__SLAVELAMBDA:
    		return getSlavelambda();
    	case shml.ShmlPackage.STATE__SLAVEUNIF:
    		return getSlaveunif();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case shml.ShmlPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case shml.ShmlPackage.STATE__SLAVEODE:
    		return getSlaveode() != null;
    	case shml.ShmlPackage.STATE__OUTGOINGCT:
    		return getOutgoingct() != null && !getOutgoingct().isEmpty();
    	case shml.ShmlPackage.STATE__INCOMINGCT:
    		return getIncomingct() != null && !getIncomingct().isEmpty();
    	case shml.ShmlPackage.STATE__OUTGOINGPT:
    		return getOutgoingpt() != null && !getOutgoingpt().isEmpty();
    	case shml.ShmlPackage.STATE__INCOMINGPT:
    		return getIncomingpt() != null && !getIncomingpt().isEmpty();
    	case shml.ShmlPackage.STATE__SUBDIAGRAM:
    		return getSubdiagram() != null;
    	case shml.ShmlPackage.STATE__FATHERSTATE:
    		return getFatherstate() != null;
    	case shml.ShmlPackage.STATE__SLAVELAMBDA:
    		return getSlavelambda() != null;
    	case shml.ShmlPackage.STATE__SLAVEUNIF:
    		return getSlaveunif() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case shml.ShmlPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case shml.ShmlPackage.STATE__SLAVEODE:
    		setSlaveode(
    		(shml.ODE)
    		 newValue);
    		return;
    	case shml.ShmlPackage.STATE__OUTGOINGCT:
    		getOutgoingct().clear();
    		getOutgoingct().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.STATE__INCOMINGCT:
    		getIncomingct().clear();
    		getIncomingct().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.STATE__OUTGOINGPT:
    		getOutgoingpt().clear();
    		getOutgoingpt().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.STATE__INCOMINGPT:
    		getIncomingpt().clear();
    		getIncomingpt().addAll((Collection) newValue);
    		return;
    	case shml.ShmlPackage.STATE__SUBDIAGRAM:
    		setSubdiagram(
    		(shml.TSHS)
    		 newValue);
    		return;
    	case shml.ShmlPackage.STATE__FATHERSTATE:
    		setFatherstate(
    		(shml.State)
    		 newValue);
    		return;
    	case shml.ShmlPackage.STATE__SLAVELAMBDA:
    		setSlavelambda(
    		(shml.ExpoDistribution)
    		 newValue);
    		return;
    	case shml.ShmlPackage.STATE__SLAVEUNIF:
    		setSlaveunif(
    		(shml.UnifDistribution)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
