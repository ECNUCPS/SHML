package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.EvaluateGuard;

@SuppressWarnings("all")
public class EvaluateGuardAspectEvaluateGuardAspectContext {
  public final static EvaluateGuardAspectEvaluateGuardAspectContext INSTANCE = new EvaluateGuardAspectEvaluateGuardAspectContext();
  
  public static EvaluateGuardAspectEvaluateGuardAspectProperties getSelf(final EvaluateGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.EvaluateGuard, ecnu.models.xshml.xshml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties>();
  
  public Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> getMap() {
    return map;
  }
}
