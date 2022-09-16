package net.hambodini.frostpunkmod.item.custom;

import net.hambodini.frostpunkmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class ModMeatSwordItem extends SwordItem {
    public ModMeatSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(!Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip1"));
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip2"));
            tooltip.add(new TranslatableText("item.frostpunkmod.meat_cleaver.tooltip3"));
        }
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 2), attacker);
        double d = Math.random();

        //20% of the time you will get meat
        if (d < .20) {
            if(target instanceof HostileEntity) {
                target.dropItem(ModItems.MONSTER_MEAT_RAW);
            } else if (target instanceof VillagerEntity) {
                target.dropItem(ModItems.MAN_MEAT_RAW);
            } else if (target instanceof AnimalEntity) {
            }
        }

        return super.postHit(stack, target, attacker);
    }
}
