
package net.mcreator.bettertoolsandarmor.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bettertoolsandarmor.procedures.GildedBraceletUnequippedProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GildedBraceletEquippedProcedure;

public class GildedBraceletItem extends Item implements ICurioItem {
	public GildedBraceletItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
		return true;
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		GildedBraceletEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		GildedBraceletUnequippedProcedure.execute(slotContext.entity());
	}
}
