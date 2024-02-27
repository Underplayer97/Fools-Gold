package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.JonoPlushieEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class JonoPlushieRenderer extends GeoBlockRenderer<JonoPlushieEntity> {

    public JonoPlushieRenderer(BlockEntityRendererFactory.Context context) {
        super(new JonoPlushieModel());
    }

}
