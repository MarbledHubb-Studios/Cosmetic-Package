package com.marbledhubb.cosmetic_package.client.renderer.purple;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.client.model.purple.PurpleNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.purple.PurpleNightguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PurpleNightguardOutfitRenderer extends GeoArmorRenderer<PurpleNightguardArmorItem> {
    public PurpleNightguardOutfitRenderer() {
        super(new PurpleNightguardOutfitModel());
    }
}
