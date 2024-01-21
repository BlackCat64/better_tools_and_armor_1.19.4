package net.mcreator.bettertoolsandarmor.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.bettertoolsandarmor.BetterToolsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterToolsModVariables {
	public static boolean being_damaged_flag = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		BetterToolsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.respawn_xp = original.respawn_xp;
			clone.extra_jumps = original.extra_jumps;
			clone.charms_equipped = original.charms_equipped;
			clone.last_on_ground_x = original.last_on_ground_x;
			clone.last_on_ground_y = original.last_on_ground_y;
			clone.last_on_ground_z = original.last_on_ground_z;
			clone.save_from_void_cooldown = original.save_from_void_cooldown;
			clone.attack_damage = original.attack_damage;
			clone.attack_damage_modifier = original.attack_damage_modifier;
			clone.knockback_resistance = original.knockback_resistance;
			clone.knockback_resistance_modifier = original.knockback_resistance_modifier;
			if (!event.isWasDeath()) {
				clone.time_since_last_hurt = original.time_since_last_hurt;
				clone.slow_falling_cooldown = original.slow_falling_cooldown;
				clone.crystallite_emerald_heal_timer = original.crystallite_emerald_heal_timer;
				clone.blocks_broken_with_sculk_crystallite_pickaxe = original.blocks_broken_with_sculk_crystallite_pickaxe;
				clone.critical_hit = original.critical_hit;
				clone.fall_time = original.fall_time;
				clone.crystallite_amethyst_absorption_timer = original.crystallite_amethyst_absorption_timer;
				clone.flaming_circlet_cooldown = original.flaming_circlet_cooldown;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("better_tools", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double respawn_xp = 0.0;
		public double extra_jumps = 0.0;
		public double charms_equipped = 0.0;
		public double time_since_last_hurt = 0;
		public boolean slow_falling_cooldown = false;
		public double crystallite_emerald_heal_timer = 0.0;
		public double blocks_broken_with_sculk_crystallite_pickaxe = 0;
		public boolean critical_hit = false;
		public double fall_time = 0.0;
		public double crystallite_amethyst_absorption_timer = 300.0;
		public double last_on_ground_x = 0;
		public double last_on_ground_y = 0;
		public double last_on_ground_z = 0;
		public double save_from_void_cooldown = 0.0;
		public String attack_damage = "\"\"";
		public String attack_damage_modifier = "\"\"";
		public String knockback_resistance = "\"\"";
		public String knockback_resistance_modifier = "\"\"";
		public double flaming_circlet_cooldown = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				BetterToolsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("respawn_xp", respawn_xp);
			nbt.putDouble("extra_jumps", extra_jumps);
			nbt.putDouble("charms_equipped", charms_equipped);
			nbt.putDouble("time_since_last_hurt", time_since_last_hurt);
			nbt.putBoolean("slow_falling_cooldown", slow_falling_cooldown);
			nbt.putDouble("crystallite_emerald_heal_timer", crystallite_emerald_heal_timer);
			nbt.putDouble("blocks_broken_with_sculk_crystallite_pickaxe", blocks_broken_with_sculk_crystallite_pickaxe);
			nbt.putBoolean("critical_hit", critical_hit);
			nbt.putDouble("fall_time", fall_time);
			nbt.putDouble("crystallite_amethyst_absorption_timer", crystallite_amethyst_absorption_timer);
			nbt.putDouble("last_on_ground_x", last_on_ground_x);
			nbt.putDouble("last_on_ground_y", last_on_ground_y);
			nbt.putDouble("last_on_ground_z", last_on_ground_z);
			nbt.putDouble("save_from_void_cooldown", save_from_void_cooldown);
			nbt.putString("attack_damage", attack_damage);
			nbt.putString("attack_damage_modifier", attack_damage_modifier);
			nbt.putString("knockback_resistance", knockback_resistance);
			nbt.putString("knockback_resistance_modifier", knockback_resistance_modifier);
			nbt.putDouble("flaming_circlet_cooldown", flaming_circlet_cooldown);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			respawn_xp = nbt.getDouble("respawn_xp");
			extra_jumps = nbt.getDouble("extra_jumps");
			charms_equipped = nbt.getDouble("charms_equipped");
			time_since_last_hurt = nbt.getDouble("time_since_last_hurt");
			slow_falling_cooldown = nbt.getBoolean("slow_falling_cooldown");
			crystallite_emerald_heal_timer = nbt.getDouble("crystallite_emerald_heal_timer");
			blocks_broken_with_sculk_crystallite_pickaxe = nbt.getDouble("blocks_broken_with_sculk_crystallite_pickaxe");
			critical_hit = nbt.getBoolean("critical_hit");
			fall_time = nbt.getDouble("fall_time");
			crystallite_amethyst_absorption_timer = nbt.getDouble("crystallite_amethyst_absorption_timer");
			last_on_ground_x = nbt.getDouble("last_on_ground_x");
			last_on_ground_y = nbt.getDouble("last_on_ground_y");
			last_on_ground_z = nbt.getDouble("last_on_ground_z");
			save_from_void_cooldown = nbt.getDouble("save_from_void_cooldown");
			attack_damage = nbt.getString("attack_damage");
			attack_damage_modifier = nbt.getString("attack_damage_modifier");
			knockback_resistance = nbt.getString("knockback_resistance");
			knockback_resistance_modifier = nbt.getString("knockback_resistance_modifier");
			flaming_circlet_cooldown = nbt.getDouble("flaming_circlet_cooldown");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.respawn_xp = message.data.respawn_xp;
					variables.extra_jumps = message.data.extra_jumps;
					variables.charms_equipped = message.data.charms_equipped;
					variables.time_since_last_hurt = message.data.time_since_last_hurt;
					variables.slow_falling_cooldown = message.data.slow_falling_cooldown;
					variables.crystallite_emerald_heal_timer = message.data.crystallite_emerald_heal_timer;
					variables.blocks_broken_with_sculk_crystallite_pickaxe = message.data.blocks_broken_with_sculk_crystallite_pickaxe;
					variables.critical_hit = message.data.critical_hit;
					variables.fall_time = message.data.fall_time;
					variables.crystallite_amethyst_absorption_timer = message.data.crystallite_amethyst_absorption_timer;
					variables.last_on_ground_x = message.data.last_on_ground_x;
					variables.last_on_ground_y = message.data.last_on_ground_y;
					variables.last_on_ground_z = message.data.last_on_ground_z;
					variables.save_from_void_cooldown = message.data.save_from_void_cooldown;
					variables.attack_damage = message.data.attack_damage;
					variables.attack_damage_modifier = message.data.attack_damage_modifier;
					variables.knockback_resistance = message.data.knockback_resistance;
					variables.knockback_resistance_modifier = message.data.knockback_resistance_modifier;
					variables.flaming_circlet_cooldown = message.data.flaming_circlet_cooldown;
				}
			});
			context.setPacketHandled(true);
		}
	}
}