package com.marbledhubb.cosmetic_package.config;

import com.marbledhubb.cosmetic_package.util.ItemUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.List;

public enum ArmorType {
    DIRTY_NIGHTGUARD("dirty_nightguard", 0),
    BUDGET_NIGHTGUARD("budget_nightguard", 1),
    CLEAN_NIGHTGUARD("clean_nightguard", 2),
    PURPLE_NIGHTGUARD("purple_nightguard", 3),
    PIZZA_PLEX_NIGHTGUARD("pizzaplex_nightguard", 4);

    private final String registry;
    private final int id;

    private ArmorType(String registry, int id) {
        this.registry = registry;
        this.id = id;
    }

    public String getRegistry() {
        return registry;
    }

    public int getId() {
        return id;
    }

    public boolean is(ArmorType armorType) {
        return this == armorType;
    }

    public boolean isDirtyNightGuard() {
        return this == DIRTY_NIGHTGUARD;
    }

    public boolean isBudgetNightGuard() {
        return this == BUDGET_NIGHTGUARD;
    }

    public boolean isCleanNightGuard() {
        return this == CLEAN_NIGHTGUARD;
    }

    public boolean isPurpleNightGuard() {
        return this == PURPLE_NIGHTGUARD;
    }

    public boolean isPizzaPlexNightGuard() {
        return this == PIZZA_PLEX_NIGHTGUARD;
    }

    public ArmorType next() {
        ArmorType[] vals = values();
        return vals[(this.ordinal() + 1) % vals.length];
    }

    public ArmorType prev() {
        ArmorType[] vals = values();
        return vals[(this.ordinal() - 1 + vals.length) % vals.length];
    }

    public static ArmorType fromRegistry(String registry) {
        for (ArmorType type : values()) {
            if (type.registry.equals(registry)) {
                return type;
            }
        }
        return DIRTY_NIGHTGUARD;
    }

    public static ArmorType fromId(int id) {
        for (ArmorType type : values()) {
            if (type.id == (id)) {
                return type;
            }
        }
        return DIRTY_NIGHTGUARD;
    }

    public List<String> getAllPiecesRegistry() {
        List<String> suffixes = List.of("_helmet", "_chestplate", "_leggings", "_boots");
        List<String> piecesRegistry = new ArrayList<>();

        for (ArmorType type : values()) {
            for (String suffix : suffixes) {
                piecesRegistry.add(type.getRegistry() + suffix);
            }
        }

        return piecesRegistry;
    }

    public List<String> getPiecesRegistry() {
        List<String> suffixes = List.of("_helmet", "_chestplate", "_leggings", "_boots");
        List<String> piecesRegistry = new ArrayList<>(4);

        for (String suffix : suffixes) {
            piecesRegistry.add(this.getRegistry() + suffix);
        }

        return piecesRegistry;
    }

    public int getPriceAmount() {

        ArmorData prices = FazFitArmorPrices.get();

        if (isDirtyNightGuard()) {
            return prices.dirtyNightGuard
                    .getOrDefault("management_wanted:faz_buck", 0);
        }

        if (isBudgetNightGuard()) {
            return prices.budgetNightGuard
                    .getOrDefault("management_wanted:faz_buck", 0);
        }

        if (isCleanNightGuard()) {
            return prices.cleanNightGuard
                    .getOrDefault("management_wanted:faz_buck", 0);
        }

        if (isPurpleNightGuard()) {
            return prices.purpleNightGuard
                    .getOrDefault("management_wanted:faz_buck", 0);
        }

        if (isPizzaPlexNightGuard()) {
            return prices.pizzaPlexNightGuard
                    .getOrDefault("management_wanted:faz_buck_stack", 0);
        }

        return 0;
    }

    public Item getPriceItem() {
        ArmorData prices = FazFitArmorPrices.get();
        String itemId = null;

        if (isDirtyNightGuard()) {
            itemId = prices.dirtyNightGuard.keySet().iterator().next();
        } else if (isBudgetNightGuard()) {
            itemId = prices.budgetNightGuard.keySet().iterator().next();
        } else if (isCleanNightGuard()) {
            itemId = prices.cleanNightGuard.keySet().iterator().next();
        } else if (isPurpleNightGuard()) {
            itemId = prices.purpleNightGuard.keySet().iterator().next();
        } else if (isPizzaPlexNightGuard()) {
            itemId = prices.pizzaPlexNightGuard.keySet().iterator().next();
        }

        if (itemId == null) return Items.AIR;

        return ItemUtils.fromRegistryName(itemId);
    }

    public String getPriceItemString() {
        ArmorData prices = FazFitArmorPrices.get();
        String itemId = null;

        if (isDirtyNightGuard()) {
            itemId = prices.dirtyNightGuard.keySet().iterator().next();
        } else if (isBudgetNightGuard()) {
            itemId = prices.budgetNightGuard.keySet().iterator().next();
        } else if (isCleanNightGuard()) {
            itemId = prices.cleanNightGuard.keySet().iterator().next();
        } else if (isPurpleNightGuard()) {
            itemId = prices.purpleNightGuard.keySet().iterator().next();
        } else if (isPizzaPlexNightGuard()) {
            itemId = prices.pizzaPlexNightGuard.keySet().iterator().next();
        }

        if (itemId == null) return "";

        return itemId;
    }

}
