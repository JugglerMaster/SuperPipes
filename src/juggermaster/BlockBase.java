package juggermaster.superpipes.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.jugglermaster.superpipes.SuperPipes;

public class BlockBase extends Block {
  protected String name;
  
  public BlockBase(Material material, String name) {
    super(material);
    
    this.name = name;
    
    setUnlocalizedName(name);
    setRegistryName(name);
  }
  public void registerItemModel(ItemBlock itemblock) {
    SuperPipes.proxy.registerItemRenderer(itemBlock, 0, name);
  }
  //stopped here
}
