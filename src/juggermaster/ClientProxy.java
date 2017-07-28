
package juggermaster.superpipes;

public static ClientProxy extends CommonProxy {
  
  @Override
  public void registerItemRenderer(Item item, int meta, String id){
   ModLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SuperPipes.modId + ":" + id, "inventory")); 
  }
}
