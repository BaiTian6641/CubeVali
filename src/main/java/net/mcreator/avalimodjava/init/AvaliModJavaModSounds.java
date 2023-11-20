
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.avalimodjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.avalimodjava.AvaliModJavaMod;

public class AvaliModJavaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AvaliModJavaMod.MODID);
	public static final RegistryObject<SoundEvent> AVALI_HURT = REGISTRY.register("avali_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("avali_mod_java", "avali_hurt")));
	public static final RegistryObject<SoundEvent> CHESTOPEN0 = REGISTRY.register("chestopen0", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("avali_mod_java", "chestopen0")));
	public static final RegistryObject<SoundEvent> CHESTCLOSE = REGISTRY.register("chestclose", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("avali_mod_java", "chestclose")));
}
