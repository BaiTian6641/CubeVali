
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.avalimodjava.AvaliModJavaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaliModJavaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AvaliModJavaMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AvaliModJavaModBlocks.CAMPTAPESTRY_1.get().asItem());
			tabData.accept(AvaliModJavaModBlocks.AVALI_GALSS.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(AvaliModJavaModBlocks.AVALI_CHEST_0.get().asItem());
			tabData.accept(AvaliModJavaModBlocks.AEROPONICS.get().asItem());
			tabData.accept(AvaliModJavaModBlocks.AEROPONICS_LR.get().asItem());
			tabData.accept(AvaliModJavaModBlocks.AEROPONICS_SIDE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AvaliModJavaModItems.AVALI_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AvaliModJavaModItems.AVALINPC_0_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AvaliModJavaModItems.AEROGEL.get());
			tabData.accept(AvaliModJavaModItems.AVALIGRAPHENE.get());
			tabData.accept(AvaliModJavaModItems.AVALITOKEN.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(AvaliModJavaModBlocks.TEST.get().asItem());
			tabData.accept(AvaliModJavaModBlocks.SUCCULENTSNORMAL_1.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AvaliModJavaModItems.AVALIFLOUR.get());
			tabData.accept(AvaliModJavaModItems.AVALIMEAT.get());
			tabData.accept(AvaliModJavaModItems.AVALINOODLE.get());
			tabData.accept(AvaliModJavaModItems.AVALINOODLE_2.get());
			tabData.accept(AvaliModJavaModItems.AVALITACO.get());
			tabData.accept(AvaliModJavaModBlocks.AVALICORP_10.get().asItem());
		}
	}
}
