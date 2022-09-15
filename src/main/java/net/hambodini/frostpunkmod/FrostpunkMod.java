package net.hambodini.frostpunkmod;

import net.fabricmc.api.ModInitializer;
import net.hambodini.frostpunkmod.block.ModBlocks;
import net.hambodini.frostpunkmod.item.ModItems;
import net.hambodini.frostpunkmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrostpunkMod implements ModInitializer {
	public static final String MOD_ID = "frostpunkmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();
	}
}
