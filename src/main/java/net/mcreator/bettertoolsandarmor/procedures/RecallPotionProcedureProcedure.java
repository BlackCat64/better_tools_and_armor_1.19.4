package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;
import net.mcreator.bettertoolsandarmor.BetterToolsMod;

public class RecallPotionProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean valid_spawn = false;
		valid_spawn = true;
		if (("ResourceKey[minecraft:dimension / " + (new Object() {
			public String getValue() {
				CompoundTag dataIndex0 = new CompoundTag();
				entity.saveWithoutId(dataIndex0);
				return dataIndex0.getString("SpawnDimension");
			}
		}.getValue()) + "]").equals("" + entity.level.dimension())) {
			if ((entity.level.dimension()) == Level.NETHER) {
				if ((world.getBlockState(BlockPos.containing(
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
								: 0,
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
								: 0,
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
								: 0)))
						.getBlock() == Blocks.RESPAWN_ANCHOR) {
					if (((world.getBlockState(BlockPos.containing(
							(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
									: 0,
							(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
									: 0,
							(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
									: 0)))
							.getBlock().getStateDefinition().getProperty("charges") instanceof IntegerProperty _getip14
									? (world.getBlockState(BlockPos.containing(
											(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
													? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
													: 0,
											(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
													? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
													: 0,
											(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
													? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
													: 0)))
											.getValue(_getip14)
									: -1) > 0) {
						{
							int _value = (int) (((world.getBlockState(BlockPos.containing(
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
											: 0,
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
											: 0,
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
											: 0)))
									.getBlock().getStateDefinition().getProperty("charges") instanceof IntegerProperty _getip22
											? (world.getBlockState(BlockPos.containing(
													(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
															? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
															: 0,
													(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
															? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
															: 0,
													(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
															? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
															: 0)))
													.getValue(_getip22)
											: -1)
									- 1);
							BlockPos _pos = BlockPos.containing(
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
											: 0,
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
											: 0,
									(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
											: 0);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("charges") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else {
						valid_spawn = false;
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s actionbar \"\u00A7cYour Respawn Anchor has no charges remaining\"");
							}
						}
					}
				} else {
					valid_spawn = false;
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s actionbar \"\u00A7cYour Respawn Anchor has been destroyed\"");
						}
					}
				}
			} else if ((entity.level.dimension()) == Level.OVERWORLD) {
				if (!((world.getBlockState(BlockPos.containing(
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
								: 0,
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
								: 0,
						(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
								: 0)))
						.is(BlockTags.create(new ResourceLocation("minecraft:beds"))))) {
					valid_spawn = false;
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s actionbar \"\u00A7cYour Bed has been destroyed\"");
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((world.getLevelData().getXSpawn() + 0.5), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn() + 0.5));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((world.getLevelData().getXSpawn() + 0.5), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn() + 0.5), _ent.getYRot(), _ent.getXRot());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(world.getLevelData().getXSpawn(), world.getLevelData().getYSpawn(), world.getLevelData().getZSpawn()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")),
									SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
			}
			if (valid_spawn) {
				{
					Entity _ent = entity;
					_ent.teleportTo(
							(((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
									: 0) + 0.5),
							((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
									: 0),
							(((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
									: 0) + 0.5));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								(((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
										: 0) + 0.5),
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
										: 0),
								(((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
										: 0) + 0.5),
								_ent.getYRot(), _ent.getXRot());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null,
								BlockPos.containing(
										(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
												? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
												: 0,
										(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
												? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
												: 0,
										(entity instanceof ServerPlayer _player && !_player.level.isClientSide())
												? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
												: 0),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
										: 0),
								((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
										: 0),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
			}
		} else {
			valid_spawn = false;
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s actionbar \"\u00A7cSpawn point is in a different dimension\"");
				}
			}
		}
		if (!valid_spawn) {
			if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				BetterToolsMod.queueServerWork(1, () -> {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.GLASS_BOTTLE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(BetterToolsModItems.RECALL_POTION.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
			}
		}
	}
}
