
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.avalimodjava.block.entity.Avalicorp13BlockEntity;
import net.mcreator.avalimodjava.block.entity.Avalicorp12BlockEntity;
import net.mcreator.avalimodjava.block.entity.Avalicorp11BlockEntity;
import net.mcreator.avalimodjava.block.entity.Avalicorp10BlockEntity;
import net.mcreator.avalimodjava.block.entity.AvaliChest0BlockEntity;
import net.mcreator.avalimodjava.block.entity.AeroponicsBlockEntity;
import net.mcreator.avalimodjava.AvaliModJavaMod;

public class AvaliModJavaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AvaliModJavaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> AVALI_CHEST_0 = register("avali_chest_0", AvaliModJavaModBlocks.AVALI_CHEST_0, AvaliChest0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AEROPONICS = register("aeroponics", AvaliModJavaModBlocks.AEROPONICS, AeroponicsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AVALICORP_10 = register("avalicorp_10", AvaliModJavaModBlocks.AVALICORP_10, Avalicorp10BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AVALICORP_11 = register("avalicorp_11", AvaliModJavaModBlocks.AVALICORP_11, Avalicorp11BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AVALICORP_12 = register("avalicorp_12", AvaliModJavaModBlocks.AVALICORP_12, Avalicorp12BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AVALICORP_13 = register("avalicorp_13", AvaliModJavaModBlocks.AVALICORP_13, Avalicorp13BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
