package net.mcreator.birb.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.birb.network.BirbModVariables;

public class ManaBarProc5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaBar >= 50) {
			return true;
		}
		return false;
	}
}