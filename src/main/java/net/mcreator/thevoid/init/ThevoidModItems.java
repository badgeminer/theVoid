
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thevoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thevoid.ThevoidMod;

public class ThevoidModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThevoidMod.MODID);
	public static final RegistryObject<Item> DUNGEON_ENTRANCE = block(ThevoidModBlocks.DUNGEON_ENTRANCE, ThevoidModTabs.TAB_THE_DUNGON_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
