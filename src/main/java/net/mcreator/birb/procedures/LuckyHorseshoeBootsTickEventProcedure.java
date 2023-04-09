package net.mcreator.birb.procedures;

import net.minecraft.world.entity.Entity;

public class LuckyHorseshoeBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
