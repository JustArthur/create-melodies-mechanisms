package net.suaptinstallkuma.createmelodiesmechanisms.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.suaptinstallkuma.createmelodiesmechanisms.CreateMelodiesMechanisms;

public class ModItemsCompat {
    public static final DeferredRegister<Item> ITEMS_COMPAT_VANILLABACKPORT = DeferredRegister.create(ForgeRegistries.ITEMS, CreateMelodiesMechanisms.MOD_ID);

    public static final RegistryObject<Item> CALCITE_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("calcite_disc_plate", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEARS_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("tears_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LAVA_CHICKEN_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("lava_chicken_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS_COMPAT_VANILLABACKPORT.register(eventBus);
    }
}
