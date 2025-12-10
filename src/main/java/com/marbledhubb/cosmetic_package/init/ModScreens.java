package com.marbledhubb.cosmetic_package.init;

import com.marbledhubb.cosmetic_package.client.gui.FazFitScreen;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModScreens {
    @SubscribeEvent
    public static void clientLoad(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModMenus.FAZ_FIT.get(), FazFitScreen::new);
        });
    }

    public interface ScreenAccessor {
        void updateMenuState(int elementType, String name, Object elementState);
    }
}
