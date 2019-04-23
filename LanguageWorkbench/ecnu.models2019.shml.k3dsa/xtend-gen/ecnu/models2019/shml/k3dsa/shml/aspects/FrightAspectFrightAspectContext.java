package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.FrightAspectFrightAspectProperties;
import java.util.Map;
import shml.Fright;

@SuppressWarnings("all")
public class FrightAspectFrightAspectContext {
  public final static FrightAspectFrightAspectContext INSTANCE = new FrightAspectFrightAspectContext();
  
  public static FrightAspectFrightAspectProperties getSelf(final Fright _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.FrightAspectFrightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Fright, FrightAspectFrightAspectProperties> map = new java.util.WeakHashMap<shml.Fright, ecnu.models2019.shml.k3dsa.shml.aspects.FrightAspectFrightAspectProperties>();
  
  public Map<Fright, FrightAspectFrightAspectProperties> getMap() {
    return map;
  }
}
