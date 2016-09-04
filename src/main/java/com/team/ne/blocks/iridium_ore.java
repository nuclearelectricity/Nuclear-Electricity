package com.team.ne.blocks;

import java.util.Random;

import com.team.ne.init.NEItems;
import com.team.ne.init.NETabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class iridium_ore extends Block {

	
	public iridium_ore() {
		super(Material.GROUND);
		setRegistryName("iridium_ore");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		this.setCreativeTab(NETabs.netab);
	    this.setHardness(5F);
		this.setResistance(5F);
		this.setHarvestLevel("pickaxe", 2);
	
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return NEItems.iridium;
	}
}
