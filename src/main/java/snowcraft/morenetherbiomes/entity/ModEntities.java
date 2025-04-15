package snowcraft.morenetherbiomes.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import snowcraft.morenetherbiomes.MoreNetherBiomes;
import snowcraft.morenetherbiomes.entity.custom.AshwalkerEntity;


public class ModEntities {
    public static final EntityType<AshwalkerEntity> ASHWALKER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MoreNetherBiomes.MOD_ID, "ashwalker"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, AshwalkerEntity::new).dimensions(EntityDimensions.fixed(1f, 2f)).build());

    public static void registerModEntities() {
        MoreNetherBiomes.LOGGER.info("Registering Mod Entities for " + MoreNetherBiomes.MOD_ID);
    }
}