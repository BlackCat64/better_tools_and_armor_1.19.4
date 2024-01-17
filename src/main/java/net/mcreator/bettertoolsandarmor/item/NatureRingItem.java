
package net.mcreator.bettertoolsandarmor.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.bettertoolsandarmor.procedures.CrystalliteChestplateEmeraldProcedureProcedure;
import net.mcreator.bettertoolsandarmor.procedures.CharmCounterIncrementProcedure;
import net.mcreator.bettertoolsandarmor.procedures.CharmCounterDecrementProcedure;

public class NatureRingItem extends Item implements ICurioItem {
	public NatureRingItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		CrystalliteChestplateEmeraldProcedureProcedure.execute(slotContext.entity().level, slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
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
