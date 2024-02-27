package net.underplayer97.foolsgold.block.entity.client;

import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.UnderPlushieEntity;
import software.bernie.geckolib.model.GeoModel;

public class UnderPlushieModel extends GeoModel<UnderPlushieEntity> {
    @Override
    public Identifier getModelResource(UnderPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "geo/plushie_base.geo.json");
    }

    @Override
    public Identifier getTextureResource(UnderPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "textures/block/underplush.png");
    }

    @Override
    public Identifier getAnimationResource(UnderPlushieEntity animatable) {
        return new Identifier(FoolsGold.MOD_ID, "animations/plushie_base.animation.json");
    }
}
