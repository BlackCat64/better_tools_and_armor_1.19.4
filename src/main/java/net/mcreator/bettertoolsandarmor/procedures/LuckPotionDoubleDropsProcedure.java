package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.bettertoolsandarmor.BetterToolsMod;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class LuckPotionDoubleDropsProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.LUCK)) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)) {
					if (blockstate.is(BlockTags.create(new ResourceLocation("forge:ores"))) && !blockstate.is(BlockTags.create(new ResourceLocation("better_tools:crystallite_topaz_forbidden_blocks")))) {
						if (Math.random() < 0.05 * ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).getValue()) {
							StopItemsProcedureProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
							BetterToolsMod.queueServerWork(4, () -> {
								if ((((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount() <= 6) {
									if ((((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("forge:gems")))
											&& !((((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
													.is(ItemTags.create(new ResourceLocation("forge:gems/prismarine")))
													|| (((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
															.is(ItemTags.create(new ResourceLocation("forge:gems/amethyst"))))
											|| (((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
												Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
													return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
												}
											}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)
													.is(ItemTags.create(new ResourceLocation("better_tools:crystallite_topaz_double_drops")))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
													(((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
														}
													}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY));
											entityToSpawn.setPickUpDelay(5);
											_level.addFreshEntity(entityToSpawn);
										}
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, (x + 0.5), (y + 0.5), (z + 0.5), 10, 1, 1, 1, 0.1);
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")), SoundSource.NEUTRAL, (float) 0.3, (float) 1.33);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.elder_guardian.curse")), SoundSource.NEUTRAL, (float) 0.3, (float) 1.33, false);
											}
										}
									}
								}
								StopItemsProcedureProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
							});
						}
					}
				}
			}
		}
	}
}
