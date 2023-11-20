
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.avalimodjava.world.inventory.TradeMenu;
import net.mcreator.avalimodjava.world.inventory.AvaliChest0GUIMenu;
import net.mcreator.avalimodjava.AvaliModJavaMod;

public class AvaliModJavaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AvaliModJavaMod.MODID);
	public static final RegistryObject<MenuType<TradeMenu>> TRADE = REGISTRY.register("trade", () -> IForgeMenuType.create(TradeMenu::new));
	public static final RegistryObject<MenuType<AvaliChest0GUIMenu>> AVALI_CHEST_0_GUI = REGISTRY.register("avali_chest_0_gui", () -> IForgeMenuType.create(AvaliChest0GUIMenu::new));
}
