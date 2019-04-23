package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.UnifDistributionAspectUnifDistributionAspectProperties;
import java.util.Map;
import shml.UnifDistribution;

@SuppressWarnings("all")
public class UnifDistributionAspectUnifDistributionAspectContext {
  public final static UnifDistributionAspectUnifDistributionAspectContext INSTANCE = new UnifDistributionAspectUnifDistributionAspectContext();
  
  public static UnifDistributionAspectUnifDistributionAspectProperties getSelf(final UnifDistribution _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.UnifDistributionAspectUnifDistributionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<UnifDistribution, UnifDistributionAspectUnifDistributionAspectProperties> map = new java.util.WeakHashMap<shml.UnifDistribution, ecnu.models2019.shml.k3dsa.shml.aspects.UnifDistributionAspectUnifDistributionAspectProperties>();
  
  public Map<UnifDistribution, UnifDistributionAspectUnifDistributionAspectProperties> getMap() {
    return map;
  }
}
