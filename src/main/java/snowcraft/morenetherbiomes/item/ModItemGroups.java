package snowcraft.morenetherbiomes.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import snowcraft.morenetherbiomes.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup MNB_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MoreNetherBiomes.MOD_ID, "morenetherbiomesgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.morenetherbiomesgroup"))
                    .icon(() -> new ItemStack(ModBlocks.ASH_BLOCK)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ASH);
                        entries.add(ModBlocks.ASH_CACTUS_STEM);
                        entries.add(ModBlocks.ASH_CACTUS_HYPHAE);
                        entries.add(ModBlocks.STRIPPED_ASH_CACTUS_STEM);
                        entries.add(ModBlocks.STRIPPED_ASH_CACTUS_HYPHAE);
                        entries.add(ModBlocks.ASHWOOD_PLANKS);
                        entries.add(ModBlocks.ASHWOOD_STAIRS);
                        entries.add(ModBlocks.ASHWOOD_SLAB);
                        entries.add(ModBlocks.ASHWOOD_FENCE);
                        entries.add(ModBlocks.ASHWOOD_FENCE_GATE);
                        entries.add(ModBlocks.ASHWOOD_DOOR);
                        entries.add(ModBlocks.ASHWOOD_TRAPDOOR);
                        entries.add(ModBlocks.ASHWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.ASHWOOD_BUTTON);
                        entries.add(ModBlocks.STANDING_ASHWOOD_SIGN);
                        entries.add(ModBlocks.HANGING_ASHWOOD_SIGN);

                        entries.add(ModBlocks.ASH_BLOCK);
                        entries.add(ModBlocks.ASHSTONE_BLOCK);
                        entries.add(ModBlocks.ASHSTONE_STAIRS);
                        entries.add(ModBlocks.ASHSTONE_SLAB);
                        entries.add(ModBlocks.ASHSTONE_WALL);
                        entries.add(ModBlocks.CHISELED_ASHSTONE_BLOCK);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_BLOCK);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_SLAB);
                        entries.add(ModBlocks.CUT_ASHSTONE_BLOCK);
                        entries.add(ModBlocks.CUT_ASHSTONE_SLAB);

                        entries.add(ModBlocks.ASHWEED);
                        entries.add(ModBlocks.ASH_THISTLE);
                        entries.add(ModItems.ASHWALKER_SPAWN_EGG);

                    }).build());
    public static void registerItemGroups() {
        MoreNetherBiomes.LOGGER.info("Registering Item Groups for " + MoreNetherBiomes.MOD_ID);
    }
}

