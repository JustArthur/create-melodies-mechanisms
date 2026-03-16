package net.suaptinstallkuma.create_melodies_mechanisms;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = CreateMelodiesMechanisms.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = CreateMelodiesMechanisms.MOD_ID, value = Dist.CLIENT)
public class CreateMelodiesMechanismsClient {
    public CreateMelodiesMechanismsClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {

    }
}
