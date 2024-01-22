package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class CrystalliteClusterGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		CrystalliteClusterGeneratedProcedure.execute(world, x, y, z);
		return y >= 5 && y <= 46 && !world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_ocean")));
	}
}
