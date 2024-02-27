package net.underplayer97.foolsgold.block.custom;

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

public class JonathanPlushie extends Block {

    public JonathanPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, ModSounds.JONATHAN_RIZZ, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }




}