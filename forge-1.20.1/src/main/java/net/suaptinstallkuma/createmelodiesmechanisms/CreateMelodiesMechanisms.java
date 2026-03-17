package net.suaptinstallkuma.createmelodiesmechanisms;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.suaptinstallkuma.createmelodiesmechanisms.item.ModItems;
import org.slf4j.Logger;

@Mod(CreateMelodiesMechanisms.MOD_ID)
public class CreateMelodiesMechanisms {
    public static final String MOD_ID = "create_melodies_mechanisms";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateMelodiesMechanisms(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.DEEPSLATE_DISC_PLATE);
            event.accept(ModItems.NETHERRACK_DISC_PLATE);
            event.accept(ModItems.TERRACOTTA_DISC_PLATE);

            event.accept(ModItems.BLOCKS_DISC_PLATE);
            event.accept(ModItems.CAT_DISC_PLATE);
            event.accept(ModItems.CHIRP_DISC_PLATE);
            event.accept(ModItems.ELEVEN_DISC_PLATE);
            event.accept(ModItems.FAR_DISC_PLATE);
            event.accept(ModItems.FIVE_DISC_PLATE);
            event.accept(ModItems.MALL_DISC_PLATE);
            event.accept(ModItems.MELLOHI_DISC_PLATE);
            event.accept(ModItems.OTHERSIDE_DISC_PLATE);
            event.accept(ModItems.PIGSTEP_DISC_PLATE);
            event.accept(ModItems.RELIC_DISC_PLATE);
            event.accept(ModItems.STAL_DISC_PLATE);
            event.accept(ModItems.STRAD_DISC_PLATE);
            event.accept(ModItems.THIRTEEN_DISC_PLATE);
            event.accept(ModItems.WAIT_DISC_PLATE);
            event.accept(ModItems.WARD_DISC_PLATE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
