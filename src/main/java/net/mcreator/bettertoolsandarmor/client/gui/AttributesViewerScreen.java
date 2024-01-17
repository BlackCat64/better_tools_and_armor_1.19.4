package net.mcreator.bettertoolsandarmor.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.bettertoolsandarmor.world.inventory.AttributesViewerMenu;
import net.mcreator.bettertoolsandarmor.procedures.GetThornsDamageProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetThornsDamageModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetSwimSpeedProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetSwimSpeedModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetMovementSpeedProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetMovementSpeedModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetLuckProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetLuckModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetKnockbackResistanceVarProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetKnockbackResistanceModifierVarProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetGravityProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetGravityModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetCritHitMultiplierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetCritHitMultiplierModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetBlockReachProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetBlockReachModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetAttackKnockbackProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetAttackKnockbackModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetAttackDamageProcedureProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetAttackDamageModifierProcedureProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetArmorToughnessProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetArmorToughnessModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetArmorPointsProcedure;
import net.mcreator.bettertoolsandarmor.procedures.GetArmorPointsModifierProcedure;
import net.mcreator.bettertoolsandarmor.procedures.AttributesViewerGetMaxHealthProcedure;
import net.mcreator.bettertoolsandarmor.procedures.AttributeViewerGetMaxHealthModifierProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AttributesViewerScreen extends AbstractContainerScreen<AttributesViewerMenu> {
	private final static HashMap<String, Object> guistate = AttributesViewerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AttributesViewerScreen(AttributesViewerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 170;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("better_tools:textures/screens/attributes_viewer.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_horizontal_line.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 28, 0, 0, 110, 4, 110, 4);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_horizontal_line.png"));
		this.blit(ms, this.leftPos + 57, this.topPos + 28, 0, 0, 110, 4, 110, 4);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_vertical_line.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 19, 0, 0, 4, 131, 4, 131);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_vertical_line.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 19, 0, 0, 4, 131, 4, 131);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_vertical_line.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 65, 0, 0, 4, 131, 4, 131);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_vertical_line.png"));
		this.blit(ms, this.leftPos + 128, this.topPos + 64, 0, 0, 4, 131, 4, 131);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_line_crossover.png"));
		this.blit(ms, this.leftPos + 127, this.topPos + 29, 0, 0, 6, 2, 6, 2);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_line_crossover.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 29, 0, 0, 6, 2, 6, 2);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/hp_heart.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 34, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/armor.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 46, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/armor_toughness.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 59, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/strength.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 85, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/attack_knockback.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 95, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/knockback_resistance.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 72, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/grass_block_side.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 139, 0, 0, 8, 8, 8, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/slow_falling.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 127, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/speed.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 150, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/luck.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 174, 0, 0, 9, 9, 9, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/critical_hit_multiplier.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 111, 0, 0, 8, 8, 8, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/swift_swim.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 163, 0, 0, 8, 8, 8, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/spiked_crystal.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 186, 0, 0, 8, 8, 8, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_line_crossover.png"));
		this.blit(ms, this.leftPos + 83, this.topPos + 29, 0, 0, 6, 2, 6, 2);

		RenderSystem.setShaderTexture(0, new ResourceLocation("better_tools:textures/screens/gui_line_crossover.png"));
		this.blit(ms, this.leftPos + 130, this.topPos + 29, 0, 0, 6, 2, 6, 2);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_attribute_viewer"), 42, 5, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_attribute"), 19, 19, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_modifier"), 86, 19, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_value"), 135, 19, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_max_health"), 15, 35, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_armor"), 15, 46, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_toughness"), 14, 59, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_attack_damage"), 14, 84, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_knockback"), 14, 95, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_atk_speed"), 13, 72, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_atk_reach"), 14, 127, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_crit_multiplier"), 14, 107, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_multiplier"), 14, 116, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_block_reach"), 14, 139, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_movement_speed"), 12, 151, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_swim_speed"), 13, 163, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_luck"), 14, 174, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.better_tools.attributes_viewer.label_thorns_dmg"), 13, 186, -12829636);
		this.font.draw(poseStack,

				AttributeViewerGetMaxHealthModifierProcedure.execute(entity), 92, 35, -12829636);
		this.font.draw(poseStack,

				GetArmorPointsModifierProcedure.execute(entity), 92, 47, -12829636);
		this.font.draw(poseStack,

				GetArmorToughnessModifierProcedure.execute(entity), 92, 59, -12829636);
		this.font.draw(poseStack,

				GetCritHitMultiplierModifierProcedure.execute(entity), 92, 111, -12829636);
		this.font.draw(poseStack,

				GetGravityModifierProcedure.execute(entity), 92, 127, -12829636);
		this.font.draw(poseStack,

				GetBlockReachModifierProcedure.execute(entity), 92, 139, -12829636);
		this.font.draw(poseStack,

				GetMovementSpeedModifierProcedure.execute(entity), 92, 152, -12829636);
		this.font.draw(poseStack,

				GetSwimSpeedModifierProcedure.execute(entity), 92, 164, -12829636);
		this.font.draw(poseStack,

				GetThornsDamageModifierProcedure.execute(entity), 92, 186, -12829636);
		this.font.draw(poseStack,

				GetLuckModifierProcedure.execute(entity), 92, 175, -12829636);
		this.font.draw(poseStack,

				AttributesViewerGetMaxHealthProcedure.execute(entity), 135, 35, -12829636);
		this.font.draw(poseStack,

				GetArmorPointsProcedure.execute(entity), 135, 47, -12829636);
		this.font.draw(poseStack,

				GetArmorToughnessProcedure.execute(entity), 135, 59, -12829636);
		this.font.draw(poseStack,

				GetCritHitMultiplierProcedure.execute(entity), 135, 111, -12829636);
		this.font.draw(poseStack,

				GetGravityProcedure.execute(entity), 135, 127, -12829636);
		this.font.draw(poseStack,

				GetBlockReachProcedure.execute(entity), 135, 139, -12829636);
		this.font.draw(poseStack,

				GetMovementSpeedProcedure.execute(entity), 135, 152, -12829636);
		this.font.draw(poseStack,

				GetSwimSpeedProcedure.execute(entity), 135, 164, -12829636);
		this.font.draw(poseStack,

				GetLuckProcedure.execute(entity), 135, 175, -12829636);
		this.font.draw(poseStack,

				GetThornsDamageProcedure.execute(entity), 135, 186, -12829636);
		this.font.draw(poseStack,

				GetAttackDamageProcedureProcedure.execute(entity), 134, 84, -12829636);
		this.font.draw(poseStack,

				GetAttackKnockbackModifierProcedure.execute(entity), 92, 96, -12829636);
		this.font.draw(poseStack,

				GetAttackKnockbackProcedure.execute(entity), 134, 96, -12829636);
		this.font.draw(poseStack,

				GetKnockbackResistanceModifierVarProcedure.execute(entity), 92, 72, -12829636);
		this.font.draw(poseStack,

				GetKnockbackResistanceVarProcedure.execute(entity), 134, 72, -12829636);
		this.font.draw(poseStack,

				GetAttackDamageModifierProcedureProcedure.execute(entity), 92, 84, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
