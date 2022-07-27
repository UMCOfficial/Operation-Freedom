
package com.theumcnetwork.operationfreedom.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

public class Drugz4AxeItem extends AxeItem {
	public Drugz4AxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4198;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 15;
			}

			public int getEnchantmentValue() {
				return 105;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OperationFreedomModItems.DRUGZ_4.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
