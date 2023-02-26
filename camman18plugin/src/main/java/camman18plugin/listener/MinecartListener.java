package camman18plugin.listener;

import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.util.Vector;

import camman18plugin.Camman18Plugin;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;

public class MinecartListener implements Listener {

	private Camman18Plugin plugin;

	public MinecartListener(Camman18Plugin luckPlugin) {
		this.plugin = luckPlugin;
		this.plugin.hashCode();
	}

	@EventHandler
	public void vehicleMove(VehicleMoveEvent event) {
		Vehicle vehicle = event.getVehicle();
		if (vehicle instanceof Minecart) {
			Minecart minecart = Minecart.class.cast(vehicle);

			Component customName = minecart.customName();
			TextComponent textComponent = TextComponent.class.cast(customName);

			if (textComponent != null && "camman18".equals(textComponent.content())) {
				plugin.getLogger().info("minecart.customName() " + textComponent.content());
				plugin.getLogger().info("minecart " + minecart);
				minecart.setMaxSpeed(minecart.getMaxSpeed() * 2);
				plugin.getLogger().info("minecart.getMaxSpeed " + minecart.getMaxSpeed());

				Vector velocity = minecart.getVelocity();
				Vector newVelocity = velocity.multiply(2);
				minecart.setVelocity(newVelocity);
				plugin.getLogger().info("minecart.getVelocity " + minecart.getVelocity());
			}
		}

	}

}
