package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bettertoolsandarmor.network.BetterToolsModVariables;
import net.mcreator.bettertoolsandarmor.init.BetterToolsModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ThornsDamageProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!BetterToolsModVariables.being_damaged_flag) {
			if (entity instanceof LivingEntity && ((LivingEntity) entity).getAttribute(BetterToolsModAttributes.THORNSDAMAGE.get()) != null) {
				if (((LivingEntity) entity).getAttribute(BetterToolsModAttributes.THORNSDAMAGE.get()).getValue() > 0) {
					BetterToolsModVariables.being_damaged_flag = true;
					BetterToolsModVariables.being_damaged_flag = false;
				}
			}
		}
	}
}
