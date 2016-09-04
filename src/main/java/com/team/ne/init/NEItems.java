package com.team.ne.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NEItems {
	public static Item iridium;
	public static Item resin;
	public static Item carbon;
	public static Item beer;
	public static Item wine;
	public static Item brandy;
	public static Item wiskey;
	public static Item champagne;
	public static Item yellowcake;
	public static Item lithium7;
	public static Item lithium;
	public static Item lithium6;
	public static Item lithiumrod;
	public static Item thorium;
	public static Item thorium233;
	public static Item waste;
	public static Item thoriumrod;
	public static Item mox;
	public static Item uox;
	public static Item plutonium;
	public static Item depleteduranium;
	public static Item fuelrod;
	public static Item uraniumrod;
	public static Item uranium235;
	public static Item uranium238;
	
	
	public static void init(){
		iridium = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("iridium");
		resin = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("resin");
		carbon = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("carbon");
		beer = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("beer");
		wine = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("wine");
		brandy = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("brandy");
		wiskey = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("wiskey");
		champagne = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("champagne");
		yellowcake = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(16).setUnlocalizedName("yellowcake");
		lithium7 = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("lithium7");
		lithium = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("lithium");
		lithium6 = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("lithium6");
		lithiumrod = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("lithiumrod");
		thorium = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("thorium");
		thorium233 = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("thorium233");
		mox = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("mox");
		uox = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("uox");
		plutonium = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("plutonium");
		depleteduranium = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("depleteduranium");
		fuelrod = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("fuelrod");
		uraniumrod = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("uraniumrod");
		uranium235 = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("uranium235");
		uranium238 = new Item().setCreativeTab(NETabs.netab).setMaxStackSize(64).setUnlocalizedName("uranium238");


	}
		
	public static void registerRenders(){
		registerRender(iridium);
		registerRender(resin);
		registerRender(carbon);
		registerRender(beer);
		registerRender(wine);
		registerRender(brandy);
		registerRender(wiskey);
		registerRender(champagne);
		registerRender(yellowcake);
		registerRender(lithium7);
		registerRender(lithium);
		registerRender(lithium6);
		registerRender(lithiumrod);
		registerRender(thorium);
		registerRender(thorium233);
		registerRender(mox);
		registerRender(uox);
		registerRender(plutonium);
		registerRender(depleteduranium);
		registerRender(fuelrod);
		registerRender(uraniumrod);
		registerRender(uranium235);
		registerRender(uranium238);


	}
	
	public static void register(){
		GameRegistry.registerItem(iridium, iridium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(resin, resin.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbon, carbon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(beer, beer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wine, wine.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(brandy, brandy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(wiskey, wiskey.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(champagne, champagne.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(yellowcake, yellowcake.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lithium7, lithium7.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lithium, lithium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lithium6, lithium6.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lithiumrod, lithiumrod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thorium, thorium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(thorium233, thorium233.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mox, mox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uox, uox.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(plutonium, plutonium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(depleteduranium, depleteduranium.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fuelrod, fuelrod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uraniumrod, uraniumrod.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uranium235, uranium235.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(uranium238, uranium238.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
}
