package com.tomwolf.trophy.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class TrophyItems {
	
	public static Item trophyStaff;

	public static final void init(){
		trophyStaff = new Item().setUnlocalizedName("trophyStaff").setCreativeTab(CreativeTabs.tabMisc);
		GameRegistry.registerItem(trophyStaff, "trophyStaff");
	}
}
