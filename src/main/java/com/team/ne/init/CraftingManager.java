package com.team.ne.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void register(){
		addRecipe();
		addSmelting();
	}

	private static void addRecipe() { 
		GameRegistry.addRecipe(new ItemStack(NEBlocks.normalmf, 1), new Object[]{"RIR", "IEI", "RIR", 'R', Items.REDSTONE, 'I', NEItems.iridium, 'E', Items.IRON_INGOT});
		
		
	}
	private static void addSmelting() {
		GameRegistry.addSmelting(Items.COAL, new ItemStack(NEItems.carbon, 1), 20);
		GameRegistry.addSmelting(NEBlocks.barium_ore, new ItemStack(NEItems.resin, 1), 20);
	}

}