package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties;
import java.util.Map;
import shml.EvaluateGuard;

@SuppressWarnings("all")
public class EvaluateGuardAspectEvaluateGuardAspectContext {
  public final static EvaluateGuardAspectEvaluateGuardAspectContext INSTANCE = new EvaluateGuardAspectEvaluateGuardAspectContext();
  
  public static EvaluateGuardAspectEvaluateGuardAspectProperties getSelf(final EvaluateGuard _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> map = new java.util.WeakHashMap<shml.EvaluateGuard, ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties>();
  
  public Map<EvaluateGuard, EvaluateGuardAspectEvaluateGuardAspectProperties> getMap() {
    return map;
  }
}
