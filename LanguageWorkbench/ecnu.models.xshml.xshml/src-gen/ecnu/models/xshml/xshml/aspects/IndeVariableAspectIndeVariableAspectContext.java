package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.IndeVariableAspectIndeVariableAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.IndeVariable;

@SuppressWarnings("all")
public class IndeVariableAspectIndeVariableAspectContext {
  public final static IndeVariableAspectIndeVariableAspectContext INSTANCE = new IndeVariableAspectIndeVariableAspectContext();
  
  public static IndeVariableAspectIndeVariableAspectProperties getSelf(final IndeVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.IndeVariableAspectIndeVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.IndeVariable, ecnu.models.xshml.xshml.aspects.IndeVariableAspectIndeVariableAspectProperties>();
  
  public Map<IndeVariable, IndeVariableAspectIndeVariableAspectProperties> getMap() {
    return map;
  }
}
