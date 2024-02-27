package net.underplayer97.foolsgold.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.underplayer97.foolsgold.block.entity.FrizzPlushieEntity;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import net.underplayer97.foolsgold.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class FrizzPlushie extends BlockWithEntity {

    public FrizzPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, ModSounds.FRIZZ_SKEPPY, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }



    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new FrizzPlushieEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }


}
