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
            .add(ModBlocks.CHISELED_ASHSTONE_BLOCK);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.ASH_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ASHSTONE_WALL);
    }
}
