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
//		ItemStack stack = new ItemStack(Material.DIAMOND, 64);
//		loot.add(stack);
//		plugin.getLogger().info("Entity: " + event.getEntity());
//		plugin.getLogger().info("getInventoryHolder: " + event.getInventoryHolder());
//		plugin.getLogger().info("getLootedEntity: " + event.getLootContext().getLootedEntity());
//		if (!executed) {
//			LootContext lootContext = event.getLootContext();
//			LootContext.Builder builder = new LootContext.Builder(lootContext.getLocation());
//			builder = builder.killer(lootContext.getKiller());
//			builder = builder.lootedEntity(lootContext.getLootedEntity());
//			builder = builder.lootingModifier(lootContext.getLootingModifier());
//			float luck = lootContext.getLuck();
//			if (luck < Float.MAX_VALUE) {
//				luck = Float.MAX_VALUE;
//			}
//			builder = builder.luck(luck);
//			LootContext newLootContext = builder.build();
//			event.getLootTable().fillInventory(event.getInventoryHolder().getInventory(), new Random(), newLootContext);
//			plugin.getLogger().info("Increasing luck by a LOT");
//			executed = true;
//		} else {
//			executed = false;
//		}
	}

}
