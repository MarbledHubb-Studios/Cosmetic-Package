package com.marbledhubb.cosmetic_package.client.renderer.clean;

import com.marbledhubb.cosmetic_package.client.model.clean.CleanNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.init.armor.clean.CleanNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class CleanNightguardOutfitSlimRenderer extends GeoArmorRenderer<CleanNightguardArmorSlimItem> {
    public CleanNightguardOutfitSlimRenderer() {
        super(new CleanNightguardOutfitSlimModel());
    }
}
