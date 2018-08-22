package com.slamtheham.slampackage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	private static Plugin plugin;
	private ConfigManager cfg;
	public void onEnable() {
		loadConfigManager();
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.GREEN + "" + ChatColor.BOLD + "ENABLED" + ChatColor.YELLOW + "!");
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.RED + "" + ChatColor.BOLD + "DISABLED" + ChatColor.YELLOW + "!");
	}
	
	public void loadConfigManager() {
		cfg = new ConfigManager();
	}

}
