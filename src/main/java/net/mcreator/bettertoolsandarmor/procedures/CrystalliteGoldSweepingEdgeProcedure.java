package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class CrystalliteGoldSweepingEdgeProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("better_tools:increased_sweeping_damage_weapons")))) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SWEEPING_EDGE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SWEEPING_EDGE, 4);
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(22));
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.SWEEPING_EDGE) < 4) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					if (_enchantments.containsKey(Enchantments.SWEEPING_EDGE)) {
						_enchantments.remove(Enchantments.SWEEPING_EDGE);
						EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
					}
				}
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).enchant(Enchantments.SWEEPING_EDGE, 4);
				if (entity instanceof Player _player)
					_player.giveExperiencePoints(-(22));
			}
		}
	}
}
