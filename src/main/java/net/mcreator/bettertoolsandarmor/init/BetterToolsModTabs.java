
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettertoolsandarmor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterToolsModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("better_tools", "better_tools_and_armor_misc"),
				builder -> builder.title(Component.translatable("item_group.better_tools.better_tools_and_armor_misc")).icon(() -> new ItemStack(BetterToolsModItems.CREATIVE_TAB_LOGO.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetterToolsModBlocks.SUGAR_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.FLINT_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.RANDOM_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.DEEPSLATE_RANDOM_ORE.get().asItem());
					tabData.accept(BetterToolsModItems.MIXED_ESSENCE.get());
					tabData.accept(BetterToolsModItems.OBSIDIAN_STICK.get());
					tabData.accept(BetterToolsModBlocks.BLACKSTONE_MAGMA.get().asItem());
					tabData.accept(BetterToolsModBlocks.PURPLE_MUSHROOM.get().asItem());
					tabData.accept(BetterToolsModBlocks.PURPLE_MUSHROOM_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.PURPLE_MOOSHROOM_SPAWN_EGG.get());
					tabData.accept(BetterToolsModBlocks.FOUR_LEAF_CLOVER.get().asItem());
					tabData.accept(BetterToolsModItems.BLUE_SLIMEBALL.get());
					tabData.accept(BetterToolsModBlocks.BLUE_SLIME_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.BLUE_SLIME_STICK.get());
					tabData.accept(BetterToolsModBlocks.BLUE_MUSHROOM.get().asItem());
					tabData.accept(BetterToolsModBlocks.BLUE_MUSHROOM_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.MUSIC_DISC_BLANK.get());
					tabData.accept(BetterToolsModItems.MASTER_BUILDER.get());
					tabData.accept(BetterToolsModItems.SHRUNK_MUSIC.get());
					tabData.accept(BetterToolsModItems.BLOCK_DANCE.get());
					tabData.accept(BetterToolsModItems.GLIDE.get());
					tabData.accept(BetterToolsModItems.RICK_ROLL_DISC.get());
					tabData.accept(BetterToolsModItems.AMOGUS.get());
					tabData.accept(BetterToolsModItems.MOGUS_DRIP_DISC.get());
					tabData.accept(BetterToolsModBlocks.END_STONE_PEBBLES.get().asItem());
					tabData.accept(BetterToolsModItems.GOLDEN_POTATO.get());
					tabData.accept(BetterToolsModItems.DIAMOND_APPLE.get());
					tabData.accept(BetterToolsModItems.EXPERIENCE_POTION.get());
					tabData.accept(BetterToolsModItems.BERRY_PIE.get());
					tabData.accept(BetterToolsModItems.SUGAR_CLUMP.get());
					tabData.accept(BetterToolsModItems.GUARDIAN_SPIKE.get());
					tabData.accept(BetterToolsModItems.APPLE_JUICE.get());
					tabData.accept(BetterToolsModItems.BERRY_SMOOTHIE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("better_tools", "tools_and_armor_tab"),
				builder -> builder.title(Component.translatable("item_group.better_tools.tools_and_armor_tab")).icon(() -> new ItemStack(BetterToolsModItems.END_TITANIUM_PICKAXE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModBlocks.NETHER_DIAMOND_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.NETHER_DIAMOND_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_SWORD.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_PICKAXE.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_AXE.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_SHOVEL.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_HOE.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_DAGGER.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_HELMET.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.NETHER_DIAMOND_BOOTS.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_SCRAP.get());
					tabData.accept(BetterToolsModBlocks.END_TITANIUM_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.END_TITANIUM_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.END_TITANIUM_INGOT.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_SWORD.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_PICKAXE.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_AXE.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_SHOVEL.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_HOE.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_DAGGER.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_HELMET.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.END_TITANIUM_BOOTS.get());
					tabData.accept(BetterToolsModItems.RUBY.get());
					tabData.accept(BetterToolsModBlocks.RUBY_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.DEEPSLATE_RUBY_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.RUBY_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.RUBY_SWORD.get());
					tabData.accept(BetterToolsModItems.RUBY_PICKAXE.get());
					tabData.accept(BetterToolsModItems.RUBY_AXE.get());
					tabData.accept(BetterToolsModItems.RUBY_SHOVEL.get());
					tabData.accept(BetterToolsModItems.RUBY_HOE.get());
					tabData.accept(BetterToolsModItems.RUBY_DAGGER.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE.get());
					tabData.accept(BetterToolsModBlocks.SAPPHIRE_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.SAPPHIRE_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.SAPPHIRE_SWORD.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_PICKAXE.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_AXE.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_SHOVEL.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_HOE.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_DAGGER.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_HELMET.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.SAPPHIRE_BOOTS.get());
					tabData.accept(BetterToolsModItems.TOPAZ.get());
					tabData.accept(BetterToolsModBlocks.TOPAZ_ORE.get().asItem());
					tabData.accept(BetterToolsModBlocks.TOPAZ_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.TOPAZ_SWORD.get());
					tabData.accept(BetterToolsModItems.TOPAZ_PICKAXE.get());
					tabData.accept(BetterToolsModItems.TOPAZ_AXE.get());
					tabData.accept(BetterToolsModItems.TOPAZ_SHOVEL.get());
					tabData.accept(BetterToolsModItems.TOPAZ_HOE.get());
					tabData.accept(BetterToolsModItems.TOPAZ_DAGGER.get());
					tabData.accept(BetterToolsModItems.TOPAZ_HELMET.get());
					tabData.accept(BetterToolsModItems.TOPAZ_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.TOPAZ_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.TOPAZ_BOOTS.get());
					tabData.accept(BetterToolsModItems.FLINT_SWORD.get());
					tabData.accept(BetterToolsModItems.FLINT_PICKAXE.get());
					tabData.accept(BetterToolsModItems.FLINT_AXE.get());
					tabData.accept(BetterToolsModItems.FLINT_SHOVEL.get());
					tabData.accept(BetterToolsModItems.FLINT_HOE.get());
					tabData.accept(BetterToolsModItems.FLINT_DAGGER.get());
					tabData.accept(BetterToolsModItems.WOOD_DAGGER.get());
					tabData.accept(BetterToolsModItems.STONE_DAGGER.get());
					tabData.accept(BetterToolsModItems.IRON_DAGGER.get());
					tabData.accept(BetterToolsModItems.GOLD_DAGGER.get());
					tabData.accept(BetterToolsModItems.DIAMOND_DAGGER.get());
					tabData.accept(BetterToolsModItems.NETHERITE_DAGGER.get());
					tabData.accept(BetterToolsModItems.BATTLE_AXE.get());
					tabData.accept(BetterToolsModItems.ELECTRIC_STAFF.get());
					tabData.accept(BetterToolsModItems.ICE_STAFF.get());
					tabData.accept(BetterToolsModItems.FIRE_STAFF.get());
					tabData.accept(BetterToolsModItems.WARDEN_STAFF.get());
					tabData.accept(BetterToolsModItems.GUARDIAN_STAFF.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("better_tools", "effect_armor_tab"),
				builder -> builder.title(Component.translatable("item_group.better_tools.effect_armor_tab")).icon(() -> new ItemStack(BetterToolsModItems.CACTUS_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetterToolsModItems.GOLD_CARROT_HELMET.get());
					tabData.accept(BetterToolsModItems.IRON_GOLD_CARROT_HELMET.get());
					tabData.accept(BetterToolsModItems.DIAMOND_GOLD_CARROT_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYING_OBSIDIAN_HELMET.get());
					tabData.accept(BetterToolsModItems.DIAMOND_CRYING_OBSIDIAN_HELMET.get());
					tabData.accept(BetterToolsModItems.CACTUS_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.IRON_CACTUS_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.DIAMOND_CACTUS_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.HEARTY_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.IRON_HEARTY_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.DIAMOND_HEARTY_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.MAGMA_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.DIAMOND_MAGMA_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.RUBY_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_RUBY_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTAL_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_CRYSTAL_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.BLACKSTONE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_BLACKSTONE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.SUGAR_BOOTS.get());
					tabData.accept(BetterToolsModItems.IRON_SUGAR_BOOTS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_SUGAR_BOOTS.get());
					tabData.accept(BetterToolsModItems.RABBIT_BOOTS.get());
					tabData.accept(BetterToolsModItems.IRON_RABBIT_BOOTS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_RABBIT_BOOTS.get());
					tabData.accept(BetterToolsModItems.PHANTOM_BOOTS.get());
					tabData.accept(BetterToolsModItems.IRON_PHANTOM_BOOTS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_PHANTOM_BOOTS.get());
					tabData.accept(BetterToolsModItems.WINGED_BOOTS_BOOTS.get());
					tabData.accept(BetterToolsModItems.GLASS_HELMET.get());
					tabData.accept(BetterToolsModItems.GLASS_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.GLASS_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.GLASS_BOOTS.get());
					tabData.accept(BetterToolsModItems.IRON_GLASS_ARMOR_HELMET.get());
					tabData.accept(BetterToolsModItems.IRON_GLASS_ARMOR_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.IRON_GLASS_ARMOR_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.IRON_GLASS_ARMOR_BOOTS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_GLASS_ARMOR_HELMET.get());
					tabData.accept(BetterToolsModItems.DIAMOND_GLASS_ARMOR_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.DIAMOND_GLASS_ARMOR_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.DIAMOND_GLASS_ARMOR_BOOTS.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("better_tools", "crystallite_tab"),
				builder -> builder.title(Component.translatable("item_group.better_tools.crystallite_tab")).icon(() -> new ItemStack(BetterToolsModItems.CRYSTALLITE_GEM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetterToolsModBlocks.JEWELLERY_TABLE.get().asItem());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHARDS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_GEM.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_CHARM_BASE.get());
					tabData.accept(BetterToolsModBlocks.CRYSTALLITE_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.CUT_CRYSTALLITE_BLOCK.get().asItem());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_BOOTS.get());
					tabData.accept(BetterToolsModItems.TOUGH_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.TOUGH_NECKLACE.get());
					tabData.accept(BetterToolsModItems.GILDED_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.GILDED_BRACELET.get());
					tabData.accept(BetterToolsModItems.MAGIC_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.MAGIC_RING.get());
					tabData.accept(BetterToolsModItems.HEAL_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.HEART_CHARM.get());
					tabData.accept(BetterToolsModItems.DIAMOND_HARD_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.DIAMOND_HARD_PLATE.get());
					tabData.accept(BetterToolsModItems.SPIKED_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.WITHERED_GAUNTLET.get());
					tabData.accept(BetterToolsModItems.SPEEDY_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.SPEEDY_NECKLACE.get());
					tabData.accept(BetterToolsModItems.ICE_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.ICY_BRACELET.get());
					tabData.accept(BetterToolsModItems.ELECTRIC_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.ELECTRIC_NECKLACE.get());
					tabData.accept(BetterToolsModItems.FIRE_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.FLAMING_CIRCLET.get());
					tabData.accept(BetterToolsModItems.NATURE_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.NATURE_RING.get());
					tabData.accept(BetterToolsModItems.ECHO_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.WARDEN_HEADBAND.get());
					tabData.accept(BetterToolsModItems.SKY_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.REFLECT_CHARM.get());
					tabData.accept(BetterToolsModItems.EARTH_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.EARTH_CIRCLET.get());
					tabData.accept(BetterToolsModItems.GUARDIAN_CRYSTAL.get());
					tabData.accept(BetterToolsModItems.GUARDIAN_NECKLACE.get());
					tabData.accept(BetterToolsModItems.ENDER_GOGGLES.get());
					tabData.accept(BetterToolsModItems.BOUNCY_BRACELET.get());
					tabData.accept(BetterToolsModItems.POISON_CHARM.get());
					tabData.accept(BetterToolsModItems.LUCKY_CHARM.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_IRON.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_IRON_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_IRON_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_IRON_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_IRON_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_GOLD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_GOLD_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_GOLD_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_GOLD_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_GOLD_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_LAPIS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_LAPIS_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_LAPIS_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_LAPIS_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_LAPIS_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_REDSTONE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_REDSTONE_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_REDSTONE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_REDSTONE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_REDSTONE_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_DIAMOND_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_DIAMOND_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_DIAMOND_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_DIAMOND_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_NETHERITE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHERITE_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHERITE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHERITE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHERITE_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_RUBY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_RUBY_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_RUBY_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_RUBY_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_RUBY_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_SAPPHIRE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SAPPHIRE_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SAPPHIRE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SAPPHIRE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SAPPHIRE_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_TOPAZ.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_TOPAZ_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_TOPAZ_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_TOPAZ_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_TOPAZ_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_NETHER_DIAMOND.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHER_DIAMOND_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHER_DIAMOND_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHER_DIAMOND_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_NETHER_DIAMOND_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_EMERALD.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_EMERALD_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_EMERALD_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_EMERALD_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_EMERALD_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_SCULK.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SCULK_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SCULK_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SCULK_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SCULK_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_SKY.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SKY_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SKY_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SKY_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_SKY_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_AMETHYST.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_AMETHYST_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_AMETHYST_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_AMETHYST_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_AMETHYST_BOOTS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SWORD_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_PICKAXE_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_AXE_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_SHOVEL_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_HOE_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_DAGGER_PRISMARINE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_PRISMARINE_HELMET.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_PRISMARINE_CHESTPLATE.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_PRISMARINE_LEGGINGS.get());
					tabData.accept(BetterToolsModItems.CRYSTALLITE_ARMOR_PRISMARINE_BOOTS.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("better_tools", "blocks_tab"),
				builder -> builder.title(Component.translatable("item_group.better_tools.blocks_tab")).icon(() -> new ItemStack(BetterToolsModBlocks.DARK_POLISHED_IRON_BLOCK.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BetterToolsModBlocks.CHARGED_ICE_ON.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COAL_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COAL_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COAL_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COAL_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COAL_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COAL_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COAL_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COAL_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COAL_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COAL_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_IRON_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_IRON_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_IRON_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_IRON_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_IRON_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_IRON_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_IRON_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_IRON_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_IRON_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_IRON_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_LAPIS_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_LAPIS_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_LAPIS_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_LAPIS_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_LAPIS_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_LAPIS_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_LAPIS_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_LAPIS_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_LAPIS_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_LAPIS_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_DIAMOND_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_DIAMOND_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_DIAMOND_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_DIAMOND_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_DIAMOND_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_EMERALD_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_EMERALD_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_EMERALD_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_EMERALD_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_EMERALD_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_EMERALD_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_EMERALD_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_EMERALD_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_EMERALD_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_EMERALD_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_REDSTONE_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_REDSTONE_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_REDSTONE_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_REDSTONE_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_REDSTONE_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_RUBY_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_RUBY_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_RUBY_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_RUBY_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_RUBY_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COPPER_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COPPER_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COPPER_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COPPER_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.DARK_POLISHED_COPPER_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COPPER_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COPPER_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COPPER_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COPPER_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_COPPER_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_TOPAZ_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_TOPAZ_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_TOPAZ_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_TOPAZ_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_TOPAZ_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_GOLD_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_GOLD_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_GOLD_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_GOLD_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_GOLD_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_GOLD_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_GOLD_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_GOLD_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_GOLD_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_GOLD_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_NETHER_DIAMOND_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_NETHER_DIAMOND_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_NETHER_DIAMOND_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_NETHER_DIAMOND_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_NETHER_DIAMOND_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_NETHER_DIAMOND_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_NETHER_DIAMOND_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_NETHER_DIAMOND_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_NETHER_DIAMOND_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_NETHER_DIAMOND_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_AMETHYST_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_AMETHYST_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_AMETHYST_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_AMETHYST_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.LIGHT_POLISHED_AMETHYST_TRAPDOOR.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_AMETHYST_BLOCK.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_AMETHYST_SLAB.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_AMETHYST_STAIRS.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_AMETHYST_WALL.get().asItem());
					tabData.accept(BetterToolsModBlocks.POLISHED_AMETHYST_TRAPDOOR.get().asItem());
				})

		);
	}
}
