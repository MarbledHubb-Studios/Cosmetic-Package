package com.marbledhubb.cosmetic_package.init;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.Map;

import com.marbledhubb.cosmetic_package.world.inventory.FazFitMenu;
import com.marbledhubb.cosmetic_package.network.MenuStateUpdateMessage;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CosmeticPackage.MODID);
    public static final RegistryObject<MenuType<FazFitMenu>> FAZ_FIT = REGISTRY.register("faz_fit", () -> IForgeMenuType.create(FazFitMenu::new));

    public interface MenuAccessor {
        Map<String, Object> getMenuState();

        Map<Integer, Slot> getSlots();

        default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
            getMenuState().put(elementType + ":" + name, elementState);
            if (player instanceof ServerPlayer serverPlayer) {
                CosmeticPackage.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
            } else if (player.level().isClientSide) {
                if (Minecraft.getInstance().screen instanceof ModScreens.ScreenAccessor accessor && needClientUpdate)
                    accessor.updateMenuState(elementType, name, elementState);
                CosmeticPackage.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
            }
        }

        default <T> T getMenuState(int elementType, String name, T defaultValue) {
            try {
                return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
            } catch (ClassCastException e) {
                return defaultValue;
            }
        }
    }
}