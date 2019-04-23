package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.SystemAspectSystemAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SystemAspectSystemAspectContext {
  public final static SystemAspectSystemAspectContext INSTANCE = new SystemAspectSystemAspectContext();
  
  public static SystemAspectSystemAspectProperties getSelf(final ecnu.models.xshml.xshml.shml.System _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.SystemAspectSystemAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ecnu.models.xshml.xshml.shml.System, SystemAspectSystemAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.System, ecnu.models.xshml.xshml.aspects.SystemAspectSystemAspectProperties>();
  
  public Map<ecnu.models.xshml.xshml.shml.System, SystemAspectSystemAspectProperties> getMap() {
    return map;
  }
}
