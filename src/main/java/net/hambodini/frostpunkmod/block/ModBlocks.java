package net.hambodini.frostpunkmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hambodini.frostpunkmod.FrostpunkMod;
import net.hambodini.frostpunkmod.block.custom.*;
import net.hambodini.frostpunkmod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {
    //normal blocks
    public static final Block RIVETED_STEEL = registerBlock("riveted_steel",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    public static final Block GRATED_STEEL = registerBlock("grated_steel",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    //generators
    public static final Block STEEL_GENERATOR = registerBlock("steel_generator",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    public static final Block DIAMOND_GENERATOR = registerBlock("diamond_generator",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    public static final Block SUPER_GENERATOR = registerBlock("super_generator",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.FROSTPUNK);

    //buttons
    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool().noCollision()), ModItemGroup.FROSTPUNK);

    //pressure plate
    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //fences
    public static final Block STEEL_FENCE = registerBlock("steel_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //fence gates
    public static final Block STEEL_FENCE_GATE = registerBlock("steel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //walls
    public static final Block STEEL_WALL = registerBlock("steel_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //slabs
    public static final Block STEEL_SLAB = registerBlock("steel_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //stairs
    public static final Block STEEL_STAIRS = registerBlock("steel_stairs",
            new ModStairsBlock(ModBlocks.RIVETED_STEEL.getDefaultState(),
                    FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.FROSTPUNK);

    //doors
    public static final Block STEEL_DOOR = registerBlock("steel_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.FROSTPUNK);

    public static final Block REINFORCED_STEEL_DOOR = registerBlock("reinforced_steel_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.FROSTPUNK);

    //trapdoors
    public static final Block STEEL_TRAPDOOR = registerBlock("steel_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.FROSTPUNK);

    public static final Block REINFORCED_STEEL_TRAPDOOR = registerBlock("reinforced_steel_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.FROSTPUNK);

    //methods
    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(FrostpunkMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(FrostpunkMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FrostpunkMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FrostpunkMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FrostpunkMod.LOGGER.info("registering ModBlocks for " + FrostpunkMod.MOD_ID);
    }

}
