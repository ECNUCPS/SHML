package ecnu.models.xshml;

import ecnu.models.xshml.xshmlmt.shml.ShmlFactory;
import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface XSHMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ShmlFactory getShmlFactory();
  
  public abstract void save(final String uri) throws IOException;
}
