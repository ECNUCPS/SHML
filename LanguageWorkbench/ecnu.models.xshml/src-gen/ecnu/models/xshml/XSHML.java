package ecnu.models.xshml;

import ecnu.models.shml.SHMLMT;
import ecnu.models.xshml.XSHMLMT;
import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class XSHML implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XSHML load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XSHML mm = new XSHML();
    mm.setResource(res);
    return mm ;
  }
  
  public SHMLMT toSHMLMT() {
    ecnu.models.xshml.xshml.adapters.shmlmt.XSHMLAdapter adaptee = new ecnu.models.xshml.xshml.adapters.shmlmt.XSHMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public XSHMLMT toXSHMLMT() {
    ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLAdapter adaptee = new ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
