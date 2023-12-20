package com.github.mystery2099.colorfuldiamondsmod.quilt;

import com.github.mystery2099.colorfuldiamondsmod.ColorfulDiamondsMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ColorfulDiamondsModQuilt implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        ColorfulDiamondsMod.init();
    }
}
