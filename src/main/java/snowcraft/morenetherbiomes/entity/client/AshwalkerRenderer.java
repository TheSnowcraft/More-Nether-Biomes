package snowcraft.morenetherbiomes.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import snowcraft.morenetherbiomes.entity.custom.AshwalkerEntity;

public class AshwalkerRenderer extends MobEntityRenderer<AshwalkerEntity, AshwalkerModel<AshwalkerEntity>> {
    private static final Identifier TEXTURE = new Identifier(MoreNetherBiomes.MOD_ID, "textures/entity/ashwalker/Ashwalker.png");

    public AshwalkerRenderer(EntityRendererFactory.Context context) {
        super(context, new AshwalkerModel<>(context.getPart(ModModelLayers.ASHWALKER)), 0.6f);
    }

    @Override
    public Identifier getTexture(AshwalkerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(AshwalkerEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
