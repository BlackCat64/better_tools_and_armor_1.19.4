package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.bettertoolsandarmor.network.BetterToolsModVariables;
import net.mcreator.bettertoolsandarmor.init.BetterToolsModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CrystalliteSwordSkyCritDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity(), event.getSource().getDirectEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		execute(null, world, entity, immediatesourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity immediatesourceentity, double amount) {
		if (entity == null || immediatesourceentity == null)
			return;
		double distance = 0;
		if (immediatesourceentity instanceof Player) {
			if ((immediatesourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("better_tools:increased_crit_damage_tools")))
					|| ((LivingEntity) immediatesourceentity).getAttribute(BetterToolsModAttributes.CRITICALHITMULTIPLIER.get()).getValue() != 1.5) {
				if ((immediatesourceentity.getCapability(BetterToolsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BetterToolsModVariables.PlayerVariables())).critical_hit) {
					{
						boolean _setval = false;
						immediatesourceentity.getCapability(BetterToolsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.critical_hit = _setval;
							capability.syncPlayerVariables(immediatesourceentity);
						});
					}
					if (event != null && event.isCancelable()) {
						event.setCanceled(true);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY() + 1), (entity.getZ()), 10, 0.5, 1, 0.5, 0.05);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.DAMAGE_INDICATOR, (entity.getX()), (entity.getY() + 1), (entity.getZ()), (int) amount, 0.4, 0.6, 0.4, 0.025);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
