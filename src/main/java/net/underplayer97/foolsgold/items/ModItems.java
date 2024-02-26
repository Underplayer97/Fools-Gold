package net.underplayer97.foolsgold.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;

public class ModItems {






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FoolsGold.MOD_ID, name), item);
    }


    public static void registerModItems() {

        FoolsGold.LOGGER.info("Registering Mod Items for " + FoolsGold.MOD_ID);

    }

}
