package com.team.ne.blocks;



import com.team.ne.init.NETabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class barium_ore extends Block {

	
	public barium_ore() {
		super(Material.GROUND);
		setRegistryName("barium_ore");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		this.setCreativeTab(NETabs.netab);
	    this.setHardness(5F);
		this.setResistance(5F);
		this.setHarvestLevel("pickaxe", 2);
	
	}
}


