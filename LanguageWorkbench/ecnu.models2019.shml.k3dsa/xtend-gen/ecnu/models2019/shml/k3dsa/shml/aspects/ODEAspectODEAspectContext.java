package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ODEAspectODEAspectProperties;
import java.util.Map;
import shml.ODE;

@SuppressWarnings("all")
public class ODEAspectODEAspectContext {
  public final static ODEAspectODEAspectContext INSTANCE = new ODEAspectODEAspectContext();
  
  public static ODEAspectODEAspectProperties getSelf(final ODE _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ODEAspectODEAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ODE, ODEAspectODEAspectProperties> map = new java.util.WeakHashMap<shml.ODE, ecnu.models2019.shml.k3dsa.shml.aspects.ODEAspectODEAspectProperties>();
  
  public Map<ODE, ODEAspectODEAspectProperties> getMap() {
    return map;
  }
}
