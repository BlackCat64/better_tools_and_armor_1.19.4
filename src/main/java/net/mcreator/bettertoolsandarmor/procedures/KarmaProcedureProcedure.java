package net.mcreator.bettertoolsandarmor.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.bettertoolsandarmor.network.BetterToolsModVariables;
import net.mcreator.bettertoolsandarmor.init.BetterToolsModMobEffects;
import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KarmaProcedureProcedure {
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
		double damage = 0;
		if (!BetterToolsModVariables.being_damaged_flag) {
			if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(BetterToolsModMobEffects.KARMA_POTION.get())) {
				damage = ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(BetterToolsModMobEffects.KARMA_POTION.get()) ? _livEnt.getEffect(BetterToolsModMobEffects.KARMA_POTION.get()).getAmplifier() : 0) + 1) * 2;
			}
			if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(BetterToolsModItems.POISON_CHARM.get(), lv).isPresent() : false) {
				damage = damage + 1;
			}
			if (damage > 1) {
				BetterToolsModVariables.being_damaged_flag = true;
				BetterToolsModVariables.being_damaged_flag = false;
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("better_tools:karma_adv"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
