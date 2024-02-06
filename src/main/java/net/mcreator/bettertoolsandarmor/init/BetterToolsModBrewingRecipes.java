
package net.mcreator.bettertoolsandarmor.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiBrewingRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class BetterToolsModBrewingRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("better_tools:brewing_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiBrewingRecipe> brewingRecipes = new ArrayList<>();
		ItemStack potion = new ItemStack(Items.POTION);
		ItemStack potion2 = new ItemStack(Items.POTION);
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.EXPERIENCE_BOTTLE)), potion.copy(), new ItemStack(BetterToolsModItems.EXPERIENCE_POTION.get())));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, Potions.LUCK);
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(BetterToolsModBlocks.FOUR_LEAF_CLOVER.get())), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.KARMA_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(BetterToolsModBlocks.PURPLE_MUSHROOM.get())), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.KARMA_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.KARMA_POTION_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.KARMA_POTION_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.SLOW_FALLING);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.FEATHER)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.DOUBLE_JUMP_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.DOUBLE_JUMP_POTION_LONG.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.DOUBLE_JUMP_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.DOUBLE_JUMP_POTION_2.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.LUCK);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.LUCK_POTION_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.LUCK_POTION_2.get());
		PotionUtils.setPotion(potion2, Potions.LUCK);
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.SWIFT_SWIM_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.PRISMARINE_CRYSTALS)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.SWIFT_SWIM_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.SWIFT_SWIM_POTION_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.SWIFT_SWIM_POTION_LONG.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.SWIFT_SWIM_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.SWIFT_SWIM_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.SWIFT_SWIM_POTION_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.SWIFT_SWIM_POTION_2.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.SWIFT_SWIM_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.KARMA_POTION_LONG.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.KARMA_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.KARMA_POTION_2.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.KARMA_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.CRITICALITY_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(BetterToolsModItems.GUARDIAN_SPIKE.get())), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.CRITICALITY_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.CRITICALITY_POTION_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.CRITICALITY_POTION_2.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.CRITICALITY_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.CRITICALITY_POTION.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.CRITICALITY_POTION_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.CRITICALITY_POTION_LONG.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.CRITICALITY_POTION.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.LONG_SLOW_FALLING);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.DOUBLE_JUMP_POTION_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.FEATHER)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, Potions.AWKWARD);
		PotionUtils.setPotion(potion2, BetterToolsModPotions.POTION_OF_DECAY.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Blocks.WITHER_ROSE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.POTION_OF_DECAY.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.POTION_OF_DECAY_LONG.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.POTION_OF_DECAY.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.POTION_OF_DECAY_2.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.POTION_OF_DECAY_LONG.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.POTION_OF_DECAY.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.GLOWSTONE_DUST)), potion.copy(), potion2.copy()));
		PotionUtils.setPotion(potion, BetterToolsModPotions.POTION_OF_DECAY_2.get());
		PotionUtils.setPotion(potion2, BetterToolsModPotions.POTION_OF_DECAY.get());
		brewingRecipes.add(factory.createBrewingRecipe(List.of(new ItemStack(Items.REDSTONE)), potion.copy(), potion2.copy()));
		registration.addRecipes(RecipeTypes.BREWING, brewingRecipes);
	}
}
