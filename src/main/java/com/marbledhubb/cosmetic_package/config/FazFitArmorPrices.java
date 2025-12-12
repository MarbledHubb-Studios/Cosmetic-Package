package com.marbledhubb.cosmetic_package.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

import com.marbledhubb.cosmetic_package.CosmeticPackage;

public class FazFitArmorPrices {
    private static final Path CONFIG_PATH = Path.of("config", CosmeticPackage.MODID, "faz_fit_armor_prices.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static ArmorData armorData;

    public static void load() {
        try {
            if (!Files.exists(CONFIG_PATH)) {
                Files.createDirectories(CONFIG_PATH.getParent());
                armorData = new ArmorData();
                save();
            } else {
                try (Reader reader = Files.newBufferedReader(CONFIG_PATH)) {
                    armorData = GSON.fromJson(reader, ArmorData.class);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load Cosmetic Package Faz-Fit ArmorData", e);
        }
    }

    public static void save() {
        try (Writer writer = Files.newBufferedWriter(CONFIG_PATH)) {
            GSON.toJson(armorData, writer);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save Cosmetic Package Faz-Fit ArmorData", e);
        }
    }

    public static ArmorData get() {
        if (armorData == null) load();
        return armorData;
    }
}