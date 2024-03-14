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
                    .icon(() -> new ItemStack(ModItems.ASH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ASH);
                        entries.add(ModBlocks.ASH_BLOCK);
                        entries.add(ModBlocks.ASHSTONE_BLOCK);
                        entries.add(ModBlocks.ASHSTONE_STAIRS);
                        entries.add(ModBlocks.ASHSTONE_SLAB);
                        entries.add(ModBlocks.ASHSTONE_WALL);
                        entries.add(ModBlocks.CUT_ASHSTONE_BLOCK);
                        entries.add(ModBlocks.CUT_ASHSTONE_SLAB);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_BLOCK);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_ASHSTONE_SLAB);
                        entries.add(ModBlocks.CHISELED_ASHSTONE_BLOCK);


                    }).build());
    public static void registerItemGroups() {
        MoreNetherBiomes.LOGGER.info("Registering Item Groups for " + MoreNetherBiomes.MOD_ID);
    }
}

