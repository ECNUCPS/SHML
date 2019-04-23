package ecnu.models.xshml.xshml.aspects;

import ecnu.models.xshml.xshml.aspects.GuardAspect;
import ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import ecnu.models.xshml.xshml.shml.Clock;
import ecnu.models.xshml.xshml.shml.TemporalGuard;

@Aspect(className = TemporalGuard.class)
@SuppressWarnings("all")
public class TemporalGuardAspect extends GuardAspect {
  @Step
  public static boolean holdstg(final TemporalGuard _self) {
	final ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectProperties _self_ = ecnu.models.xshml.xshml.aspects.TemporalGuardAspectTemporalGuardAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_holdstg(_self_, _self));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "TemporalGuard", "holdstg");
	} else {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry
				.getInstance().findEventManager(null);
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (boolean) result;
}
  
  protected static boolean _privk3_holdstg(final TemporalGuardAspectTemporalGuardAspectProperties _self_, final TemporalGuard _self) {
    InputOutput.<String>println("dian11");
    String _tcondition = _self.getTcondition();
    boolean _contains = _tcondition.contains("<");
    if (_contains) {
      String _tcondition_1 = _self.getTcondition();
      String _tcondition_2 = _self.getTcondition();
      int _indexOf = _tcondition_2.indexOf("<");
      int _plus = (_indexOf + 1);
      String guardright = _tcondition_1.substring(_plus);
      Clock _onclock = _self.getOnclock();
      float _time = _onclock.getTime();
      float _parseFloat = Float.parseFloat(guardright);
      boolean _lessThan = (_time < _parseFloat);
      if (_lessThan) {
        return true;
      } else {
        return false;
      }
    } else {
      String _tcondition_3 = _self.getTcondition();
      boolean _contains_1 = _tcondition_3.contains(">");
      if (_contains_1) {
        String _tcondition_4 = _self.getTcondition();
        String _tcondition_5 = _self.getTcondition();
        int _indexOf_1 = _tcondition_5.indexOf(">");
        int _plus_1 = (_indexOf_1 + 1);
        String guardright_1 = _tcondition_4.substring(_plus_1);
        Clock _onclock_1 = _self.getOnclock();
        float _time_1 = _onclock_1.getTime();
        float _parseFloat_1 = Float.parseFloat(guardright_1);
        boolean _greaterThan = (_time_1 > _parseFloat_1);
        if (_greaterThan) {
          return true;
        } else {
          return false;
        }
      } else {
        String _tcondition_6 = _self.getTcondition();
        boolean _contains_2 = _tcondition_6.contains("=");
        if (_contains_2) {
          String _tcondition_7 = _self.getTcondition();
          String _tcondition_8 = _self.getTcondition();
          int _indexOf_2 = _tcondition_8.indexOf("=");
          int _plus_2 = (_indexOf_2 + 1);
          String guardright_2 = _tcondition_7.substring(_plus_2);
          Clock _onclock_2 = _self.getOnclock();
          float _time_2 = _onclock_2.getTime();
          float _parseFloat_2 = Float.parseFloat(guardright_2);
          boolean _equals = (_time_2 == _parseFloat_2);
          if (_equals) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
      }
    }
  }
}
