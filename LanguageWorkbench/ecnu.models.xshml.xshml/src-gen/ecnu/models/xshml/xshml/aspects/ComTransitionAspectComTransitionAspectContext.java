package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ComTransitionAspectComTransitionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.ComTransition;

@SuppressWarnings("all")
public class ComTransitionAspectComTransitionAspectContext {
  public final static ComTransitionAspectComTransitionAspectContext INSTANCE = new ComTransitionAspectComTransitionAspectContext();
  
  public static ComTransitionAspectComTransitionAspectProperties getSelf(final ComTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ComTransitionAspectComTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.ComTransition, ecnu.models.xshml.xshml.aspects.ComTransitionAspectComTransitionAspectProperties>();
  
  public Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> getMap() {
    return map;
  }
}
