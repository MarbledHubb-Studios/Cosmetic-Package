package com.marbledhubb.cosmetic_package.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

@SuppressWarnings("deprecation")
public class ItemUtils {

    public static Item fromRegistryName(String registryName) {
        if (registryName == null) {
            return Items.AIR;
        }
        ResourceLocation id = ResourceLocation.parse(registryName);

        return BuiltInRegistries.ITEM.get(id);
    }

}
