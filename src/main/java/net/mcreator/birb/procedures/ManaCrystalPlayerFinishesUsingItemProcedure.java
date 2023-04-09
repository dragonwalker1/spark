package net.mcreator.birb.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.birb.network.BirbModVariables;

public class ManaCrystalPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaBar + 30;
			entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ManaBar = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaMultiplier + 1;
			entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ManaMultiplier = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
