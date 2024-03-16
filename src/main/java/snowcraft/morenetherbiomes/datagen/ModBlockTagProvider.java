package snowcraft.morenetherbiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import snowcraft.morenetherbiomes.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider  {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(ModBlocks.ASHSTONE_BLOCK)
            .add(ModBlocks.CUT_ASHSTONE_BLOCK)
            .add(ModBlocks.SMOOTH_ASHSTONE_BLOCK)
            .add(ModBlocks.CHISELED_ASHSTONE_BLOCK)
            .add(ModBlocks.ASHSTONE_SLAB)
            .add(ModBlocks.ASHSTONE_STAIRS)
            .add(ModBlocks.ASHSTONE_WALL)
            .add(ModBlocks.SMOOTH_ASHSTONE_SLAB)
            .add(ModBlocks.SMOOTH_ASHSTONE_STAIRS)
            .add(ModBlocks.CUT_ASHSTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ASHWOOD_PLANKS)
                .add(ModBlocks.ASHWOOD_STAIRS)
                .add(ModBlocks.ASHWOOD_SLAB)
                .add(ModBlocks.ASHWOOD_BUTTON)
                .add(ModBlocks.ASHWOOD_PRESSURE_PLATE)
                .add(ModBlocks.ASHWOOD_FENCE)
                .add(ModBlocks.ASHWOOD_FENCE_GATE)
                .add(ModBlocks.ASHWOOD_DOOR)
                .add(ModBlocks.ASHWOOD_TRAPDOOR);

    getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlocks.ASH_BLOCK);

    getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
            .add(ModBlocks.ASHWOOD_FENCE);

    getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(ModBlocks.ASHWOOD_FENCE_GATE);

    getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.ASHSTONE_WALL);
    }
}
