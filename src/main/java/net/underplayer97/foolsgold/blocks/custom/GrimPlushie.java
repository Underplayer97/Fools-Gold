package net.underplayer97.foolsgold.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.underplayer97.foolsgold.sound.ModSounds;

public class GrimPlushie extends Block {

    public GrimPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, ModSounds.GRIM_DEMOMAN, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }




}
