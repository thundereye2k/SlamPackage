package com.slamtheham.slampackage;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
	
	private Main plugin = Main.getPlugin(Main.class);
	
	public FileConfiguration messagescfg;
	public File messages;
	public FileConfiguration customenchantscfg;
	public File customenchants;
	public FileConfiguration settingscfg;
	public File settings;
	
	public void setup() {
		if(!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		
		messages = new File(plugin.getDataFolder(), "messages.yml");
		customenchants = new File(plugin.getDataFolder(), "customenchants.yml");
		settings = new File(plugin.getDataFolder(), "settings.yml");
		
		if(!messages.exists()) {
			try {
				messages.createNewFile();
				Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "messages.yml" + ChatColor.YELLOW + "has been created and loaded");
			}catch(IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not create ''messages.yml'' file.");
			}
		}	
		if(!customenchants.exists()) {
			try {
				customenchants.createNewFile();	
				Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "customenchants.yml" + ChatColor.YELLOW + "has been created and loaded");
			}catch(IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not create ''customenchants.yml'' file.");
			}	
		}
		if(!settings.exists()) {
			try {
				settings.createNewFile();
				Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "settings.yml" + ChatColor.YELLOW + "has been created and loaded");
			}catch(IOException e) {
				Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Could not create ''settings.yml'' file.");
			}
		}
		
		messagescfg = YamlConfiguration.loadConfiguration(messages);
		customenchantscfg = YamlConfiguration.loadConfiguration(customenchants);	
		settingscfg = YamlConfiguration.loadConfiguration(settings);
		
		
	}
}
