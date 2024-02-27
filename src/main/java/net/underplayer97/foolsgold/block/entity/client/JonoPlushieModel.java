package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.JonoPlushieEntity;
import software.bernie.geckolib.model.GeoModel;

public class JonoPlushieModel extends GeoModel<JonoPlushieEntity> {
    @Override
    public Identifier getModelResource(JonoPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(JonoPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/jonoplush.png");
    }

    @Override
    public Identifier getAnimationResource(JonoPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }
}
