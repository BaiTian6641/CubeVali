package net.mcreator.avalimodjava.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Avalicorp10DetectBlockProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return Blocks.POTATOES.defaultBlockState().canSurvive(world, BlockPos.containing(x, y, z));
	}
}
