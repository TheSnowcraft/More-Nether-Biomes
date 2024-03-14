package snowcraft.morenetherbiomes.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;

public class ModBlocks {
    public static final Block ASHSTONE_BLOCK = registerBlock("ashstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CUT_ASHSTONE_BLOCK = registerBlock("cut_ashstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block SMOOTH_ASHSTONE_BLOCK = registerBlock("smooth_ashstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CHISELED_ASHSTONE_BLOCK = registerBlock("chiseled_ashstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final FallingBlock ASH_BLOCK = (FallingBlock) registerBlock("ash_block",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.LIGHT_GRAY)));

    public static final Block ASHSTONE_SLAB = registerBlock("ashstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block ASHSTONE_STAIRS = registerBlock("ashstone_stairs",
            new StairsBlock(ModBlocks.ASHSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block ASHSTONE_WALL = registerBlock("ashstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block SMOOTH_ASHSTONE_SLAB = registerBlock("smooth_ashstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block SMOOTH_ASHSTONE_STAIRS = registerBlock("smooth_ashstone_stairs",
            new StairsBlock(ModBlocks.SMOOTH_ASHSTONE_BLOCK.getDefaultState(),FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block CUT_ASHSTONE_SLAB = registerBlock("cut_ashstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.LIGHT_GRAY)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(MoreNetherBiomes.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MoreNetherBiomes.LOGGER.info("Registering Mod Blocks for " + MoreNetherBiomes.MOD_ID);
    }
}
