
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.avalimodjava.item.AvalitokenItem;
import net.mcreator.avalimodjava.item.AvalitacoItem;
import net.mcreator.avalimodjava.item.AvalinoodleItem;
import net.mcreator.avalimodjava.item.Avalinoodle2Item;
import net.mcreator.avalimodjava.item.AvalimeatItem;
import net.mcreator.avalimodjava.item.AvaligrapheneItem;
import net.mcreator.avalimodjava.item.AvaliflourItem;
import net.mcreator.avalimodjava.item.AvaliSwordItem;
import net.mcreator.avalimodjava.item.AerogelItem;
import net.mcreator.avalimodjava.AvaliModJavaMod;

public class AvaliModJavaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AvaliModJavaMod.MODID);
	public static final RegistryObject<Item> AVALINPC_0_SPAWN_EGG = REGISTRY.register("avalinpc_0_spawn_egg", () -> new ForgeSpawnEggItem(AvaliModJavaModEntities.AVALINPC_0, -26368, -256, new Item.Properties()));
	public static final RegistryObject<Item> AEROGEL = REGISTRY.register("aerogel", () -> new AerogelItem());
	public static final RegistryObject<Item> AVALIGRAPHENE = REGISTRY.register("avaligraphene", () -> new AvaligrapheneItem());
	public static final RegistryObject<Item> AVALITOKEN = REGISTRY.register("avalitoken", () -> new AvalitokenItem());
	public static final RegistryObject<Item> CAMPTAPESTRY_1 = block(AvaliModJavaModBlocks.CAMPTAPESTRY_1);
	public static final RegistryObject<Item> AVALI_SWORD = REGISTRY.register("avali_sword", () -> new AvaliSwordItem());
	public static final RegistryObject<Item> TEST = block(AvaliModJavaModBlocks.TEST);
	public static final RegistryObject<Item> AVALI_CHEST_0 = block(AvaliModJavaModBlocks.AVALI_CHEST_0);
	public static final RegistryObject<Item> AEROPONICS = block(AvaliModJavaModBlocks.AEROPONICS);
	public static final RegistryObject<Item> AEROPONICS_LR = block(AvaliModJavaModBlocks.AEROPONICS_LR);
	public static final RegistryObject<Item> AEROPONICS_SIDE = block(AvaliModJavaModBlocks.AEROPONICS_SIDE);
	public static final RegistryObject<Item> AVALI_GALSS = block(AvaliModJavaModBlocks.AVALI_GALSS);
	public static final RegistryObject<Item> SUCCULENTSNORMAL_1 = block(AvaliModJavaModBlocks.SUCCULENTSNORMAL_1);
	public static final RegistryObject<Item> SUCCULENTSNORMAL_2 = block(AvaliModJavaModBlocks.SUCCULENTSNORMAL_2);
	public static final RegistryObject<Item> SUCCULENTSNORMAL_3 = block(AvaliModJavaModBlocks.SUCCULENTSNORMAL_3);
	public static final RegistryObject<Item> AVALIFLOUR = REGISTRY.register("avaliflour", () -> new AvaliflourItem());
	public static final RegistryObject<Item> AVALIMEAT = REGISTRY.register("avalimeat", () -> new AvalimeatItem());
	public static final RegistryObject<Item> AVALINOODLE = REGISTRY.register("avalinoodle", () -> new AvalinoodleItem());
	public static final RegistryObject<Item> AVALINOODLE_2 = REGISTRY.register("avalinoodle_2", () -> new Avalinoodle2Item());
	public static final RegistryObject<Item> AVALITACO = REGISTRY.register("avalitaco", () -> new AvalitacoItem());
	public static final RegistryObject<Item> AVALICORP_10 = block(AvaliModJavaModBlocks.AVALICORP_10);
	public static final RegistryObject<Item> AVALICORP_11 = block(AvaliModJavaModBlocks.AVALICORP_11);
	public static final RegistryObject<Item> AVALICORP_12 = block(AvaliModJavaModBlocks.AVALICORP_12);
	public static final RegistryObject<Item> AVALICORP_13 = block(AvaliModJavaModBlocks.AVALICORP_13);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
