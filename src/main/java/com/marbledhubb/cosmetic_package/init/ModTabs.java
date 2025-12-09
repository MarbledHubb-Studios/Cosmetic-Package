package com.marbledhubb.cosmetic_package.init;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.marbledhubb.cosmetic_package.CosmeticPackage.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CosmeticPackage.MODID);

    public static final RegistryObject<CreativeModeTab> COSMETIC_PACKAGE_TAB = CREATIVE_MODE_TABS.register("cosmetic_package_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + MODID + ".cosmetic_package_tab"))
                    .icon(() -> new ItemStack(ModItems.CLEAN_NIGHTGUARD_HELMET.get()))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.FAZ_FIT.get());

                        output.accept(ModItems.DIRTY_NIGHTGUARD_HELMET.get());
                        output.accept(ModItems.DIRTY_NIGHTGUARD_CHESTPLATE.get());
                        output.accept(ModItems.DIRTY_NIGHTGUARD_SLIM_CHESTPLATE.get());
                        output.accept(ModItems.DIRTY_NIGHTGUARD_LEGGINGS.get());
                        output.accept(ModItems.DIRTY_NIGHTGUARD_BOOTS.get());

                        output.accept(ModItems.BUDGET_NIGHTGUARD_HELMET.get());
                        output.accept(ModItems.BUDGET_NIGHTGUARD_CHESTPLATE.get());
                        output.accept(ModItems.BUDGET_NIGHTGUARD_LEGGINGS.get());
                        output.accept(ModItems.BUDGET_NIGHTGUARD_BOOTS.get());

                        output.accept(ModItems.CLEAN_NIGHTGUARD_HELMET.get());
                        output.accept(ModItems.CLEAN_NIGHTGUARD_CHESTPLATE.get());
                        output.accept(ModItems.CLEAN_NIGHTGUARD_LEGGINGS.get());
                        output.accept(ModItems.CLEAN_NIGHTGUARD_BOOTS.get());

                        output.accept(ModItems.PIZZAPLEX_NIGHTGUARD_HELMET.get());
                        output.accept(ModItems.PIZZAPLEX_NIGHTGUARD_CHESTPLATE.get());
                        output.accept(ModItems.PIZZALEX_NIGHTGUARD_LEGGINGS.get());
                        output.accept(ModItems.PIZZAPLEX_NIGHTGUARD_BOOTS.get());

                        output.accept(ModItems.PURPLE_NIGHTGUARD_HELMET.get());
                        output.accept(ModItems.PURPLE_NIGHTGUARD_CHESTPLATE.get());
                        output.accept(ModItems.PURPLE_NIGHTGUARD_LEGGINGS.get());
                        output.accept(ModItems.PURPLE_NIGHTGUARD_BOOTS.get());
                    })
                    .build()
    );
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
