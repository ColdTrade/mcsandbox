package camman18plugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import camman18plugin.listener.MinecartListener;

public class Camman18Plugin extends JavaPlugin {
	private MinecartListener minecartListener;

	public Camman18Plugin() {
		minecartListener = new MinecartListener(this);
	}

	@Override
	public void onEnable() {
		getLogger().info("----------------");
		getLogger().info("Camman18 Plugin!");
		getLogger().info("----------------");

		// Register the Event Listeners
		PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvents(minecartListener, this);
	}

	@Override
	public void onDisable() {
		getLogger().info("-----------------------");
		getLogger().info("  Bye Camman18 Plugin! ");
		getLogger().info("-----------------------");
	}

}