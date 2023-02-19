package luckplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import luckplugin.listener.LuckListener;

public class LuckPlugin extends JavaPlugin {
	private LuckListener luckListener;

	public LuckPlugin() {
		luckListener = new LuckListener(this);
	}

	@Override
	public void onEnable() {
		getLogger().info("----------------");
		getLogger().info("  Lucky Plugin! ");
		getLogger().info("----------------");

		// Register the Event Listeners
		PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvents(luckListener, this);

		// Register the Commands
//		getCommand("luckcommand").setExecutor(new LuckCommand(this));
	}

	@Override
	public void onDisable() {
		getLogger().info("-----------------------");
		getLogger().info("Good Bye Lucky Plugin! ");
		getLogger().info("-----------------------");
	}

}