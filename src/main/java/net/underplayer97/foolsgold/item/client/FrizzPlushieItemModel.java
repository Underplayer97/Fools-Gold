package net.underplayer97.foolsgold.item.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.item.custom.FrizzPlushieItem;
import net.underplayer97.foolsgold.item.custom.UnderPlushieItem;
import software.bernie.geckolib.model.GeoModel;

public class FrizzPlushieItemModel extends GeoModel<FrizzPlushieItem> {

    @Override
    public Identifier getModelResource(FrizzPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(FrizzPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/frizzplush.png");
    }

    @Override
    public Identifier getAnimationResource(FrizzPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }

}
