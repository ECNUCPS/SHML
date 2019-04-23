package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.IntervalAspectIntervalAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Interval;

@SuppressWarnings("all")
public class IntervalAspectIntervalAspectContext {
  public final static IntervalAspectIntervalAspectContext INSTANCE = new IntervalAspectIntervalAspectContext();
  
  public static IntervalAspectIntervalAspectProperties getSelf(final Interval _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.IntervalAspectIntervalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Interval, IntervalAspectIntervalAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Interval, ecnu.models.xshml.xshml.aspects.IntervalAspectIntervalAspectProperties>();
  
  public Map<Interval, IntervalAspectIntervalAspectProperties> getMap() {
    return map;
  }
}
