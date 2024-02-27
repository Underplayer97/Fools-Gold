package net.underplayer97.foolsgold.item.client;

import net.underplayer97.foolsgold.block.entity.client.JonoPlushieModel;
import net.underplayer97.foolsgold.item.custom.FrizzPlushieItem;
import net.underplayer97.foolsgold.item.custom.JonoPlushieItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class JonoPlushieItemRenderer extends GeoItemRenderer<JonoPlushieItem> {
    public JonoPlushieItemRenderer() {
        super(new JonoPlushieItemModel());
    }
}
