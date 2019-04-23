package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.DeVariableAspectDeVariableAspectProperties;
import java.util.Map;
import shml.DeVariable;

@SuppressWarnings("all")
public class DeVariableAspectDeVariableAspectContext {
  public final static DeVariableAspectDeVariableAspectContext INSTANCE = new DeVariableAspectDeVariableAspectContext();
  
  public static DeVariableAspectDeVariableAspectProperties getSelf(final DeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.DeVariableAspectDeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DeVariable, DeVariableAspectDeVariableAspectProperties> map = new java.util.WeakHashMap<shml.DeVariable, ecnu.models2019.shml.k3dsa.shml.aspects.DeVariableAspectDeVariableAspectProperties>();
  
  public Map<DeVariable, DeVariableAspectDeVariableAspectProperties> getMap() {
    return map;
  }
}
