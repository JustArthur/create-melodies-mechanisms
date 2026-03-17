package net.suaptinstallkuma.createmelodiesmechanisms.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.suaptinstallkuma.createmelodiesmechanisms.CreateMelodiesMechanisms;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateMelodiesMechanisms.MOD_ID);

    public static final RegistryObject<Item> DEEPSLATE_DISC_PLATE = ITEMS.register("deepslate_disc_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERRACK_DISC_PLATE = ITEMS.register("netherrack_disc_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERRACOTTA_DISC_PLATE = ITEMS.register("terracotta_disc_plate", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOCKS_DISC_PLATE = ITEMS.register("blocks_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CAT_DISC_PLATE = ITEMS.register("cat_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHIRP_DISC_PLATE = ITEMS.register("chirp_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ELEVEN_DISC_PLATE = ITEMS.register("eleven_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FAR_DISC_PLATE = ITEMS.register("far_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FIVE_DISC_PLATE = ITEMS.register("five_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALL_DISC_PLATE = ITEMS.register("mall_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MELLOHI_DISC_PLATE = ITEMS.register("mellohi_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OTHERSIDE_DISC_PLATE = ITEMS.register("otherside_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PIGSTEP_DISC_PLATE = ITEMS.register("pigstep_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RELIC_DISC_PLATE = ITEMS.register("relic_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STAL_DISC_PLATE = ITEMS.register("stal_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STRAD_DISC_PLATE = ITEMS.register("strad_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> THIRTEEN_DISC_PLATE = ITEMS.register("thirteen_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WAIT_DISC_PLATE = ITEMS.register("wait_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WARD_DISC_PLATE = ITEMS.register("ward_disc_plate", () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
