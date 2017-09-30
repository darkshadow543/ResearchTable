package com.darkshadow543.ResearchTable.blocks;

import com.darkshadow543.research_table.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.*;

public class ModBlocks {
	
    @GameRegistry.ObjectHolder(Reference.MOD_ID + ":" + "blockResearchTable")
    public static ResearchTable researchTable;

}
