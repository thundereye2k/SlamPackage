package com.slamtheham.slampackage;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
	private  Main plugin = Main.getPlugin(Main.class);
	
	public  FileConfiguration msgCfg;
	public  File msg;
	public  FileConfiguration ceCfg;
	public  File ce;
	public  FileConfiguration setCfg;
	public  File set;
	
	public void setup() {
		if (!plugin.getDataFolder().exists()) {
			plugin.getDataFolder().mkdir();
		}
		
		msg = new File(plugin.getDataFolder(), "messages.yml");
		ce = new File(plugin.getDataFolder(), "customenchants.yml");
		set = new File(plugin.getDataFolder(), "settings.yml");
		
		if (!msg.exists()) {
			try {
				msg.createNewFile();
			} catch(IOException e) {
				Bukkit.getServer().getLogger().severe("Could not load ''messages.yml''!");
			}
		}
		
		if (!ce.exists()) {
			try {
				ce.createNewFile();
			} catch(IOException e) {
				Bukkit.getServer().getLogger().severe("Could not load ''customenchants.yml''!");
			}
		}
		
		if (!set.exists()) {
			try {
				set.createNewFile();
			} catch(IOException e) {
				Bukkit.getServer().getLogger().severe("Could not load ''settings.yml''!");
			}
		}
		
		msgCfg = YamlConfiguration.loadConfiguration(msg);
		ceCfg = YamlConfiguration.loadConfiguration(ce);
		setCfg = YamlConfiguration.loadConfiguration(set);
		
		
		
		msgCfg.options().copyDefaults(true);
		saveDefaultConfig();
		ceCfg.options().copyDefaults(true);
		saveDefaultConfig();
		setCfg.options().copyDefaults(true);
		saveDefaultConfig();
	}
	
	public void saveDefaultConfig() {
	    if (msg == null) {
	        msg = new File(plugin.getDataFolder(), "messages.yml");
	    }
	    if (!msg.exists()) { 
	         plugin.saveResource("messages.yml", false);
	     }
	    if (ce == null) {
	        ce = new File(plugin.getDataFolder(), "customenchants.yml");
	    }
	    if (!ce.exists()) { 
	         plugin.saveResource("customenchants.yml", false);
	     }
	    
	    if (set == null) {
	        set = new File(plugin.getDataFolder(), "sets.yml");
	    }
	    if (!set.exists()) { 
	         plugin.saveResource("sets.yml", false);
	     }
	}
}









