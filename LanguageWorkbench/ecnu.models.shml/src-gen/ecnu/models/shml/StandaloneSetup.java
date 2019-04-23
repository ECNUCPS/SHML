package ecnu.models.shml;

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
    	shml.ShmlPackage.eNS_URI,
    	shml.ShmlPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor sHML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"ecnu.models.shml.SHML", "", "http://www.example.org/shml", "ecnu.models.shml.SHMLMT"
    );
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"ecnu.models.shml.SHML",
    	sHML
    );
    MelangeRegistry.ModelTypeDescriptor sHMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"ecnu.models.shml.SHMLMT", "", "http://ecnu.models.shml.shmlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"ecnu.models.shml.SHMLMT",
    	sHMLMT
    );
  }
}
