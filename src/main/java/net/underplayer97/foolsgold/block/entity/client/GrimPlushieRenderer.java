package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class GrimPlushieRenderer extends GeoBlockRenderer<GrimPlushieEntity> {

    public GrimPlushieRenderer(BlockEntityRendererFactory.Context context) {
        super(new GrimPlushieModel());
    }

}
