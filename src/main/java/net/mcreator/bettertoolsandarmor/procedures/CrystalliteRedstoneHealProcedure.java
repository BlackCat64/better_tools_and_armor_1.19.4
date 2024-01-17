package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CrystalliteRedstoneHealProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_SWORD_REDSTONE.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_AXE_REDSTONE.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_DAGGER_REDSTONE.get()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 0.3 * (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			} else {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			}
		}
	}
}
