package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ActionAspectActionAspectProperties;
import java.util.Map;
import shml.Action;

@SuppressWarnings("all")
public class ActionAspectActionAspectContext {
  public final static ActionAspectActionAspectContext INSTANCE = new ActionAspectActionAspectContext();
  
  public static ActionAspectActionAspectProperties getSelf(final Action _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ActionAspectActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Action, ActionAspectActionAspectProperties> map = new java.util.WeakHashMap<shml.Action, ecnu.models2019.shml.k3dsa.shml.aspects.ActionAspectActionAspectProperties>();
  
  public Map<Action, ActionAspectActionAspectProperties> getMap() {
    return map;
  }
}
