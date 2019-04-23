package ecnu.models.xshml.xshml.adapters.xshmlmt;

import ecnu.models.xshml.XSHMLMT;
import ecnu.models.xshml.xshmlmt.shml.ShmlFactory;
import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("all")
public class XSHMLAdapter extends ResourceAdapter implements XSHMLMT {
  public XSHMLAdapter() {
    super(ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ShmlFactory getShmlFactory() {
    return new ecnu.models.xshml.xshml.adapters.xshmlmt.shml.ShmlFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getShmlFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
