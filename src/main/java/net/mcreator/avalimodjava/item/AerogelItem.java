
package net.mcreator.avalimodjava.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AerogelItem extends Item {
	public AerogelItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
