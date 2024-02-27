package net.underplayer97.foolsgold.item.client;

import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class GrimPlushieItemRenderer extends GeoItemRenderer<GrimPlushieItem> {
    public GrimPlushieItemRenderer() {
        super(new GrimPlushieItemModel());
    }
}
