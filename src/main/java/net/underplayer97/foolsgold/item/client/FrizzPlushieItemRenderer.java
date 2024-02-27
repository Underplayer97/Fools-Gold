package net.underplayer97.foolsgold.item.client;

import net.underplayer97.foolsgold.item.custom.FrizzPlushieItem;
import net.underplayer97.foolsgold.item.custom.UnderPlushieItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FrizzPlushieItemRenderer extends GeoItemRenderer<FrizzPlushieItem> {
    public FrizzPlushieItemRenderer() {
        super(new FrizzPlushieItemModel());
    }
}
