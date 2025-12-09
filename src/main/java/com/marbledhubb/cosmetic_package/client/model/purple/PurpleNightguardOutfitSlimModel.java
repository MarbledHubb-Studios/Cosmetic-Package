package com.marbledhubb.cosmetic_package.client.model.purple;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorSlimItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PurpleNightguardOutfitSlimModel extends GeoModel<PurpleNightguardArmorSlimItem> {

    @Override
    public ResourceLocation getModelResource(PurpleNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard_slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PurpleNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/purple_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PurpleNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}
