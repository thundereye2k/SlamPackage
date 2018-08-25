package com.slamtheham.slampackage.enchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.slamtheham.slampackage.utils.Utils;

public class Books {
	public static ItemStack simpleBook = new ItemStack(Material.BOOK, 1);
	public static ItemStack uniqueBook = new ItemStack(Material.BOOK, 1);
	public static ItemStack eliteBook = new ItemStack(Material.BOOK, 1); 
	public static ItemStack ultimateBook = new ItemStack(Material.BOOK, 1);
	public static ItemStack legendaryBook = new ItemStack(Material.BOOK, 1);

	ItemMeta simpleBookMeta = simpleBook.getItemMeta();
	ItemMeta uniqueBookMeta = uniqueBook.getItemMeta();
	ItemMeta eliteBookMeta = eliteBook.getItemMeta();
	ItemMeta ultimateBookMeta = ultimateBook.getItemMeta();
	ItemMeta legendaryBookMeta = legendaryBook.getItemMeta();

	public void createItems() {
		
		List<String> lore1 = new ArrayList<String>();
		List<String> lore2 = new ArrayList<String>();
		List<String> lore3 = new ArrayList<String>();
		List<String> lore4 = new ArrayList<String>();
		List<String> lore5 = new ArrayList<String>();

		simpleBookMeta.setDisplayName(Utils.cc("&f&lSimple Enchantment Book &7(Right Click)"));
		uniqueBookMeta.setDisplayName(Utils.cc("&a&lUnique Enchantment Book &7(Right Click)"));
		eliteBookMeta.setDisplayName(Utils.cc("&b&lElite Enchantment Book &7(Right Click)"));
		ultimateBookMeta.setDisplayName(Utils.cc("&e&lUltimate Enchantment Book &7(Right Click)"));
		legendaryBookMeta.setDisplayName(Utils.cc("&6&lLegendary Enchantment Book &7(Right Click)"));

		lore1.add(Utils.cc("&7Examine to recive a random"));
		lore1.add(Utils.cc("&fsimple &7enchantment book."));

		lore2.add(Utils.cc("&7Examine to recive a random"));
		lore2.add(Utils.cc("&aunique &7enchantment book."));

		lore3.add(Utils.cc("&7Examine to recive a random"));
		lore3.add(Utils.cc("&belite &7enchantment book."));

		lore4.add(Utils.cc("&7Examine to recive a random"));
		lore4.add(Utils.cc("&eultimate &7enchantment book."));

		lore5.add(Utils.cc("&7Examine to recive a random"));
		lore5.add(Utils.cc("&6&llegendary &7enchantment book."));
	
		simpleBookMeta.setLore(lore1);
		uniqueBookMeta.setLore(lore2);
		eliteBookMeta.setLore(lore3);
		ultimateBookMeta.setLore(lore4);
		legendaryBookMeta.setLore(lore5);
		
		simpleBook.setItemMeta(simpleBookMeta);
		uniqueBook.setItemMeta(uniqueBookMeta);
		eliteBook.setItemMeta(eliteBookMeta);
		ultimateBook.setItemMeta(ultimateBookMeta);
		legendaryBook.setItemMeta(legendaryBookMeta);

	}
}
