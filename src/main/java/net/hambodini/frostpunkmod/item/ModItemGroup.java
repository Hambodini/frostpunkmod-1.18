package net.hambodini.frostpunkmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hambodini.frostpunkmod.FrostpunkMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FROSTPUNK = FabricItemGroupBuilder.build(new Identifier(FrostpunkMod.MOD_ID, "frostpunk"),
            () -> new ItemStack(ModItems.STEAM_CORE));
}
