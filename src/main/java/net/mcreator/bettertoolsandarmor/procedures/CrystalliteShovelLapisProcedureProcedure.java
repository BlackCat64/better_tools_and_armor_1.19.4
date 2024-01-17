package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class CrystalliteShovelLapisProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (Math.random() < 0.1) {
			if (world instanceof ServerLevel _level)
				_level.addFreshEntity(new ExperienceOrb(_level, (x + Math.random()), (y + Math.random()), (z + Math.random()), Mth.nextInt(RandomSource.create(), 1, (int) (itemstack.getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) + 1))));
		}
	}
}
