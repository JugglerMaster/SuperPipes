
package juggermaster.superpipes.item;

import net.miecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
  //my super metal
  public static ItemBase ingotSuperIron = new ItemBase("ingot_superiron").setCreativeTab(CreativeTabs.MATERIALS);
  
  public static void register(IForgeRegistry<Item> registry) {
    registry.registerAll(
      ingotSuperIron
      );
  }
  
  public static void registerModels() {
    ingotSuperIron.registerItemModel();
  }
}

