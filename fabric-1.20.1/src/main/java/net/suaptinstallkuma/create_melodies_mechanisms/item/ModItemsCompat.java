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

public class ModItemsCompat {
    public static final Item CALCITE_DISC_PLATE = registerItem("calcite_disc_plate", new Item(new FabricItemSettings()));

    public static final Item TEARS_DISC_PLATE = registerItem("tears_disc_plate", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item LAVA_CHICKEN_DISC_PLATE = registerItem("lava_chicken_disc_plate", new Item(new FabricItemSettings().maxCount(1)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CALCITE_DISC_PLATE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateMelodiesMechanisms.MOD_ID, name), item);
    }

    public static void registerModItemsCompat() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemsCompat::addItemsToIngredientItemGroup);
    }
}
