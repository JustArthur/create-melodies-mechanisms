package net.suaptinstallkuma.create_melodies_mechanisms.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.suaptinstallkuma.create_melodies_mechanisms.CreateMelodiesMechanisms;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateMelodiesMechanisms.MOD_ID);

    // Base Plate
    public static final DeferredItem<Item> DEEPSLATE_DISC_PLATE = ITEMS.register("deepslate_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERRACK_DISC_PLATE = ITEMS.register("netherrack_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TERRACOTTA_DISC_PLATE = ITEMS.register("terracotta_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_DISC_PLATE = ITEMS.register("copper_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OXIDIZED_DISC_PLATE = ITEMS.register("oxidized_disc_plate", () -> new Item(new Item.Properties()));

    // Disc Plate
    public static final DeferredItem<Item> BLOCKS_DISC_PLATE = ITEMS.register("blocks_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAT_DISC_PLATE = ITEMS.register("cat_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHIRP_DISC_PLATE = ITEMS.register("chirp_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELEVEN_DISC_PLATE = ITEMS.register("eleven_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FAR_DISC_PLATE = ITEMS.register("far_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIVE_DISC_PLATE = ITEMS.register("five_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MELLOHI_DISC_PLATE = ITEMS.register("mellohi_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MALL_DISC_PLATE = ITEMS.register("mall_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OTHERSIDE_DISC_PLATE = ITEMS.register("otherside_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PIGSTEP_DISC_PLATE = ITEMS.register("pigstep_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RELIC_DISC_PLATE = ITEMS.register("relic_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STAL_DISC_PLATE = ITEMS.register("stal_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRAD_DISC_PLATE = ITEMS.register("strad_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THIRTEEN_DISC_PLATE = ITEMS.register("thirteen_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WAIT_DISC_PLATE = ITEMS.register("wait_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARD_DISC_PLATE = ITEMS.register("ward_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CREATOR_DISC_PLATE = ITEMS.register("creator_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CREATOR_BOX_DISC_PLATE = ITEMS.register("creator_box_disc_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PRECIPICE_BOX_DISC_PLATE = ITEMS.register("precipice_disc_plate", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
