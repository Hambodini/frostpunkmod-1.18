package net.hambodini.frostpunkmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MeatCleaverItem extends Item {
    public MeatCleaverItem(Settings settings) {
        super(settings);
    }



    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip.shift1"));
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip.shift2"));
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip.shift3"));
        } else {
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip"));
        }
    }
}