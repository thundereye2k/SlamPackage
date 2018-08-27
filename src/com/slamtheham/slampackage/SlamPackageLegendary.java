package com.slamtheham.slampackage;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.CEnchantments;

public class SlamPackageLegendary {
	private static SlamPackageLegendary instance = new SlamPackageLegendary();

	public static SlamPackageLegendary getInstance() {
		return instance;
	}
	public static ArrayList<LegendaryEnchantments> getEnchantments() {
		ArrayList<CEnchantments> enchs = new ArrayList<CEnchantments>();
		for(CEnchantments en : CEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
