package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.ProbTransitionAspectProbTransitionAspectProperties;
import java.util.Map;
import shml.ProbTransition;

@SuppressWarnings("all")
public class ProbTransitionAspectProbTransitionAspectContext {
  public final static ProbTransitionAspectProbTransitionAspectContext INSTANCE = new ProbTransitionAspectProbTransitionAspectContext();
  
  public static ProbTransitionAspectProbTransitionAspectProperties getSelf(final ProbTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models2019.shml.k3dsa.shml.aspects.ProbTransitionAspectProbTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> map = new java.util.WeakHashMap<shml.ProbTransition, ecnu.models2019.shml.k3dsa.shml.aspects.ProbTransitionAspectProbTransitionAspectProperties>();
  
  public Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> getMap() {
    return map;
  }
}
