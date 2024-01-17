package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModMobEffects;

public class SwiftSwimProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level.getServer(), _ent),
						("attribute @s forge:swim_speed modifier add e4fc11f4-1915-4a88-bc02-f9feb8e5f0b9 swift_swim_effect "
								+ (((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BetterToolsModMobEffects.SWIFT_SWIM.get()) ? _livEnt.getEffect(BetterToolsModMobEffects.SWIFT_SWIM.get()).getAmplifier() : 0) + 1) * 0.5) + " add"));
			}
		}
	}
}
