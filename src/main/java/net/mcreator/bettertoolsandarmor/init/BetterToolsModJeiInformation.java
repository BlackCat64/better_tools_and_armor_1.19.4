
package net.mcreator.bettertoolsandarmor.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class BetterToolsModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("better_tools:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(BetterToolsModItems.TOUGH_CRYSTAL.get()), new ItemStack(BetterToolsModItems.GILDED_CRYSTAL.get()), new ItemStack(BetterToolsModItems.MAGIC_CRYSTAL.get()),
				new ItemStack(BetterToolsModItems.HEAL_CRYSTAL.get()), new ItemStack(BetterToolsModItems.DIAMOND_HARD_CRYSTAL.get()), new ItemStack(BetterToolsModItems.SPIKED_CRYSTAL.get()), new ItemStack(BetterToolsModItems.SPEEDY_CRYSTAL.get()),
				new ItemStack(BetterToolsModItems.SKY_CRYSTAL.get()), new ItemStack(BetterToolsModItems.NATURE_CRYSTAL.get()), new ItemStack(BetterToolsModItems.ECHO_CRYSTAL.get()), new ItemStack(BetterToolsModItems.EARTH_CRYSTAL.get()),
				new ItemStack(BetterToolsModItems.GUARDIAN_CRYSTAL.get()), new ItemStack(BetterToolsModItems.HIVE_CRYSTAL.get()), new ItemStack(BetterToolsModItems.FIRE_CRYSTAL.get()), new ItemStack(BetterToolsModItems.ICE_CRYSTAL.get()),
				new ItemStack(BetterToolsModItems.ELECTRIC_CRYSTAL.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.better_tools.elemental_crystals_info"));
	}
}
