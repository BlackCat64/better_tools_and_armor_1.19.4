package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.entity.Entity;

public class WardenStaffNoProjectilesProcedureProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level.isClientSide())
			immediatesourceentity.discard();
	}
}
