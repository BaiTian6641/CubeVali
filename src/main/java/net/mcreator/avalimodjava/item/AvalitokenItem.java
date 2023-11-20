
package net.mcreator.avalimodjava.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AvalitokenItem extends Item {
	public AvalitokenItem() {
		super(new Item.Properties().durability(16).fireResistant().rarity(Rarity.COMMON));
	}
}
