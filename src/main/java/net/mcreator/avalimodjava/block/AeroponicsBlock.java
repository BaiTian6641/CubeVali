
package net.mcreator.avalimodjava.block;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.Containers;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.avalimodjava.procedures.AeroponicsTickProcedure;
import net.mcreator.avalimodjava.block.entity.AeroponicsBlockEntity;

import java.util.List;
import java.util.Collections;

public class AeroponicsBlock extends Block implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public AeroponicsBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(1f, 10f).friction(0.8f).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(12, 0, 12, 16, 16, 16), box(12, 0, 0, 16, 16, 4), box(0, 0, 0, 4, 16, 4), box(0, 0, 12, 4, 16, 16), box(13.75, 3, 3, 15.75, 5, 13), box(0.25, 3, 3, 2.25, 5, 13), box(3, 3, 13.75, 13, 5, 15.75),
					box(3, 3, 0.25, 13, 5, 2.25), box(0.5, 0.5, 0.5, 15.5, 15.5, 15.5));
			case NORTH -> Shapes.or(box(0, 0, 0, 4, 16, 4), box(0, 0, 12, 4, 16, 16), box(12, 0, 12, 16, 16, 16), box(12, 0, 0, 16, 16, 4), box(0.25, 3, 3, 2.25, 5, 13), box(13.75, 3, 3, 15.75, 5, 13), box(3, 3, 0.25, 13, 5, 2.25),
					box(3, 3, 13.75, 13, 5, 15.75), box(0.5, 0.5, 0.5, 15.5, 15.5, 15.5));
			case EAST -> Shapes.or(box(12, 0, 0, 16, 16, 4), box(0, 0, 0, 4, 16, 4), box(0, 0, 12, 4, 16, 16), box(12, 0, 12, 16, 16, 16), box(3, 3, 0.25, 13, 5, 2.25), box(3, 3, 13.75, 13, 5, 15.75), box(13.75, 3, 3, 15.75, 5, 13),
					box(0.25, 3, 3, 2.25, 5, 13), box(0.5, 0.5, 0.5, 15.5, 15.5, 15.5));
			case WEST -> Shapes.or(box(0, 0, 12, 4, 16, 16), box(12, 0, 12, 16, 16, 16), box(12, 0, 0, 16, 16, 4), box(0, 0, 0, 4, 16, 4), box(3, 3, 13.75, 13, 5, 15.75), box(3, 3, 0.25, 13, 5, 2.25), box(0.25, 3, 3, 2.25, 5, 13),
					box(13.75, 3, 3, 15.75, 5, 13), box(0.5, 0.5, 0.5, 15.5, 15.5, 15.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		AeroponicsTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new AeroponicsBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof AeroponicsBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof AeroponicsBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}
