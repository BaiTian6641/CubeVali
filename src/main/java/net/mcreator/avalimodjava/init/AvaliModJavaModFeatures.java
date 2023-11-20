
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.avalimodjava.world.features.AvaliTribe0Feature;
import net.mcreator.avalimodjava.AvaliModJavaMod;

@Mod.EventBusSubscriber
public class AvaliModJavaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AvaliModJavaMod.MODID);
	public static final RegistryObject<Feature<?>> AVALI_TRIBE_0 = REGISTRY.register("avali_tribe_0", AvaliTribe0Feature::new);
}
