package sampleplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.kyori.adventure.text.minimessage.MiniMessage;
import sampleplugin.SamplePlugin;

public class SampleCommand implements CommandExecutor {

	private SamplePlugin plugin;

	public SampleCommand(SamplePlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		plugin.getServer().broadcast(
				MiniMessage.miniMessage().deserialize("Sample Command <color:#00ff00><b>executed</b></color>"));
		return true;
	}

}
