package luckplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;

import luckplugin.LuckPlugin;

public class LuckListener implements Listener {

	private LuckPlugin plugin;

	public LuckListener(LuckPlugin itemDisablePlugin) {
		this.plugin = itemDisablePlugin;
		this.plugin.hashCode();
	}

	@EventHandler
	public void lootGenerate(LootGenerateEvent event) {
		this.plugin.getLogger().info("Handlers" + event.getHandlers());
		this.plugin.getLogger().info("Luck: " + event.getLootContext().getLuck());
	}

}
