package com.marbledhubb.cosmetic_package.client.model.pizzaplex;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PizzaplexNightguardOutfitModel extends GeoModel<PizzaplexNightguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(PizzaplexNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PizzaplexNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/pizzaplex_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PizzaplexNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}

