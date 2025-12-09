package com.marbledhubb.cosmetic_package.client.model.dirty;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DirtyNightguardOutfitModel extends GeoModel<DirtyNightguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(DirtyNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DirtyNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/dirty_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DirtyNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}

