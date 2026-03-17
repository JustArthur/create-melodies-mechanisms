package net.suaptinstallkuma.create_melodies_mechanisms.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.suaptinstallkuma.create_melodies_mechanisms.CreateMelodiesMechanisms;

public class ModItems {

    public static final Item DEEPSLATE_DISC_PLATE = registerItem("deepslate_disc_plate", new Item(new FabricItemSettings()));
    public static final Item NETHERRACK_DISC_PLATE = registerItem("netherrack_disc_plate", new Item(new FabricItemSettings()));
    public static final Item TERRACOTTA_DISC_PLATE = registerItem("terracotta_disc_plate", new Item(new FabricItemSettings()));

    public static final Item BLOCKS_DISC_PLATE = registerItem("blocks_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CAT_DISC_PLATE = registerItem("cat_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CHIRP_DISC_PLATE = registerItem("chirp_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item ELEVEN_DISC_PLATE = registerItem("eleven_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item FAR_DISC_PLATE = registerItem("far_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item FIVE_DISC_PLATE = registerItem("five_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item MALL_DISC_PLATE = registerItem("mall_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item MELLOHI_DISC_PLATE = registerItem("mellohi_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item OTHERSIDE_DISC_PLATE = registerItem("otherside_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item PIGSTEP_DISC_PLATE = registerItem("pigstep_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item RELIC_DISC_PLATE = registerItem("relic_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STAL_DISC_PLATE = registerItem("stal_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item STRAD_DISC_PLATE = registerItem("strad_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item THIRTEEN_DISC_PLATE = registerItem("thirteen_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WAIT_DISC_PLATE = registerItem("wait_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WARD_DISC_PLATE = registerItem("ward_disc_plate", new Item(new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(DEEPSLATE_DISC_PLATE);
        entries.add(NETHERRACK_DISC_PLATE);
        entries.add(TERRACOTTA_DISC_PLATE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMelodiesMechanisms.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
