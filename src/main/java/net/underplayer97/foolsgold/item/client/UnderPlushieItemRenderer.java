package net.underplayer97.foolsgold.item.client;

import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;
import net.underplayer97.foolsgold.item.custom.UnderPlushieItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class UnderPlushieItemRenderer extends GeoItemRenderer<UnderPlushieItem> {
    public UnderPlushieItemRenderer() {
        super(new UnderPlushieItemModel());
    }
}
