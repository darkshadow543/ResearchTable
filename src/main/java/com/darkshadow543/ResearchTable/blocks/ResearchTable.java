package com.darkshadow543.ResearchTable.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.darkshadow543.ResearchTable.util.HasModel;
import com.darkshadow543.research_table.Reference;
import com.darkshadow543.research_table.ResearchTableMod;;

	public class ResearchTable extends Block implements HasModel{


	public ResearchTable() {
			super(Material.WOOD, MapColor.WOOD);
			this.setRegistryName(Reference.MOD_ID +":"+ Reference.ResearchTableNames.RESERCHTABLE.getRegistryName());
			this.setUnlocalizedName(Reference.MOD_ID +":"+ Reference.ResearchTableNames.RESERCHTABLE.getUnlocalizedName());
	        this.setCreativeTab(CreativeTabs.DECORATIONS);
	        this.setHardness(1.0F);
	        this.setResistance(2.0F);
	        this.setHarvestLevel("axe", 0);
		}
	
	  public boolean isOpaqueCube(IBlockState iBlockState) {
		    return true;
	  }
}
