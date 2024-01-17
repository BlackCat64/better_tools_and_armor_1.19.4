package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;

import javax.annotation.Nullable;

import java.util.UUID;

@Mod.EventBusSubscriber
public class CrystalliteIronKnockbackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_SWORD_IRON.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_DAGGER_IRON.get()) {
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_KNOCKBACK)
					.hasModifier((new AttributeModifier(UUID.fromString("f27c97a7-3849-4c6c-bb28-fa6c7780eb7f"), "crystallite_iron", 3, AttributeModifier.Operation.ADDITION)))))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_KNOCKBACK)
						.addTransientModifier((new AttributeModifier(UUID.fromString("f27c97a7-3849-4c6c-bb28-fa6c7780eb7f"), "crystallite_iron", 3, AttributeModifier.Operation.ADDITION)));
		} else {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_KNOCKBACK).removeModifier(UUID.fromString("f27c97a7-3849-4c6c-bb28-fa6c7780eb7f"));
		}
	}
}
