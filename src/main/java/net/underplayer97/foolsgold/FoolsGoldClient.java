package net.underplayer97.foolsgold;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.underplayer97.foolsgold.block.entity.ModBlockEntities;
import net.underplayer97.foolsgold.block.entity.client.GrimPlushieRenderer;

public class FoolsGoldClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        BlockEntityRendererFactories.register(ModBlockEntities.GRIM_PLUSHIE_ENTITY, GrimPlushieRenderer::new);


    }

}
