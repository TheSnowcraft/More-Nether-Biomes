package snowcraft.morenetherbiomes.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
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

    public static final Block ASHWOOD_PLANKS = registerBlock("ashwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block ASHWOOD_STAIRS = registerBlock("ashwood_stairs",
            new StairsBlock(ModBlocks.ASHWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block ASHWOOD_SLAB = registerBlock("ashwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block ASHWOOD_BUTTON = registerBlock("ashwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS), BlockSetType.CRIMSON, 10, true));
    public static final Block ASHWOOD_PRESSURE_PLATE = registerBlock("ashwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS), BlockSetType.CRIMSON));
    public static final Block ASHWOOD_FENCE = registerBlock("ashwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block ASHWOOD_FENCE_GATE = registerBlock("ashwood_fencegate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS), WoodType.CRIMSON));
    public static final Block ASHWOOD_DOOR = registerBlock("ashwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS), BlockSetType.CRIMSON));
    public static final Block ASHWOOD_TRAPDOOR = registerBlock("ashwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).nonOpaque(), BlockSetType.CRIMSON));

    public static final Identifier ASHWOOD_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "entity/signs/ashwood");
    public static final Identifier ASHWOOD_HANGING_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "entity/signs/hanging/ashwood");
    public static final Identifier ASHWOOD_HANGING_GUI_SIGN_TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "textures/gui/hanging_signs/ashwood");

    public static final Block STANDING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_standing_sign"),
            new TerraformSignBlock(ASHWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_wall_sign"),
            new TerraformWallSignBlock(ASHWOOD_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_hanging_sign"),
            new TerraformHangingSignBlock(ASHWOOD_HANGING_SIGN_TEXTURE, ASHWOOD_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_ASHWOOD_SIGN = Registry.register(Registries.BLOCK, new Identifier(MoreNetherBiomes.MOD_ID, "ashwood_wall_hanging_sign"),
            new TerraformHangingSignBlock(ASHWOOD_HANGING_SIGN_TEXTURE, ASHWOOD_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

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
