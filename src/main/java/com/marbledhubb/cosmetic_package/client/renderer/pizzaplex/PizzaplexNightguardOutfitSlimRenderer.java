package com.marbledhubb.cosmetic_package.client.renderer.pizzaplex;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.client.model.pizzaplex.PizzaplexNightguardOutfitSlimModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorSlimItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorSlimItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PizzaplexNightguardOutfitSlimRenderer extends GeoArmorRenderer<PizzaplexNightguardArmorSlimItem> {
    public PizzaplexNightguardOutfitSlimRenderer() {
        super(new PizzaplexNightguardOutfitSlimModel());
    }
}
