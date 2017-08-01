//Main class
//Super Pipes!

package juggermaster.superpipes;

import juggermaster.superpipes.block.ModBlocks;
import juggermaster.superpipes.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = superpipes.modId, name = superpipes.name, version = superpipes.version)
public class SuperPipes {

  public static final String modId = "superpipes";
  public static final String name = "Super Pipes";
  public static final String version = "0.01";
  
  @SidedProxy(serverSide = "net.jugglermast.superpipes.proxy.CommonProxy", clientSide = "net.jugglermaster.superpipes.proxy.ClientProxy")
  public static CommonProxy proxy;
  
  @Mod.Instance(modId)
  public static superpipes instance;
  
  @Mod.EventHandler
  public void init(FMLPreInitializationEvent event){
    System.out.println(name + " super pipes is loading up!");
    ModItems.init();
    ModBlocks.init();
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent event){
    System.out.println(name + " Have a super time!");
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event){
  }
  
  @Mod.EventBusSubscriber
  public static class RegistrationHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
      ModItems.register(event.getRegistry());
    }
    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
     ModItems.registerModels(); 
    }
  }
  
}
