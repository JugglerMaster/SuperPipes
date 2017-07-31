
package juggermaster.superpipes.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.jugglermaster.superpipes.SuperPipes;

public class ItemBase extends Item implements ItemModelProvider{

protected String name;

public ItemBase(String name) {
  this.name = name;
  setUnlocalizedName(name);
  setRegistryName(name);
}
  @Override
public void registerItemModel(Item item) {
  SuperPipes.proxy.registerItemRenderer(item, 0 , name);
}
 @Override
  public ItemBase setCreativeTab(CreativeTabs tab) {
    super.setCreativeTab(tab); 
    return this;
  }



}
