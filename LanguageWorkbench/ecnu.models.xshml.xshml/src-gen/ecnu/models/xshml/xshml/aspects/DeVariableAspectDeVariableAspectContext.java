package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.DeVariableAspectDeVariableAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.DeVariable;

@SuppressWarnings("all")
public class DeVariableAspectDeVariableAspectContext {
  public final static DeVariableAspectDeVariableAspectContext INSTANCE = new DeVariableAspectDeVariableAspectContext();
  
  public static DeVariableAspectDeVariableAspectProperties getSelf(final DeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.DeVariableAspectDeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DeVariable, DeVariableAspectDeVariableAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.DeVariable, ecnu.models.xshml.xshml.aspects.DeVariableAspectDeVariableAspectProperties>();
  
  public Map<DeVariable, DeVariableAspectDeVariableAspectProperties> getMap() {
    return map;
  }
}
