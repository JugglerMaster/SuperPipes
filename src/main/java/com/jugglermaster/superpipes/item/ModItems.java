
package com.jugglermaster.superpipes.item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
  
  public static ItemBase ingotSuperIron;
  
  public static void init() {
     //my super metal
     ingotSuperIron = new ItemBase("ingot_superiron").setCreativeTab(CreativeTabs.MATERIALS);
  } 
  private static <T extends Item> T register(T item){
   GameRegistry.register(item);
    if(item instanceof ItemModelProvider){
    ((ItemModelProvider)item).registerItemModel();
    }
    return item;
  }
 
}
  
  /*public static void register(IForgeRegistry<Item> registry) {
    registry.registerAll(
      ingotSuperIron
      );
  }
  
  public static void registerModels() {
    ingotSuperIron.registerItemModel();
  }
}

*/
