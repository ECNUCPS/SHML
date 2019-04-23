package ecnu.models2019.shml.k3dsa.shml.aspects;

import java.io.PrintStream;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.scilab.modules.javasci.Scilab;

@SuppressWarnings("all")
public class SystemAspectSystemAspectProperties {
  public Scilab sci = new Function0<Scilab>() {
    public Scilab apply() {
      try {
        Scilab _scilab = new Scilab(true);
        return _scilab;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
  
  public String str1 = "";
  
  public String str2 = "";
  
  public String str3 = "";
  
  public String str4 = "";
  
  public String str5 = "";
  
  public float intervalleft = 0;
  
  public float intervalright = 0;
  
  public float intervalsub = 0;
  
  public float newt0 = 0;
  
  public int j = 0;
  
  public int inode = 0;
  
  public int odelayer = 0;
  
  public PrintStream ps = new Function0<PrintStream>() {
    public PrintStream apply() {
      try {
        PrintStream _printStream = new PrintStream("D:/trace.txt");
        return _printStream;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }.apply();
}
