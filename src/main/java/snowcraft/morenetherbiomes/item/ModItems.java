package snowcraft.morenetherbiomes.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item ASH = registerItem( "ash", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ASH);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreNetherBiomes.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreNetherBiomes.LOGGER.info("Registering Mod Items for " + MoreNetherBiomes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
