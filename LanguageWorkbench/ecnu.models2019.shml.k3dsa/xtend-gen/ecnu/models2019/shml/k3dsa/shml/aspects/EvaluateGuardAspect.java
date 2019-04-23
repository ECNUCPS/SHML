package ecnu.models2019.shml.k3dsa.shml.aspects;

import ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties;
import ecnu.models2019.shml.k3dsa.shml.aspects.GuardAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import shml.EvaluateGuard;
import shml.Variable;

@Aspect(className = EvaluateGuard.class)
@SuppressWarnings("all")
public class EvaluateGuardAspect extends GuardAspect {
  @Step
  public static boolean holdseg(final EvaluateGuard _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspectEvaluateGuardAspectContext.getSelf(_self);
    Object result = null;
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		addToResult(_privk3_holdseg(_self_, _self));
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"EvaluateGuard","holdseg");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    result = command.getResult();
    ;;
    return (boolean)result;
  }
  
  protected static boolean _privk3_holdseg(final EvaluateGuardAspectEvaluateGuardAspectProperties _self_, final EvaluateGuard _self) {
    String _vcondition = _self.getVcondition();
    boolean _contains = _vcondition.contains("<");
    if (_contains) {
      String _vcondition_1 = _self.getVcondition();
      String _vcondition_2 = _self.getVcondition();
      int _indexOf = _vcondition_2.indexOf("<");
      int _plus = (_indexOf + 1);
      String guardright = _vcondition_1.substring(_plus);
      Variable _onvariable = _self.getOnvariable();
      float _value = _onvariable.getValue();
      float _parseFloat = Float.parseFloat(guardright);
      boolean _lessThan = (_value < _parseFloat);
      if (_lessThan) {
        return true;
      } else {
        return false;
      }
    } else {
      String _vcondition_3 = _self.getVcondition();
      boolean _contains_1 = _vcondition_3.contains(">");
      if (_contains_1) {
        String _vcondition_4 = _self.getVcondition();
        String _vcondition_5 = _self.getVcondition();
        int _indexOf_1 = _vcondition_5.indexOf(">");
        int _plus_1 = (_indexOf_1 + 1);
        String guardright_1 = _vcondition_4.substring(_plus_1);
        Variable _onvariable_1 = _self.getOnvariable();
        float _value_1 = _onvariable_1.getValue();
        float _parseFloat_1 = Float.parseFloat(guardright_1);
        boolean _greaterThan = (_value_1 > _parseFloat_1);
        if (_greaterThan) {
          return true;
        } else {
          return false;
        }
      } else {
        String _vcondition_6 = _self.getVcondition();
        boolean _contains_2 = _vcondition_6.contains("=");
        if (_contains_2) {
          String _vcondition_7 = _self.getVcondition();
          String _vcondition_8 = _self.getVcondition();
          int _indexOf_2 = _vcondition_8.indexOf("=");
          int _plus_2 = (_indexOf_2 + 1);
          String guardright_2 = _vcondition_7.substring(_plus_2);
          Variable _onvariable_2 = _self.getOnvariable();
          float _value_2 = _onvariable_2.getValue();
          float _parseFloat_2 = Float.parseFloat(guardright_2);
          boolean _equals = (_value_2 == _parseFloat_2);
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
