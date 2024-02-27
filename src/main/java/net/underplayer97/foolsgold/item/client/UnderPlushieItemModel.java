package net.underplayer97.foolsgold.item.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;
import net.underplayer97.foolsgold.item.custom.UnderPlushieItem;
import software.bernie.geckolib.model.GeoModel;

public class UnderPlushieItemModel extends GeoModel<UnderPlushieItem> {

    @Override
    public Identifier getModelResource(UnderPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(UnderPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/underplush.png");
    }

    @Override
    public Identifier getAnimationResource(UnderPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }

}
