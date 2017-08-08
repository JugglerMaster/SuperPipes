 package com.jugglermaster.superpipes.block;

import com.jugglermaster.superpipes.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	   @GameRegistry.ObjectHolder("modtut:firstblock")
	   public static ModBlocks firstBlock;
	   
  public static void init() {
   oreStarDust = register(new BlockOre("oreStarDust").setCreativeTab(CreativeTabs.MATERIALS));

  }
 
 private static <T extends Block> T register(T block, ItemBlock itemBlock) {
  GameRegistry.register(block);
  GameRegistry.register(itemBlock);
  

  
  if(block instanceof ItemModelProvider) {
    ((ItemModelProvider)block).registerItemModel(itemBlock);
  }
  return block;
 }
 private static <T extends Block> T register(T block) {
  ItemBlock itemBlock = new ItemBlock(block);
  itemBlock.setRegistryName(block.getRegistryName());
  return register(block, itemBlock);
 }
}
 
