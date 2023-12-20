package com.github.mystery2099.colorfuldiamondsmod;

import com.github.mystery2099.colorfuldiamondsmod.item.ModItems;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ColorfulDiamondsMod.MOD_ID, Registry.BLOCK_KEY);

    public static final List<RegistrySupplier<Block>> DIAMOND_BLOCKS = new ArrayList<>();
    static {
        for (var color : DyeColor.values()) {
            DIAMOND_BLOCKS.add(register(color));
        }
    }

    private static RegistrySupplier<Block> register(DyeColor color) {
        var location = new Identifier(ColorfulDiamondsMod.MOD_ID, color.toString().toLowerCase() + "_diamond_block");
        var block = BLOCKS.register(location, () -> new Block(AbstractBlock.Settings.of(Material.METAL, color).requiresTool()));
        ModItems.ITEMS.register(location, () -> new BlockItem(block.get(), new Item.Settings().group(ColorfulDiamondsMod.DEFAULT_ITEM_GROUP)));
        return block;
    }
}
