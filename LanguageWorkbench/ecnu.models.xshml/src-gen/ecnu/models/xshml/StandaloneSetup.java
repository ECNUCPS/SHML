package ecnu.models.xshml;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	ecnu.models.xshml.xshml.shml.ShmlPackage.eNS_URI,
    	ecnu.models.xshml.xshml.shml.ShmlPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xSHML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ecnu.models.xshml.XSHML", "", "http://ecnu.models.xshml.xshml/shml/", "ecnu.models.xshml.XSHMLMT"
    );
    xSHML.addAdapter("ecnu.models.shml.SHMLMT", ecnu.models.xshml.xshml.adapters.shmlmt.XSHMLAdapter.class);
    xSHML.addAdapter("ecnu.models.xshml.XSHMLMT", ecnu.models.xshml.xshml.adapters.xshmlmt.XSHMLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ecnu.models.xshml.XSHML",
    	xSHML
    );
    MelangeRegistry.ModelTypeDescriptor xSHMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ecnu.models.xshml.XSHMLMT", "", "http://ecnu.models.xshml.xshmlmt/"
    );
    xSHMLMT.addSuperType("ecnu.models.shml.SHMLMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ecnu.models.xshml.XSHMLMT",
    	xSHMLMT
    );
  }
}
