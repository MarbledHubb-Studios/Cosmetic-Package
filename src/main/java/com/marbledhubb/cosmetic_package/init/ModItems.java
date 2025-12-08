package com.marbledhubb.cosmetic_package.init;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CosmeticPackage.MODID);

    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_HELMET = ITEMS.register("dirty_nightguard_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_CHESTPLATE = ITEMS.register("dirty_nightguard_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_LEGGINGS = ITEMS.register("dirty_nightguard_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_BOOTS = ITEMS.register("dirty_nightguard_boots", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_HELMET = ITEMS.register("budget_nightguard_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_CHESTPLATE = ITEMS.register("budget_nightguard_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_LEGGINGS = ITEMS.register("budget_nightguard_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_BOOTS = ITEMS.register("budget_nightguard_boots", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_HELMET = ITEMS.register("clean_nightguard_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_CHESTPLATE = ITEMS.register("clean_nightguard_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_LEGGINGS = ITEMS.register("clean_nightguard_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_BOOTS = ITEMS.register("clean_nightguard_boots", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_HELMET = ITEMS.register("purple_nightguard_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_CHESTPLATE = ITEMS.register("purple_nightguard_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_LEGGINGS = ITEMS.register("purple_nightguard_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_BOOTS = ITEMS.register("purple_nightguard_boots", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_HELMET = ITEMS.register("pizzaplex_nightguard_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_CHESTPLATE = ITEMS.register("pizzaplex_nightguard_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIZZALEX_NIGHTGUARD_LEGGINGS = ITEMS.register("pizzaplex_nightguard_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_BOOTS = ITEMS.register("pizzaplex_nightguard_boots", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
