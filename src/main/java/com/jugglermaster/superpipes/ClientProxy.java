
package com.jugglermaster.superpipes;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id){
     ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SuperPipes.modId + ":" + id, "inventory")); 
    }
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    }
}

