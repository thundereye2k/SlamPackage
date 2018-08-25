package com.slamtheham.slampackage.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import com.slamtheham.slampackage.utils.Utils;

public class MainCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof ConsoleCommandSender) {
			return true;
		}
						
		if (label.equalsIgnoreCase("slampackage")||(label.equalsIgnoreCase("sp"))){
			String permission = "slampackage.admin";
			
			sender.sendMessage(Utils.cc(""));
			
		}
		return true;
		
	}
	
}
