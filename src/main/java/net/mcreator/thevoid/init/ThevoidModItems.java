
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thevoid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thevoid.item.WeakManaElixirItem;
import net.mcreator.thevoid.item.ShieldRuneItem;
import net.mcreator.thevoid.item.PureManaElixirItem;
import net.mcreator.thevoid.item.PowerfullManaElixirItem;
import net.mcreator.thevoid.item.PowerRuneItem;
import net.mcreator.thevoid.item.ManaShardItem;
import net.mcreator.thevoid.item.ManaPowderItem;
import net.mcreator.thevoid.item.ConsentratedManaElixirItem;
import net.mcreator.thevoid.item.BasicManaElixirItem;
import net.mcreator.thevoid.item.AtherdimItem;
import net.mcreator.thevoid.item.AtherStaffItem;
import net.mcreator.thevoid.ThevoidMod;

public class ThevoidModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThevoidMod.MODID);
	public static final RegistryObject<Item> ATHER_STONE = block(ThevoidModBlocks.ATHER_STONE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ATHERDIM = REGISTRY.register("atherdim", () -> new AtherdimItem());
	public static final RegistryObject<Item> ATHERGRASS = block(ThevoidModBlocks.ATHERGRASS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SHIELD_RUNE = REGISTRY.register("shield_rune", () -> new ShieldRuneItem());
	public static final RegistryObject<Item> POWER_RUNE = REGISTRY.register("power_rune", () -> new PowerRuneItem());
	public static final RegistryObject<Item> SHADOW_KNIGHT = REGISTRY.register("shadow_knight_spawn_egg",
			() -> new ForgeSpawnEggItem(ThevoidModEntities.SHADOW_KNIGHT, -16777216, -13434829, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ATHER_STAFF = REGISTRY.register("ather_staff", () -> new AtherStaffItem());
	public static final RegistryObject<Item> MANA_SHARD = REGISTRY.register("mana_shard", () -> new ManaShardItem());
	public static final RegistryObject<Item> WEAK_MANA_ELIXIR = REGISTRY.register("weak_mana_elixir", () -> new WeakManaElixirItem());
	public static final RegistryObject<Item> BASIC_MANA_ELIXIR = REGISTRY.register("basic_mana_elixir", () -> new BasicManaElixirItem());
	public static final RegistryObject<Item> POWERFULL_MANA_ELIXIR = REGISTRY.register("powerfull_mana_elixir", () -> new PowerfullManaElixirItem());
	public static final RegistryObject<Item> CONSENTRATED_MANA_ELIXIR = REGISTRY.register("consentrated_mana_elixir",
			() -> new ConsentratedManaElixirItem());
	public static final RegistryObject<Item> PURE_MANA_ELIXIR = REGISTRY.register("pure_mana_elixir", () -> new PureManaElixirItem());
	public static final RegistryObject<Item> MANA_POWDER = REGISTRY.register("mana_powder", () -> new ManaPowderItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
