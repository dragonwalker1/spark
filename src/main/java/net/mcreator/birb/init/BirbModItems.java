
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.birb.item.WindElementItem;
import net.mcreator.birb.item.WaterwandprojectileItem;
import net.mcreator.birb.item.WaterWandItem;
import net.mcreator.birb.item.WaterElementItem;
import net.mcreator.birb.item.ManaCrystalItem;
import net.mcreator.birb.item.LuckyHorseshoeItem;
import net.mcreator.birb.item.FireElementItem;
import net.mcreator.birb.item.EarthWandItem;
import net.mcreator.birb.item.EarthItem;
import net.mcreator.birb.item.EarthElementItem;
import net.mcreator.birb.BirbMod;

public class BirbModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BirbMod.MODID);
	public static final RegistryObject<Item> FIRE_ELEMENT = REGISTRY.register("fire_element", () -> new FireElementItem());
	public static final RegistryObject<Item> WATER_ELEMENT = REGISTRY.register("water_element", () -> new WaterElementItem());
	public static final RegistryObject<Item> EARTH_ELEMENT = REGISTRY.register("earth_element", () -> new EarthElementItem());
	public static final RegistryObject<Item> WIND_ELEMENT = REGISTRY.register("wind_element", () -> new WindElementItem());
	public static final RegistryObject<Item> MANA_CRYSTAL = REGISTRY.register("mana_crystal", () -> new ManaCrystalItem());
	public static final RegistryObject<Item> WATER_WAND = REGISTRY.register("water_wand", () -> new WaterWandItem());
	public static final RegistryObject<Item> LUCKY_HORSESHOE_BOOTS = REGISTRY.register("lucky_horseshoe_boots", () -> new LuckyHorseshoeItem.Boots());
	public static final RegistryObject<Item> WATERWANDPROJECTILE = REGISTRY.register("waterwandprojectile", () -> new WaterwandprojectileItem());
	public static final RegistryObject<Item> EARTH = REGISTRY.register("earth", () -> new EarthItem());
	public static final RegistryObject<Item> EARTH_WAND = REGISTRY.register("earth_wand", () -> new EarthWandItem());
}
