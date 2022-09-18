package net.hambodini.frostpunkmod.world.feature;

import net.hambodini.frostpunkmod.FrostpunkMod;
import net.hambodini.frostpunkmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {


    public static final List<OreFeatureConfig.Target> OVERWORLD_SULFUR_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SULFUR_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SULFUR_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OVERWORLD_POTASSIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.POTASSIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_POTASSIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SULFUR_ORE =
            ConfiguredFeatures.register("sulfur_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SULFUR_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> POTASSIUM_ORE =
            ConfiguredFeatures.register("potassium_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_POTASSIUM_ORES, 9));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + FrostpunkMod.MOD_ID);
    }
}
