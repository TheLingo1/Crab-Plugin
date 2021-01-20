package io.github.thelingo1;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CrabGoneCrab extends JavaPlugin implements Listener{
	// Fired when plugin is first enabled
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}
	// Fired when plugin is disabled.
	public void onDisable() {
	
	}
	// Check for players that have disconnected via Quit
	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		event.setQuitMessage("");
		for (Player p : Bukkit.getOnlinePlayers()) {
			Player player = event.getPlayer();
			//getLogger().info("Player name is " + player.getName());			
			String CrabString = "Crab %goner% is gone Crab";
			CrabString = CrabString.replace("%goner%", player.getName());
			p.sendMessage(ChatColor.GREEN + CrabString);
		}
	}
	// Check for players that have disconnected via Kick
	public void onKick(PlayerKickEvent event) {
		event.setLeaveMessage("");
		for (Player p1 : Bukkit.getOnlinePlayers()) {
			Player player1 = event.getPlayer();
			// getLogger().info("Player name is " + player1.getName());
			String CrabString1 = "Crab %goner% is gone Crab";
			CrabString1 = CrabString1.replace("%goner%", player1.getName());
			p1.sendMessage(ChatColor.GREEN + CrabString1);
		}
	}
	
}
