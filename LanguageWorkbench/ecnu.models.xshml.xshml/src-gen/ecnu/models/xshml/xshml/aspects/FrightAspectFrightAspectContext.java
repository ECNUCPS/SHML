package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.FrightAspectFrightAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Fright;

@SuppressWarnings("all")
public class FrightAspectFrightAspectContext {
  public final static FrightAspectFrightAspectContext INSTANCE = new FrightAspectFrightAspectContext();
  
  public static FrightAspectFrightAspectProperties getSelf(final Fright _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.FrightAspectFrightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Fright, FrightAspectFrightAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Fright, ecnu.models.xshml.xshml.aspects.FrightAspectFrightAspectProperties>();
  
  public Map<Fright, FrightAspectFrightAspectProperties> getMap() {
    return map;
  }
}
