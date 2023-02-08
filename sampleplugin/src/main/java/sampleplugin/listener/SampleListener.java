package sampleplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import net.kyori.adventure.text.minimessage.MiniMessage;
import sampleplugin.SamplePlugin;

public class SampleListener implements Listener {

	private SamplePlugin plugin;

	public SampleListener(SamplePlugin itemDisablePlugin) {
		this.plugin = itemDisablePlugin;
	}

	@EventHandler
	public void playerItemConsumeEventHandler(PlayerItemConsumeEvent event) {
		plugin.getServer().broadcast(MiniMessage.miniMessage()
				.deserialize("Food Ingested: <color:#00ff00><b>" + event.getItem().getType() + "</b></color>"));
	}
}
