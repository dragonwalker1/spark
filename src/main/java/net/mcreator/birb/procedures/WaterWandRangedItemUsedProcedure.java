package net.mcreator.birb.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.birb.network.BirbModVariables;
import net.mcreator.birb.init.BirbModEntities;
import net.mcreator.birb.entity.WaterwandprojectileEntity;

public class WaterWandRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaBar > 10) {
			{
				double _setval = (entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BirbModVariables.PlayerVariables())).ManaBar - 25;
				entity.getCapability(BirbModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ManaBar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new WaterwandprojectileEntity(BirbModEntities.WATERWANDPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 10, 5, (byte) 2);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 2);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
