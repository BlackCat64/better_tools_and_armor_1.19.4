
package net.mcreator.bettertoolsandarmor.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bettertoolsandarmor.procedures.CrystalliteHelmetSculkProcedureProcedure;
import net.mcreator.bettertoolsandarmor.procedures.CharmCounterIncrementProcedure;
import net.mcreator.bettertoolsandarmor.procedures.CharmCounterDecrementProcedure;

public class WardenHeadbandItem extends Item implements ICurioItem {
	public WardenHeadbandItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		CrystalliteHelmetSculkProcedureProcedure.execute(slotContext.entity().level, slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		CharmCounterIncrementProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		CharmCounterDecrementProcedure.execute(slotContext.entity());
	}
}
