package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.VariableAspectVariableAspectProperties;
import java.util.Map;
import shml.Variable;

@SuppressWarnings("all")
public class VariableAspectVariableAspectContext {
  public final static VariableAspectVariableAspectContext INSTANCE = new VariableAspectVariableAspectContext();
  
  public static VariableAspectVariableAspectProperties getSelf(final Variable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.VariableAspectVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Variable, VariableAspectVariableAspectProperties> map = new java.util.WeakHashMap<shml.Variable, ecnu.models2019.shml.k3dsa.shml.aspects.VariableAspectVariableAspectProperties>();
  
  public Map<Variable, VariableAspectVariableAspectProperties> getMap() {
    return map;
  }
}
