package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.bettertoolsandarmor.BetterToolsMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CrystalliteIronMagneticProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
			BetterToolsMod.queueServerWork(4, () -> {
				{
					final Vec3 _center = new Vec3((x + 0.5), (y + 0.5), (z + 0.5));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if (!entityiterator.level.isClientSide())
								entityiterator.discard();
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY));
								entityToSpawn.setPickUpDelay(0);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			});
		}
	}
}
