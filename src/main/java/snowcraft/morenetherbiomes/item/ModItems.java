package snowcraft.morenetherbiomes.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import snowcraft.morenetherbiomes.block.ModBlocks;

public class ModItems {

    public static final Item STANDING_ASHWOOD_SIGN = registerItem("ashwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_ASHWOOD_SIGN, ModBlocks.WALL_ASHWOOD_SIGN));
    public static final Item HANGING_ASHWOOD_SIGN = registerItem("ashwood_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_ASHWOOD_SIGN, ModBlocks.WALL_HANGING_ASHWOOD_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item EXAMPLE = registerItem( "example", new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreNetherBiomes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreNetherBiomes.LOGGER.info("Registering Mod Items for " + MoreNetherBiomes.MOD_ID);
    }
}
