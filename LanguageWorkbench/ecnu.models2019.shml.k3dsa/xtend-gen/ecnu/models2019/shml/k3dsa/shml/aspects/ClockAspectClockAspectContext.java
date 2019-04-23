package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ClockAspectClockAspectProperties;
import java.util.Map;
import shml.Clock;

@SuppressWarnings("all")
public class ClockAspectClockAspectContext {
  public final static ClockAspectClockAspectContext INSTANCE = new ClockAspectClockAspectContext();
  
  public static ClockAspectClockAspectProperties getSelf(final Clock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ClockAspectClockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Clock, ClockAspectClockAspectProperties> map = new java.util.WeakHashMap<shml.Clock, ecnu.models2019.shml.k3dsa.shml.aspects.ClockAspectClockAspectProperties>();
  
  public Map<Clock, ClockAspectClockAspectProperties> getMap() {
    return map;
  }
}
