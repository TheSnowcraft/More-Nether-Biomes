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
        BlockStateModelGenerator.BlockTexturePool ashwoodPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ASHWOOD_PLANKS);

        ashwoodPool.stairs(ModBlocks.ASHWOOD_STAIRS);
        ashwoodPool.slab(ModBlocks.ASHWOOD_SLAB);
        ashwoodPool.button(ModBlocks.ASHWOOD_BUTTON);
        ashwoodPool.pressurePlate(ModBlocks.ASHWOOD_PRESSURE_PLATE);
        ashwoodPool.fence(ModBlocks.ASHWOOD_FENCE);
        ashwoodPool.fenceGate(ModBlocks.ASHWOOD_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ASHWOOD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ASHWOOD_TRAPDOOR);

        blockStateModelGenerator.registerLog(ModBlocks.ASH_CACTUS_STEM).log(ModBlocks.ASH_CACTUS_STEM).wood(ModBlocks.ASH_CACTUS_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ASH_CACTUS_STEM).log(ModBlocks.STRIPPED_ASH_CACTUS_STEM).wood(ModBlocks.STRIPPED_ASH_CACTUS_HYPHAE);

        ashwoodPool.family(ModBlocks.ASHWOOD_FAMILY);

        blockStateModelGenerator.registerRoots (ModBlocks.ASH_THISTLE,ModBlocks.POTTED_ASH_THISTLE);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ASHWEED, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.HANGING_ASHWOOD_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASHWEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASH, Models.GENERATED);

        //itemModelGenerator.register(ModItems.ASHWOOD_BOAT, Models.GENERATED);
        //itemModelGenerator.register(ModItems.ASHWOOD_CHEST_BOAT, Models.GENERATED);
    }
}
