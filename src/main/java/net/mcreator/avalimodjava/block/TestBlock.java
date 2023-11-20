
package net.mcreator.avalimodjava.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class TestBlock extends Block {
	public TestBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(1f, 10f).lightLevel(s -> 2).noOcclusion().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
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
		return Shapes.or(box(6, 0, 6, 10, 1, 10), box(5, 2, 5, 11, 3, 11), box(11, 2, 5, 12, 3, 11), box(5, 2, 4, 11, 3, 5), box(4, 2, 5, 5, 3, 11), box(5, 2, 11, 11, 3, 12), box(6, 1, 10, 10, 2, 11), box(5, 1, 6, 6, 2, 10), box(10, 1, 6, 11, 2, 10),
				box(6, 1, 5, 10, 2, 6), box(6, 1, 6, 10, 2, 10), box(4, 3, 4, 11, 4, 5), box(4, 3, 5, 5, 4, 12), box(5, 3, 11, 12, 4, 12), box(11, 3, 4, 12, 4, 11), box(5, 4, 4, 11, 5, 5), box(4, 4, 5, 5, 5, 11), box(5, 4, 11, 11, 5, 12),
				box(11, 4, 5, 12, 5, 11), box(5, 3, 5, 11, 4, 11), box(7, 4, 7, 9, 11, 9), box(8, 4, 9, 9, 9, 11), box(7, 2, 7, 9, 8, 10), box(7, 3, 8, 9, 11, 10), box(6, 3, 7, 8, 7, 10), box(5, 5, 7.5, 6, 12, 9.5), box(6, 4, 6.5, 7, 9, 8.5));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
