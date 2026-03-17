package net.suaptinstallkuma.create_melodies_mechanisms;

import net.neoforged.fml.ModList;
import net.suaptinstallkuma.create_melodies_mechanisms.item.ModItems;
import net.suaptinstallkuma.create_melodies_mechanisms.item.ModItemsCompat;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(CreateMelodiesMechanisms.MOD_ID)
public class CreateMelodiesMechanisms {

    public static final String MOD_ID = "create_melodies_mechanisms";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateMelodiesMechanisms(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        // All items
        ModItems.register(modEventBus);

        // Check if Vanilla Backport mod is loaded
        if(ModList.get().isLoaded("vanillabackport")) {
            ModItemsCompat.registerCompatVanillaBackport(modEventBus);
        }

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.DEEPSLATE_DISC_PLATE);
            event.accept(ModItems.NETHERRACK_DISC_PLATE);
            event.accept(ModItems.TERRACOTTA_DISC_PLATE);
            event.accept(ModItems.COPPER_DISC_PLATE);
            event.accept(ModItems.OXIDIZED_DISC_PLATE);

            if(ModList.get().isLoaded("vanillabackport")) {
                event.accept(ModItemsCompat.CALCITE_DISC_PLATE);
            }
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
