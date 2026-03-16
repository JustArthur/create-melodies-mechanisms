package net.suaptinstallkuma.create_melodies_mechanisms;

import net.suaptinstallkuma.create_melodies_mechanisms.item.ModItems;
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

        ModItems.register(modEventBus);

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

            event.accept(ModItems.BLOCKS_DISC_PLATE);
            event.accept(ModItems.CAT_DISC_PLATE);
            event.accept(ModItems.CHIRP_DISC_PLATE);
            event.accept(ModItems.ELEVEN_DISC_PLATE);
            event.accept(ModItems.FAR_DISC_PLATE);
            event.accept(ModItems.FIVE_DISC_PLATE);
            event.accept(ModItems.MELLOHI_DISC_PLATE);
            event.accept(ModItems.MALL_DISC_PLATE);
            event.accept(ModItems.OTHERSIDE_DISC_PLATE);
            event.accept(ModItems.PIGSTEP_DISC_PLATE);
            event.accept(ModItems.RELIC_DISC_PLATE);
            event.accept(ModItems.STAL_DISC_PLATE);
            event.accept(ModItems.STRAD_DISC_PLATE);
            event.accept(ModItems.THIRTEEN_DISC_PLATE);
            event.accept(ModItems.WAIT_DISC_PLATE);
            event.accept(ModItems.WARD_DISC_PLATE);
            event.accept(ModItems.CREATOR_DISC_PLATE);
            event.accept(ModItems.CREATOR_BOX_DISC_PLATE);
            event.accept(ModItems.PRECIPICE_BOX_DISC_PLATE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
