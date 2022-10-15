
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thevoid.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.thevoid.network.StatsMessage;
import net.mcreator.thevoid.ThevoidMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ThevoidModKeyMappings {
	public static final KeyMapping STATS = new KeyMapping("key.thevoid.stats", GLFW.GLFW_KEY_M, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(STATS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == STATS.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ThevoidMod.PACKET_HANDLER.sendToServer(new StatsMessage(0, 0));
						StatsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
