
package net.mcreator.avalimodjava.block;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.avalimodjava.procedures.AerponicsLRSSIDE2NormalProcedure;
import net.mcreator.avalimodjava.init.AvaliModJavaModBlocks;

import java.util.List;
import java.util.Collections;

public class AeroponicsSideBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public AeroponicsSideBlock() {
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
			default -> Shapes.or(box(0, 0, 0, 4, 16, 4), box(0, 0, 12, 4, 16, 16), box(0.25, 3, 3, 2.25, 5, 13), box(3, 3, 13.75, 16, 5, 15.75), box(3, 3, 0.25, 16, 5, 2.25), box(0.5, 0.5, 0.5, 16, 15.5, 15.5), box(5, 0, 5, 11, 6, 11),
					box(5, 12, 5, 11, 16, 11), box(6, 6, 6, 10, 12, 10), box(11, 1, 6, 16, 5, 10));
			case NORTH -> Shapes.or(box(12, 0, 12, 16, 16, 16), box(12, 0, 0, 16, 16, 4), box(13.75, 3, 3, 15.75, 5, 13), box(0, 3, 0.25, 13, 5, 2.25), box(0, 3, 13.75, 13, 5, 15.75), box(0, 0.5, 0.5, 15.5, 15.5, 15.5), box(5, 0, 5, 11, 6, 11),
					box(5, 12, 5, 11, 16, 11), box(6, 6, 6, 10, 12, 10), box(0, 1, 6, 5, 5, 10));
			case EAST -> Shapes.or(box(0, 0, 12, 4, 16, 16), box(12, 0, 12, 16, 16, 16), box(3, 3, 13.75, 13, 5, 15.75), box(13.75, 3, 0, 15.75, 5, 13), box(0.25, 3, 0, 2.25, 5, 13), box(0.5, 0.5, 0, 15.5, 15.5, 15.5), box(5, 0, 5, 11, 6, 11),
					box(5, 12, 5, 11, 16, 11), box(6, 6, 6, 10, 12, 10), box(6, 1, 0, 10, 5, 5));
			case WEST -> Shapes.or(box(12, 0, 0, 16, 16, 4), box(0, 0, 0, 4, 16, 4), box(3, 3, 0.25, 13, 5, 2.25), box(0.25, 3, 3, 2.25, 5, 16), box(13.75, 3, 3, 15.75, 5, 16), box(0.5, 0.5, 0.5, 15.5, 15.5, 16), box(5, 0, 5, 11, 6, 11),
					box(5, 12, 5, 11, 16, 11), box(6, 6, 6, 10, 12, 10), box(6, 1, 11, 10, 5, 16));
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
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(AvaliModJavaModBlocks.AEROPONICS.get());
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
		return Collections.singletonList(new ItemStack(AvaliModJavaModBlocks.AEROPONICS.get()));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		AerponicsLRSSIDE2NormalProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		return retval;
	}
}
