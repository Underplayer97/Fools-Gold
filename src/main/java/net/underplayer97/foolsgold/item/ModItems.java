package net.underplayer97.foolsgold.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.ModBlocks;
import net.underplayer97.foolsgold.item.custom.FrizzPlushieItem;
import net.underplayer97.foolsgold.item.custom.GrimPlushieItem;
import net.underplayer97.foolsgold.item.custom.JonoPlushieItem;
import net.underplayer97.foolsgold.item.custom.UnderPlushieItem;

public class ModItems {

    public static Item GRIM_PLUSHIE = registerItem("grim_plushie",
            new GrimPlushieItem(ModBlocks.GRIM_PLUSHIE, new FabricItemSettings()));

    public static Item UNDER_PLUSHIE = registerItem("under_plushie",
            new UnderPlushieItem(ModBlocks.UNDER_PLUSHIE, new FabricItemSettings()));

    public static Item JONO_PLUSHIE = registerItem("jono_plushie",
            new JonoPlushieItem(ModBlocks.JONO_PLUSHIE, new FabricItemSettings()));

    public static Item FRIZZ_PLUSHIE = registerItem("frizz_plushie",
            new FrizzPlushieItem(ModBlocks.FRIZZ_PLUSHIE, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FoolsGold.MOD_ID, name), item);
    }


    public static void registerModItems() {

        FoolsGold.LOGGER.info("Registering Mod Items for " + FoolsGold.MOD_ID);

    }

}
