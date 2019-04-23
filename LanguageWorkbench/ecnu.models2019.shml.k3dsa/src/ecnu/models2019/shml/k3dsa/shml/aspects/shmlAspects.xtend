package ecnu.models2019.shml.k3dsa.shml.aspects
import java.io.FileOutputStream;  
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.*
import java.util.ArrayList
import org.scilab.modules.javasci.Scilab
import org.scilab.modules.types.ScilabType
import org.eclipse.emf.common.util.EList
import java.util.Random
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import shml.System
import shml.TSHS
import shml.Variable
import shml.Clock
import shml.Event
import shml.Transition
import shml.Guard
import shml.TemporalGuard
import shml.EvaluateGuard
import shml.State
import shml.ComTransition
import shml.ProbTransition
import shml.Function
import shml.IndeVariable
import shml.DeVariable
import shml.Fright
import shml.ODE
import shml.Condition
import shml.Interval
import shml.ExpoDistribution
import shml.Action
import shml.UnifDistribution

import static extension ecnu.models2019.shml.k3dsa.shml.aspects.SystemAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.TSHSAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.VariableAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ClockAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.EventAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.TransitionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.GuardAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.TemporalGuardAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.EvaluateGuardAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.StateAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ComTransitionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ProbTransitionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.FunctionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.IndeVariableAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.DeVariableAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.FrightAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ODEAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ConditionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.IntervalAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ExpoDistributionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.ActionAspect.*
import static extension ecnu.models2019.shml.k3dsa.shml.aspects.UnifDistributionAspect.*
@Aspect(className=System)
class SystemAspect {

var Scilab sci=new Scilab(true)
 var String str1=""                 //str1 y0=25
 var String str2=""                 //str2  0.1*y-1
 var String str3=""                 //str3 f1
 var String str4=""                 //str4 t
 var String str5=""                 //str5 y
 var float intervalleft=0
 var float intervalright=0
 var float intervalsub=0   
 
 var float newt0=0                  //t0=?
 var int j=0                        //ode resultj 
 var int inode=0                    //用于ode之后的ct边，若满足，则newt0需要置为当前时间值
 var int odelayer=0
 var PrintStream ps = new PrintStream("D:/trace.txt");
 
@Main
def public void main(){
   	   // var PrintStream ps = new PrintStream("D:/trace.txt");
		//System.setOut(ps)
   	
   	 _self.sci.open                                              //scilab cannot open many times, so open it here                                                  
 //    println(" ")
 //    println("Scilab Open")
     try{
     	while(true){
     		_self.dojump  	
     		//print("After Dojump")
     		_self.doprintconfiguration
     		
     	}
     }catch(Exception nt){
     	println("Stopped due to:"+nt.message)
     }
}

@Step
def public void doprintconfiguration(){
	print("###########################################################################################################################current configuration:")

    for(var i=0;i<_self.tshss.length;i++){
       print(_self.tshss.get(i).initialstate.name+" ") print(",")
    }  
	for(var k=0;k<_self.globalclocks.length;k++){
	   print(_self.globalclocks.get(k).time)      print(",")
	}
	for(var j=0;j<_self.globalvariables.length;j++){
	   println(_self.globalvariables.get(j).value+" ")  
	}	
}


@Step
def public void dojump(){ 
 println(" ")	
// print("Dojump")
  for(var i=0;i<_self.tshss.length;i++){
//	print("**********the current state of TSHS"+i+": "+_self.tshss.get(i).initialstate.name+"****")

		var int ok=0
        var int tmp=0                   //用于判断最终该状态是否需要设定为暂时的终止状态或者说等待状态  0是需要 1是不需要
      
        
        
		
  if(_self.tshss.get(i).initialstate.outgoingct.length<1&&_self.tshss.get(i).initialstate.outgoingpt.length<1&&_self.tshss.get(i).initialstate.slaveode==null){//print(" >Branch1 ")
			println(">"+_self.tshss.get(i).initialstate.name+" is the final state of tshs"+i) 	
		}
	
  else{ //print(" >Branch2 ")
		
   
   //检查ct
   if(_self.tshss.get(i).initialstate.outgoingct.length>=1){// print(" >do cts check ")print(" ")
	for(var j=0;j<_self.tshss.get(i).initialstate.outgoingct.length;j++){
			    

		
	  if(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent!=null)	
	  {	
		
		
			    
		//没有同步信号的普通边 带e
		if(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.send==0&&_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.receive==0) 
	    {    //     print(" >no send and receive ")print(" ")
			    
			      
			      
			      if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){//	println("ct has t/e")		 		     
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt
				         ok=1			
				         tmp=1
				  //       print(" >ctok 1") 	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)				      
				          if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				 }
			     else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard==null){// println("ct has t")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt	
				         ok=1          
				         tmp=1
				   //      print(" >ctok 2")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)   
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				   }
				  else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){ //println("ct has e")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				       { 
				       	if(_self.tshss.get(i).initialstate.incomingpt.length>0)
				       	{if(_self.tshss.get(i).initialstate.incomingpt.get(0).triggerevent.active==1){_self.tshss.get(i).initialstate.incomingpt.get(0).triggerevent.active=0}}
				       	if(_self.tshss.get(i).initialstate.incomingct.length>0)
				       	{if(_self.tshss.get(i).initialstate.incomingct.get(0).triggerevent.active==1){_self.tshss.get(i).initialstate.incomingct.get(0).triggerevent.active=0}}
				       	
				       	_self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt		
				         ok=1           
				         tmp=1
				    //     print(" >ctok 3")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)
				         
				         	
				         
				         
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}			            
				        }				        				     
			      }
			    
			    
			    		   
			    
	   } //有send信号的普通边带e
	   else if(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.send==1&&_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.receive==0) 
	   { //      print(" >has send ")print(" ")
			 _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.active=1        			    
			  for(var r=0;r<_self.globalevents.length;r++){
		      
			 			 
			 
			  if(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="r"&&_self.globalevents.get(r).receive==1&&_self.globalevents.get(r).active==1&& _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)== _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.indexOf("_")+1)){
						
			
			    		
			    		
			    if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){//	println("ct has t/e")		 		     
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt
				         ok=1			
				         tmp=1
				         r=_self.globalevents.length
				  //       print(" >ctok 1") 	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)				      
				          if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				 }
			     else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard==null){// println("ct has t")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt	
				         ok=1          
				         tmp=1
				         r=_self.globalevents.length
				     //    print(" >ctok 2")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)   
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				   }
				  else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){// print(" >ct has eguard")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				       { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt		
				         ok=1           
				         tmp=1
				         r=_self.globalevents.length 
				   //      print(" >ctok 3")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)	
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}			            
				        }				        				     
			      } 		
			    		

             


			    		
			    		
			    		
			    		}
			    	}
			    
		}//有receive信号的普通边带e
	    else if(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.send==0&&_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.receive==1)
		{  // print(" >ct_j has receive ")
	        _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.active=1         
			
			
			
			for(var r=0;r<_self.globalevents.length;r++){
			
					
		/* 	println("j="+j)
		    println("j's triggerevent name="+ _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name)
			print(">check event:"+_self.globalevents.get(r).name) 
			print(">has send? ") print(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="s")
			print(">send=1? ") print(_self.globalevents.get(r).send==1) 
			print(">active? ") print(_self.globalevents.get(r).active==1) 
			print(">tong? ") print( _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)==_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.indexOf("_")+1))
			print(">ry="+ _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1))
			println(">jy="+ _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.indexOf("_")+1))
		*/	
			if(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="s"&&_self.globalevents.get(r).send==1&&_self.globalevents.get(r).active==1&& _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)== _self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingct.get(j).triggerevent.name.indexOf("_")+1)){
			    		
			    		
			    		

                if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){//	println("ct has t/e")		 		     
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt
				         ok=1			
				         tmp=1				         
				          r=_self.globalevents.length
				       //  print(" >ctok 1") 	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)				      
				          if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				 }
			     else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard==null){// println("ct has t")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard.holdstg==true)
				        { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt	
				         ok=1          
				         tmp=1
				         r=_self.globalevents.length
				    //     print(" >ctok 2")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)   
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}
				        }
				   }
				  else if(_self.tshss.get(i).initialstate.outgoingct.get(j).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard!=null){ //println("ct has e")
			     	   if(_self.tshss.get(i).initialstate.outgoingct.get(j).evaluateguard.holdseg==true)
				       { _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(j).ctgt		
				         ok=1           
				         tmp=1
				         r=_self.globalevents.length
				     //    print(" >ctok 3")	println(" the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)	
				         if(_self.inode==1&&_self.odelayer==i){
				         	_self.newt0=_self.globalclocks.get(0).time
				         	_self.inode=0				         	 
				         	}			            
				        }				        				     
			      }

	
	
	
			 }
		   }
		}			    
       }//if triggerevent不为空			     					      	    			     			     
	 }//for all cts
   }//ct length>=1 检查ct结束
		
		
		
		
//开始检查pt		
 else if(_self.tshss.get(i).initialstate.outgoingct.length==0&&_self.tshss.get(i).initialstate.outgoingpt.length>1)
 {   //        print(" >do pts check ")
		     var float ran=0	
		     ran=Math.random().floatValue
		     var float probleft=0		     
		     var ProbTransition[] ptlist = newArrayOfSize(10)
		     var Float[] problist = newArrayOfSize(10)
		     var ProbTransition ptok
		     var int outlabel=0	
		     var int beginchoose=0
		     	     		   
    for(var k=0;k<_self.tshss.get(i).initialstate.outgoingpt.length;k++){// print(">check all pts")
		   	 	
	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent!=null)	
	   {    //不带send和receive的pt，带e
	    	
	      if(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.send==0&&_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.receive==0) 
	        {  // print(" >no send and receive ")print(" ")
			    
			     if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){ //  println("pt has t/e")   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){
		   	        ptlist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	   }	
		   	     }
		   	     else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard==null){//	 println("pt has t") 	   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true){
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=0
		   	  	   }	
		   	     }		   	    
		   	     else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){  //   println("pt has e") 	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){      //    print(" >pt e is true ")
		   	        println(_self.tshss.get(i).initialstate.outgoingpt.get(k).name)
		   	        println(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		         
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))                         //     print(" >add ptlist ") 
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)	 //  println(" >add problist") 	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	  }	
		   	    }
			 
		
			
			 }//带send的pt，带e
		 else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.send==1&&_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.receive==0)
		 {
			 // print(" >has send")
					    
			for(var r=0;r<_self.globalevents.length;r++){ 
			    
			    
		//	println("k="+k)
		//    println("k's triggerevent name="+ _self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name)
		//	print(">check event:"+_self.globalevents.get(r).name) 
		//	print(">has send? ") print(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="s")
		//	print(">send=1? ") print(_self.globalevents.get(r).send==1) 
		//	print(">active? ") print(_self.globalevents.get(r).active==1) 
		//	print(">tong? ") print( _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)== _self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.indexOf("_")+1))
		//	print(">ry="+ _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1))
		//	println(">jy="+ _self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.indexOf("_")+1))
			    
			    
			    
			    
			    if(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="r"&&_self.globalevents.get(r).receive==1&&_self.globalevents.get(r).active==1&& _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)==  _self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.indexOf("_")+1)){
				
				
				
                 if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){ //  println("pt has t/e")   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){
		   	        ptlist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	   }	
		   	     }
		   	     else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard==null){//	 println("pt has t") 	   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true){
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	     probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=0
		   	  	   }	
		   	     }		   	    
		   	    else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){  //   println("pt has e") 	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){      //    print(" eguard is true ")
		   	     //   print(" >pt is"+_self.tshss.get(i).initialstate.outgoingpt.get(k).name)
		   	      //  print(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		         
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))                           //   print(" >send pt add ptlist ") print(">probleft:"+probleft)
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)	 //  println(" >send pt add problist") 	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	  }	
		   	    }
		
				
				
				 }
			  }		
			
			 
                 
                 
	 
			 
		}//带receive的pt，带e		 
		else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.send==0&&_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.receive==1)
		{
			//print(" >has receive ")print(" ")
		     	    
			for(var r=0;r<_self.globalevents.length;r++){
			if(_self.globalevents.get(r).name.substring(0, _self.globalevents.get(r).name.indexOf("_"))=="s"&&_self.globalevents.get(r).send==1&&_self.globalevents.get(r).active==1&& _self.globalevents.get(r).name.substring( _self.globalevents.get(r).name.indexOf("_")+1)== _self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.substring(_self.tshss.get(i).initialstate.outgoingpt.get(k).triggerevent.name.indexOf("_")+1)){
				
				
		     
			     if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){ //  println("pt has t/e")   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){
		   	        ptlist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.add(_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	   }	
		   	     }
		   	     else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard!=null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard==null){//	 println("pt has t") 	   	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard.holdstg==true){
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)		   	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=0
		   	  	   }	
		   	     }		   	    
		   	    else if(_self.tshss.get(i).initialstate.outgoingpt.get(k).temporalguard==null&&_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard!=null){  //   println("pt has e") 	 
		   	  	   if(_self.tshss.get(i).initialstate.outgoingpt.get(k).evaluateguard.holdseg==true){       //   print(" >pt e is true ")
		   	      //  println(_self.tshss.get(i).initialstate.outgoingpt.get(k).name)
		   	      //  println(_self.tshss.get(i).initialstate.outgoingpt.get(k))
		         
		   	        ptlist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k))                          //    print(" >add ptlist ") 
		   	        problist.set(k,_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft)	 //  println(" >add problist") 	  	
		   	  	    probleft=_self.tshss.get(i).initialstate.outgoingpt.get(k).probability+probleft
		   	  	    beginchoose=1
		   	  	   }	
		   	    }
   
   
                 }
			 
			   }//可以active的才可以
	        }//for 可以的加进pt
	       
	  }//if has triggerevent		 	   	 		
    }//for all pts
		   	
		 if(beginchoose==1){ // print(" >begin choose") print(" >ptlist:"+ptlist.get(0).name+" "+ptlist.get(1).name) print(">problist:"+problist.get(0)+" "+problist.get(1))	
		       //   print(" >ran:"+ran)	   	    
		   	     for(var m=0;m<problist.length&&outlabel==0;m++){ 
		   	  //     print(">store ")
		   		   if(ran<problist.get(m)){               //print(" >choose pt") print(" >ran:"+ran.toString)
		   			ptok=ptlist.get(m)                 //   print(" >ptok="+ptok.name)  
		   			outlabel=1		   		   
		   		    _self.tshss.get(i).initialstate.outgoingpt.get(m).triggerevent.active=1 
		   		   }
		   	     }
		   	     _self.tshss.get(i).initialstate=ptok.ptgt   
		   	   		   	    		   
		   	     ok=1		   	 
		   	     tmp=1
		      //   println(" >Change to State:"+_self.tshss.get(i).initialstate.name)  	
	            if(_self.inode==1&&_self.odelayer==i)
	            {
				 _self.newt0=_self.globalclocks.get(0).time
				  _self.inode=0				         	 
			    }
	          }
	   
	}//检查pt
			
		
			
		
	if(ok==0){	//print(" >do ok")  
		 if(_self.tshss.get(i).initialstate.outgoingct.length==1&&_self.tshss.get(i).initialstate.slavelambda!=null){ //	  print(" >has slavelambda")	
		   	  var float lambdaran=0
		   	  lambdaran=(-(1/_self.tshss.get(i).initialstate.slavelambda.lambda)*Math.log(Math.random().floatValue).floatValue)
		   	//  print("> lambdaran:"+lambdaran)
		   	  if(lambdaran<=_self.globalclocks.get(0).time&&_self.inode==1){
		   	  	_self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(0).ctgt		   	//   println(" >the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)			   	  
		   	  	 ok=1
		         tmp=1		   	  			   	  			   	  	
		   	  }else if(lambdaran>=_self.globalclocks.get(0).time&&_self.inode==1){
		   	  	ok=1
		   	  	tmp=1		   	  		   	  
		   	  }else
		   	  {
		   	  _self.globalclocks.get(0).time=_self.globalclocks.get(0).time+lambdaran
		   	//  print(" >time:"+_self.globalclocks.get(0).time)		   	  
		      _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(0).ctgt		          //    println(" >the current state of tshs"+i+" becomes "+_self.tshss.get(i).initialstate.name)
		      ok=1
		      tmp=1
		      }					
			
		
		}else if(_self.tshss.get(i).initialstate.outgoingct.length==1&&_self.tshss.get(i).initialstate.slaveunif!=null){// println(" >has slaveunif")
		   	 var float Max=_self.tshss.get(i).initialstate.slaveunif.b
		   	 var float Min=_self.tshss.get(i).initialstate.slaveunif.a
		   	 var BigDecimal db = new BigDecimal(Math.random() * (Max - Min) + Min);  
	       //  print(" >unif ran:"+db.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue.toString());  		
		     _self.globalclocks.get(0).time=_self.globalclocks.get(0).time+db.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue
		   //    print(" >time:"+_self.globalclocks.get(0).time)
		     _self.tshss.get(i).initialstate=_self.tshss.get(i).initialstate.outgoingct.get(0).ctgt	                    // println(" >the current state of tshs"+i+" becomes"+_self.tshss.get(i).initialstate.name)
		      ok=1
		      tmp=1		      
	    }else if(_self.tshss.get(i).initialstate.slaveode!=null){ // print(" >has slaveode")
			    _self.str1=_self.tshss.get(i).initialstate.slaveode.condition.name                                        //str1 y0=25
    	        _self.str2=_self.tshss.get(i).initialstate.slaveode.function.fright.name                                  //str2 0.1*y-1
    	        _self.str3=_self.tshss.get(i).initialstate.slaveode.function.name                                         //str3 f1
    	        _self.str4=_self.tshss.get(i).initialstate.slaveode.function.indevariable.name                            //str4 t
    	        _self.str5=_self.tshss.get(i).initialstate.slaveode.function.devariable.name                              //str5 y
    	        _self.intervalleft=_self.tshss.get(i).initialstate.slaveode.interval.left                                 //0
    	        _self.intervalright=_self.tshss.get(i).initialstate.slaveode.interval.right                               //120
    	        _self.intervalsub=_self.tshss.get(i).initialstate.slaveode.interval.subinterval 	  	       
    	   		
    	   		_self.inode=1
    	   		_self.odelayer=i			
				_self.callscilab			
                tmp=1
							    
			}		
	   } //ok
	
	
	 if(tmp==0){//print(" >do tmp ") 
	 	   if(_self.tshss.get(i).initialstate.outgoingct.length>=1||_self.tshss.get(i).initialstate.outgoingpt.length>=1){	 	
	 	   //	println("<"+_self.tshss.get(i).initialstate.name+" is a tmp state")
	 		 	   	
	 	   	} 	
	  }
	
			

		 
	  }//不是终止状态的情况

	}//for 多个tshs遍历，跳到各自的状态
		
}//dojump
















@Step
def public void callscilab(){// println(" >do callscilab()")
	
	    
	try{
		
        var String sttplot3="function"+" "+_self.str5+"dot="+_self.str3+"("+_self.str4+","+_self.str5+"),"+_self.str5+"dot="+_self.str2+",endfunction,"+_self.str1+","+_self.str4+"0="+_self.newt0+","
        	 +_self.str4+"="+_self.globalclocks.get(0).time+":"+_self.intervalsub+":"+_self.intervalright+","+_self.str5+"=ode("+_self.str5+"0,"+_self.str4+"0,"+_self.str4+","+_self.str3+")"+","
        	 +("result"+_self.j).toString+"=ode("+_self.str5+"0,"+_self.str4+"0,"+_self.globalclocks.get(0).time+","+_self.str3+")"
            
        //    println("ODE is:"+sttplot3) 
		    _self.sci.exec(sttplot3)	
		     var ScilabType result=_self.sci.get("result"+_self.j.toString)
		     var s=result.toString()   	     	 
   	     	 var String ss=s.substring(1,s.length-1)
   	    	 _self.globalvariables.get(0).value=Float.parseFloat(ss) 
             
   	
   	    	 var String sttplot="x=["+_self.globalclocks.get(0).time+"], y=["+_self.globalvariables.get(0).value+"],plot(x,y,'.')"  
   	   // 	 println("time=["+_self.globalclocks.get(0).time+"], temperature=["+_self.globalvariables.get(0).value+"]")
		    _self.sci.exec(sttplot)
		
   	  
   	    }catch(org.scilab.modules.javasci.JavasciException e){
   	     	    print("Error:"+e.localizedMessage)
   	  }  	        
   	      _self.globalclocks.get(0).time=_self.globalclocks.get(0).time+_self.intervalsub  
    	 _self.j=_self.j+1  
    	 
}





@Step
@InitializeModel
  def public void RealizeInitializeModel(EList<String> arguments){
	print("############################################################################################################initial configuration:")
    for(var i=0;i<_self.tshss.length;i++){
       print(_self.tshss.get(i).initialstate.name+" ") print(",")
    }  
	for(var k=0;k<_self.globalclocks.length;k++){
	   print(_self.globalclocks.get(k).time)       print(",")
	}
	for(var j=0;j<_self.globalvariables.length;j++){
	   println(_self.globalvariables.get(j).value+" ")  
	}	 	   
  }
}

@Aspect(className=TSHS)
class TSHSAspect {

}

@Aspect(className=Variable)
class VariableAspect {

}

@Aspect(className=Clock)
class ClockAspect {

}

@Aspect(className=Event)
class EventAspect {

}

@Aspect(className=Transition)
abstract class TransitionAspect {

}

@Aspect(className=Guard)
abstract class GuardAspect {

}

@Aspect(className=TemporalGuard)
class TemporalGuardAspect extends GuardAspect {
@Step
def boolean holdstg(){println("dian11")
	if(_self.tcondition.contains("<")){
		var guardright=_self.tcondition.substring(_self.tcondition.indexOf("<")+1)
		if(_self.onclock.time<Float.parseFloat(guardright)){return true}	else{return false}
	}
	else if(_self.tcondition.contains(">")){
		var guardright=_self.tcondition.substring(_self.tcondition.indexOf(">")+1)
		if(_self.onclock.time>Float.parseFloat(guardright)){return true}	else{return false}
	}
	else if(_self.tcondition.contains("=")){
		var guardright=_self.tcondition.substring(_self.tcondition.indexOf("=")+1)
		if(_self.onclock.time==Float.parseFloat(guardright)){return true}	else{return false}
		  
	}else{return false}
  }
}

@Aspect(className=EvaluateGuard)
class EvaluateGuardAspect extends GuardAspect {
@Step
def boolean holdseg(){//println("Label Eguard")
	if(_self.vcondition.contains("<")){//println("<")
		var guardright=_self.vcondition.substring(_self.vcondition.indexOf("<")+1)
		if(_self.onvariable.value<Float.parseFloat(guardright)){return true}	else{return false}     
	}
	else if(_self.vcondition.contains(">")){//println(">")
	    var guardright=_self.vcondition.substring(_self.vcondition.indexOf(">")+1)
		if(_self.onvariable.value>Float.parseFloat(guardright)){return true}	else{return false}     
	}
	else if(_self.vcondition.contains("=")){//println("=")
	    var guardright=_self.vcondition.substring(_self.vcondition.indexOf("=")+1)
		if(_self.onvariable.value==Float.parseFloat(guardright)){return true}	else{return false}    
	}
	else{return false}
  }
}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=ComTransition)
class ComTransitionAspect extends TransitionAspect {

}

@Aspect(className=ProbTransition)
class ProbTransitionAspect extends TransitionAspect {

}

@Aspect(className=Function)
class FunctionAspect {

}

@Aspect(className=IndeVariable)
class IndeVariableAspect {

}

@Aspect(className=DeVariable)
class DeVariableAspect {

}

@Aspect(className=Fright)
class FrightAspect {

}

@Aspect(className=ODE)
class ODEAspect {

}

@Aspect(className=Condition)
class ConditionAspect {

}

@Aspect(className=Interval)
class IntervalAspect {

}

@Aspect(className=ExpoDistribution)
class ExpoDistributionAspect {

}

@Aspect(className=Action)
class ActionAspect {

}

@Aspect(className=UnifDistribution)
class UnifDistributionAspect {

}



