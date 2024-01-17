package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class TopazOreGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBiome(BlockPos.containing(x, 128, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("forge:is_desert"))) && y <= 70;
	}
}
