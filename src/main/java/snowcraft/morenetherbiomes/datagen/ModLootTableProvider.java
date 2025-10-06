package snowcraft.morenetherbiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.LootNumberProviderType;
import snowcraft.morenetherbiomes.block.ModBlocks;
import snowcraft.morenetherbiomes.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ASH_BLOCK, (Block block) -> this.drops((Block)block, ModItems.ASH, ConstantLootNumberProvider.create(4.0f)));
        addDrop(ModBlocks.ASHSTONE_BLOCK);
        addDrop(ModBlocks.CUT_ASHSTONE_BLOCK);
        addDrop(ModBlocks.SMOOTH_ASHSTONE_BLOCK);
        addDrop(ModBlocks.CHISELED_ASHSTONE_BLOCK);

        addDrop(ModBlocks.ASHSTONE_SLAB, slabDrops(ModBlocks.ASHSTONE_SLAB));
        addDrop(ModBlocks.SMOOTH_ASHSTONE_SLAB, slabDrops(ModBlocks.SMOOTH_ASHSTONE_SLAB));
        addDrop(ModBlocks.CUT_ASHSTONE_SLAB, slabDrops(ModBlocks.CUT_ASHSTONE_SLAB));
        addDrop(ModBlocks.ASHSTONE_STAIRS);
        addDrop(ModBlocks.SMOOTH_ASHSTONE_STAIRS);
        addDrop(ModBlocks.ASHSTONE_WALL);

        addDrop(ModBlocks.ASH_CACTUS);
        addDrop(ModBlocks.ASH_CACTUS_STEM);
        addDrop(ModBlocks.ASH_CACTUS_HYPHAE);
        addDrop(ModBlocks.STRIPPED_ASH_CACTUS_STEM);
        addDrop(ModBlocks.STRIPPED_ASH_CACTUS_HYPHAE);

        addDrop(ModBlocks.ASHWOOD_PLANKS);
        addDrop(ModBlocks.ASHWOOD_STAIRS);
        addDrop(ModBlocks.ASHWOOD_BUTTON);
        addDrop(ModBlocks.ASHWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.ASHWOOD_FENCE);
        addDrop(ModBlocks.ASHWOOD_FENCE_GATE);
        addDrop(ModBlocks.ASHWOOD_TRAPDOOR);

        addDrop(ModBlocks.ASHWOOD_SLAB, slabDrops(ModBlocks.ASHWOOD_SLAB));
        addDrop(ModBlocks.ASHWOOD_DOOR, doorDrops(ModBlocks.ASHWOOD_DOOR));

        addDrop(ModBlocks.ASHWEED);
        addDrop(ModBlocks.ASH_THISTLE);
        addPottedPlantDrops(ModBlocks.POTTED_ASH_THISTLE);

    }
}
