package com.marbledhubb.cosmetic_package.client.renderer.purple;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.client.model.purple.PurpleNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorSlimItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PurpleNightguardOutfitSlimRenderer extends GeoArmorRenderer<PurpleNightguardArmorSlimItem> {
    public PurpleNightguardOutfitSlimRenderer() {
        super(new PurpleNightguardOutfitSlimModel());
    }
}
