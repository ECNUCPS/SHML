package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.TemporalGuardAspectTemporalGuardAspectProperties;
import java.util.Map;
import shml.TemporalGuard;

@SuppressWarnings("all")
public class TemporalGuardAspectTemporalGuardAspectContext {
  public final static TemporalGuardAspectTemporalGuardAspectContext INSTANCE = new TemporalGuardAspectTemporalGuardAspectContext();
  
  public static TemporalGuardAspectTemporalGuardAspectProperties getSelf(final TemporalGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.TemporalGuardAspectTemporalGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TemporalGuard, TemporalGuardAspectTemporalGuardAspectProperties> map = new java.util.WeakHashMap<shml.TemporalGuard, ecnu.models2019.shml.k3dsa.shml.aspects.TemporalGuardAspectTemporalGuardAspectProperties>();
  
  public Map<TemporalGuard, TemporalGuardAspectTemporalGuardAspectProperties> getMap() {
    return map;
  }
}
