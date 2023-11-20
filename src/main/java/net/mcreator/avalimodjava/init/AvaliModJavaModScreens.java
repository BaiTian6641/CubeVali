
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.avalimodjava.client.gui.TradeScreen;
import net.mcreator.avalimodjava.client.gui.AvaliChest0GUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaliModJavaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AvaliModJavaModMenus.TRADE.get(), TradeScreen::new);
			MenuScreens.register(AvaliModJavaModMenus.AVALI_CHEST_0_GUI.get(), AvaliChest0GUIScreen::new);
		});
	}
}
