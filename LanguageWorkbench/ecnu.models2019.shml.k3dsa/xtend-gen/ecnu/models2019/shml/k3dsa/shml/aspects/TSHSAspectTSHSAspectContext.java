package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.TSHSAspectTSHSAspectProperties;
import java.util.Map;
import shml.TSHS;

@SuppressWarnings("all")
public class TSHSAspectTSHSAspectContext {
  public final static TSHSAspectTSHSAspectContext INSTANCE = new TSHSAspectTSHSAspectContext();
  
  public static TSHSAspectTSHSAspectProperties getSelf(final TSHS _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.TSHSAspectTSHSAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TSHS, TSHSAspectTSHSAspectProperties> map = new java.util.WeakHashMap<shml.TSHS, ecnu.models2019.shml.k3dsa.shml.aspects.TSHSAspectTSHSAspectProperties>();
  
  public Map<TSHS, TSHSAspectTSHSAspectProperties> getMap() {
    return map;
  }
}
