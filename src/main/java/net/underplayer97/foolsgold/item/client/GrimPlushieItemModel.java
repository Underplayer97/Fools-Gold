package net.underplayer97.foolsgold.item.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;
import software.bernie.geckolib.model.GeoModel;

public class GrimPlushieItemModel extends GeoModel<GrimPlushieItem> {

    @Override
    public Identifier getModelResource(GrimPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/grim_plushie.geo.json");
    }

    @Override
    public Identifier getTextureResource(GrimPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/grim_plushie.png");
    }

    @Override
    public Identifier getAnimationResource(GrimPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }

}
