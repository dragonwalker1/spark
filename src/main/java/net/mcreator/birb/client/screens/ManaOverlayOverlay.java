
package net.mcreator.birb.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.birb.procedures.ManavalueProcedure;
import net.mcreator.birb.procedures.ManaBarProcedureProcedure;
import net.mcreator.birb.procedures.ManaBarProc9Procedure;
import net.mcreator.birb.procedures.ManaBarProc8Procedure;
import net.mcreator.birb.procedures.ManaBarProc7Procedure;
import net.mcreator.birb.procedures.ManaBarProc6Procedure;
import net.mcreator.birb.procedures.ManaBarProc5Procedure;
import net.mcreator.birb.procedures.ManaBarProc4Procedure;
import net.mcreator.birb.procedures.ManaBarProc3Procedure;
import net.mcreator.birb.procedures.ManaBarProc2Procedure;
import net.mcreator.birb.procedures.ManaBarProc10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ManaOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/dbghb.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 93, posY + 28, 0, 0, 120, 120, 120, 120);

			if (ManaBarProcedureProcedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/sadwasd.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/flat_right_side_thingytlol.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -2, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/sdfweasd.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc4Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/asdwf.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc5Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/sdfsf.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc6Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/sdf.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc7Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/bruvvvxd.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc8Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/idkreallyknowwhattocalltheseanymorelol.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc9Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/flat_right_side_thingytlol.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			if (ManaBarProc10Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("birb:textures/screens/endrightmana.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + 92, posY + 28, 0, 0, 120, 120, 120, 120);
			}
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ManavalueProcedure.execute(entity), posX + 96, posY + 73, -11812622);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
