
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.birb.entity.WaterwandprojectileEntity;
import net.mcreator.birb.entity.EarthEntity;
import net.mcreator.birb.BirbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BirbModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BirbMod.MODID);
	public static final RegistryObject<EntityType<WaterwandprojectileEntity>> WATERWANDPROJECTILE = register("projectile_waterwandprojectile", EntityType.Builder.<WaterwandprojectileEntity>of(WaterwandprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(WaterwandprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthEntity>> EARTH = register("projectile_earth",
			EntityType.Builder.<EarthEntity>of(EarthEntity::new, MobCategory.MISC).setCustomClientFactory(EarthEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
