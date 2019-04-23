package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ConditionAspectConditionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.Condition;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.Condition, ecnu.models.xshml.xshml.aspects.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
