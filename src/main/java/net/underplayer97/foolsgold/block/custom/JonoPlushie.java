package net.underplayer97.foolsgold.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import net.underplayer97.foolsgold.block.entity.JonoPlushieEntity;
import net.underplayer97.foolsgold.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class JonoPlushie extends BlockWithEntity {

    public JonoPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, ModSounds.JONATHAN_RIZZ, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }




    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new JonoPlushieEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }


}
