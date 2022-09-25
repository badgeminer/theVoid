
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thevoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.thevoid.world.biome.TheDungeonBiomeBiome;
import net.mcreator.thevoid.ThevoidMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThevoidModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ThevoidMod.MODID);
	public static final RegistryObject<Biome> THE_DUNGEON_BIOME = REGISTRY.register("the_dungeon_biome", () -> TheDungeonBiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheDungeonBiomeBiome.init();
		});
	}
}
