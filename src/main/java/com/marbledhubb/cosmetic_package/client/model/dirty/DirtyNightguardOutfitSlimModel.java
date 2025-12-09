package com.marbledhubb.cosmetic_package.client.model.dirty;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DirtyNightguardOutfitSlimModel extends GeoModel<DirtyNightguardArmorSlimItem> {

    @Override
    public ResourceLocation getModelResource(DirtyNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard_slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DirtyNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/dirty_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DirtyNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}
