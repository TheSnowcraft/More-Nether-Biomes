package snowcraft.morenetherbiomes.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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

    public static final Block ASH_CACTUS_STEM = registerBlock("ash_cactus_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM)));
    public static final Block ASH_CACTUS_HYPHAE = registerBlock("ash_cactus_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE)));
    public static final Block STRIPPED_ASH_CACTUS_STEM = registerBlock("stripped_ash_cactus_stem",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final Block STRIPPED_ASH_CACTUS_HYPHAE = registerBlock("stripped_ash_cactus_hyphae",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE)));
    public static final Block ASHWOOD_PLANKS = registerBlock("ashwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block ASHWOOD_STAIRS = registerBlock("ashwood_stairs",
            new StairsBlock(ModBlocks.ASHWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block ASHWOOD_SLAB = registerBlock("ashwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block ASHWOOD_BUTTON = registerBlock("ashwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK), BlockSetType.CRIMSON, 10, true));
    public static final Block ASHWOOD_PRESSURE_PLATE = registerBlock("ashwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK), BlockSetType.CRIMSON));
    public static final Block ASHWOOD_FENCE = registerBlock("ashwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block ASHWOOD_FENCE_GATE = registerBlock("ashwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK), WoodType.CRIMSON));
    public static final Block ASHWOOD_DOOR = registerBlock("ashwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK), BlockSetType.CRIMSON));
    public static final Block ASHWOOD_TRAPDOOR = registerBlock("ashwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.TERRACOTTA_BLACK).nonOpaque(), BlockSetType.CRIMSON));

    public static final Identifier ASHWOOD_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "entity/signs/ashwood");
    public static final Identifier ASHWOOD_HANGING_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "entity/signs/hanging/ashwood");
    public static final Identifier ASHWOOD_HANGING_GUI_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "textures/gui/hanging_signs/ashwood");

    public static final Block STANDING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_standing_sign"),
            new TerraformSignBlock(ASHWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_SIGN).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block WALL_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_wall_sign"),
            new TerraformWallSignBlock(ASHWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_WALL_SIGN).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block HANGING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_hanging_sign"),
            new TerraformHangingSignBlock(ASHWOOD_HANGING_SIGN_TEXTURE, ASHWOOD_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block WALL_HANGING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(ASHWOOD_HANGING_SIGN_TEXTURE, ASHWOOD_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.CRIMSON_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_BLACK)));

    public static final Block ASHWEED = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID,"ashweed"),
            new AshPlantBlock(FabricBlockSettings.copyOf(Blocks.NETHER_SPROUTS).nonOpaque().mapColor(MapColor.GRAY)));

    public static final Block ASH_THISTLE = registerBlock("ash_thistle",
            new AshPlantBlock(FabricBlockSettings.copyOf(Blocks.WARPED_ROOTS).nonOpaque().mapColor(MapColor.GRAY)));
    public static final Block ASH_BERRY_BUSH = registerBlock("ash_berry_bush",
            new AshBerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH).nonOpaque().mapColor(MapColor.GRAY)));

    public static final Block POTTED_ASH_THISTLE = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "potted_ash_thistle"),
            new FlowerPotBlock(ASH_THISTLE, FabricBlockSettings.copyOf(Blocks.POTTED_WARPED_ROOTS).nonOpaque().mapColor(MapColor.GRAY)));
    public static final BlockFamily ASHWOOD_FAMILY = BlockFamilies.register(ModBlocks.ASHWOOD_PLANKS)
            .sign(ModBlocks.STANDING_ASHWOOD_SIGN, ModBlocks.WALL_ASHWOOD_SIGN) 
            .group("wooden").unlockCriterionName("has_planks").build();


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
