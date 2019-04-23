package ecnu.models.shml;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import shml.ShmlFactory;

@SuppressWarnings("all")
public interface SHMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ShmlFactory getShmlFactory();
  
  public abstract void save(final String uri) throws IOException;
}
