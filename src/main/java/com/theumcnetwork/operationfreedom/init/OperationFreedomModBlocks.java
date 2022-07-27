
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.operationfreedom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.theumcnetwork.operationfreedom.block.Drugz4OreBlock;
import com.theumcnetwork.operationfreedom.block.Drugz4BlockBlock;
import com.theumcnetwork.operationfreedom.OperationFreedomMod;

public class OperationFreedomModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OperationFreedomMod.MODID);
	public static final RegistryObject<Block> DRUGZ_4_ORE = REGISTRY.register("drugz_4_ore", () -> new Drugz4OreBlock());
	public static final RegistryObject<Block> DRUGZ_4_BLOCK = REGISTRY.register("drugz_4_block", () -> new Drugz4BlockBlock());
}
