package com.github.mystery2099.colorful_diamonds_mod.forge;

import dev.architectury.platform.forge.EventBuses;
import com.github.mystery2099.colorful_diamonds_mod.ColorfulDiamondsMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ColorfulDiamondsMod.MOD_ID)
public class ColorfulDiamondsModForge {
    public ColorfulDiamondsModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ColorfulDiamondsMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ColorfulDiamondsMod.init();
    }
}