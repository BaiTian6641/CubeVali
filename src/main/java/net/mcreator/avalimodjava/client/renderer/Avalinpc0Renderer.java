
package net.mcreator.avalimodjava.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.avalimodjava.entity.Avalinpc0Entity;
import net.mcreator.avalimodjava.client.model.Modelcynavali;

public class Avalinpc0Renderer extends MobRenderer<Avalinpc0Entity, Modelcynavali<Avalinpc0Entity>> {
	public Avalinpc0Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcynavali(context.bakeLayer(Modelcynavali.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Avalinpc0Entity entity) {
		return new ResourceLocation("avali_mod_java:textures/entities/avali-skin512512.png");
	}
}
