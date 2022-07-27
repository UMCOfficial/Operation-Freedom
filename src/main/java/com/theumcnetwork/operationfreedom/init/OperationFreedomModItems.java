
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.theumcnetwork.operationfreedom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.theumcnetwork.operationfreedom.item.Drugz4SwordItem;
import com.theumcnetwork.operationfreedom.item.Drugz4ShovelItem;
import com.theumcnetwork.operationfreedom.item.Drugz4PickaxeItem;
import com.theumcnetwork.operationfreedom.item.Drugz4Item;
import com.theumcnetwork.operationfreedom.item.Drugz4HoeItem;
import com.theumcnetwork.operationfreedom.item.Drugz4AxeItem;
import com.theumcnetwork.operationfreedom.item.Drugz4ArmorItem;
import com.theumcnetwork.operationfreedom.OperationFreedomMod;

public class OperationFreedomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OperationFreedomMod.MODID);
	public static final RegistryObject<Item> DRUGZ_4 = REGISTRY.register("drugz_4", () -> new Drugz4Item());
	public static final RegistryObject<Item> DRUGZ_4_ORE = block(OperationFreedomModBlocks.DRUGZ_4_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRUGZ_4_BLOCK = block(OperationFreedomModBlocks.DRUGZ_4_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> DRUGZ_4_PICKAXE = REGISTRY.register("drugz_4_pickaxe", () -> new Drugz4PickaxeItem());
	public static final RegistryObject<Item> DRUGZ_4_AXE = REGISTRY.register("drugz_4_axe", () -> new Drugz4AxeItem());
	public static final RegistryObject<Item> DRUGZ_4_SWORD = REGISTRY.register("drugz_4_sword", () -> new Drugz4SwordItem());
	public static final RegistryObject<Item> DRUGZ_4_SHOVEL = REGISTRY.register("drugz_4_shovel", () -> new Drugz4ShovelItem());
	public static final RegistryObject<Item> DRUGZ_4_HOE = REGISTRY.register("drugz_4_hoe", () -> new Drugz4HoeItem());
	public static final RegistryObject<Item> DRUGZ_4_ARMOR_HELMET = REGISTRY.register("drugz_4_armor_helmet", () -> new Drugz4ArmorItem.Helmet());
	public static final RegistryObject<Item> DRUGZ_4_ARMOR_CHESTPLATE = REGISTRY.register("drugz_4_armor_chestplate",
			() -> new Drugz4ArmorItem.Chestplate());
	public static final RegistryObject<Item> DRUGZ_4_ARMOR_LEGGINGS = REGISTRY.register("drugz_4_armor_leggings",
			() -> new Drugz4ArmorItem.Leggings());
	public static final RegistryObject<Item> DRUGZ_4_ARMOR_BOOTS = REGISTRY.register("drugz_4_armor_boots", () -> new Drugz4ArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
