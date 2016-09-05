package com.team.ne.init;

import com.team.ne.blocks.barium_ore;
import com.team.ne.blocks.conreactor;
import com.team.ne.blocks.iridium_ore;
import com.team.ne.blocks.normalmf;
import com.team.ne.blocks.nucleicmf;
import com.team.ne.blocks.uranium_ore;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class NEBlocks {
	
	public static barium_ore barium_ore;
	public static normalmf normalmf;
	public static iridium_ore iridium_ore;
	public static nucleicmf nucleicmf;
	public static conreactor conreactor;
	public static uranium_ore uranium_ore;
	
	public static void init(){
		barium_ore = new barium_ore();
		barium_ore.setUnlocalizedName("barium_ore");
		normalmf = new normalmf();
		normalmf.setUnlocalizedName("normalmf");
		iridium_ore = new iridium_ore();
		iridium_ore.setUnlocalizedName("iridium_ore");
		nucleicmf = new nucleicmf();
		nucleicmf.setUnlocalizedName("nucleicmf");
		conreactor = new conreactor();
		conreactor.setUnlocalizedName("conreactor");
		uranium_ore = new uranium_ore(true);
		uranium_ore.setUnlocalizedName("uranium_ore");
	}
	public static void registerRenders(){
		registerRender(barium_ore);
		registerRender(normalmf);
		registerRender(iridium_ore);
		registerRender(nucleicmf);
		registerRender(conreactor);
		registerRender(uranium_ore);
	}
	public static void registerRender(Block block){
		Item blockItem = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(blockItem, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}

