package com.marbledhubb.cosmetic_package.client.gui;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.config.ArmorType;
import com.marbledhubb.cosmetic_package.config.FazFitArmorPrices;
import com.marbledhubb.cosmetic_package.init.block.FazFitBlock;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import com.mojang.blaze3d.systems.RenderSystem;

import com.marbledhubb.cosmetic_package.world.inventory.FazFitMenu;
import com.marbledhubb.cosmetic_package.network.FazFitButtonMessage;
import com.marbledhubb.cosmetic_package.init.ModScreens;

import java.util.List;

@SuppressWarnings("removal")
public class FazFitScreen extends AbstractContainerScreen<FazFitMenu> implements ModScreens.ScreenAccessor {
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    private boolean menuStateUpdateActive = false;
    private Button back_button;
    private Button next_button;
    private ImageButton purchase_button;
    private final int armorPieceXConstant = 27;
    private final List<Integer> armorPiecesX = List.of(armorPieceXConstant, armorPieceXConstant*2, armorPieceXConstant*3, armorPieceXConstant*4);

    public FazFitScreen(FazFitMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    public void updateMenuState(int elementType, String name, Object elementState) {
        menuStateUpdateActive = true;
        menuStateUpdateActive = false;
    }

    private static final ResourceLocation texture = new ResourceLocation("cosmetic_package:textures/screens/faz_fit.png");

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(guiGraphics);
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        for (int i=0; i<FazFitBlock.getArmorType(entity, x, y, z).getPiecesRegistry().size(); i++) {
            guiGraphics.blit(new ResourceLocation(CosmeticPackage.MODID + ":textures/item/" + FazFitBlock.getArmorType(entity, x, y, z).getPiecesRegistry().get(i) + ".png"), this.leftPos + armorPiecesX.get(i), this.topPos + 16, 0, 0, 16, 16, 16, 16);
        }
        RenderSystem.disableBlend();
    }

    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(key, b, c);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, Component.literal("" + FazFitBlock.getArmorType(entity, x, y, z).getPriceAmount()), 47, 54, -1, false);
    }

    @Override
    public void init() {
        super.init();
        back_button = Button.builder(Component.literal(">>"), e -> {
            int x = FazFitScreen.this.x;
            int y = FazFitScreen.this.y;
            if (true) {
                CosmeticPackage.PACKET_HANDLER.sendToServer(new FazFitButtonMessage(0, x, y, z));
                FazFitButtonMessage.handleButtonAction(entity, 0, x, y, z);
            }
        }).bounds(this.leftPos + 154, this.topPos + 6, 18, 20).build();
        this.addRenderableWidget(back_button);
        next_button = Button.builder(Component.literal("<<"), e -> {
            int x = FazFitScreen.this.x;
            int y = FazFitScreen.this.y;
            if (true) {
                CosmeticPackage.PACKET_HANDLER.sendToServer(new FazFitButtonMessage(1, x, y, z));
                FazFitButtonMessage.handleButtonAction(entity, 1, x, y, z);
            }
        }).bounds(this.leftPos + 154, this.topPos + 26, 18, 20).build();
        this.addRenderableWidget(next_button);
        purchase_button = new ImageButton(this.leftPos + 79, this.topPos + 49, 90, 18, 0, 0, 18, new ResourceLocation("cosmetic_package:textures/screens/atlas/buttons.png"), 90, 36, e -> {
            int x = FazFitScreen.this.x;
            int y = FazFitScreen.this.y;
            if (true) {
                CosmeticPackage.PACKET_HANDLER.sendToServer(new FazFitButtonMessage(2, x, y, z));
                FazFitButtonMessage.handleButtonAction(entity, 2, x, y, z);
            }
        });
        this.addRenderableWidget(purchase_button);
    }
}
