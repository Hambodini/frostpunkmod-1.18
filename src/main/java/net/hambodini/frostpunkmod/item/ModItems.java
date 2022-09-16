package net.hambodini.frostpunkmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hambodini.frostpunkmod.FrostpunkMod;
import net.hambodini.frostpunkmod.item.custom.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {


    //misc items

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

    public static final Item MONSTER_MEAT_RAW = registerItem("monster_meat_raw",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MONSTER_MEAT_RAW)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.monster_meat_raw.tooltip"));
                }
            });

    public static final Item MONSTER_MEAT_COOKED = registerItem("monster_meat_cooked",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MONSTER_MEAT_COOKED)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.monster_meat_cooked.tooltip"));
                }
            });

    public static final Item MAN_MEAT_RAW = registerItem("man_meat_raw",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MAN_MEAT_RAW)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.man_meat_raw.tooltip"));
                }
            });

    public static final Item MAN_MEAT_COOKED = registerItem("man_meat_cooked",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MAN_MEAT_COOKED)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.man_meat_cooked.tooltip"));
                }
            });

    public static final Item MYSTERY_MEAT_RAW = registerItem("mystery_meat_raw",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MYSTERY_MEAT_RAW)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.mystery_meat_raw.tooltip"));
                }
            });

    public static final Item MYSTERY_MEAT_COOKED = registerItem("mystery_meat_cooked",
            new Item( new FabricItemSettings().group(ModItemGroup.FROSTPUNK).food(ModFoodComponents.MYSTERY_MEAT_COOKED)){
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.mystery_meat_cooked.tooltip"));
                }
            });

    //swords
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL,3,-2.4f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    //axe
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterials.STEEL,5,-3f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    //hoe
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterials.STEEL,-4,-2.4f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    //pickaxe
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.STEEL,1,-2.8f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    //shovel
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL,1.5f,-3f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));
    
    //armor
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_helmet.tooltip"));
                }
            });
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_chestplate.tooltip"));
                }
            });
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_leggings.tooltip"));
                }
            });
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_boots.tooltip"));
                }
            });

    public static final Item STEEL_FUR_HELMET = registerItem("steel_fur_helmet",
            new ArmorItem(ModArmorMaterials.STEEL_FUR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_fur_helmet.tooltip"));
                }
            });
    public static final Item STEEL_FUR_CHESTPLATE = registerItem("steel_fur_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL_FUR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_fur_chestplate.tooltip"));
                }
            });
    public static final Item STEEL_FUR_LEGGINGS = registerItem("steel_fur_leggings",
            new ArmorItem(ModArmorMaterials.STEEL_FUR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_fur_leggings.tooltip"));
                }
            });
    public static final Item STEEL_FUR_BOOTS = registerItem("steel_fur_boots",
            new ArmorItem(ModArmorMaterials.STEEL_FUR, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.steel_fur_boots.tooltip"));
                }
            });

    public static final Item FUR_HELMET = registerItem("fur_helmet",
            new ArmorItem(ModArmorMaterials.FUR, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.fur_helmet.tooltip"));
                }
            });
    public static final Item FUR_CHESTPLATE = registerItem("fur_chestplate",
            new ArmorItem(ModArmorMaterials.FUR, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.fur_chestplate.tooltip"));
                }
            });
    public static final Item FUR_LEGGINGS = registerItem("fur_leggings",
            new ArmorItem(ModArmorMaterials.FUR, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.fur_leggings.tooltip"));
                }
            });
    public static final Item FUR_BOOTS = registerItem("fur_boots",
            new ArmorItem(ModArmorMaterials.FUR, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.frostpunkmod.fur_boots.tooltip"));
                }
            });

    
    //custom sword
    public static final Item MEAT_CLEAVER = registerItem("meat_cleaver",
            new ModMeatSwordItem(ModToolMaterials.STEEL_WEAK,1,-2.4f,
                    new FabricItemSettings().group(ModItemGroup.FROSTPUNK)));

    //custom item
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
