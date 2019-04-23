package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.ProbTransitionAspectProbTransitionAspectProperties;
import java.util.Map;
import ecnu.models.xshml.xshml.shml.ProbTransition;

@SuppressWarnings("all")
public class ProbTransitionAspectProbTransitionAspectContext {
  public final static ProbTransitionAspectProbTransitionAspectContext INSTANCE = new ProbTransitionAspectProbTransitionAspectContext();
  
  public static ProbTransitionAspectProbTransitionAspectProperties getSelf(final ProbTransition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new ecnu.models.xshml.xshml.aspects.ProbTransitionAspectProbTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> map = new java.util.WeakHashMap<ecnu.models.xshml.xshml.shml.ProbTransition, ecnu.models.xshml.xshml.aspects.ProbTransitionAspectProbTransitionAspectProperties>();
  
  public Map<ProbTransition, ProbTransitionAspectProbTransitionAspectProperties> getMap() {
    return map;
  }
}
