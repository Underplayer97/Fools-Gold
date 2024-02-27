package net.underplayer97.foolsgold.item.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.item.custom.FrizzPlushieItem;
import net.underplayer97.foolsgold.item.custom.JonoPlushieItem;
import software.bernie.geckolib.model.GeoModel;

public class JonoPlushieItemModel extends GeoModel<JonoPlushieItem> {

    @Override
    public Identifier getModelResource(JonoPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(JonoPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/jonoplush.png");
    }

    @Override
    public Identifier getAnimationResource(JonoPlushieItem animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }

}
