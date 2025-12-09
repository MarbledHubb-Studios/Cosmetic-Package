package com.marbledhubb.cosmetic_package.init;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorSlimItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CosmeticPackage.MODID);

    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_HELMET = ITEMS.register("dirty_nightguard_helmet", () -> new DirtyNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_CHESTPLATE = ITEMS.register("dirty_nightguard_chestplate", () -> new DirtyNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_SLIM_CHESTPLATE = ITEMS.register("dirty_nightguard_slim_chestplate", () -> new DirtyNightguardArmorSlimItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_LEGGINGS = ITEMS.register("dirty_nightguard_leggings", () -> new DirtyNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NIGHTGUARD_BOOTS = ITEMS.register("dirty_nightguard_boots", () -> new DirtyNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_HELMET = ITEMS.register("budget_nightguard_helmet", () -> new BudgetNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_CHESTPLATE = ITEMS.register("budget_nightguard_chestplate", () -> new BudgetNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_SLIM_CHESTPLATE = ITEMS.register("budget_nightguard_slim_chestplate", () -> new BudgetNightguardArmorSlimItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_LEGGINGS = ITEMS.register("budget_nightguard_leggings", () -> new BudgetNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> BUDGET_NIGHTGUARD_BOOTS = ITEMS.register("budget_nightguard_boots", () -> new BudgetNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_HELMET = ITEMS.register("clean_nightguard_helmet", () -> new CleanNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_CHESTPLATE = ITEMS.register("clean_nightguard_chestplate", () -> new CleanNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_SLIM_CHESTPLATE = ITEMS.register("clean_nightguard_slim_chestplate", () -> new CleanNightguardArmorSlimItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_LEGGINGS = ITEMS.register("clean_nightguard_leggings", () -> new CleanNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> CLEAN_NIGHTGUARD_BOOTS = ITEMS.register("clean_nightguard_boots", () -> new CleanNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_HELMET = ITEMS.register("purple_nightguard_helmet", () -> new PurpleNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_CHESTPLATE = ITEMS.register("purple_nightguard_chestplate", () -> new PurpleNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_SLIM_CHESTPLATE = ITEMS.register("purple_nightguard_slim_chestplate", () -> new PurpleNightguardArmorSlimItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_LEGGINGS = ITEMS.register("purple_nightguard_leggings", () -> new PurpleNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_NIGHTGUARD_BOOTS = ITEMS.register("purple_nightguard_boots", () -> new PurpleNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_HELMET = ITEMS.register("pizzaplex_nightguard_helmet", () -> new PizzaplexNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.HELMET,new Item.Properties()));
    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_CHESTPLATE = ITEMS.register("pizzaplex_nightguard_chestplate", () -> new PizzaplexNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_SLIM_CHESTPLATE = ITEMS.register("pizzaplex_nightguard_slim_chestplate", () -> new PizzaplexNightguardArmorSlimItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE,new Item.Properties()));
    public static final RegistryObject<Item> PIZZALEX_NIGHTGUARD_LEGGINGS = ITEMS.register("pizzaplex_nightguard_leggings", () -> new PizzaplexNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS,new Item.Properties()));
    public static final RegistryObject<Item> PIZZAPLEX_NIGHTGUARD_BOOTS = ITEMS.register("pizzaplex_nightguard_boots", () -> new PizzaplexNightguardArmorItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS,new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
