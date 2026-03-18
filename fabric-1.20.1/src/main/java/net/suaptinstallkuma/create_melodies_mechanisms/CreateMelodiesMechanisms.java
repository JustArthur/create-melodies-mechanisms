package net.suaptinstallkuma.create_melodies_mechanisms;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.suaptinstallkuma.create_melodies_mechanisms.item.ModItems;
import net.suaptinstallkuma.create_melodies_mechanisms.item.ModItemsCompat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateMelodiesMechanisms implements ModInitializer {
	public static final String MOD_ID = "create_melodies_mechanisms";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		if(FabricLoader.getInstance().isModLoaded("vanillabackport")) {
			ModItemsCompat.registerModItemsCompat();
		}
	}
}