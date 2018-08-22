package com.slamtheham.slampackage.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import co.aikar.commands.annotation.Syntax;

@CommandAlias("sp|slampackage|spackage")
public class MainCommand extends BaseCommand {
	
	@Default
	@Subcommand("help")
	@Syntax("")
	@CommandPermission("slampackage.admin")
	public void onHelp(CommandSender sender) {
		String label = getExecCommandLabel();
		sender.sendMessage(label);
	}
	
	
}
