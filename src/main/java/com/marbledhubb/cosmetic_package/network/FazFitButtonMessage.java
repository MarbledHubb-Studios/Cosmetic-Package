package com.marbledhubb.cosmetic_package.network;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.block.FazFitBlock;
import net.minecraft.network.chat.Component;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.ovdrstudios.mw.init.ManagementWantedModSounds;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public record FazFitButtonMessage(int buttonID, int x, int y, int z) {
    public FazFitButtonMessage(FriendlyByteBuf buffer) {
        this(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt());
    }

    public static void buffer(FazFitButtonMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.buttonID);
        buffer.writeInt(message.x);
        buffer.writeInt(message.y);
        buffer.writeInt(message.z);
    }

    public static void handler(FazFitButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> handleButtonAction(context.getSender(), message.buttonID, message.x, message.y, message.z));
        context.setPacketHandled(true);
    }

    public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
        Level world = entity.level();

        if (!world.hasChunkAt(new BlockPos(x, y, z)))
            return;
        if (buttonID == 0) {

            FazFitBlock.goToNextArmorType(entity, x, y, z);
        }
        if (buttonID == 1) {

            FazFitBlock.goToPreviousArmorType(entity, x, y, z);
        }
        if (buttonID == 2) {

            FazFitBlock.buyArmor(entity, x, y, z);

        }
    }

    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        CosmeticPackage.addNetworkMessage(FazFitButtonMessage.class, FazFitButtonMessage::buffer, FazFitButtonMessage::new, FazFitButtonMessage::handler);
    }
}