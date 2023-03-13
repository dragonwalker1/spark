
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.birb.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.birb.block.CrystalizedStoneBlock;
import net.mcreator.birb.BirbMod;

public class BirbModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BirbMod.MODID);
	public static final RegistryObject<Block> CRYSTALIZED_STONE = REGISTRY.register("crystalized_stone", () -> new CrystalizedStoneBlock());
}
