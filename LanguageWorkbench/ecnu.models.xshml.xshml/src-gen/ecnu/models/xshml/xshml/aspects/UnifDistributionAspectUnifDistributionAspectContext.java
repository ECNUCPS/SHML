package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.UnifDistributionAspectUnifDistributionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.UnifDistribution;

@SuppressWarnings("all")
public class UnifDistributionAspectUnifDistributionAspectContext {
  public final static UnifDistributionAspectUnifDistributionAspectContext INSTANCE = new UnifDistributionAspectUnifDistributionAspectContext();
  
  public static UnifDistributionAspectUnifDistributionAspectProperties getSelf(final UnifDistribution _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.UnifDistributionAspectUnifDistributionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<UnifDistribution, UnifDistributionAspectUnifDistributionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.UnifDistribution, ecnu.models.xshml.xshml.aspects.UnifDistributionAspectUnifDistributionAspectProperties>();
  
  public Map<UnifDistribution, UnifDistributionAspectUnifDistributionAspectProperties> getMap() {
    return map;
  }
}
