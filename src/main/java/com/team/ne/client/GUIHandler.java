package com.team.ne.client;

import com.team.ne.container.ContainerConReactor;
import com.team.ne.gui.GUIConReactor;
import com.team.ne.tileentity.TileEntityConReactor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler{
	
	public static final int conreactor = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == conreactor){
			return new ContainerConReactor(player.inventory, (TileEntityConReactor) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == conreactor){
			return new GUIConReactor(player.inventory, (TileEntityConReactor) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
