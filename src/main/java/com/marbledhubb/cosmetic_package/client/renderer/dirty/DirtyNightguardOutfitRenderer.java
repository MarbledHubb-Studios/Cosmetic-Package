package com.marbledhubb.cosmetic_package.client.renderer.dirty;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class DirtyNightguardOutfitRenderer extends GeoArmorRenderer<DirtyNightguardArmorItem> {
    public DirtyNightguardOutfitRenderer() {
        super(new DirtyNightguardOutfitModel());
    }
}
