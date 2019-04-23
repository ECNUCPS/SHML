package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.ExpoDistribution;

@SuppressWarnings("all")
public class ExpoDistributionAspectExpoDistributionAspectContext {
  public final static ExpoDistributionAspectExpoDistributionAspectContext INSTANCE = new ExpoDistributionAspectExpoDistributionAspectContext();
  
  public static ExpoDistributionAspectExpoDistributionAspectProperties getSelf(final ExpoDistribution _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ExpoDistribution, ExpoDistributionAspectExpoDistributionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.ExpoDistribution, ecnu.models.xshml.xshml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties>();
  
  public Map<ExpoDistribution, ExpoDistributionAspectExpoDistributionAspectProperties> getMap() {
    return map;
  }
}
