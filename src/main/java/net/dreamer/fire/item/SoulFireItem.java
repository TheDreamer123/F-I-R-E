package net.dreamer.fire.item;

import net.dreamer.fire.Damage;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SoulFireItem extends BlockItem {

    public SoulFireItem(Block block,Settings settings) {
        super(block,settings);
    }

    public ItemStack finishUsing(ItemStack stack,World world,LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack,world,user);
        if (!user.isFireImmune()) {
            user.damage(Damage.EAT_FIRE,10.0F);
        }
        return itemStack;
    }
}
