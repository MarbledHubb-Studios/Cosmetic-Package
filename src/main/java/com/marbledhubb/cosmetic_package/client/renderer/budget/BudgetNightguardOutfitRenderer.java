package com.marbledhubb.cosmetic_package.client.renderer.budget;

import com.marbledhubb.cosmetic_package.client.model.budget.BudgetNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class BudgetNightguardOutfitRenderer extends GeoArmorRenderer<BudgetNightguardArmorItem> {
    public BudgetNightguardOutfitRenderer() {
        super(new BudgetNightguardOutfitModel());
    }
}
