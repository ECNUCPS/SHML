package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.TSHSAspectTSHSAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.TSHS;

@SuppressWarnings("all")
public class TSHSAspectTSHSAspectContext {
  public final static TSHSAspectTSHSAspectContext INSTANCE = new TSHSAspectTSHSAspectContext();
  
  public static TSHSAspectTSHSAspectProperties getSelf(final TSHS _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.TSHSAspectTSHSAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TSHS, TSHSAspectTSHSAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.TSHS, ecnu.models.xshml.xshml.aspects.TSHSAspectTSHSAspectProperties>();
  
  public Map<TSHS, TSHSAspectTSHSAspectProperties> getMap() {
    return map;
  }
}
