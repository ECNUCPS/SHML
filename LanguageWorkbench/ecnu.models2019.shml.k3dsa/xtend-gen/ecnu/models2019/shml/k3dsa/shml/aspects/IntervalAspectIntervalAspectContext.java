package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.IntervalAspectIntervalAspectProperties;
import java.util.Map;
import shml.Interval;

@SuppressWarnings("all")
public class IntervalAspectIntervalAspectContext {
  public final static IntervalAspectIntervalAspectContext INSTANCE = new IntervalAspectIntervalAspectContext();
  
  public static IntervalAspectIntervalAspectProperties getSelf(final Interval _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.IntervalAspectIntervalAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Interval, IntervalAspectIntervalAspectProperties> map = new java.util.WeakHashMap<shml.Interval, ecnu.models2019.shml.k3dsa.shml.aspects.IntervalAspectIntervalAspectProperties>();
  
  public Map<Interval, IntervalAspectIntervalAspectProperties> getMap() {
    return map;
  }
}
