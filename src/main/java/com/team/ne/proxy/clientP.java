package com.team.ne.proxy;

import com.team.ne.client.GUIHandler;
import com.team.ne.client.MainNE;
import com.team.ne.init.NEBlocks;
import com.team.ne.init.NEItems;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public class clientP extends serverP{
	@Override
	public void registerRenders() {
		NEBlocks.registerRenders();
		NEItems.registerRenders();
	}
	
	@Override
	public void registerGuiHander(){
		NetworkRegistry.INSTANCE.registerGuiHandler(MainNE.class, new GUIHandler());
	}

}
