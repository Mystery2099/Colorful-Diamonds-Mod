package com.github.mystery2099.colorfuldiamondsmod;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static net.minecraft.core.Registry.BLOCK_REGISTRY;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, BLOCK_REGISTRY);
    public static final RegistrySupplier<Block> WHITE_DIAMOND_BLOCK = register("white_diamond_block", new Block(BlockBehaviour.Properties.of(Material.METAL, DyeColor.WHITE)));

    private static RegistrySupplier<Block> register(String id, Block block) {
        var location = new ResourceLocation(ColorfulDiamondsMod.MOD_ID, id);
        Items.ITEMS.register(location, () -> new BlockItem(block, new Item.Properties().tab(ColorfulDiamondsMod.BLOCK_TAB)));
        return BLOCKS.register(location, () -> block);
    }
}
