package com.marbledhubb.cosmetic_package.client.renderer.clean;

import com.marbledhubb.cosmetic_package.client.model.clean.CleanNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class CleanNightguardOutfitRenderer extends GeoArmorRenderer<CleanNightguardArmorItem> {
    public CleanNightguardOutfitRenderer() {
        super(new CleanNightguardOutfitModel());
    }
}
