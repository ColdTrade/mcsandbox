package luckplugin.listener;

import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.inventory.ItemStack;

import luckplugin.LuckPlugin;

public class LuckListener implements Listener {

	private LuckPlugin plugin;

	public LuckListener(LuckPlugin luckPlugin) {
		this.plugin = luckPlugin;
		this.plugin.hashCode();
	}

	@EventHandler
	public void lootGenerateLuckier(LootGenerateEvent event) {
		List<ItemStack> loot = event.getLoot();
		for (ItemStack itemStack : loot) {
			itemStack.setAmount(itemStack.getAmount() * 7);
			plugin.getLogger().info("itemStack " + itemStack);
		}
	}

}
