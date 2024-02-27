package net.underplayer97.foolsgold.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.ModBlocks;

public class ModBlockEntities {

    public static BlockEntityType<GrimPlushieEntity> GRIM_PLUSHIE_ENTITY;
    public static BlockEntityType<FrizzPlushieEntity> FRIZZ_PLUSHIE_ENTITY;
    public static BlockEntityType<UnderPlushieEntity> UNDER_PLUSHIE_ENTITY;
    public static BlockEntityType<JonoPlushieEntity> JONO_PLUSHIE_ENTITY;


    public static void registerAllBlockEntities() {
        GRIM_PLUSHIE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(FoolsGold.MOD_ID, "grim_plushie_entity"),
                FabricBlockEntityTypeBuilder.create(GrimPlushieEntity::new,
                        ModBlocks.GRIM_PLUSHIE).build());

        FRIZZ_PLUSHIE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(FoolsGold.MOD_ID, "frizz_plushie_entity"),
                FabricBlockEntityTypeBuilder.create(FrizzPlushieEntity::new,
                        ModBlocks.FRIZZ_PLUSHIE).build());

        UNDER_PLUSHIE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(FoolsGold.MOD_ID, "under_plushie_entity"),
                FabricBlockEntityTypeBuilder.create(UnderPlushieEntity::new,
                        ModBlocks.UNDER_PLUSHIE).build());

        JONO_PLUSHIE_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(FoolsGold.MOD_ID, "jono_plushie_entity"),
                FabricBlockEntityTypeBuilder.create(JonoPlushieEntity::new,
                        ModBlocks.JONO_PLUSHIE).build());
    }
}
