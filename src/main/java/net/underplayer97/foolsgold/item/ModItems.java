package net.underplayer97.foolsgold.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.ModBlocks;
import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;

public class ModItems {

    public static Item GRIM_PLUSHIE = registerItem("grim_plushie",
            new GrimPlushieItem(ModBlocks.GRIM_PLUSHIE, new FabricItemSettings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FoolsGold.MOD_ID, name), item);
    }


    public static void registerModItems() {

        FoolsGold.LOGGER.info("Registering Mod Items for " + FoolsGold.MOD_ID);

    }

}
