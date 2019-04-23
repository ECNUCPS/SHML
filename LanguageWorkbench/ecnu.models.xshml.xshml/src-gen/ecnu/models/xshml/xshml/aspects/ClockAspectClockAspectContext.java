package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ClockAspectClockAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Clock;

@SuppressWarnings("all")
public class ClockAspectClockAspectContext {
  public final static ClockAspectClockAspectContext INSTANCE = new ClockAspectClockAspectContext();
  
  public static ClockAspectClockAspectProperties getSelf(final Clock _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ClockAspectClockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Clock, ClockAspectClockAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Clock, ecnu.models.xshml.xshml.aspects.ClockAspectClockAspectProperties>();
  
  public Map<Clock, ClockAspectClockAspectProperties> getMap() {
    return map;
  }
}
