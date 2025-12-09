package com.marbledhubb.cosmetic_package.client.model.clean;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CleanNightguardOutfitModel extends GeoModel<CleanNightguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(CleanNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CleanNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/clean_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CleanNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}

