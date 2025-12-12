package com.marbledhubb.cosmetic_package.config;

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

    public List<String> getPiecesRegistry(ArmorType armorType) {
        List<String> suffixes = List.of("_helmet", "_chestplate", "_leggings", "_boots");
        List<String> piecesRegistry = new ArrayList<>(4);

        for (String suffix : suffixes) {
            piecesRegistry.add(armorType.getRegistry() + suffix);
        }

        return piecesRegistry;
    }
}
