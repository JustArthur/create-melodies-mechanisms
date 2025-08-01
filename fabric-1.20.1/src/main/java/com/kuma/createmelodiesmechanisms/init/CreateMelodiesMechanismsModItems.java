/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createmelodiesmechanisms.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import com.kuma.createmelodiesmechanisms.item.WardDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.WaitDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.ThirteenDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.TerracottaDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.StradDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.StalDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.RelicDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.PigstepDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.OthersideDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.NetherrackDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.MellohiDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.FiveDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.FarDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.ElevenDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.DeepslateDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.ChirpDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.CatDiscPlateItem;
import com.kuma.createmelodiesmechanisms.item.BlocksDiscPlateItem;
import com.kuma.createmelodiesmechanisms.CreateMelodiesMechanismsMod;

public class CreateMelodiesMechanismsModItems {
	public static Item DEEPSLATE_DISC_PLATE;
	public static Item NETHERRACK_DISC_PLATE;
	public static Item TERRACOTTA_DISC_PLATE;
	public static Item FIVE_DISC_PLATE;
	public static Item ELEVEN_DISC_PLATE;
	public static Item THIRTEEN_DISC_PLATE;
	public static Item CAT_DISC_PLATE;
	public static Item BLOCKS_DISC_PLATE;
	public static Item CHIRP_DISC_PLATE;
	public static Item FAR_DISC_PLATE;
	public static Item MELLOHI_DISC_PLATE;
	public static Item STAL_DISC_PLATE;
	public static Item STRAD_DISC_PLATE;
	public static Item WARD_DISC_PLATE;
	public static Item WAIT_DISC_PLATE;
	public static Item OTHERSIDE_DISC_PLATE;
	public static Item PIGSTEP_DISC_PLATE;
	public static Item RELIC_DISC_PLATE;

	public static void load() {
		DEEPSLATE_DISC_PLATE = register("deepslate_disc_plate", new DeepslateDiscPlateItem());
		NETHERRACK_DISC_PLATE = register("netherrack_disc_plate", new NetherrackDiscPlateItem());
		TERRACOTTA_DISC_PLATE = register("terracotta_disc_plate", new TerracottaDiscPlateItem());
		FIVE_DISC_PLATE = register("five_disc_plate", new FiveDiscPlateItem());
		ELEVEN_DISC_PLATE = register("eleven_disc_plate", new ElevenDiscPlateItem());
		THIRTEEN_DISC_PLATE = register("thirteen_disc_plate", new ThirteenDiscPlateItem());
		CAT_DISC_PLATE = register("cat_disc_plate", new CatDiscPlateItem());
		BLOCKS_DISC_PLATE = register("blocks_disc_plate", new BlocksDiscPlateItem());
		CHIRP_DISC_PLATE = register("chirp_disc_plate", new ChirpDiscPlateItem());
		FAR_DISC_PLATE = register("far_disc_plate", new FarDiscPlateItem());
		MELLOHI_DISC_PLATE = register("mellohi_disc_plate", new MellohiDiscPlateItem());
		STAL_DISC_PLATE = register("stal_disc_plate", new StalDiscPlateItem());
		STRAD_DISC_PLATE = register("strad_disc_plate", new StradDiscPlateItem());
		WARD_DISC_PLATE = register("ward_disc_plate", new WardDiscPlateItem());
		WAIT_DISC_PLATE = register("wait_disc_plate", new WaitDiscPlateItem());
		OTHERSIDE_DISC_PLATE = register("otherside_disc_plate", new OthersideDiscPlateItem());
		PIGSTEP_DISC_PLATE = register("pigstep_disc_plate", new PigstepDiscPlateItem());
		RELIC_DISC_PLATE = register("relic_disc_plate", new RelicDiscPlateItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CreateMelodiesMechanismsMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}