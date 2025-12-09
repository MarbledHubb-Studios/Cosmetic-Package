package com.marbledhubb.cosmetic_package.client.renderer.budget;

import com.marbledhubb.cosmetic_package.client.model.budget.BudgetNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.client.model.budget.BudgetNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.init.armor.budget.BudgetNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class BudgetNightguardOutfitSlimRenderer extends GeoArmorRenderer<BudgetNightguardArmorSlimItem> {
    public BudgetNightguardOutfitSlimRenderer() {
        super(new BudgetNightguardOutfitSlimModel());
    }
}
