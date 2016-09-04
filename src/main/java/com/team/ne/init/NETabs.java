package com.team.ne.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NETabs {
	
	public static final CreativeTabs netab = new CreativeTabs("netab"){
		@Override
		public Item getTabIconItem(){
			return NEItems.iridium;
		}
	};
}

