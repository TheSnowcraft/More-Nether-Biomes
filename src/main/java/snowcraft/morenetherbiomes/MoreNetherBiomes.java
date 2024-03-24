package snowcraft.morenetherbiomes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import snowcraft.morenetherbiomes.block.ModBlocks;
import snowcraft.morenetherbiomes.item.ModItems;
import snowcraft.morenetherbiomes.item.ModItemGroups;

public class MoreNetherBiomes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "morenetherbiomes";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.ASH_CACTUS_STEM, ModBlocks.STRIPPED_ASH_CACTUS_STEM);
		StrippableBlockRegistry.register(ModBlocks.ASH_CACTUS_HYPHAE, ModBlocks.STRIPPED_ASH_CACTUS_HYPHAE);
	}
}