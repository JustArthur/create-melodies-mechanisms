package com.kuma.createmelodiesmechanisms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RelicDiscPlateItem extends Item {
	public RelicDiscPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}