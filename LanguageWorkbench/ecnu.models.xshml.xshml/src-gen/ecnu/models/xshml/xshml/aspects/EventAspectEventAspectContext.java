package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.EventAspectEventAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Event;

@SuppressWarnings("all")
public class EventAspectEventAspectContext {
  public final static EventAspectEventAspectContext INSTANCE = new EventAspectEventAspectContext();
  
  public static EventAspectEventAspectProperties getSelf(final Event _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.EventAspectEventAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Event, EventAspectEventAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Event, ecnu.models.xshml.xshml.aspects.EventAspectEventAspectProperties>();
  
  public Map<Event, EventAspectEventAspectProperties> getMap() {
    return map;
  }
}
