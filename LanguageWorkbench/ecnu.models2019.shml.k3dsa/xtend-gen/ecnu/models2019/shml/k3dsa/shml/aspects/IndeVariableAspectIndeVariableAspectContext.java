package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.IndeVariableAspectIndeVariableAspectProperties;
import java.util.Map;
import shml.IndeVariable;

@SuppressWarnings("all")
public class IndeVariableAspectIndeVariableAspectContext {
  public final static IndeVariableAspectIndeVariableAspectContext INSTANCE = new IndeVariableAspectIndeVariableAspectContext();
  
  public static IndeVariableAspectIndeVariableAspectProperties getSelf(final IndeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.IndeVariableAspectIndeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> map = new java.util.WeakHashMap<shml.IndeVariable, ecnu.models2019.shml.k3dsa.shml.aspects.IndeVariableAspectIndeVariableAspectProperties>();
  
  public Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> getMap() {
    return map;
  }
}
