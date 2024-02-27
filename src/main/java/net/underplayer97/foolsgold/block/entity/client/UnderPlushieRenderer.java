package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.JonoPlushieEntity;
import net.underplayer97.foolsgold.block.entity.UnderPlushieEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class UnderPlushieRenderer extends GeoBlockRenderer<UnderPlushieEntity> {

    public UnderPlushieRenderer(BlockEntityRendererFactory.Context context) {
        super(new UnderPlushieModel());
    }

}
