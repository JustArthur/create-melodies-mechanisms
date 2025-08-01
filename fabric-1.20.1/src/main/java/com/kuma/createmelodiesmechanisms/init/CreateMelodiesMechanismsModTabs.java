/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createmelodiesmechanisms.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.kuma.createmelodiesmechanisms.CreateMelodiesMechanismsMod;

public class CreateMelodiesMechanismsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CREATE_MELODIES_MECHANISMS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreateMelodiesMechanismsMod.MODID, "create_melodies_mechanisms_tab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATE_MELODIES_MECHANISMS_TAB,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreateMelodiesMechanismsMod.MODID + ".create_melodies_mechanisms_tab")).icon(() -> new ItemStack(Items.MUSIC_DISC_5)).build());
	}
}