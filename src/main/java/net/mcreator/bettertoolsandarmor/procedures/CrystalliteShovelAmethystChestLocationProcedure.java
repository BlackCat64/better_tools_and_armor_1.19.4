package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.MinecartChest;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModParticleTypes;

public class CrystalliteShovelAmethystChestLocationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double radius = 0;
		double change_x = 0;
		double change_y = 0;
		double change_z = 0;
		double distance = 0;
		double count = 0;
		double repeats = 0;
		if (entity.isShiftKeyDown()) {
			found = false;
			radius = 0;
			for (int index0 = 0; index0 < 31; index0++) {
				radius = radius + 1;
				if (radius == 1) {
					repeats = 1;
				}
				sx = radius * (-1);
				for (int index1 = 0; index1 < 2; index1++) {
					sy = radius * (-1);
					for (int index2 = 0; index2 < (int) (radius * 2); index2++) {
						sz = radius * (-1);
						for (int index3 = 0; index3 < (int) (radius * 2); index3++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:chests")))
									|| !world.getEntitiesOfClass(MinecartChest.class, AABB.ofSize(new Vec3((x + sx + 0.5), (y + sy + 0.5), (z + sz + 0.5)), 1, 1, 1), e -> true).isEmpty()) {
								found = true;
								break;
							}
							sz = sz + 1;
						}
						if (found == true) {
							break;
						}
						sy = sy + 1;
					}
					if (found == true) {
						break;
					}
					sx = radius;
				}
				if (found == true) {
					break;
				}
				sz = radius * (-1);
				for (int index4 = 0; index4 < 2; index4++) {
					sx = 1 - radius;
					if (radius > 1) {
						repeats = (radius - 1) * 2;
					}
					for (int index5 = 0; index5 < (int) repeats; index5++) {
						sy = radius * (-1);
						for (int index6 = 0; index6 < (int) (radius * 2); index6++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:chests")))
									|| !world.getEntitiesOfClass(MinecartChest.class, AABB.ofSize(new Vec3((x + sx + 0.5), (y + sy + 0.5), (z + sz + 0.5)), 1, 1, 1), e -> true).isEmpty()) {
								found = true;
								break;
							}
							sy = sy + 1;
						}
						if (found == true) {
							break;
						}
						sx = sx + 1;
					}
					if (found == true) {
						break;
					}
					sz = radius;
				}
				if (found == true) {
					break;
				}
				sy = radius * (-1);
				for (int index7 = 0; index7 < 2; index7++) {
					sx = 1 - radius;
					if (radius > 1) {
						repeats = (radius - 1) * 2;
					}
					for (int index8 = 0; index8 < (int) repeats; index8++) {
						sz = 1 - radius;
						if (radius > 1) {
							repeats = (radius - 1) * 2;
						}
						for (int index9 = 0; index9 < (int) repeats; index9++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("forge:chests")))
									|| !world.getEntitiesOfClass(MinecartChest.class, AABB.ofSize(new Vec3((x + sx + 0.5), (y + sy + 0.5), (z + sz + 0.5)), 1, 1, 1), e -> true).isEmpty()) {
								found = true;
								break;
							}
							sz = sz + 1;
						}
						if (found == true) {
							break;
						}
						sx = sx + 1;
					}
					if (found == true) {
						break;
					}
					sy = radius;
				}
				if (found == true) {
					break;
				}
			}
			if (found == true) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(50, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 2400);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.fall")), SoundSource.BLOCKS, 5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.fall")), SoundSource.BLOCKS, 5, 1, false);
					}
				}
				distance = Math.sqrt(Math.pow(sx, 2) + Math.pow(sy, 2) + Math.pow(sz, 2));
				change_x = sx / distance;
				change_y = sy / distance;
				change_z = sz / distance;
				if (change_x != 0 || change_y != 0 || change_z != 0) {
					count = 0;
					for (int index10 = 0; index10 < (int) Math.ceil(distance); index10++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (BetterToolsModParticleTypes.ORE_LOCATION_PARTICLE.get()), (x + count * change_x), (y + 1 + count * change_y), (z + count * change_z), 3, 0.02, 0.02, 0.02, 0.0025);
						count = count + 1;
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.BLOCKS, 5, (float) 0.2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.fall")), SoundSource.BLOCKS, 5, (float) 0.2, false);
					}
				}
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = itemstack;
						if (_ist.hurt(10, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
				}
			}
		}
	}
}
