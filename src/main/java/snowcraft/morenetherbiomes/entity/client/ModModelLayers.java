package snowcraft.morenetherbiomes.entity.client;

import snowcraft.morenetherbiomes.MoreNetherBiomes;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer ASHWALKER =
            new EntityModelLayer(new Identifier(MoreNetherBiomes.MOD_ID, "ashwalker"), "main");
}
