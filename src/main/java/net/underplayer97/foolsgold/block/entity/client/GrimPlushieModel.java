package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import software.bernie.geckolib.model.GeoModel;

public class GrimPlushieModel extends GeoModel<GrimPlushieEntity> {
    @Override
    public Identifier getModelResource(GrimPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/grim_plushie.geo.json");
    }

    @Override
    public Identifier getTextureResource(GrimPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/grim_plushie.png");
    }

    @Override
    public Identifier getAnimationResource(GrimPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }
}
