package com.team.ne.container;

import com.team.ne.tileentity.TileEntityConReactor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerConReactor extends Container{
	
	private TileEntityConReactor te;
	
	public ContainerConReactor(IInventory playerInv, TileEntityConReactor te){
		this.te = te;
		
		this.addSlotToContainer(new Slot(te, 2, 113, 34));
		this.addSlotToContainer(new Slot(te, 2, 113, 106));
		this.addSlotToContainer(new Slot(te, 2, 225, 62));
		
		//Player Inventory
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 9; ++x) {
				this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 41 + y * 18));
			}
		}
		//Player Hotbar	
		for (int x = 0; x < 9; ++x) {
			this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 99));
		}
	}
	
	
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUseableByPlayer(playerIn);
		
		
			
		}
	}
