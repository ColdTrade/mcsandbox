package sampleplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import sampleplugin.command.SampleCommand;
import sampleplugin.listener.SampleListener;

public class SamplePlugin extends JavaPlugin {
	private SampleListener sampleListener;

	public SamplePlugin() {
		sampleListener = new SampleListener(this);
	}

	@Override
	public void onEnable() {
		getLogger().info("----------------");
		getLogger().info(" Sample Plugin! ");
		getLogger().info("----------------");

		// Register the Event Listeners
		PluginManager pluginManager = getServer().getPluginManager();
		pluginManager.registerEvents(sampleListener, this);

		// Register the Commands
		getCommand("samplecommand").setExecutor(new SampleCommand(this));
	}

	@Override
	public void onDisable() {
		getLogger().info("-----------------------");
		getLogger().info("Good Bye Sample Plugin!");
		getLogger().info("-----------------------");
	}

}