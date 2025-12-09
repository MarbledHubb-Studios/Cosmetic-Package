package com.marbledhubb.cosmetic_package.client.model.purple;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PurpleNightguardOutfitModel extends GeoModel<PurpleNightguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(PurpleNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PurpleNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/purple_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PurpleNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}

