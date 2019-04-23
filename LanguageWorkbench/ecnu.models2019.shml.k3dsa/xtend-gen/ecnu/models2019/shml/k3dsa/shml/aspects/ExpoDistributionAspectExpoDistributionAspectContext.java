package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties;
import java.util.Map;
import shml.ExpoDistribution;

@SuppressWarnings("all")
public class ExpoDistributionAspectExpoDistributionAspectContext {
  public final static ExpoDistributionAspectExpoDistributionAspectContext INSTANCE = new ExpoDistributionAspectExpoDistributionAspectContext();
  
  public static ExpoDistributionAspectExpoDistributionAspectProperties getSelf(final ExpoDistribution _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ExpoDistribution, ExpoDistributionAspectExpoDistributionAspectProperties> map = new java.util.WeakHashMap<shml.ExpoDistribution, ecnu.models2019.shml.k3dsa.shml.aspects.ExpoDistributionAspectExpoDistributionAspectProperties>();
  
  public Map<ExpoDistribution, ExpoDistributionAspectExpoDistributionAspectProperties> getMap() {
    return map;
  }
}
