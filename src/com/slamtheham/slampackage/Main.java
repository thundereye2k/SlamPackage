package com.slamtheham.slampackage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.slamtheham.slampackage.commands.EnchanterCommand;
import com.slamtheham.slampackage.listeners.EnchanterMenuListener;
import com.slamtheham.slampackage.menus.EnchanterMenu;
import com.slamtheham.slampackage.enchants.*;

public class Main extends JavaPlugin {
	public static Main instance;
	private Plugin plugin;
	public ConfigManager cfgm;
	EnchanterMenu eCom = new EnchanterMenu();
	Books books = new Books();
	
	public void onEnable() {
		instance = this;
		loadConfigManager();
		books.createItems();
		getCommand("enchanter").setExecutor(new EnchanterCommand());
		EnchanterMenu.createMenu();
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.GREEN + "" + ChatColor.BOLD + "ENABLED" + ChatColor.YELLOW + "!");
		Bukkit.getServer().getPluginManager().registerEvents(new EnchanterMenuListener(), this);
		
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.RED + "" + ChatColor.BOLD + "DISABLED" + ChatColor.YELLOW + "!");
	}
	
	public static Main getPlugin(){
		   return instance;
	
	}
	public void loadConfigManager() {
		cfgm = new ConfigManager();
		cfgm.setup();
	}
}
