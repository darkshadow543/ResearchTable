package com.darkshadow543.ResearchTable.proxy;

import com.darkshadow543.ResearchTable.blocks.ModBlocks;
import com.darkshadow543.ResearchTable.blocks.ResearchTable;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().register(new ResearchTable());
    	System.out.println("debug line");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	 event.getRegistry().register(new ItemBlock(ModBlocks.researchTable).setRegistryName(ModBlocks.researchTable.getRegistryName()));

    }
}
