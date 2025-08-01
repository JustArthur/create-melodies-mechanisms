package com.kuma.createmelodiesmechanisms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PigstepDiscPlateItem extends Item {
	public PigstepDiscPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}