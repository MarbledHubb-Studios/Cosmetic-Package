package com.marbledhubb.cosmetic_package.client.model.pizzaplex;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorSlimItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PizzaplexNightguardOutfitSlimModel extends GeoModel<PizzaplexNightguardArmorSlimItem> {

    @Override
    public ResourceLocation getModelResource(PizzaplexNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard_slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PizzaplexNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/pizzaplex_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PizzaplexNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}
