package net.underplayer97.foolsgold;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.underplayer97.foolsgold.block.entity.ModBlockEntities;
import net.underplayer97.foolsgold.block.entity.client.FrizzPlushieRenderer;
import net.underplayer97.foolsgold.block.entity.client.GrimPlushieRenderer;
import net.underplayer97.foolsgold.block.entity.client.JonoPlushieRenderer;
import net.underplayer97.foolsgold.block.entity.client.UnderPlushieRenderer;

public class FoolsGoldClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.GRIM_PLUSHIE_ENTITY, GrimPlushieRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.UNDER_PLUSHIE_ENTITY, UnderPlushieRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.JONO_PLUSHIE_ENTITY, JonoPlushieRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.FRIZZ_PLUSHIE_ENTITY, FrizzPlushieRenderer::new);


    }

}
