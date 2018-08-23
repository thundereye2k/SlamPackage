package com.slamtheham.slampackage.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import co.aikar.commands.annotation.Syntax;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;

@CommandAlias("sp|slampackage|spackage")
public class MainCommand extends BaseCommand {
	
	@Default
	@Subcommand("help")
	@Syntax("")
	@CommandPermission("slampackage.admin")
	public void onHelp(CommandSender sender) {
		String perm = "slampackage.admin";
		String label = getExecCommandLabel();
		if (!(sender.hasPermission("slampackage.admin")));
			sender.sendMessage("&eYou do not have the permission &7&o(" + perm + "&7&o) &eto use &a/" + label + "&e!");
        sender.sendMessage("&a&m--------------------------------------------------");
        sender.sendMessage(" ");
        sender.sendMessage("&f&lSLAM PACKAGE - CUSTOM ENCHANTMENTS");
        sender.sendMessage("&eVersion: &aIndev-v8.21.2018-0.01");
        sender.sendMessage("&ePlugin Developed by &aSlamTheHam");
        sender.sendMessage(" ");
        sender.sendMessage("&a&m--------------------------------------------------");
        sender.sendMessage("&7- How to use /" + label + " properly.");
        sender.sendMessage(" ");
        sender.sendMessage("&7Proper Usage: &e/" + label + " <arg>");
        sender.sendMessage("&bAll possible actions. &7&o(Click the text to auto fill the command)") ;
        sender.sendMessage(" ");
        BaseComponent[] component1 =
                new ComponentBuilder(("&a/" + label + " help &e- Get a full list of commands and help info!"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " help"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component1);
        BaseComponent[] component2 =
                new ComponentBuilder(("&a/" + label + " admin &e- Opens admin menu"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " admin"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component2);
        BaseComponent[] component3 =
                new ComponentBuilder(("&a/" + label + " info/information &e- Sends plugin information message"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " info"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component3);
        BaseComponent[] component4 =
                new ComponentBuilder(("&a/" + label + " ver/version &e- Sends version message"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " ver"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component4);
        BaseComponent[] component5 =
                new ComponentBuilder(("&a/" + label + " reload &e- Reloads the plugin and all configuration files"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " reload"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component5);
        BaseComponent[] component6 =
                new ComponentBuilder(("&a/" + label + " update &e- Updates the plugin if an update is available"))
                        .event(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/" + label + " update"))
                        .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to autofill command").create()))
                        .create();
        sender.spigot().sendMessage(component6);
        sender.sendMessage(("&a&m--------------------------------------------------"));
	}
			
	@Subcommand("admin")
	@Syntax("")
	@CommandPermission("slampackage.admin")
	public void onAdmin (CommandSender sender) {
		String perm = "slampackage.admin";
		String label = getExecCommandLabel();
		
	}
}
