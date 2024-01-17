package net.mcreator.bettertoolsandarmor.procedures;

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
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;
import net.mcreator.bettertoolsandarmor.init.BetterToolsModEnchantments;
import net.mcreator.bettertoolsandarmor.BetterToolsMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class SmeltingTouchProcedureProcedure {
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
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (blockstate.is(BlockTags.create(new ResourceLocation("forge:ores")))) {
				if (EnchantmentHelper.getItemEnchantmentLevel(BetterToolsModEnchantments.SMELTING_TOUCH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BetterToolsModItems.CRYSTALLITE_PICKAXE_NETHER_DIAMOND.get()) {
					StopItemsProcedureProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
					BetterToolsMod.queueServerWork(2, () -> {
						if (world instanceof Level _level9 && _level9.getRecipeManager()
								.getRecipeFor(RecipeType.SMELTING, new SimpleContainer((((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _level9).isPresent()) {
							for (int index0 = 0; index0 < (((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getCount(); index0++) {
								if (world instanceof ServerLevel _level) {
									ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.8), (z + 0.5),
											(world instanceof Level _lvlSmeltResult
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
															new SimpleContainer((((Entity) world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3((x + 0.5), (y + 0.5), (z + 0.5)), 1, 1, 1), e -> true).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
																}
															}.compareDistOf((x + 0.5), (y + 0.5), (z + 0.5))).findFirst().orElse(null)) instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _lvlSmeltResult)
															.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
													: ItemStack.EMPTY));
									entityToSpawn.setPickUpDelay(5);
									_level.addFreshEntity(entityToSpawn);
								}
							}
							{
								final Vec3 _center = new Vec3((x + 0.5), (y + 0.5), (z + 0.5));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof ItemEntity) {
										if (world instanceof Level _level19
												&& _level19.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY)), _level19).isPresent()) {
											if (!entityiterator.level.isClientSide())
												entityiterator.discard();
											break;
										}
									}
								}
							}
							StopItemsProcedureProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
						}
					});
				}
			}
		}
	}
}
