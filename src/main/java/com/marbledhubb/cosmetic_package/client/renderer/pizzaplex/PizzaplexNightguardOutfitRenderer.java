package com.marbledhubb.cosmetic_package.client.renderer.pizzaplex;

import com.marbledhubb.cosmetic_package.client.model.dirty.DirtyNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.client.model.pizzaplex.PizzaplexNightguardOutfitModel;
import com.marbledhubb.cosmetic_package.init.armor.dirty.DirtyNightguardArmorItem;
import com.marbledhubb.cosmetic_package.init.armor.pizzaplex.PizzaplexNightguardArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public final class PizzaplexNightguardOutfitRenderer extends GeoArmorRenderer<PizzaplexNightguardArmorItem> {
    public PizzaplexNightguardOutfitRenderer() {
        super(new PizzaplexNightguardOutfitModel());
    }
}
