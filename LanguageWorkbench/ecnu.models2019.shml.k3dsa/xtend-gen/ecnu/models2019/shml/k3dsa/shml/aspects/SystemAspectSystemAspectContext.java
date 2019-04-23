package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final shml.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<shml.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<shml.System, ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<shml.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
