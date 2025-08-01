package com.kuma.createmelodiesmechanisms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElevenDiscPlateItem extends Item {
	public ElevenDiscPlateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}