package net.mcreator.bettertoolsandarmor.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.bettertoolsandarmor.init.BetterToolsModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class EnderTitaniumArmorTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == BetterToolsModItems.END_TITANIUM_HELMET.get() || itemstack.getItem() == BetterToolsModItems.END_TITANIUM_CHESTPLATE.get() || itemstack.getItem() == BetterToolsModItems.END_TITANIUM_LEGGINGS.get()
				|| itemstack.getItem() == BetterToolsModItems.END_TITANIUM_BOOTS.get()) {
			tooltip.add(Component.literal("\u00A77When full set worn:"));
			tooltip.add(Component.literal("\u00A79Saves from void death"));
			tooltip.add(Component.literal("\u00A7cDurability Cost: 20%"));
			tooltip.add(Component.literal("\u00A7cCooldown: 10mins"));
		}
	}
}
