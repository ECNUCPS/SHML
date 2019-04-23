package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.FunctionAspectFunctionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Function;

@SuppressWarnings("all")
public class FunctionAspectFunctionAspectContext {
  public final static FunctionAspectFunctionAspectContext INSTANCE = new FunctionAspectFunctionAspectContext();
  
  public static FunctionAspectFunctionAspectProperties getSelf(final Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.FunctionAspectFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Function, FunctionAspectFunctionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Function, ecnu.models.xshml.xshml.aspects.FunctionAspectFunctionAspectProperties>();
  
  public Map<Function, FunctionAspectFunctionAspectProperties> getMap() {
    return map;
  }
}
