package snowcraft.morenetherbiomes;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;
import snowcraft.morenetherbiomes.block.ModBlocks;
import snowcraft.morenetherbiomes.entity.ModEntities;
import snowcraft.morenetherbiomes.entity.client.AshwalkerModel;
import snowcraft.morenetherbiomes.entity.client.AshwalkerRenderer;
import snowcraft.morenetherbiomes.entity.client.ModModelLayers;

public class MoreNetherBiomesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASHWOOD_TRAPDOOR, RenderLayer.getCutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.ASHWOOD_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ModBlocks.ASHWOOD_HANGING_SIGN_TEXTURE));

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASHWEED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_THISTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ASH_THISTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ASH_CACTUS, RenderLayer.getCutout());


        EntityRendererRegistry.register(ModEntities.ASHWALKER, AshwalkerRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ASHWALKER, AshwalkerModel::getTexturedModelData);
    }
}
