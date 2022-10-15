
package net.mcreator.thevoid.client.renderer;

public class ShadowKnightRenderer extends MobRenderer<ShadowKnightEntity, ModelshadowArmor<ShadowKnightEntity>> {

	public ShadowKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelshadowArmor(context.bakeLayer(ModelshadowArmor.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ShadowKnightEntity entity) {
		return new ResourceLocation("thevoid:textures/shadow_armor.png");
	}

}
