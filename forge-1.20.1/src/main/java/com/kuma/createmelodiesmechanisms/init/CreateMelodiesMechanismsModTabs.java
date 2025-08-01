/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.kuma.createmelodiesmechanisms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.kuma.createmelodiesmechanisms.CreateMelodiesMechanismsMod;

public class CreateMelodiesMechanismsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateMelodiesMechanismsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATE_MELODIES_MECHANISMS_TAB = REGISTRY.register("create_melodies_mechanisms_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_melodies_mechanisms.create_melodies_mechanisms_tab")).icon(() -> new ItemStack(Items.MUSIC_DISC_5)).displayItems((parameters, tabData) -> {
				tabData.accept(CreateMelodiesMechanismsModItems.DEEPSLATE_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.NETHERRACK_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.TERRACOTTA_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.FIVE_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.ELEVEN_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.THIRTEEN_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.CAT_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.BLOCKS_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.CHIRP_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.FAR_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.MELLOHI_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.STAL_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.STRAD_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.WARD_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.WAIT_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.OTHERSIDE_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.PIGSTEP_DISC_PLATE.get());
				tabData.accept(CreateMelodiesMechanismsModItems.RELIC_DISC_PLATE.get());
			}).build());
}