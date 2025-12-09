package com.marbledhubb.cosmetic_package.client.model.budget;

import com.marbledhubb.cosmetic_package.CosmeticPackage;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BudgetNightguardOutfitSlimModel extends GeoModel<BudgetNightguardArmorSlimItem> {

    @Override
    public ResourceLocation getModelResource(BudgetNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "geo/nightguard_slim.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BudgetNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "textures/armor/budget_nightguard_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BudgetNightguardArmorSlimItem animatable) {
        return ResourceLocation.fromNamespaceAndPath(CosmeticPackage.MODID, "animations/nightguard.animation.json");
    }
}
