package com.github.mystery2099.colorful_diamonds_mod.quilt;

import com.github.mystery2099.colorful_diamonds_mod.ColorfulDiamondsMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ColorfulDiamondsModQuilt implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        ColorfulDiamondsMod.init();
    }
}
