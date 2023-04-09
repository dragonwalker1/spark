package net.mcreator.birb.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.birb.network.BirbModVariables;

public class ManavalueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format((entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaBar) + "";
	}
}
