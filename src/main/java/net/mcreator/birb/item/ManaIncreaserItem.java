
package net.mcreator.birb.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.birb.procedures.ManaIncreaserRightclickedProcedure;

public class ManaIncreaserItem extends Item {
	public ManaIncreaserItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(1000).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ManaIncreaserRightclickedProcedure.execute(entity, itemstack);
		return ar;
	}
}
