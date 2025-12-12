package com.marbledhubb.cosmetic_package.init.block;

import com.marbledhubb.cosmetic_package.config.ArmorType;
import com.marbledhubb.cosmetic_package.world.inventory.FazFitMenu;
import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;

import static net.minecraft.world.level.block.HopperBlock.FACING;
import static net.minecraft.world.level.block.SculkSensorBlock.WATERLOGGED;

public class FazFitBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public FazFitBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE_N = Block.box(0, 0, 5, 16, 13, 11);
    private static final VoxelShape SHAPE_E = Block.box(5, 0, 0, 11, 13, 16);
    private static final VoxelShape SHAPE_S = Block.box(0, 0, 5, 16, 13, 11);
    private static final VoxelShape SHAPE_W = Block.box(5, 0, 0, 11, 13, 16);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return switch (pState.getValue(FACING)) {
            case NORTH -> SHAPE_N;
            case EAST -> SHAPE_E;
            case SOUTH -> SHAPE_S;
            case WEST -> SHAPE_W;
            default -> SHAPE_S;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {

        for (Direction direction : pContext.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockstate = this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());

                if (blockstate.canSurvive(pContext.getLevel(), pContext.getClickedPos())) {
                    return blockstate.setValue(HorizontalDirectionalBlock.FACING, pContext.getHorizontalDirection());
                }
            }
        }
        return null;
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    @Override
    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        super.use(blockstate, world, pos, entity, hand, hit);

        if (entity instanceof ServerPlayer serverPlayer) {
            BlockPos _bpos = BlockPos.containing(serverPlayer.getX(), serverPlayer.getY(), serverPlayer.getZ());
            NetworkHooks.openScreen((ServerPlayer) serverPlayer, new MenuProvider() {
                @Override
                public Component getDisplayName() {
                    return Component.literal("FazFit");
                }

                @Override
                public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                    return new FazFitMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                }
            }, _bpos);
        }

        return InteractionResult.SUCCESS;

    }

    public static ArmorType getArmorType(Player player, double x, double y, double z) {
        BlockPos _bp = BlockPos.containing(x, y, z);
        BlockEntity blockEntity = player.level().getBlockEntity(_bp);
        String registry = "";
        if (blockEntity != null)
            registry = blockEntity.getPersistentData().getString("armorType");

        return ArmorType.fromRegistry(registry);
    }

    public static void setArmorType(ArmorType armorType, Player player, double x, double y, double z) {
        if (!player.level().isClientSide()) {
            BlockPos _bp = BlockPos.containing(x, y, z);
            BlockEntity _blockEntity = player.level().getBlockEntity(_bp);
            BlockState _bs = player.level().getBlockState(_bp);
            if (_blockEntity != null) {
                _blockEntity.getPersistentData().putString("armorType", armorType.getRegistry());
            }
            player.level().sendBlockUpdated(_bp, _bs, _bs, 3);
        }
    }

    public static void goToNextArmorType(Player player, double x, double y, double z) {
        setArmorType(getArmorType(player, x, y ,z).next(), player, x, y, z);
    }

    public static void goToPreviousArmorType(Player player, double x, double y, double z) {
        setArmorType(getArmorType(player, x, y ,z).prev(), player, x, y ,z);
    }
}
