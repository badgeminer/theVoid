
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thevoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thevoid.block.DungeonEntranceBlock;
import net.mcreator.thevoid.block.AthergrassBlock;
import net.mcreator.thevoid.block.AtherdimPortalBlock;
import net.mcreator.thevoid.block.AtherStoneBlock;
import net.mcreator.thevoid.ThevoidMod;

public class ThevoidModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ThevoidMod.MODID);
	public static final RegistryObject<Block> ATHER_STONE = REGISTRY.register("ather_stone", () -> new AtherStoneBlock());
	public static final RegistryObject<Block> ATHERDIM_PORTAL = REGISTRY.register("atherdim_portal", () -> new AtherdimPortalBlock());
	public static final RegistryObject<Block> ATHERGRASS = REGISTRY.register("athergrass", () -> new AthergrassBlock());
	public static final RegistryObject<Block> DUNGEON_ENTRANCE = REGISTRY.register("dungeon_entrance", () -> new DungeonEntranceBlock());
}
