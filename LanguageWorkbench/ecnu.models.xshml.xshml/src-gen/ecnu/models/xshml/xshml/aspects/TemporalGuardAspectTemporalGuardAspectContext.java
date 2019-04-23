package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.TemporalGuard;

@SuppressWarnings("all")
public class TemporalGuardAspectTemporalGuardAspectContext {
  public final static TemporalGuardAspectTemporalGuardAspectContext INSTANCE = new TemporalGuardAspectTemporalGuardAspectContext();
  
  public static TemporalGuardAspectTemporalGuardAspectProperties getSelf(final TemporalGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TemporalGuard, TemporalGuardAspectTemporalGuardAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.TemporalGuard, ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectProperties>();
  
  public Map<TemporalGuard, TemporalGuardAspectTemporalGuardAspectProperties> getMap() {
    return map;
  }
}
