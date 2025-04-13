package snowcraft.morenetherbiomes.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import net.minecraft.registry.Registry;
import snowcraft.morenetherbiomes.block.ModBlocks;
import snowcraft.morenetherbiomes.entity.ModEntities;

public class ModItems {

    public static final Item STANDING_ASHWOOD_SIGN = registerItem("ashwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_ASHWOOD_SIGN, ModBlocks.WALL_ASHWOOD_SIGN));
    public static final Item HANGING_ASHWOOD_SIGN = registerItem("ashwood_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_ASHWOOD_SIGN, ModBlocks.WALL_HANGING_ASHWOOD_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ASHWEED = Items.register(ModBlocks.ASHWEED);

    public static final Item ASH = registerItem("ash", new Item(new FabricItemSettings()));

    public static final Item ASHWALKER_SPAWN_EGG = registerItem("ashwalker_spawn_egg",
            new SpawnEggItem(ModEntities.ASHWALKER, 0xd6d5d4, 0x918180, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreNetherBiomes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreNetherBiomes.LOGGER.info("Registering Mod Items for " + MoreNetherBiomes.MOD_ID);
    }
}
