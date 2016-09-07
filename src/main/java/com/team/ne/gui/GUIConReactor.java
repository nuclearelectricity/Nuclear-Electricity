package com.team.ne.gui;

import com.team.ne.container.ContainerConReactor;
import com.team.ne.tileentity.TileEntityConReactor;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUIConReactor extends GuiContainer{
	
	private TileEntityConReactor te;
	private IInventory playerInv;

	public GUIConReactor(IInventory playerInv, TileEntityConReactor te) {
		super(new ContainerConReactor(playerInv, te));
		
		this.te = te;
		this.playerInv = playerInv;
		
		this.xSize = 353;
		this.ySize = 332;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(new ResourceLocation("nuclearelectricity:textures/gui/container/conreactor"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
	}
}
