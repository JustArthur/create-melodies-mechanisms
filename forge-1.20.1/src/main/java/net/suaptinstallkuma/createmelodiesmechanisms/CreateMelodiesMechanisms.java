package net.suaptinstallkuma.createmelodiesmechanisms;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.suaptinstallkuma.createmelodiesmechanisms.item.ModItems;
import net.suaptinstallkuma.createmelodiesmechanisms.item.ModItemsCompat;
import org.slf4j.Logger;

@Mod(CreateMelodiesMechanisms.MOD_ID)
public class CreateMelodiesMechanisms {
    public static final String MOD_ID = "create_melodies_mechanisms";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateMelodiesMechanisms(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);

        if(ModList.get().isLoaded("vanillabackport")) {
            ModItemsCompat.register(modEventBus);
        }

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

            if(ModList.get().isLoaded("vanillabackport")) {
                event.accept(ModItemsCompat.CALCITE_DISC_PLATE);
            }
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
