package net.underplayer97.foolsgold.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.underplayer97.foolsgold.block.entity.GrimPlushieEntity;
import net.underplayer97.foolsgold.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class GrimPlushie extends BlockWithEntity {

    public GrimPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {
        world.playSound(player, pos, ModSounds.GRIM_DEMOMAN, SoundCategory.BLOCKS, 1f, 1f);
        return ActionResult.SUCCESS;
    }

    /*
    private static VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 12, 16, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

     */

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GrimPlushieEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
