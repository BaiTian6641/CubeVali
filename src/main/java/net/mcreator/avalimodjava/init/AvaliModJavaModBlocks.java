
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.avalimodjava.block.TestBlock;
import net.mcreator.avalimodjava.block.Succulentsnormal3Block;
import net.mcreator.avalimodjava.block.Succulentsnormal2Block;
import net.mcreator.avalimodjava.block.Succulentsnormal1Block;
import net.mcreator.avalimodjava.block.Camptapestry1Block;
import net.mcreator.avalimodjava.block.Avalicorp13Block;
import net.mcreator.avalimodjava.block.Avalicorp12Block;
import net.mcreator.avalimodjava.block.Avalicorp11Block;
import net.mcreator.avalimodjava.block.Avalicorp10Block;
import net.mcreator.avalimodjava.block.AvaliGalssBlock;
import net.mcreator.avalimodjava.block.AvaliChest0Block;
import net.mcreator.avalimodjava.block.AeroponicsSideBlock;
import net.mcreator.avalimodjava.block.AeroponicsLRBlock;
import net.mcreator.avalimodjava.block.AeroponicsBlock;
import net.mcreator.avalimodjava.AvaliModJavaMod;

public class AvaliModJavaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AvaliModJavaMod.MODID);
	public static final RegistryObject<Block> CAMPTAPESTRY_1 = REGISTRY.register("camptapestry_1", () -> new Camptapestry1Block());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> AVALI_CHEST_0 = REGISTRY.register("avali_chest_0", () -> new AvaliChest0Block());
	public static final RegistryObject<Block> AEROPONICS = REGISTRY.register("aeroponics", () -> new AeroponicsBlock());
	public static final RegistryObject<Block> AEROPONICS_LR = REGISTRY.register("aeroponics_lr", () -> new AeroponicsLRBlock());
	public static final RegistryObject<Block> AEROPONICS_SIDE = REGISTRY.register("aeroponics_side", () -> new AeroponicsSideBlock());
	public static final RegistryObject<Block> AVALI_GALSS = REGISTRY.register("avali_galss", () -> new AvaliGalssBlock());
	public static final RegistryObject<Block> SUCCULENTSNORMAL_1 = REGISTRY.register("succulentsnormal_1", () -> new Succulentsnormal1Block());
	public static final RegistryObject<Block> SUCCULENTSNORMAL_2 = REGISTRY.register("succulentsnormal_2", () -> new Succulentsnormal2Block());
	public static final RegistryObject<Block> SUCCULENTSNORMAL_3 = REGISTRY.register("succulentsnormal_3", () -> new Succulentsnormal3Block());
	public static final RegistryObject<Block> AVALICORP_10 = REGISTRY.register("avalicorp_10", () -> new Avalicorp10Block());
	public static final RegistryObject<Block> AVALICORP_11 = REGISTRY.register("avalicorp_11", () -> new Avalicorp11Block());
	public static final RegistryObject<Block> AVALICORP_12 = REGISTRY.register("avalicorp_12", () -> new Avalicorp12Block());
	public static final RegistryObject<Block> AVALICORP_13 = REGISTRY.register("avalicorp_13", () -> new Avalicorp13Block());
}
