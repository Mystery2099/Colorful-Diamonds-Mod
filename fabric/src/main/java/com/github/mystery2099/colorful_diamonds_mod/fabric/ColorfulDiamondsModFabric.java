package com.github.mystery2099.colorful_diamonds_mod.fabric;

import com.github.mystery2099.colorful_diamonds_mod.ColorfulDiamondsMod;
import net.fabricmc.api.ModInitializer;

public class ColorfulDiamondsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ColorfulDiamondsMod.init();
    }
}