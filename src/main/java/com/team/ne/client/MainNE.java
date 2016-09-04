package com.team.ne.client;

import com.team.ne.init.CraftingManager;
import com.team.ne.init.NEBlocks;
import com.team.ne.init.NEItems;
import com.team.ne.init.NEWorldGen;
import com.team.ne.proxy.serverP;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MainVariables.MOD_ID , name = MainVariables.MOD_NAME , version = MainVariables.MOD_VERSION)
public class MainNE {
	@SidedProxy(clientSide = MainVariables.MOD_CLIENT_PROXY , serverSide = MainVariables.MOD_SERVER_PROXY)
	public static serverP proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		NEItems.init();
		NEItems.register();
		NEBlocks.init();
		GameRegistry.registerWorldGenerator(new NEWorldGen(), 0);
		CraftingManager.register();
		proxy.registerRenders();
		
		
		
	}
	@EventHandler
    public void Init(FMLInitializationEvent event){

	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
	@EventHandler
	public void ServerLoad(FMLServerStartingEvent event){
		
	}
	
}
