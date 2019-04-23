package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.FunctionAspectFunctionAspectProperties;
import java.util.Map;
import shml.Function;

@SuppressWarnings("all")
public class FunctionAspectFunctionAspectContext {
  public final static FunctionAspectFunctionAspectContext INSTANCE = new FunctionAspectFunctionAspectContext();
  
  public static FunctionAspectFunctionAspectProperties getSelf(final Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.FunctionAspectFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Function, FunctionAspectFunctionAspectProperties> map = new java.util.WeakHashMap<shml.Function, ecnu.models2019.shml.k3dsa.shml.aspects.FunctionAspectFunctionAspectProperties>();
  
  public Map<Function, FunctionAspectFunctionAspectProperties> getMap() {
    return map;
  }
}
