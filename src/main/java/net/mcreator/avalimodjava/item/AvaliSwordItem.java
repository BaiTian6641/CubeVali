
package net.mcreator.avalimodjava.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.avalimodjava.init.AvaliModJavaModItems;

public class AvaliSwordItem extends SwordItem {
	public AvaliSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2048;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 22f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AvaliModJavaModItems.AEROGEL.get()));
			}
		}, 3, -2.55f, new Item.Properties().fireResistant());
	}
}
