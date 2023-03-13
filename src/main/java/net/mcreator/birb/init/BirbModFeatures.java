
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.birb.world.features.ores.CrystalizedStoneFeature;
import net.mcreator.birb.BirbMod;

@Mod.EventBusSubscriber
public class BirbModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BirbMod.MODID);
	public static final RegistryObject<Feature<?>> CRYSTALIZED_STONE = REGISTRY.register("crystalized_stone", CrystalizedStoneFeature::feature);
}
