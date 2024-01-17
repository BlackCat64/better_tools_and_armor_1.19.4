
package net.mcreator.bettertoolsandarmor.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bettertoolsandarmor.procedures.DiamondHardPlateUnequippedProcedure;
import net.mcreator.bettertoolsandarmor.procedures.DiamondHardPlateEquippedProcedure;

public class DiamondHardPlateItem extends Item implements ICurioItem {
	public DiamondHardPlateItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		DiamondHardPlateEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		DiamondHardPlateUnequippedProcedure.execute(slotContext.entity());
	}
}
