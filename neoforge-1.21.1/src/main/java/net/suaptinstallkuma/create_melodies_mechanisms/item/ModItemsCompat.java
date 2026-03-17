package net.suaptinstallkuma.create_melodies_mechanisms.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suaptinstallkuma.create_melodies_mechanisms.CreateMelodiesMechanisms;

public class ModItemsCompat {

    public static final DeferredRegister.Items ITEMS_COMPAT_VANILLABACKPORT = DeferredRegister.createItems(CreateMelodiesMechanisms.MOD_ID);

    public static final DeferredItem<Item> CALCITE_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("calcite_disc_plate", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEARS_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("tears_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> LAVA_CHICKEN_DISC_PLATE = ITEMS_COMPAT_VANILLABACKPORT.register("lava_chicken_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));


    public static void registerCompatVanillaBackport(IEventBus eventBus) {
        ITEMS_COMPAT_VANILLABACKPORT.register(eventBus);
    }
}