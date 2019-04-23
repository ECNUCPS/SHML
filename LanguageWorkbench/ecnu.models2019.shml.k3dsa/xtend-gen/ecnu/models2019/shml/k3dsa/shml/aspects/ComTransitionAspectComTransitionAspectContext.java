package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ComTransitionAspectComTransitionAspectProperties;
import java.util.Map;
import shml.ComTransition;

@SuppressWarnings("all")
public class ComTransitionAspectComTransitionAspectContext {
  public final static ComTransitionAspectComTransitionAspectContext INSTANCE = new ComTransitionAspectComTransitionAspectContext();
  
  public static ComTransitionAspectComTransitionAspectProperties getSelf(final ComTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ComTransitionAspectComTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> map = new java.util.WeakHashMap<shml.ComTransition, ecnu.models2019.shml.k3dsa.shml.aspects.ComTransitionAspectComTransitionAspectProperties>();
  
  public Map<ComTransition, ComTransitionAspectComTransitionAspectProperties> getMap() {
    return map;
  }
}
