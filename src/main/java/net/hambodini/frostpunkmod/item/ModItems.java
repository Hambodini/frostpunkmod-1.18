package net.hambodini.frostpunkmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hambodini.frostpunkmod.FrostpunkMod;
import net.hambodini.frostpunkmod.item.custom.DowsingRodItem;
import net.hambodini.frostpunkmod.item.custom.MeatCleaverItem;
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

public class ModItems {


    //normal items

    public static final Item STEAM_CORE = registerItem("steam_core",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steam_core.tooltip"));
                }
            });

    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_ingot.tooltip"));
                }
            });

    public static final Item RIVET = registerItem("rivet",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.rivet.tooltip"));
                }
            });

    public static final Item SUPER_STEEL = registerItem("super_steel",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.super_steel.tooltip"));
                }
            });

    public static final Item ASH = registerItem("ash",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.ash.tooltip"));
                }
            });

    //fuels
    public static final Item COW_CHIP = registerItem("cow_chip",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.cow_chip.tooltip"));
                }
            });

    public static final Item HALF_COAL = registerItem("half_coal",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.half_coal.tooltip"));
                }
            });

    //foods
    public static final Item EMERGENCY_RATION = registerItem("emergency_ration",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.EMERGENCY_RATION)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.emergency_ration.tooltip"));
                }
            });

    //custom items
    public static final Item MEAT_CLEAVER = registerItem("meat_cleaver",
            new MeatCleaverItem( new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.FROSTPUNK).maxDamage(16)));

    //methods
    private static Item  registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FrostpunkMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FrostpunkMod.LOGGER.info("registering ModItems for " + FrostpunkMod.MOD_ID);
    }
}
