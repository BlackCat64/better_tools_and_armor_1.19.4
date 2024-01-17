
package net.mcreator.bettertoolsandarmor.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bettertoolsandarmor.procedures.LuckyCharmUnequippedProcedure;
import net.mcreator.bettertoolsandarmor.procedures.LuckyCharmEquippedProcedure;

public class LuckyCharmItem extends Item implements ICurioItem {
	public LuckyCharmItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		LuckyCharmEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		LuckyCharmUnequippedProcedure.execute(slotContext.entity());
	}
}
