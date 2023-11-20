package net.mcreator.avalimodjava.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.avalimodjava.init.AvaliModJavaModBlocks;

public class Avalicorp10GrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double previousRecipe = 0;
		BlockState wheatBlock = Blocks.AIR.defaultBlockState();
		BlockState avalicorp0state0 = Blocks.AIR.defaultBlockState();
		BlockState avalicorp0state1 = Blocks.AIR.defaultBlockState();
		BlockState avalicorp0state2 = Blocks.AIR.defaultBlockState();
		BlockState avalicorp0state3 = Blocks.AIR.defaultBlockState();
		avalicorp0state0 = AvaliModJavaModBlocks.AVALICORP_10.get().defaultBlockState();
		avalicorp0state1 = AvaliModJavaModBlocks.AVALICORP_11.get().defaultBlockState();
		avalicorp0state2 = AvaliModJavaModBlocks.AVALICORP_12.get().defaultBlockState();
		avalicorp0state2 = AvaliModJavaModBlocks.AVALICORP_13.get().defaultBlockState();
		if (Math.random() <= 0.45) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == avalicorp0state0.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), avalicorp0state1, 3);
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == avalicorp0state1.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), avalicorp0state2, 3);
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == avalicorp0state2.getBlock()) {
				world.setBlock(BlockPos.containing(x, y, z), avalicorp0state3, 3);
				{
					int _value = 3;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
