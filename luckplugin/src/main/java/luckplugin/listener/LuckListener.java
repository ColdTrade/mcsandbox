package luckplugin.listener;

import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.inventory.ItemStack;

import luckplugin.LuckPlugin;

public class LuckListener implements Listener {

	private LuckPlugin plugin;

	public LuckListener(LuckPlugin itemDisablePlugin) {
		this.plugin = itemDisablePlugin;
		this.plugin.hashCode();
	}

	boolean executed = false;

	@EventHandler
	public void lootGenerate(LootGenerateEvent event) {
		List<ItemStack> loot = event.getLoot();
		for (ItemStack itemStack : loot) {
			plugin.getLogger().info("itemStack " + itemStack + " " + itemStack.getType() + " " + itemStack.getAmount());
			itemStack.setAmount(itemStack.getAmount() * 7);
		}
	}

}
