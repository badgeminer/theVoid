package net.mcreator.thevoid.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thevoid.network.ThevoidModVariables;
import net.mcreator.thevoid.init.ThevoidModItems;

public class ManaShardRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ThevoidModItems.MANA_SHARD.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		{
			double _setval = (entity.getCapability(ThevoidModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ThevoidModVariables.PlayerVariables())).Mana + 100;
			entity.getCapability(ThevoidModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
