package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ODEAspectODEAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.ODE;

@SuppressWarnings("all")
public class ODEAspectODEAspectContext {
  public final static ODEAspectODEAspectContext INSTANCE = new ODEAspectODEAspectContext();
  
  public static ODEAspectODEAspectProperties getSelf(final ODE _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ODEAspectODEAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ODE, ODEAspectODEAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.ODE, ecnu.models.xshml.xshml.aspects.ODEAspectODEAspectProperties>();
  
  public Map<ODE, ODEAspectODEAspectProperties> getMap() {
    return map;
  }
}
