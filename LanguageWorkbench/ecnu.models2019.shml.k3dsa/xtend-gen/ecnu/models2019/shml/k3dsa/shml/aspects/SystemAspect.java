package ecnu.models2019.shml.k3dsa.shml.aspects;

import com.google.common.base.Objects;
import ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspect;
import ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties;
import ecnu.models2019.shml.k3dsa.shml.aspects.TemporalGuardAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.scilab.modules.javasci.JavasciException;
import org.scilab.modules.javasci.Scilab;
import org.scilab.modules.types.ScilabType;
import shml.Clock;
import shml.ComTransition;
import shml.Condition;
import shml.DeVariable;
import shml.EvaluateGuard;
import shml.Event;
import shml.ExpoDistribution;
import shml.Fright;
import shml.Function;
import shml.IndeVariable;
import shml.Interval;
import shml.ODE;
import shml.ProbTransition;
import shml.State;
import shml.TSHS;
import shml.TemporalGuard;
import shml.UnifDistribution;
import shml.Variable;

@Aspect(className = shml.System.class)
@SuppressWarnings("all")
public class SystemAspect {
  @Main
  public static void main(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_main(_self_, _self);;
  }
  
  @Step
  public static void doprintconfiguration(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_doprintconfiguration(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","doprintconfiguration");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void dojump(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_dojump(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","dojump");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void callscilab(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_callscilab(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","callscilab");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  @Step
  @InitializeModel
  public static void RealizeInitializeModel(final shml.System _self, final EList<String> arguments) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_RealizeInitializeModel(_self_, _self,arguments);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"System","RealizeInitializeModel");
    } else {
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager eventManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.EventManagerRegistry.getInstance().findEventManager(_self);
    	if (eventManager != null) {
    		eventManager.manageEvents();
    	}
    	command.execute();
    }
    ;;
  }
  
  private static Scilab sci(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_sci(_self_, _self);;
    return (org.scilab.modules.javasci.Scilab)result;
  }
  
  private static void sci(final shml.System _self, final Scilab sci) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_sci(_self_, _self,sci);;
  }
  
  private static String str1(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str1(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str1(final shml.System _self, final String str1) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str1(_self_, _self,str1);;
  }
  
  private static String str2(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str2(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str2(final shml.System _self, final String str2) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str2(_self_, _self,str2);;
  }
  
  private static String str3(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str3(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str3(final shml.System _self, final String str3) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str3(_self_, _self,str3);;
  }
  
  private static String str4(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str4(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str4(final shml.System _self, final String str4) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str4(_self_, _self,str4);;
  }
  
  private static String str5(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_str5(_self_, _self);;
    return (java.lang.String)result;
  }
  
  private static void str5(final shml.System _self, final String str5) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_str5(_self_, _self,str5);;
  }
  
  private static float intervalleft(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalleft(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalleft(final shml.System _self, final float intervalleft) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalleft(_self_, _self,intervalleft);;
  }
  
  private static float intervalright(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalright(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalright(final shml.System _self, final float intervalright) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalright(_self_, _self,intervalright);;
  }
  
  private static float intervalsub(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_intervalsub(_self_, _self);;
    return (float)result;
  }
  
  private static void intervalsub(final shml.System _self, final float intervalsub) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_intervalsub(_self_, _self,intervalsub);;
  }
  
  private static float newt0(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_newt0(_self_, _self);;
    return (float)result;
  }
  
  private static void newt0(final shml.System _self, final float newt0) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_newt0(_self_, _self,newt0);;
  }
  
  private static int j(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_j(_self_, _self);;
    return (int)result;
  }
  
  private static void j(final shml.System _self, final int j) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_j(_self_, _self,j);;
  }
  
  private static int inode(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_inode(_self_, _self);;
    return (int)result;
  }
  
  private static void inode(final shml.System _self, final int inode) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_inode(_self_, _self,inode);;
  }
  
  private static int odelayer(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_odelayer(_self_, _self);;
    return (int)result;
  }
  
  private static void odelayer(final shml.System _self, final int odelayer) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_odelayer(_self_, _self,odelayer);;
  }
  
  private static PrintStream ps(final shml.System _self) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_ps(_self_, _self);;
    return (java.io.PrintStream)result;
  }
  
  private static void ps(final shml.System _self, final PrintStream ps) {
    final ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectProperties _self_ = ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspectSystemAspectContext.getSelf(_self);
    _privk3_ps(_self_, _self,ps);;
  }
  
  protected static void _privk3_main(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
      Scilab _sci = SystemAspect.sci(_self);
      _sci.open();
      try {
        while (true) {
          {
            SystemAspect.dojump(_self);
            SystemAspect.doprintconfiguration(_self);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception nt = (Exception)_t;
          String _message = nt.getMessage();
          String _plus = ("Stopped due to:" + _message);
          InputOutput.<String>println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_doprintconfiguration(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    InputOutput.<String>print("###########################################################################################################################current configuration:");
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(_self.getTshss(), Object.class)).length); i++) {
      {
        EList<TSHS> _tshss = _self.getTshss();
        TSHS _get = _tshss.get(i);
        State _initialstate = _get.getInitialstate();
        String _name = _initialstate.getName();
        String _plus = (_name + " ");
        InputOutput.<String>print(_plus);
        InputOutput.<String>print(",");
      }
    }
    for (int k = 0; (k < ((Object[])Conversions.unwrapArray(_self.getGlobalclocks(), Object.class)).length); k++) {
      {
        EList<Clock> _globalclocks = _self.getGlobalclocks();
        Clock _get = _globalclocks.get(k);
        float _time = _get.getTime();
        InputOutput.<Float>print(Float.valueOf(_time));
        InputOutput.<String>print(",");
      }
    }
    for (int j = 0; (j < ((Object[])Conversions.unwrapArray(_self.getGlobalvariables(), Object.class)).length); j++) {
      EList<Variable> _globalvariables = _self.getGlobalvariables();
      Variable _get = _globalvariables.get(j);
      float _value = _get.getValue();
      String _plus = (Float.valueOf(_value) + " ");
      InputOutput.<String>println(_plus);
    }
  }
  
  protected static void _privk3_dojump(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    InputOutput.<String>println(" ");
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(_self.getTshss(), Object.class)).length); i++) {
      {
        int ok = 0;
        int tmp = 0;
        if ((((((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length < 1) && (((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingpt(), Object.class)).length < 1)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getSlaveode(), null))) {
          EList<TSHS> _tshss = _self.getTshss();
          TSHS _get = _tshss.get(i);
          State _initialstate = _get.getInitialstate();
          String _name = _initialstate.getName();
          String _plus = (">" + _name);
          String _plus_1 = (_plus + " is the final state of tshs");
          String _plus_2 = (_plus_1 + Integer.valueOf(i));
          InputOutput.<String>println(_plus_2);
        } else {
          EList<TSHS> _tshss_1 = _self.getTshss();
          TSHS _get_1 = _tshss_1.get(i);
          State _initialstate_1 = _get_1.getInitialstate();
          EList<ComTransition> _outgoingct = _initialstate_1.getOutgoingct();
          int _length = ((Object[])Conversions.unwrapArray(_outgoingct, Object.class)).length;
          boolean _greaterEqualsThan = (_length >= 1);
          if (_greaterEqualsThan) {
            for (int j = 0; (j < ((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length); j++) {
              EList<TSHS> _tshss_2 = _self.getTshss();
              TSHS _get_2 = _tshss_2.get(i);
              State _initialstate_2 = _get_2.getInitialstate();
              EList<ComTransition> _outgoingct_1 = _initialstate_2.getOutgoingct();
              ComTransition _get_3 = _outgoingct_1.get(j);
              Event _triggerevent = _get_3.getTriggerevent();
              boolean _notEquals = (!Objects.equal(_triggerevent, null));
              if (_notEquals) {
                if (((_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getSend() == 0) && (_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getReceive() == 0))) {
                  if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                    if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard()) == true))) {
                      EList<TSHS> _tshss_3 = _self.getTshss();
                      TSHS _get_4 = _tshss_3.get(i);
                      EList<TSHS> _tshss_4 = _self.getTshss();
                      TSHS _get_5 = _tshss_4.get(i);
                      State _initialstate_3 = _get_5.getInitialstate();
                      EList<ComTransition> _outgoingct_2 = _initialstate_3.getOutgoingct();
                      ComTransition _get_6 = _outgoingct_2.get(j);
                      State _ctgt = _get_6.getCtgt();
                      _get_4.setInitialstate(_ctgt);
                      ok = 1;
                      tmp = 1;
                      if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                        EList<Clock> _globalclocks = _self.getGlobalclocks();
                        Clock _get_7 = _globalclocks.get(0);
                        float _time = _get_7.getTime();
                        SystemAspect.newt0(_self, _time);
                        SystemAspect.inode(_self, 0);
                      }
                    }
                  } else {
                    if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null))) {
                      EList<TSHS> _tshss_5 = _self.getTshss();
                      TSHS _get_8 = _tshss_5.get(i);
                      State _initialstate_4 = _get_8.getInitialstate();
                      EList<ComTransition> _outgoingct_3 = _initialstate_4.getOutgoingct();
                      ComTransition _get_9 = _outgoingct_3.get(j);
                      TemporalGuard _temporalguard = _get_9.getTemporalguard();
                      boolean _holdstg = TemporalGuardAspect.holdstg(_temporalguard);
                      boolean _equals = (_holdstg == true);
                      if (_equals) {
                        EList<TSHS> _tshss_6 = _self.getTshss();
                        TSHS _get_10 = _tshss_6.get(i);
                        EList<TSHS> _tshss_7 = _self.getTshss();
                        TSHS _get_11 = _tshss_7.get(i);
                        State _initialstate_5 = _get_11.getInitialstate();
                        EList<ComTransition> _outgoingct_4 = _initialstate_5.getOutgoingct();
                        ComTransition _get_12 = _outgoingct_4.get(j);
                        State _ctgt_1 = _get_12.getCtgt();
                        _get_10.setInitialstate(_ctgt_1);
                        ok = 1;
                        tmp = 1;
                        if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                          EList<Clock> _globalclocks_1 = _self.getGlobalclocks();
                          Clock _get_13 = _globalclocks_1.get(0);
                          float _time_1 = _get_13.getTime();
                          SystemAspect.newt0(_self, _time_1);
                          SystemAspect.inode(_self, 0);
                        }
                      }
                    } else {
                      if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                        EList<TSHS> _tshss_8 = _self.getTshss();
                        TSHS _get_14 = _tshss_8.get(i);
                        State _initialstate_6 = _get_14.getInitialstate();
                        EList<ComTransition> _outgoingct_5 = _initialstate_6.getOutgoingct();
                        ComTransition _get_15 = _outgoingct_5.get(j);
                        EvaluateGuard _evaluateguard = _get_15.getEvaluateguard();
                        boolean _holdseg = EvaluateGuardAspect.holdseg(_evaluateguard);
                        boolean _equals_1 = (_holdseg == true);
                        if (_equals_1) {
                          EList<TSHS> _tshss_9 = _self.getTshss();
                          TSHS _get_16 = _tshss_9.get(i);
                          State _initialstate_7 = _get_16.getInitialstate();
                          EList<ProbTransition> _incomingpt = _initialstate_7.getIncomingpt();
                          int _length_1 = ((Object[])Conversions.unwrapArray(_incomingpt, Object.class)).length;
                          boolean _greaterThan = (_length_1 > 0);
                          if (_greaterThan) {
                            EList<TSHS> _tshss_10 = _self.getTshss();
                            TSHS _get_17 = _tshss_10.get(i);
                            State _initialstate_8 = _get_17.getInitialstate();
                            EList<ProbTransition> _incomingpt_1 = _initialstate_8.getIncomingpt();
                            ProbTransition _get_18 = _incomingpt_1.get(0);
                            Event _triggerevent_1 = _get_18.getTriggerevent();
                            int _active = _triggerevent_1.getActive();
                            boolean _equals_2 = (_active == 1);
                            if (_equals_2) {
                              EList<TSHS> _tshss_11 = _self.getTshss();
                              TSHS _get_19 = _tshss_11.get(i);
                              State _initialstate_9 = _get_19.getInitialstate();
                              EList<ProbTransition> _incomingpt_2 = _initialstate_9.getIncomingpt();
                              ProbTransition _get_20 = _incomingpt_2.get(0);
                              Event _triggerevent_2 = _get_20.getTriggerevent();
                              _triggerevent_2.setActive(0);
                            }
                          }
                          EList<TSHS> _tshss_12 = _self.getTshss();
                          TSHS _get_21 = _tshss_12.get(i);
                          State _initialstate_10 = _get_21.getInitialstate();
                          EList<ComTransition> _incomingct = _initialstate_10.getIncomingct();
                          int _length_2 = ((Object[])Conversions.unwrapArray(_incomingct, Object.class)).length;
                          boolean _greaterThan_1 = (_length_2 > 0);
                          if (_greaterThan_1) {
                            EList<TSHS> _tshss_13 = _self.getTshss();
                            TSHS _get_22 = _tshss_13.get(i);
                            State _initialstate_11 = _get_22.getInitialstate();
                            EList<ComTransition> _incomingct_1 = _initialstate_11.getIncomingct();
                            ComTransition _get_23 = _incomingct_1.get(0);
                            Event _triggerevent_3 = _get_23.getTriggerevent();
                            int _active_1 = _triggerevent_3.getActive();
                            boolean _equals_3 = (_active_1 == 1);
                            if (_equals_3) {
                              EList<TSHS> _tshss_14 = _self.getTshss();
                              TSHS _get_24 = _tshss_14.get(i);
                              State _initialstate_12 = _get_24.getInitialstate();
                              EList<ComTransition> _incomingct_2 = _initialstate_12.getIncomingct();
                              ComTransition _get_25 = _incomingct_2.get(0);
                              Event _triggerevent_4 = _get_25.getTriggerevent();
                              _triggerevent_4.setActive(0);
                            }
                          }
                          EList<TSHS> _tshss_15 = _self.getTshss();
                          TSHS _get_26 = _tshss_15.get(i);
                          EList<TSHS> _tshss_16 = _self.getTshss();
                          TSHS _get_27 = _tshss_16.get(i);
                          State _initialstate_13 = _get_27.getInitialstate();
                          EList<ComTransition> _outgoingct_6 = _initialstate_13.getOutgoingct();
                          ComTransition _get_28 = _outgoingct_6.get(j);
                          State _ctgt_2 = _get_28.getCtgt();
                          _get_26.setInitialstate(_ctgt_2);
                          ok = 1;
                          tmp = 1;
                          if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                            EList<Clock> _globalclocks_2 = _self.getGlobalclocks();
                            Clock _get_29 = _globalclocks_2.get(0);
                            float _time_2 = _get_29.getTime();
                            SystemAspect.newt0(_self, _time_2);
                            SystemAspect.inode(_self, 0);
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (((_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getSend() == 1) && (_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getReceive() == 0))) {
                    EList<TSHS> _tshss_17 = _self.getTshss();
                    TSHS _get_30 = _tshss_17.get(i);
                    State _initialstate_14 = _get_30.getInitialstate();
                    EList<ComTransition> _outgoingct_7 = _initialstate_14.getOutgoingct();
                    ComTransition _get_31 = _outgoingct_7.get(j);
                    Event _triggerevent_5 = _get_31.getTriggerevent();
                    _triggerevent_5.setActive(1);
                    for (int r = 0; (r < ((Object[])Conversions.unwrapArray(_self.getGlobalevents(), Object.class)).length); r++) {
                      if ((((Objects.equal(_self.getGlobalevents().get(r).getName().substring(0, _self.getGlobalevents().get(r).getName().indexOf("_")), "r") && (_self.getGlobalevents().get(r).getReceive() == 1)) && (_self.getGlobalevents().get(r).getActive() == 1)) && Objects.equal(_self.getGlobalevents().get(r).getName().substring((_self.getGlobalevents().get(r).getName().indexOf("_") + 1)), _self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getName().substring((_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getName().indexOf("_") + 1))))) {
                        if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                          if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard()) == true))) {
                            EList<TSHS> _tshss_18 = _self.getTshss();
                            TSHS _get_32 = _tshss_18.get(i);
                            EList<TSHS> _tshss_19 = _self.getTshss();
                            TSHS _get_33 = _tshss_19.get(i);
                            State _initialstate_15 = _get_33.getInitialstate();
                            EList<ComTransition> _outgoingct_8 = _initialstate_15.getOutgoingct();
                            ComTransition _get_34 = _outgoingct_8.get(j);
                            State _ctgt_3 = _get_34.getCtgt();
                            _get_32.setInitialstate(_ctgt_3);
                            ok = 1;
                            tmp = 1;
                            EList<Event> _globalevents = _self.getGlobalevents();
                            int _length_3 = ((Object[])Conversions.unwrapArray(_globalevents, Object.class)).length;
                            r = _length_3;
                            if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                              EList<Clock> _globalclocks_3 = _self.getGlobalclocks();
                              Clock _get_35 = _globalclocks_3.get(0);
                              float _time_3 = _get_35.getTime();
                              SystemAspect.newt0(_self, _time_3);
                              SystemAspect.inode(_self, 0);
                            }
                          }
                        } else {
                          if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null))) {
                            EList<TSHS> _tshss_20 = _self.getTshss();
                            TSHS _get_36 = _tshss_20.get(i);
                            State _initialstate_16 = _get_36.getInitialstate();
                            EList<ComTransition> _outgoingct_9 = _initialstate_16.getOutgoingct();
                            ComTransition _get_37 = _outgoingct_9.get(j);
                            TemporalGuard _temporalguard_1 = _get_37.getTemporalguard();
                            boolean _holdstg_1 = TemporalGuardAspect.holdstg(_temporalguard_1);
                            boolean _equals_4 = (_holdstg_1 == true);
                            if (_equals_4) {
                              EList<TSHS> _tshss_21 = _self.getTshss();
                              TSHS _get_38 = _tshss_21.get(i);
                              EList<TSHS> _tshss_22 = _self.getTshss();
                              TSHS _get_39 = _tshss_22.get(i);
                              State _initialstate_17 = _get_39.getInitialstate();
                              EList<ComTransition> _outgoingct_10 = _initialstate_17.getOutgoingct();
                              ComTransition _get_40 = _outgoingct_10.get(j);
                              State _ctgt_4 = _get_40.getCtgt();
                              _get_38.setInitialstate(_ctgt_4);
                              ok = 1;
                              tmp = 1;
                              EList<Event> _globalevents_1 = _self.getGlobalevents();
                              int _length_4 = ((Object[])Conversions.unwrapArray(_globalevents_1, Object.class)).length;
                              r = _length_4;
                              if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                                EList<Clock> _globalclocks_4 = _self.getGlobalclocks();
                                Clock _get_41 = _globalclocks_4.get(0);
                                float _time_4 = _get_41.getTime();
                                SystemAspect.newt0(_self, _time_4);
                                SystemAspect.inode(_self, 0);
                              }
                            }
                          } else {
                            if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                              EList<TSHS> _tshss_23 = _self.getTshss();
                              TSHS _get_42 = _tshss_23.get(i);
                              State _initialstate_18 = _get_42.getInitialstate();
                              EList<ComTransition> _outgoingct_11 = _initialstate_18.getOutgoingct();
                              ComTransition _get_43 = _outgoingct_11.get(j);
                              EvaluateGuard _evaluateguard_1 = _get_43.getEvaluateguard();
                              boolean _holdseg_1 = EvaluateGuardAspect.holdseg(_evaluateguard_1);
                              boolean _equals_5 = (_holdseg_1 == true);
                              if (_equals_5) {
                                EList<TSHS> _tshss_24 = _self.getTshss();
                                TSHS _get_44 = _tshss_24.get(i);
                                EList<TSHS> _tshss_25 = _self.getTshss();
                                TSHS _get_45 = _tshss_25.get(i);
                                State _initialstate_19 = _get_45.getInitialstate();
                                EList<ComTransition> _outgoingct_12 = _initialstate_19.getOutgoingct();
                                ComTransition _get_46 = _outgoingct_12.get(j);
                                State _ctgt_5 = _get_46.getCtgt();
                                _get_44.setInitialstate(_ctgt_5);
                                ok = 1;
                                tmp = 1;
                                EList<Event> _globalevents_2 = _self.getGlobalevents();
                                int _length_5 = ((Object[])Conversions.unwrapArray(_globalevents_2, Object.class)).length;
                                r = _length_5;
                                if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                                  EList<Clock> _globalclocks_5 = _self.getGlobalclocks();
                                  Clock _get_47 = _globalclocks_5.get(0);
                                  float _time_5 = _get_47.getTime();
                                  SystemAspect.newt0(_self, _time_5);
                                  SystemAspect.inode(_self, 0);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (((_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getSend() == 0) && (_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getReceive() == 1))) {
                      EList<TSHS> _tshss_18 = _self.getTshss();
                      TSHS _get_32 = _tshss_18.get(i);
                      State _initialstate_15 = _get_32.getInitialstate();
                      EList<ComTransition> _outgoingct_8 = _initialstate_15.getOutgoingct();
                      ComTransition _get_33 = _outgoingct_8.get(j);
                      Event _triggerevent_6 = _get_33.getTriggerevent();
                      _triggerevent_6.setActive(1);
                      for (int r = 0; (r < ((Object[])Conversions.unwrapArray(_self.getGlobalevents(), Object.class)).length); r++) {
                        if ((((Objects.equal(_self.getGlobalevents().get(r).getName().substring(0, _self.getGlobalevents().get(r).getName().indexOf("_")), "s") && (_self.getGlobalevents().get(r).getSend() == 1)) && (_self.getGlobalevents().get(r).getActive() == 1)) && Objects.equal(_self.getGlobalevents().get(r).getName().substring((_self.getGlobalevents().get(r).getName().indexOf("_") + 1)), _self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getName().substring((_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTriggerevent().getName().indexOf("_") + 1))))) {
                          if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                            if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard()) == true))) {
                              EList<TSHS> _tshss_19 = _self.getTshss();
                              TSHS _get_34 = _tshss_19.get(i);
                              EList<TSHS> _tshss_20 = _self.getTshss();
                              TSHS _get_35 = _tshss_20.get(i);
                              State _initialstate_16 = _get_35.getInitialstate();
                              EList<ComTransition> _outgoingct_9 = _initialstate_16.getOutgoingct();
                              ComTransition _get_36 = _outgoingct_9.get(j);
                              State _ctgt_3 = _get_36.getCtgt();
                              _get_34.setInitialstate(_ctgt_3);
                              ok = 1;
                              tmp = 1;
                              EList<Event> _globalevents = _self.getGlobalevents();
                              int _length_3 = ((Object[])Conversions.unwrapArray(_globalevents, Object.class)).length;
                              r = _length_3;
                              if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                                EList<Clock> _globalclocks_3 = _self.getGlobalclocks();
                                Clock _get_37 = _globalclocks_3.get(0);
                                float _time_3 = _get_37.getTime();
                                SystemAspect.newt0(_self, _time_3);
                                SystemAspect.inode(_self, 0);
                              }
                            }
                          } else {
                            if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null))) {
                              EList<TSHS> _tshss_21 = _self.getTshss();
                              TSHS _get_38 = _tshss_21.get(i);
                              State _initialstate_17 = _get_38.getInitialstate();
                              EList<ComTransition> _outgoingct_10 = _initialstate_17.getOutgoingct();
                              ComTransition _get_39 = _outgoingct_10.get(j);
                              TemporalGuard _temporalguard_1 = _get_39.getTemporalguard();
                              boolean _holdstg_1 = TemporalGuardAspect.holdstg(_temporalguard_1);
                              boolean _equals_4 = (_holdstg_1 == true);
                              if (_equals_4) {
                                EList<TSHS> _tshss_22 = _self.getTshss();
                                TSHS _get_40 = _tshss_22.get(i);
                                EList<TSHS> _tshss_23 = _self.getTshss();
                                TSHS _get_41 = _tshss_23.get(i);
                                State _initialstate_18 = _get_41.getInitialstate();
                                EList<ComTransition> _outgoingct_11 = _initialstate_18.getOutgoingct();
                                ComTransition _get_42 = _outgoingct_11.get(j);
                                State _ctgt_4 = _get_42.getCtgt();
                                _get_40.setInitialstate(_ctgt_4);
                                ok = 1;
                                tmp = 1;
                                EList<Event> _globalevents_1 = _self.getGlobalevents();
                                int _length_4 = ((Object[])Conversions.unwrapArray(_globalevents_1, Object.class)).length;
                                r = _length_4;
                                if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                                  EList<Clock> _globalclocks_4 = _self.getGlobalclocks();
                                  Clock _get_43 = _globalclocks_4.get(0);
                                  float _time_4 = _get_43.getTime();
                                  SystemAspect.newt0(_self, _time_4);
                                  SystemAspect.inode(_self, 0);
                                }
                              }
                            } else {
                              if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingct().get(j).getEvaluateguard(), null)))) {
                                EList<TSHS> _tshss_24 = _self.getTshss();
                                TSHS _get_44 = _tshss_24.get(i);
                                State _initialstate_19 = _get_44.getInitialstate();
                                EList<ComTransition> _outgoingct_12 = _initialstate_19.getOutgoingct();
                                ComTransition _get_45 = _outgoingct_12.get(j);
                                EvaluateGuard _evaluateguard_1 = _get_45.getEvaluateguard();
                                boolean _holdseg_1 = EvaluateGuardAspect.holdseg(_evaluateguard_1);
                                boolean _equals_5 = (_holdseg_1 == true);
                                if (_equals_5) {
                                  EList<TSHS> _tshss_25 = _self.getTshss();
                                  TSHS _get_46 = _tshss_25.get(i);
                                  EList<TSHS> _tshss_26 = _self.getTshss();
                                  TSHS _get_47 = _tshss_26.get(i);
                                  State _initialstate_20 = _get_47.getInitialstate();
                                  EList<ComTransition> _outgoingct_13 = _initialstate_20.getOutgoingct();
                                  ComTransition _get_48 = _outgoingct_13.get(j);
                                  State _ctgt_5 = _get_48.getCtgt();
                                  _get_46.setInitialstate(_ctgt_5);
                                  ok = 1;
                                  tmp = 1;
                                  EList<Event> _globalevents_2 = _self.getGlobalevents();
                                  int _length_5 = ((Object[])Conversions.unwrapArray(_globalevents_2, Object.class)).length;
                                  r = _length_5;
                                  if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                                    EList<Clock> _globalclocks_5 = _self.getGlobalclocks();
                                    Clock _get_49 = _globalclocks_5.get(0);
                                    float _time_5 = _get_49.getTime();
                                    SystemAspect.newt0(_self, _time_5);
                                    SystemAspect.inode(_self, 0);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (((((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length == 0) && (((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingpt(), Object.class)).length > 1))) {
              float ran = 0;
              double _random = Math.random();
              float _floatValue = Double.valueOf(_random).floatValue();
              ran = _floatValue;
              float probleft = 0;
              ProbTransition[] ptlist = new ProbTransition[10];
              Float[] problist = new Float[10];
              ProbTransition ptok = null;
              int outlabel = 0;
              int beginchoose = 0;
              for (int k = 0; (k < ((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingpt(), Object.class)).length); k++) {
                EList<TSHS> _tshss_2 = _self.getTshss();
                TSHS _get_2 = _tshss_2.get(i);
                State _initialstate_2 = _get_2.getInitialstate();
                EList<ProbTransition> _outgoingpt = _initialstate_2.getOutgoingpt();
                ProbTransition _get_3 = _outgoingpt.get(k);
                Event _triggerevent = _get_3.getTriggerevent();
                boolean _notEquals = (!Objects.equal(_triggerevent, null));
                if (_notEquals) {
                  if (((_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getSend() == 0) && (_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getReceive() == 0))) {
                    if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                      if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard()) == true))) {
                        final ProbTransition[] _converted_ptlist = (ProbTransition[])ptlist;
                        EList<TSHS> _tshss_3 = _self.getTshss();
                        TSHS _get_4 = _tshss_3.get(i);
                        State _initialstate_3 = _get_4.getInitialstate();
                        EList<ProbTransition> _outgoingpt_1 = _initialstate_3.getOutgoingpt();
                        ProbTransition _get_5 = _outgoingpt_1.get(k);
                        ((List<ProbTransition>)Conversions.doWrapArray(_converted_ptlist)).add(_get_5);
                        final Float[] _converted_problist = (Float[])problist;
                        EList<TSHS> _tshss_4 = _self.getTshss();
                        TSHS _get_6 = _tshss_4.get(i);
                        State _initialstate_4 = _get_6.getInitialstate();
                        EList<ProbTransition> _outgoingpt_2 = _initialstate_4.getOutgoingpt();
                        ProbTransition _get_7 = _outgoingpt_2.get(k);
                        float _probability = _get_7.getProbability();
                        float _plus_3 = (_probability + probleft);
                        ((List<Float>)Conversions.doWrapArray(_converted_problist)).add(Float.valueOf(_plus_3));
                        EList<TSHS> _tshss_5 = _self.getTshss();
                        TSHS _get_8 = _tshss_5.get(i);
                        State _initialstate_5 = _get_8.getInitialstate();
                        EList<ProbTransition> _outgoingpt_3 = _initialstate_5.getOutgoingpt();
                        ProbTransition _get_9 = _outgoingpt_3.get(k);
                        float _probability_1 = _get_9.getProbability();
                        float _plus_4 = (_probability_1 + probleft);
                        probleft = _plus_4;
                        beginchoose = 1;
                      }
                    } else {
                      if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null))) {
                        EList<TSHS> _tshss_6 = _self.getTshss();
                        TSHS _get_10 = _tshss_6.get(i);
                        State _initialstate_6 = _get_10.getInitialstate();
                        EList<ProbTransition> _outgoingpt_4 = _initialstate_6.getOutgoingpt();
                        ProbTransition _get_11 = _outgoingpt_4.get(k);
                        TemporalGuard _temporalguard = _get_11.getTemporalguard();
                        boolean _holdstg = TemporalGuardAspect.holdstg(_temporalguard);
                        boolean _equals = (_holdstg == true);
                        if (_equals) {
                          EList<TSHS> _tshss_7 = _self.getTshss();
                          TSHS _get_12 = _tshss_7.get(i);
                          State _initialstate_7 = _get_12.getInitialstate();
                          EList<ProbTransition> _outgoingpt_5 = _initialstate_7.getOutgoingpt();
                          ProbTransition _get_13 = _outgoingpt_5.get(k);
                          ptlist[k] = _get_13;
                          EList<TSHS> _tshss_8 = _self.getTshss();
                          TSHS _get_14 = _tshss_8.get(i);
                          State _initialstate_8 = _get_14.getInitialstate();
                          EList<ProbTransition> _outgoingpt_6 = _initialstate_8.getOutgoingpt();
                          ProbTransition _get_15 = _outgoingpt_6.get(k);
                          float _probability_2 = _get_15.getProbability();
                          float _plus_5 = (_probability_2 + probleft);
                          problist[k] = Float.valueOf(_plus_5);
                          EList<TSHS> _tshss_9 = _self.getTshss();
                          TSHS _get_16 = _tshss_9.get(i);
                          State _initialstate_9 = _get_16.getInitialstate();
                          EList<ProbTransition> _outgoingpt_7 = _initialstate_9.getOutgoingpt();
                          ProbTransition _get_17 = _outgoingpt_7.get(k);
                          float _probability_3 = _get_17.getProbability();
                          float _plus_6 = (_probability_3 + probleft);
                          probleft = _plus_6;
                          beginchoose = 0;
                        }
                      } else {
                        if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                          EList<TSHS> _tshss_10 = _self.getTshss();
                          TSHS _get_18 = _tshss_10.get(i);
                          State _initialstate_10 = _get_18.getInitialstate();
                          EList<ProbTransition> _outgoingpt_8 = _initialstate_10.getOutgoingpt();
                          ProbTransition _get_19 = _outgoingpt_8.get(k);
                          EvaluateGuard _evaluateguard = _get_19.getEvaluateguard();
                          boolean _holdseg = EvaluateGuardAspect.holdseg(_evaluateguard);
                          boolean _equals_1 = (_holdseg == true);
                          if (_equals_1) {
                            EList<TSHS> _tshss_11 = _self.getTshss();
                            TSHS _get_20 = _tshss_11.get(i);
                            State _initialstate_11 = _get_20.getInitialstate();
                            EList<ProbTransition> _outgoingpt_9 = _initialstate_11.getOutgoingpt();
                            ProbTransition _get_21 = _outgoingpt_9.get(k);
                            String _name_1 = _get_21.getName();
                            InputOutput.<String>println(_name_1);
                            EList<TSHS> _tshss_12 = _self.getTshss();
                            TSHS _get_22 = _tshss_12.get(i);
                            State _initialstate_12 = _get_22.getInitialstate();
                            EList<ProbTransition> _outgoingpt_10 = _initialstate_12.getOutgoingpt();
                            ProbTransition _get_23 = _outgoingpt_10.get(k);
                            InputOutput.<ProbTransition>println(_get_23);
                            EList<TSHS> _tshss_13 = _self.getTshss();
                            TSHS _get_24 = _tshss_13.get(i);
                            State _initialstate_13 = _get_24.getInitialstate();
                            EList<ProbTransition> _outgoingpt_11 = _initialstate_13.getOutgoingpt();
                            ProbTransition _get_25 = _outgoingpt_11.get(k);
                            ptlist[k] = _get_25;
                            EList<TSHS> _tshss_14 = _self.getTshss();
                            TSHS _get_26 = _tshss_14.get(i);
                            State _initialstate_14 = _get_26.getInitialstate();
                            EList<ProbTransition> _outgoingpt_12 = _initialstate_14.getOutgoingpt();
                            ProbTransition _get_27 = _outgoingpt_12.get(k);
                            float _probability_4 = _get_27.getProbability();
                            float _plus_7 = (_probability_4 + probleft);
                            problist[k] = Float.valueOf(_plus_7);
                            EList<TSHS> _tshss_15 = _self.getTshss();
                            TSHS _get_28 = _tshss_15.get(i);
                            State _initialstate_15 = _get_28.getInitialstate();
                            EList<ProbTransition> _outgoingpt_13 = _initialstate_15.getOutgoingpt();
                            ProbTransition _get_29 = _outgoingpt_13.get(k);
                            float _probability_5 = _get_29.getProbability();
                            float _plus_8 = (_probability_5 + probleft);
                            probleft = _plus_8;
                            beginchoose = 1;
                          }
                        }
                      }
                    }
                  } else {
                    if (((_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getSend() == 1) && (_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getReceive() == 0))) {
                      for (int r = 0; (r < ((Object[])Conversions.unwrapArray(_self.getGlobalevents(), Object.class)).length); r++) {
                        if ((((Objects.equal(_self.getGlobalevents().get(r).getName().substring(0, _self.getGlobalevents().get(r).getName().indexOf("_")), "r") && (_self.getGlobalevents().get(r).getReceive() == 1)) && (_self.getGlobalevents().get(r).getActive() == 1)) && Objects.equal(_self.getGlobalevents().get(r).getName().substring((_self.getGlobalevents().get(r).getName().indexOf("_") + 1)), _self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getName().substring((_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getName().indexOf("_") + 1))))) {
                          if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                            if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard()) == true))) {
                              final ProbTransition[] _converted_ptlist_1 = (ProbTransition[])ptlist;
                              EList<TSHS> _tshss_16 = _self.getTshss();
                              TSHS _get_30 = _tshss_16.get(i);
                              State _initialstate_16 = _get_30.getInitialstate();
                              EList<ProbTransition> _outgoingpt_14 = _initialstate_16.getOutgoingpt();
                              ProbTransition _get_31 = _outgoingpt_14.get(k);
                              ((List<ProbTransition>)Conversions.doWrapArray(_converted_ptlist_1)).add(_get_31);
                              final Float[] _converted_problist_1 = (Float[])problist;
                              EList<TSHS> _tshss_17 = _self.getTshss();
                              TSHS _get_32 = _tshss_17.get(i);
                              State _initialstate_17 = _get_32.getInitialstate();
                              EList<ProbTransition> _outgoingpt_15 = _initialstate_17.getOutgoingpt();
                              ProbTransition _get_33 = _outgoingpt_15.get(k);
                              float _probability_6 = _get_33.getProbability();
                              float _plus_9 = (_probability_6 + probleft);
                              ((List<Float>)Conversions.doWrapArray(_converted_problist_1)).add(Float.valueOf(_plus_9));
                              EList<TSHS> _tshss_18 = _self.getTshss();
                              TSHS _get_34 = _tshss_18.get(i);
                              State _initialstate_18 = _get_34.getInitialstate();
                              EList<ProbTransition> _outgoingpt_16 = _initialstate_18.getOutgoingpt();
                              ProbTransition _get_35 = _outgoingpt_16.get(k);
                              float _probability_7 = _get_35.getProbability();
                              float _plus_10 = (_probability_7 + probleft);
                              probleft = _plus_10;
                              beginchoose = 1;
                            }
                          } else {
                            if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null))) {
                              EList<TSHS> _tshss_19 = _self.getTshss();
                              TSHS _get_36 = _tshss_19.get(i);
                              State _initialstate_19 = _get_36.getInitialstate();
                              EList<ProbTransition> _outgoingpt_17 = _initialstate_19.getOutgoingpt();
                              ProbTransition _get_37 = _outgoingpt_17.get(k);
                              TemporalGuard _temporalguard_1 = _get_37.getTemporalguard();
                              boolean _holdstg_1 = TemporalGuardAspect.holdstg(_temporalguard_1);
                              boolean _equals_2 = (_holdstg_1 == true);
                              if (_equals_2) {
                                EList<TSHS> _tshss_20 = _self.getTshss();
                                TSHS _get_38 = _tshss_20.get(i);
                                State _initialstate_20 = _get_38.getInitialstate();
                                EList<ProbTransition> _outgoingpt_18 = _initialstate_20.getOutgoingpt();
                                ProbTransition _get_39 = _outgoingpt_18.get(k);
                                ptlist[k] = _get_39;
                                EList<TSHS> _tshss_21 = _self.getTshss();
                                TSHS _get_40 = _tshss_21.get(i);
                                State _initialstate_21 = _get_40.getInitialstate();
                                EList<ProbTransition> _outgoingpt_19 = _initialstate_21.getOutgoingpt();
                                ProbTransition _get_41 = _outgoingpt_19.get(k);
                                float _probability_8 = _get_41.getProbability();
                                float _plus_11 = (_probability_8 + probleft);
                                problist[k] = Float.valueOf(_plus_11);
                                EList<TSHS> _tshss_22 = _self.getTshss();
                                TSHS _get_42 = _tshss_22.get(i);
                                State _initialstate_22 = _get_42.getInitialstate();
                                EList<ProbTransition> _outgoingpt_20 = _initialstate_22.getOutgoingpt();
                                ProbTransition _get_43 = _outgoingpt_20.get(k);
                                float _probability_9 = _get_43.getProbability();
                                float _plus_12 = (_probability_9 + probleft);
                                probleft = _plus_12;
                                beginchoose = 0;
                              }
                            } else {
                              if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                                EList<TSHS> _tshss_23 = _self.getTshss();
                                TSHS _get_44 = _tshss_23.get(i);
                                State _initialstate_23 = _get_44.getInitialstate();
                                EList<ProbTransition> _outgoingpt_21 = _initialstate_23.getOutgoingpt();
                                ProbTransition _get_45 = _outgoingpt_21.get(k);
                                EvaluateGuard _evaluateguard_1 = _get_45.getEvaluateguard();
                                boolean _holdseg_1 = EvaluateGuardAspect.holdseg(_evaluateguard_1);
                                boolean _equals_3 = (_holdseg_1 == true);
                                if (_equals_3) {
                                  EList<TSHS> _tshss_24 = _self.getTshss();
                                  TSHS _get_46 = _tshss_24.get(i);
                                  State _initialstate_24 = _get_46.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_22 = _initialstate_24.getOutgoingpt();
                                  ProbTransition _get_47 = _outgoingpt_22.get(k);
                                  ptlist[k] = _get_47;
                                  EList<TSHS> _tshss_25 = _self.getTshss();
                                  TSHS _get_48 = _tshss_25.get(i);
                                  State _initialstate_25 = _get_48.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_23 = _initialstate_25.getOutgoingpt();
                                  ProbTransition _get_49 = _outgoingpt_23.get(k);
                                  float _probability_10 = _get_49.getProbability();
                                  float _plus_13 = (_probability_10 + probleft);
                                  problist[k] = Float.valueOf(_plus_13);
                                  EList<TSHS> _tshss_26 = _self.getTshss();
                                  TSHS _get_50 = _tshss_26.get(i);
                                  State _initialstate_26 = _get_50.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_24 = _initialstate_26.getOutgoingpt();
                                  ProbTransition _get_51 = _outgoingpt_24.get(k);
                                  float _probability_11 = _get_51.getProbability();
                                  float _plus_14 = (_probability_11 + probleft);
                                  probleft = _plus_14;
                                  beginchoose = 1;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (((_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getSend() == 0) && (_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getReceive() == 1))) {
                        for (int r = 0; (r < ((Object[])Conversions.unwrapArray(_self.getGlobalevents(), Object.class)).length); r++) {
                          if ((((Objects.equal(_self.getGlobalevents().get(r).getName().substring(0, _self.getGlobalevents().get(r).getName().indexOf("_")), "s") && (_self.getGlobalevents().get(r).getSend() == 1)) && (_self.getGlobalevents().get(r).getActive() == 1)) && Objects.equal(_self.getGlobalevents().get(r).getName().substring((_self.getGlobalevents().get(r).getName().indexOf("_") + 1)), _self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getName().substring((_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTriggerevent().getName().indexOf("_") + 1))))) {
                            if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                              if (((TemporalGuardAspect.holdstg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard()) == true) && (EvaluateGuardAspect.holdseg(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard()) == true))) {
                                final ProbTransition[] _converted_ptlist_1 = (ProbTransition[])ptlist;
                                EList<TSHS> _tshss_16 = _self.getTshss();
                                TSHS _get_30 = _tshss_16.get(i);
                                State _initialstate_16 = _get_30.getInitialstate();
                                EList<ProbTransition> _outgoingpt_14 = _initialstate_16.getOutgoingpt();
                                ProbTransition _get_31 = _outgoingpt_14.get(k);
                                ((List<ProbTransition>)Conversions.doWrapArray(_converted_ptlist_1)).add(_get_31);
                                final Float[] _converted_problist_1 = (Float[])problist;
                                EList<TSHS> _tshss_17 = _self.getTshss();
                                TSHS _get_32 = _tshss_17.get(i);
                                State _initialstate_17 = _get_32.getInitialstate();
                                EList<ProbTransition> _outgoingpt_15 = _initialstate_17.getOutgoingpt();
                                ProbTransition _get_33 = _outgoingpt_15.get(k);
                                float _probability_6 = _get_33.getProbability();
                                float _plus_9 = (_probability_6 + probleft);
                                ((List<Float>)Conversions.doWrapArray(_converted_problist_1)).add(Float.valueOf(_plus_9));
                                EList<TSHS> _tshss_18 = _self.getTshss();
                                TSHS _get_34 = _tshss_18.get(i);
                                State _initialstate_18 = _get_34.getInitialstate();
                                EList<ProbTransition> _outgoingpt_16 = _initialstate_18.getOutgoingpt();
                                ProbTransition _get_35 = _outgoingpt_16.get(k);
                                float _probability_7 = _get_35.getProbability();
                                float _plus_10 = (_probability_7 + probleft);
                                probleft = _plus_10;
                                beginchoose = 1;
                              }
                            } else {
                              if (((!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null)) && Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null))) {
                                EList<TSHS> _tshss_19 = _self.getTshss();
                                TSHS _get_36 = _tshss_19.get(i);
                                State _initialstate_19 = _get_36.getInitialstate();
                                EList<ProbTransition> _outgoingpt_17 = _initialstate_19.getOutgoingpt();
                                ProbTransition _get_37 = _outgoingpt_17.get(k);
                                TemporalGuard _temporalguard_1 = _get_37.getTemporalguard();
                                boolean _holdstg_1 = TemporalGuardAspect.holdstg(_temporalguard_1);
                                boolean _equals_2 = (_holdstg_1 == true);
                                if (_equals_2) {
                                  EList<TSHS> _tshss_20 = _self.getTshss();
                                  TSHS _get_38 = _tshss_20.get(i);
                                  State _initialstate_20 = _get_38.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_18 = _initialstate_20.getOutgoingpt();
                                  ProbTransition _get_39 = _outgoingpt_18.get(k);
                                  ptlist[k] = _get_39;
                                  EList<TSHS> _tshss_21 = _self.getTshss();
                                  TSHS _get_40 = _tshss_21.get(i);
                                  State _initialstate_21 = _get_40.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_19 = _initialstate_21.getOutgoingpt();
                                  ProbTransition _get_41 = _outgoingpt_19.get(k);
                                  float _probability_8 = _get_41.getProbability();
                                  float _plus_11 = (_probability_8 + probleft);
                                  problist[k] = Float.valueOf(_plus_11);
                                  EList<TSHS> _tshss_22 = _self.getTshss();
                                  TSHS _get_42 = _tshss_22.get(i);
                                  State _initialstate_22 = _get_42.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_20 = _initialstate_22.getOutgoingpt();
                                  ProbTransition _get_43 = _outgoingpt_20.get(k);
                                  float _probability_9 = _get_43.getProbability();
                                  float _plus_12 = (_probability_9 + probleft);
                                  probleft = _plus_12;
                                  beginchoose = 0;
                                }
                              } else {
                                if ((Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getTemporalguard(), null) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getOutgoingpt().get(k).getEvaluateguard(), null)))) {
                                  EList<TSHS> _tshss_23 = _self.getTshss();
                                  TSHS _get_44 = _tshss_23.get(i);
                                  State _initialstate_23 = _get_44.getInitialstate();
                                  EList<ProbTransition> _outgoingpt_21 = _initialstate_23.getOutgoingpt();
                                  ProbTransition _get_45 = _outgoingpt_21.get(k);
                                  EvaluateGuard _evaluateguard_1 = _get_45.getEvaluateguard();
                                  boolean _holdseg_1 = EvaluateGuardAspect.holdseg(_evaluateguard_1);
                                  boolean _equals_3 = (_holdseg_1 == true);
                                  if (_equals_3) {
                                    EList<TSHS> _tshss_24 = _self.getTshss();
                                    TSHS _get_46 = _tshss_24.get(i);
                                    State _initialstate_24 = _get_46.getInitialstate();
                                    EList<ProbTransition> _outgoingpt_22 = _initialstate_24.getOutgoingpt();
                                    ProbTransition _get_47 = _outgoingpt_22.get(k);
                                    ptlist[k] = _get_47;
                                    EList<TSHS> _tshss_25 = _self.getTshss();
                                    TSHS _get_48 = _tshss_25.get(i);
                                    State _initialstate_25 = _get_48.getInitialstate();
                                    EList<ProbTransition> _outgoingpt_23 = _initialstate_25.getOutgoingpt();
                                    ProbTransition _get_49 = _outgoingpt_23.get(k);
                                    float _probability_10 = _get_49.getProbability();
                                    float _plus_13 = (_probability_10 + probleft);
                                    problist[k] = Float.valueOf(_plus_13);
                                    EList<TSHS> _tshss_26 = _self.getTshss();
                                    TSHS _get_50 = _tshss_26.get(i);
                                    State _initialstate_26 = _get_50.getInitialstate();
                                    EList<ProbTransition> _outgoingpt_24 = _initialstate_26.getOutgoingpt();
                                    ProbTransition _get_51 = _outgoingpt_24.get(k);
                                    float _probability_11 = _get_51.getProbability();
                                    float _plus_14 = (_probability_11 + probleft);
                                    probleft = _plus_14;
                                    beginchoose = 1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              if ((beginchoose == 1)) {
                for (int m = 0; ((m < problist.length) && (outlabel == 0)); m++) {
                  Float _get_2 = problist[m];
                  boolean _lessThan = (ran < (_get_2).floatValue());
                  if (_lessThan) {
                    ProbTransition _get_3 = ptlist[m];
                    ptok = _get_3;
                    outlabel = 1;
                    EList<TSHS> _tshss_2 = _self.getTshss();
                    TSHS _get_4 = _tshss_2.get(i);
                    State _initialstate_2 = _get_4.getInitialstate();
                    EList<ProbTransition> _outgoingpt = _initialstate_2.getOutgoingpt();
                    ProbTransition _get_5 = _outgoingpt.get(m);
                    Event _triggerevent = _get_5.getTriggerevent();
                    _triggerevent.setActive(1);
                  }
                }
                EList<TSHS> _tshss_2 = _self.getTshss();
                TSHS _get_2 = _tshss_2.get(i);
                State _ptgt = ptok.getPtgt();
                _get_2.setInitialstate(_ptgt);
                ok = 1;
                tmp = 1;
                if (((SystemAspect.inode(_self) == 1) && (SystemAspect.odelayer(_self) == i))) {
                  EList<Clock> _globalclocks = _self.getGlobalclocks();
                  Clock _get_3 = _globalclocks.get(0);
                  float _time = _get_3.getTime();
                  SystemAspect.newt0(_self, _time);
                  SystemAspect.inode(_self, 0);
                }
              }
            }
          }
          if ((ok == 0)) {
            if (((((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length == 1) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getSlavelambda(), null)))) {
              float lambdaran = 0;
              EList<TSHS> _tshss_3 = _self.getTshss();
              TSHS _get_4 = _tshss_3.get(i);
              State _initialstate_2 = _get_4.getInitialstate();
              ExpoDistribution _slavelambda = _initialstate_2.getSlavelambda();
              float _lambda = _slavelambda.getLambda();
              float _divide = (1 / _lambda);
              float _minus = (-_divide);
              double _random_1 = Math.random();
              float _floatValue_1 = Double.valueOf(_random_1).floatValue();
              double _log = Math.log(_floatValue_1);
              float _floatValue_2 = Double.valueOf(_log).floatValue();
              float _multiply = (_minus * _floatValue_2);
              lambdaran = _multiply;
              if (((lambdaran <= _self.getGlobalclocks().get(0).getTime()) && (SystemAspect.inode(_self) == 1))) {
                EList<TSHS> _tshss_4 = _self.getTshss();
                TSHS _get_5 = _tshss_4.get(i);
                EList<TSHS> _tshss_5 = _self.getTshss();
                TSHS _get_6 = _tshss_5.get(i);
                State _initialstate_3 = _get_6.getInitialstate();
                EList<ComTransition> _outgoingct_1 = _initialstate_3.getOutgoingct();
                ComTransition _get_7 = _outgoingct_1.get(0);
                State _ctgt = _get_7.getCtgt();
                _get_5.setInitialstate(_ctgt);
                ok = 1;
                tmp = 1;
              } else {
                if (((lambdaran >= _self.getGlobalclocks().get(0).getTime()) && (SystemAspect.inode(_self) == 1))) {
                  ok = 1;
                  tmp = 1;
                } else {
                  EList<Clock> _globalclocks_1 = _self.getGlobalclocks();
                  Clock _get_8 = _globalclocks_1.get(0);
                  EList<Clock> _globalclocks_2 = _self.getGlobalclocks();
                  Clock _get_9 = _globalclocks_2.get(0);
                  float _time_1 = _get_9.getTime();
                  float _plus_3 = (_time_1 + lambdaran);
                  _get_8.setTime(_plus_3);
                  EList<TSHS> _tshss_6 = _self.getTshss();
                  TSHS _get_10 = _tshss_6.get(i);
                  EList<TSHS> _tshss_7 = _self.getTshss();
                  TSHS _get_11 = _tshss_7.get(i);
                  State _initialstate_4 = _get_11.getInitialstate();
                  EList<ComTransition> _outgoingct_2 = _initialstate_4.getOutgoingct();
                  ComTransition _get_12 = _outgoingct_2.get(0);
                  State _ctgt_1 = _get_12.getCtgt();
                  _get_10.setInitialstate(_ctgt_1);
                  ok = 1;
                  tmp = 1;
                }
              }
            } else {
              if (((((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length == 1) && (!Objects.equal(_self.getTshss().get(i).getInitialstate().getSlaveunif(), null)))) {
                EList<TSHS> _tshss_8 = _self.getTshss();
                TSHS _get_13 = _tshss_8.get(i);
                State _initialstate_5 = _get_13.getInitialstate();
                UnifDistribution _slaveunif = _initialstate_5.getSlaveunif();
                float Max = _slaveunif.getB();
                EList<TSHS> _tshss_9 = _self.getTshss();
                TSHS _get_14 = _tshss_9.get(i);
                State _initialstate_6 = _get_14.getInitialstate();
                UnifDistribution _slaveunif_1 = _initialstate_6.getSlaveunif();
                float Min = _slaveunif_1.getA();
                double _random_2 = Math.random();
                double _multiply_1 = (_random_2 * (Max - Min));
                double _plus_4 = (_multiply_1 + Min);
                BigDecimal db = new BigDecimal(_plus_4);
                EList<Clock> _globalclocks_3 = _self.getGlobalclocks();
                Clock _get_15 = _globalclocks_3.get(0);
                EList<Clock> _globalclocks_4 = _self.getGlobalclocks();
                Clock _get_16 = _globalclocks_4.get(0);
                float _time_2 = _get_16.getTime();
                BigDecimal _setScale = db.setScale(2, BigDecimal.ROUND_HALF_UP);
                float _floatValue_3 = _setScale.floatValue();
                float _plus_5 = (_time_2 + _floatValue_3);
                _get_15.setTime(_plus_5);
                EList<TSHS> _tshss_10 = _self.getTshss();
                TSHS _get_17 = _tshss_10.get(i);
                EList<TSHS> _tshss_11 = _self.getTshss();
                TSHS _get_18 = _tshss_11.get(i);
                State _initialstate_7 = _get_18.getInitialstate();
                EList<ComTransition> _outgoingct_3 = _initialstate_7.getOutgoingct();
                ComTransition _get_19 = _outgoingct_3.get(0);
                State _ctgt_2 = _get_19.getCtgt();
                _get_17.setInitialstate(_ctgt_2);
                ok = 1;
                tmp = 1;
              } else {
                EList<TSHS> _tshss_12 = _self.getTshss();
                TSHS _get_20 = _tshss_12.get(i);
                State _initialstate_8 = _get_20.getInitialstate();
                ODE _slaveode = _initialstate_8.getSlaveode();
                boolean _notEquals = (!Objects.equal(_slaveode, null));
                if (_notEquals) {
                  EList<TSHS> _tshss_13 = _self.getTshss();
                  TSHS _get_21 = _tshss_13.get(i);
                  State _initialstate_9 = _get_21.getInitialstate();
                  ODE _slaveode_1 = _initialstate_9.getSlaveode();
                  Condition _condition = _slaveode_1.getCondition();
                  String _name_1 = _condition.getName();
                  SystemAspect.str1(_self, _name_1);
                  EList<TSHS> _tshss_14 = _self.getTshss();
                  TSHS _get_22 = _tshss_14.get(i);
                  State _initialstate_10 = _get_22.getInitialstate();
                  ODE _slaveode_2 = _initialstate_10.getSlaveode();
                  Function _function = _slaveode_2.getFunction();
                  Fright _fright = _function.getFright();
                  String _name_2 = _fright.getName();
                  SystemAspect.str2(_self, _name_2);
                  EList<TSHS> _tshss_15 = _self.getTshss();
                  TSHS _get_23 = _tshss_15.get(i);
                  State _initialstate_11 = _get_23.getInitialstate();
                  ODE _slaveode_3 = _initialstate_11.getSlaveode();
                  Function _function_1 = _slaveode_3.getFunction();
                  String _name_3 = _function_1.getName();
                  SystemAspect.str3(_self, _name_3);
                  EList<TSHS> _tshss_16 = _self.getTshss();
                  TSHS _get_24 = _tshss_16.get(i);
                  State _initialstate_12 = _get_24.getInitialstate();
                  ODE _slaveode_4 = _initialstate_12.getSlaveode();
                  Function _function_2 = _slaveode_4.getFunction();
                  IndeVariable _indevariable = _function_2.getIndevariable();
                  String _name_4 = _indevariable.getName();
                  SystemAspect.str4(_self, _name_4);
                  EList<TSHS> _tshss_17 = _self.getTshss();
                  TSHS _get_25 = _tshss_17.get(i);
                  State _initialstate_13 = _get_25.getInitialstate();
                  ODE _slaveode_5 = _initialstate_13.getSlaveode();
                  Function _function_3 = _slaveode_5.getFunction();
                  DeVariable _devariable = _function_3.getDevariable();
                  String _name_5 = _devariable.getName();
                  SystemAspect.str5(_self, _name_5);
                  EList<TSHS> _tshss_18 = _self.getTshss();
                  TSHS _get_26 = _tshss_18.get(i);
                  State _initialstate_14 = _get_26.getInitialstate();
                  ODE _slaveode_6 = _initialstate_14.getSlaveode();
                  Interval _interval = _slaveode_6.getInterval();
                  float _left = _interval.getLeft();
                  SystemAspect.intervalleft(_self, _left);
                  EList<TSHS> _tshss_19 = _self.getTshss();
                  TSHS _get_27 = _tshss_19.get(i);
                  State _initialstate_15 = _get_27.getInitialstate();
                  ODE _slaveode_7 = _initialstate_15.getSlaveode();
                  Interval _interval_1 = _slaveode_7.getInterval();
                  float _right = _interval_1.getRight();
                  SystemAspect.intervalright(_self, _right);
                  EList<TSHS> _tshss_20 = _self.getTshss();
                  TSHS _get_28 = _tshss_20.get(i);
                  State _initialstate_16 = _get_28.getInitialstate();
                  ODE _slaveode_8 = _initialstate_16.getSlaveode();
                  Interval _interval_2 = _slaveode_8.getInterval();
                  float _subinterval = _interval_2.getSubinterval();
                  SystemAspect.intervalsub(_self, _subinterval);
                  SystemAspect.inode(_self, 1);
                  SystemAspect.odelayer(_self, i);
                  SystemAspect.callscilab(_self);
                  tmp = 1;
                }
              }
            }
          }
          if ((tmp == 0)) {
            if (((((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingct(), Object.class)).length >= 1) || (((Object[])Conversions.unwrapArray(_self.getTshss().get(i).getInitialstate().getOutgoingpt(), Object.class)).length >= 1))) {
            }
          }
        }
      }
    }
  }
  
  protected static void _privk3_callscilab(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
      String _str5 = SystemAspect.str5(_self);
      String _plus = (("function" + " ") + _str5);
      String _plus_1 = (_plus + "dot=");
      String _str3 = SystemAspect.str3(_self);
      String _plus_2 = (_plus_1 + _str3);
      String _plus_3 = (_plus_2 + "(");
      String _str4 = SystemAspect.str4(_self);
      String _plus_4 = (_plus_3 + _str4);
      String _plus_5 = (_plus_4 + ",");
      String _str5_1 = SystemAspect.str5(_self);
      String _plus_6 = (_plus_5 + _str5_1);
      String _plus_7 = (_plus_6 + "),");
      String _str5_2 = SystemAspect.str5(_self);
      String _plus_8 = (_plus_7 + _str5_2);
      String _plus_9 = (_plus_8 + "dot=");
      String _str2 = SystemAspect.str2(_self);
      String _plus_10 = (_plus_9 + _str2);
      String _plus_11 = (_plus_10 + ",endfunction,");
      String _str1 = SystemAspect.str1(_self);
      String _plus_12 = (_plus_11 + _str1);
      String _plus_13 = (_plus_12 + ",");
      String _str4_1 = SystemAspect.str4(_self);
      String _plus_14 = (_plus_13 + _str4_1);
      String _plus_15 = (_plus_14 + "0=");
      float _newt0 = SystemAspect.newt0(_self);
      String _plus_16 = (_plus_15 + Float.valueOf(_newt0));
      String _plus_17 = (_plus_16 + ",");
      String _str4_2 = SystemAspect.str4(_self);
      String _plus_18 = (_plus_17 + _str4_2);
      String _plus_19 = (_plus_18 + "=");
      EList<Clock> _globalclocks = _self.getGlobalclocks();
      Clock _get = _globalclocks.get(0);
      float _time = _get.getTime();
      String _plus_20 = (_plus_19 + Float.valueOf(_time));
      String _plus_21 = (_plus_20 + ":");
      float _intervalsub = SystemAspect.intervalsub(_self);
      String _plus_22 = (_plus_21 + Float.valueOf(_intervalsub));
      String _plus_23 = (_plus_22 + ":");
      float _intervalright = SystemAspect.intervalright(_self);
      String _plus_24 = (_plus_23 + Float.valueOf(_intervalright));
      String _plus_25 = (_plus_24 + ",");
      String _str5_3 = SystemAspect.str5(_self);
      String _plus_26 = (_plus_25 + _str5_3);
      String _plus_27 = (_plus_26 + "=ode(");
      String _str5_4 = SystemAspect.str5(_self);
      String _plus_28 = (_plus_27 + _str5_4);
      String _plus_29 = (_plus_28 + "0,");
      String _str4_3 = SystemAspect.str4(_self);
      String _plus_30 = (_plus_29 + _str4_3);
      String _plus_31 = (_plus_30 + "0,");
      String _str4_4 = SystemAspect.str4(_self);
      String _plus_32 = (_plus_31 + _str4_4);
      String _plus_33 = (_plus_32 + ",");
      String _str3_1 = SystemAspect.str3(_self);
      String _plus_34 = (_plus_33 + _str3_1);
      String _plus_35 = (_plus_34 + ")");
      String _plus_36 = (_plus_35 + ",");
      int _j = SystemAspect.j(_self);
      String _plus_37 = ("result" + Integer.valueOf(_j));
      String _string = _plus_37.toString();
      String _plus_38 = (_plus_36 + _string);
      String _plus_39 = (_plus_38 + "=ode(");
      String _str5_5 = SystemAspect.str5(_self);
      String _plus_40 = (_plus_39 + _str5_5);
      String _plus_41 = (_plus_40 + "0,");
      String _str4_5 = SystemAspect.str4(_self);
      String _plus_42 = (_plus_41 + _str4_5);
      String _plus_43 = (_plus_42 + "0,");
      EList<Clock> _globalclocks_1 = _self.getGlobalclocks();
      Clock _get_1 = _globalclocks_1.get(0);
      float _time_1 = _get_1.getTime();
      String _plus_44 = (_plus_43 + Float.valueOf(_time_1));
      String _plus_45 = (_plus_44 + ",");
      String _str3_2 = SystemAspect.str3(_self);
      String _plus_46 = (_plus_45 + _str3_2);
      String sttplot3 = (_plus_46 + ")");
      Scilab _sci = SystemAspect.sci(_self);
      _sci.exec(sttplot3);
      Scilab _sci_1 = SystemAspect.sci(_self);
      int _j_1 = SystemAspect.j(_self);
      String _string_1 = Integer.valueOf(_j_1).toString();
      String _plus_47 = ("result" + _string_1);
      ScilabType result = _sci_1.get(_plus_47);
      String s = result.toString();
      int _length = s.length();
      int _minus = (_length - 1);
      String ss = s.substring(1, _minus);
      EList<Variable> _globalvariables = _self.getGlobalvariables();
      Variable _get_2 = _globalvariables.get(0);
      float _parseFloat = Float.parseFloat(ss);
      _get_2.setValue(_parseFloat);
      EList<Clock> _globalclocks_2 = _self.getGlobalclocks();
      Clock _get_3 = _globalclocks_2.get(0);
      float _time_2 = _get_3.getTime();
      String _plus_48 = ("x=[" + Float.valueOf(_time_2));
      String _plus_49 = (_plus_48 + "], y=[");
      EList<Variable> _globalvariables_1 = _self.getGlobalvariables();
      Variable _get_4 = _globalvariables_1.get(0);
      float _value = _get_4.getValue();
      String _plus_50 = (_plus_49 + Float.valueOf(_value));
      String sttplot = (_plus_50 + "],plot(x,y,\'.\')");
      Scilab _sci_2 = SystemAspect.sci(_self);
      _sci_2.exec(sttplot);
    } catch (final Throwable _t) {
      if (_t instanceof JavasciException) {
        final JavasciException e = (JavasciException)_t;
        String _localizedMessage = e.getLocalizedMessage();
        String _plus_51 = ("Error:" + _localizedMessage);
        InputOutput.<String>print(_plus_51);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    EList<Clock> _globalclocks_3 = _self.getGlobalclocks();
    Clock _get_5 = _globalclocks_3.get(0);
    EList<Clock> _globalclocks_4 = _self.getGlobalclocks();
    Clock _get_6 = _globalclocks_4.get(0);
    float _time_3 = _get_6.getTime();
    float _intervalsub_1 = SystemAspect.intervalsub(_self);
    float _plus_52 = (_time_3 + _intervalsub_1);
    _get_5.setTime(_plus_52);
    int _j_2 = SystemAspect.j(_self);
    int _plus_53 = (_j_2 + 1);
    SystemAspect.j(_self, _plus_53);
  }
  
  protected static void _privk3_RealizeInitializeModel(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final EList<String> arguments) {
    InputOutput.<String>print("############################################################################################################initial configuration:");
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(_self.getTshss(), Object.class)).length); i++) {
      {
        EList<TSHS> _tshss = _self.getTshss();
        TSHS _get = _tshss.get(i);
        State _initialstate = _get.getInitialstate();
        String _name = _initialstate.getName();
        String _plus = (_name + " ");
        InputOutput.<String>print(_plus);
        InputOutput.<String>print(",");
      }
    }
    for (int k = 0; (k < ((Object[])Conversions.unwrapArray(_self.getGlobalclocks(), Object.class)).length); k++) {
      {
        EList<Clock> _globalclocks = _self.getGlobalclocks();
        Clock _get = _globalclocks.get(k);
        float _time = _get.getTime();
        InputOutput.<Float>print(Float.valueOf(_time));
        InputOutput.<String>print(",");
      }
    }
    for (int j = 0; (j < ((Object[])Conversions.unwrapArray(_self.getGlobalvariables(), Object.class)).length); j++) {
      EList<Variable> _globalvariables = _self.getGlobalvariables();
      Variable _get = _globalvariables.get(j);
      float _value = _get.getValue();
      String _plus = (Float.valueOf(_value) + " ");
      InputOutput.<String>println(_plus);
    }
  }
  
  protected static Scilab _privk3_sci(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSci") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.scilab.modules.javasci.Scilab) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.sci;
  }
  
  protected static void _privk3_sci(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final Scilab sci) {
    _self_.sci = sci; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSci")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, sci);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str1(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr1") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str1;
  }
  
  protected static void _privk3_str1(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final String str1) {
    _self_.str1 = str1; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr1")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str1);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str2(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr2") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str2;
  }
  
  protected static void _privk3_str2(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final String str2) {
    _self_.str2 = str2; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr2")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str2);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str3(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr3") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str3;
  }
  
  protected static void _privk3_str3(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final String str3) {
    _self_.str3 = str3; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr3")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str3);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str4(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr4") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str4;
  }
  
  protected static void _privk3_str4(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final String str4) {
    _self_.str4 = str4; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr4")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str4);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static String _privk3_str5(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStr5") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.str5;
  }
  
  protected static void _privk3_str5(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final String str5) {
    _self_.str5 = str5; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setStr5")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, str5);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalleft(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalleft") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.intervalleft;
  }
  
  protected static void _privk3_intervalleft(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final float intervalleft) {
    _self_.intervalleft = intervalleft; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalleft")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalleft);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalright(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalright") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.intervalright;
  }
  
  protected static void _privk3_intervalright(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final float intervalright) {
    _self_.intervalright = intervalright; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalright")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalright);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_intervalsub(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getIntervalsub") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.intervalsub;
  }
  
  protected static void _privk3_intervalsub(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final float intervalsub) {
    _self_.intervalsub = intervalsub; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setIntervalsub")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, intervalsub);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static float _privk3_newt0(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNewt0") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (float) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.newt0;
  }
  
  protected static void _privk3_newt0(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final float newt0) {
    _self_.newt0 = newt0; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNewt0")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, newt0);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_j(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getJ") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.j;
  }
  
  protected static void _privk3_j(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final int j) {
    _self_.j = j; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setJ")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, j);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_inode(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inode;
  }
  
  protected static void _privk3_inode(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final int inode) {
    _self_.inode = inode; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inode);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_odelayer(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOdelayer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.odelayer;
  }
  
  protected static void _privk3_odelayer(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final int odelayer) {
    _self_.odelayer = odelayer; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOdelayer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, odelayer);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static PrintStream _privk3_ps(final SystemAspectSystemAspectProperties _self_, final shml.System _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPs") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.io.PrintStream) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.ps;
  }
  
  protected static void _privk3_ps(final SystemAspectSystemAspectProperties _self_, final shml.System _self, final PrintStream ps) {
    _self_.ps = ps; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPs")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ps);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
