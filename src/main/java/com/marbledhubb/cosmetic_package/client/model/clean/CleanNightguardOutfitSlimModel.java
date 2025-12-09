package com.marbledhubb.cosmetic_package.client.model.clean;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CleanNightguardOutfitSlimModel extends GeoModel<CleanNightguardArmorSlimItem> {

    @Override
    public ResourceLocation getModelResource(CleanNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard_slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CleanNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/clean_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CleanNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}
