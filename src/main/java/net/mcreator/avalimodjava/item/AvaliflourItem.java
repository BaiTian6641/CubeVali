
package net.mcreator.avalimodjava.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AvaliflourItem extends Item {
	public AvaliflourItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
