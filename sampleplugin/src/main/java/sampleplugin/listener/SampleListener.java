package sampleplugin.listener;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.Title.Times;
import net.kyori.adventure.util.Ticks;
import sampleplugin.SamplePlugin;

public class SampleListener implements Listener {

	private SamplePlugin plugin;

	public SampleListener(SamplePlugin itemDisablePlugin) {
		this.plugin = itemDisablePlugin;
	}

	@EventHandler
	public void playerItemConsumeEventHandler(PlayerItemConsumeEvent event) {
		plugin.getServer().broadcast(MiniMessage.miniMessage()
				.deserialize("Ingested food: <color:#00ff00><b>" + event.getItem().getType() + "</b></color>"));

		Times times = Times.times(Ticks.duration(10), Ticks.duration(70), Ticks.duration(20));
		Title title = Title.title(MiniMessage.miniMessage().deserialize("<b>YOUR Plugin</b>"), MiniMessage.miniMessage()
				.deserialize("<b><light_purple><b><i>Yeah, Baby! CUSTOM!</i></b></light_purple></b>"), times);
		event.getPlayer().showTitle(title);

		playMusic(event.getPlayer());
	}

//		event.getPlayer().setArrowsInBody(700);
//		event.getPlayer().setGlowing(false);
//		event.getPlayer().showElderGuardian();
//		event.getPlayer().spawnParticle(Particle.DRIP_LAVA, event.getPlayer().getLocation(), 500, 2, 2, 2);
//		event.getPlayer().spawnParticle(Particle.DRIP_WATER, event.getPlayer().getLocation(), 500, 2, 2, 2);

	protected void playMusic(Player player) {
		// value pitch value pitch value pitch
		// 0.5 F# 1 F# 2 F#
		// 0.53 G 1.059 G
		// 0.561 G# 1.122 G#
		// 0.595 A 1.189 A
		// 0.63 A# 1.26 A#
		// 0.667 B 1.335 B
		// 0.707 C 1.414 C
		// 0.749 C# 1.498 C#
		// 0.794 D 1.587 D
		// 0.841 D# 1.682 D#
		// 0.891 E 1.782 E
		// 0.944 F 1.888 F

		Sound instrument = Sound.BLOCK_NOTE_BLOCK_PLING;
		// Sound instrument = Sound.BLOCK_NOTE_BLOCK_HARP;
		player.playSound(player.getLocation(), instrument, 1, 1.335f); // B
		int timeToSleep = 100;
		sleepyTime(timeToSleep);
		player.playSound(player.getLocation(), instrument, 1, 1.498f); // D#
		sleepyTime(timeToSleep);
		player.playSound(player.getLocation(), instrument, 1, 2.0f); // F#
		sleepyTime(timeToSleep);
		player.playSound(player.getLocation(), instrument, 1, 1.498f); // D#
		sleepyTime(50);
		player.playSound(player.getLocation(), instrument, 1, 2.0f); // F#
	}

	private void sleepyTime(int timeToSleep) {
		try {
			Thread.sleep(timeToSleep);
		} catch (InterruptedException e) {
			// Nothing
			plugin.getLogger().info("Error sleeping: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
