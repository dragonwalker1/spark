package net.mcreator.birb.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class FireElementLivingEntityIsHitWithItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRIPPING_LAVA, x, y, z, 100, 3, 3, 3, 1);
		world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
	}
}
