package snowcraft.morenetherbiomes.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import snowcraft.morenetherbiomes.block.ModBlocks;
import snowcraft.morenetherbiomes.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool smoothashstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ASHSTONE_BLOCK);

        smoothashstonePool.stairs(ModBlocks.SMOOTH_ASHSTONE_STAIRS);
        smoothashstonePool.slab(ModBlocks.SMOOTH_ASHSTONE_SLAB);

        blockStateModelGenerator.registerDoor(ModBlocks.SMOOTH_ASHSTONE_STAIRS);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SMOOTH_ASHSTONE_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ASH, Models.GENERATED);
    }
}
