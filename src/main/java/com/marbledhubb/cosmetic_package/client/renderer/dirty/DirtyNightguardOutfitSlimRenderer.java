package com.marbledhubb.cosmetic_package.client.renderer.dirty;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class DirtyNightguardOutfitSlimRenderer extends GeoArmorRenderer<DirtyNightguardArmorSlimItem> {
    public DirtyNightguardOutfitSlimRenderer() {
        super(new DirtyNightguardOutfitSlimModel());
    }
}
