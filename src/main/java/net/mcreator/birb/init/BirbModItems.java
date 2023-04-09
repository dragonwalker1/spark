
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.birb.item.WindElementItem;
import net.mcreator.birb.item.WaterElementItem;
import net.mcreator.birb.item.ManaIncreaserItem;
import net.mcreator.birb.item.HighJumpBootsItem;
import net.mcreator.birb.item.FireElementItem;
import net.mcreator.birb.item.EarthElementItem;
import net.mcreator.birb.BirbMod;

public class BirbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BirbMod.MODID);
	public static final RegistryObject<Item> FIRE_ELEMENT = REGISTRY.register("fire_element", () -> new FireElementItem());
	public static final RegistryObject<Item> WATER_ELEMENT = REGISTRY.register("water_element", () -> new WaterElementItem());
	public static final RegistryObject<Item> EARTH_ELEMENT = REGISTRY.register("earth_element", () -> new EarthElementItem());
	public static final RegistryObject<Item> WIND_ELEMENT = REGISTRY.register("wind_element", () -> new WindElementItem());
	public static final RegistryObject<Item> MANA_INCREASER = REGISTRY.register("mana_increaser", () -> new ManaIncreaserItem());
	public static final RegistryObject<Item> HIGH_JUMP_BOOTS_BOOTS = REGISTRY.register("high_jump_boots_boots", () -> new HighJumpBootsItem.Boots());
}
