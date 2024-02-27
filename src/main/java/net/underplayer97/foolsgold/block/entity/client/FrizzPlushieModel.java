package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import software.bernie.geckolib.model.GeoModel;

public class FrizzPlushieModel extends GeoModel<FrizzPlushieEntity> {
    @Override
    public Identifier getModelResource(FrizzPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(FrizzPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/frizzplush.png");
    }

    @Override
    public Identifier getAnimationResource(FrizzPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }
}
