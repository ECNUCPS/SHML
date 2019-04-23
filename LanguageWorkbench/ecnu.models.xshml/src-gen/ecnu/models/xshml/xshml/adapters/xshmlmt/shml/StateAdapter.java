package ecnu.models.xshml.xshml.adapters.xshmlmt.shml;

import ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory;
import ecnu.models.xshml.xshml.shml.State;
import ecnu.models.xshml.xshmlmt.shml.ComTransition;
import ecnu.models.xshml.xshmlmt.shml.ExpoDistribution;
import ecnu.models.xshml.xshmlmt.shml.ODE;
import ecnu.models.xshml.xshmlmt.shml.ProbTransition;
import ecnu.models.xshml.xshmlmt.shml.TSHS;
import ecnu.models.xshml.xshmlmt.shml.UnifDistribution;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements ecnu.models.xshml.xshmlmt.shml.State {
  private XSHMLMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
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
  public ODE getSlaveode() {
    return (ODE) adaptersFactory.createAdapter(adaptee.getSlaveode(), eResource);
  }
  
  @Override
  public void setSlaveode(final ODE o) {
    if (o != null)
    	adaptee.setSlaveode(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ODEAdapter) o).getAdaptee());
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
    	adaptee.setSubdiagram(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.TSHSAdapter) o).getAdaptee());
    else adaptee.setSubdiagram(null);
  }
  
  @Override
  public ecnu.models.xshml.xshmlmt.shml.State getFatherstate() {
    return (ecnu.models.xshml.xshmlmt.shml.State) adaptersFactory.createAdapter(adaptee.getFatherstate(), eResource);
  }
  
  @Override
  public void setFatherstate(final ecnu.models.xshml.xshmlmt.shml.State o) {
    if (o != null)
    	adaptee.setFatherstate(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.StateAdapter) o).getAdaptee());
    else adaptee.setFatherstate(null);
  }
  
  @Override
  public ExpoDistribution getSlavelambda() {
    return (ExpoDistribution) adaptersFactory.createAdapter(adaptee.getSlavelambda(), eResource);
  }
  
  @Override
  public void setSlavelambda(final ExpoDistribution o) {
    if (o != null)
    	adaptee.setSlavelambda(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ExpoDistributionAdapter) o).getAdaptee());
    else adaptee.setSlavelambda(null);
  }
  
  @Override
  public UnifDistribution getSlaveunif() {
    return (UnifDistribution) adaptersFactory.createAdapter(adaptee.getSlaveunif(), eResource);
  }
  
  @Override
  public void setSlaveunif(final UnifDistribution o) {
    if (o != null)
    	adaptee.setSlaveunif(((ecnu.models.xshml.xshml.adapters.xshmlmt.shml.UnifDistributionAdapter) o).getAdaptee());
    else adaptee.setSlaveunif(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return ecnu.models.xshml.xshmlmt.shml.ShmlPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__NAME:
    		return getName();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEODE:
    		return getSlaveode();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGCT:
    		return getOutgoingct();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGCT:
    		return getIncomingct();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGPT:
    		return getOutgoingpt();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGPT:
    		return getIncomingpt();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SUBDIAGRAM:
    		return getSubdiagram();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__FATHERSTATE:
    		return getFatherstate();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVELAMBDA:
    		return getSlavelambda();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEUNIF:
    		return getSlaveunif();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEODE:
    		return getSlaveode() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGCT:
    		return getOutgoingct() != null && !getOutgoingct().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGCT:
    		return getIncomingct() != null && !getIncomingct().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGPT:
    		return getOutgoingpt() != null && !getOutgoingpt().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGPT:
    		return getIncomingpt() != null && !getIncomingpt().isEmpty();
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SUBDIAGRAM:
    		return getSubdiagram() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__FATHERSTATE:
    		return getFatherstate() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVELAMBDA:
    		return getSlavelambda() != null;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEUNIF:
    		return getSlaveunif() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEODE:
    		setSlaveode(
    		(ecnu.models.xshml.xshmlmt.shml.ODE)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGCT:
    		getOutgoingct().clear();
    		getOutgoingct().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGCT:
    		getIncomingct().clear();
    		getIncomingct().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__OUTGOINGPT:
    		getOutgoingpt().clear();
    		getOutgoingpt().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__INCOMINGPT:
    		getIncomingpt().clear();
    		getIncomingpt().addAll((Collection) newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SUBDIAGRAM:
    		setSubdiagram(
    		(ecnu.models.xshml.xshmlmt.shml.TSHS)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__FATHERSTATE:
    		setFatherstate(
    		(ecnu.models.xshml.xshmlmt.shml.State)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVELAMBDA:
    		setSlavelambda(
    		(ecnu.models.xshml.xshmlmt.shml.ExpoDistribution)
    		 newValue);
    		return;
    	case ecnu.models.xshml.xshmlmt.shml.ShmlPackage.STATE__SLAVEUNIF:
    		setSlaveunif(
    		(ecnu.models.xshml.xshmlmt.shml.UnifDistribution)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
