package net.hambodini.frostpunkmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.hambodini.frostpunkmod.FrostpunkMod;
import net.hambodini.frostpunkmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        FrostpunkMod.LOGGER.info("Registering Fuels for " + FrostpunkMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.HALF_COAL, 800);
        registry.add(ModItems.COW_CHIP, 400);
    }
}
