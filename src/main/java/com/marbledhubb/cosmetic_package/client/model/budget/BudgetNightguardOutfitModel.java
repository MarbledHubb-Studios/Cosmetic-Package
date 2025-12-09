package com.marbledhubb.cosmetic_package.client.model.budget;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BudgetNightguardOutfitModel extends GeoModel<BudgetNightguardArmorItem> {

    @Override
    public ResourceLocation getModelResource(BudgetNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BudgetNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/budget_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BudgetNightguardArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}

