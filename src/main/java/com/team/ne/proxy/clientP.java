package com.team.ne.proxy;

import com.team.ne.init.NEBlocks;
import com.team.ne.init.NEItems;

public class clientP extends serverP{
	@Override
	public void registerRenders() {
		NEBlocks.registerRenders();
		NEItems.registerRenders();
	}

}
