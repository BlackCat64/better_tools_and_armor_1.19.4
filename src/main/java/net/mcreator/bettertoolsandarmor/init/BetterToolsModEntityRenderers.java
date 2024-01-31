
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettertoolsandarmor.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bettertoolsandarmor.client.renderer.PurpleMooshroomRenderer;
import net.mcreator.bettertoolsandarmor.client.renderer.IceStaffProjectileRenderer;
import net.mcreator.bettertoolsandarmor.client.renderer.FireStaffProjectileRenderer;
import net.mcreator.bettertoolsandarmor.client.renderer.ElectricStaffProjectileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterToolsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BetterToolsModEntities.PURPLE_MOOSHROOM.get(), PurpleMooshroomRenderer::new);
		event.registerEntityRenderer(BetterToolsModEntities.ICE_STAFF_PROJECTILE.get(), IceStaffProjectileRenderer::new);
		event.registerEntityRenderer(BetterToolsModEntities.ELECTRIC_STAFF_PROJECTILE.get(), ElectricStaffProjectileRenderer::new);
		event.registerEntityRenderer(BetterToolsModEntities.FIRE_STAFF_PROJECTILE.get(), FireStaffProjectileRenderer::new);
	}
}
