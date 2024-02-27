package net.underplayer97.foolsgold.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.custom.*;

public class ModBlocks {

    public static Block GRIM_PLUSHIE = Registry.register(Registries.BLOCK, new Identifier(FoolsGold.MOD_ID, "grim_plushie"),
            new GrimPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));
    public static Block UNDER_PLUSHIE = Registry.register(Registries.BLOCK, new Identifier(FoolsGold.MOD_ID, "under_plushie"),
            new UnderPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));
    public static Block FRIZZ_PLUSHIE = Registry.register(Registries.BLOCK, new Identifier(FoolsGold.MOD_ID, "frizz_plushie"),
            new FrizzPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));
    public static Block JONO_PLUSHIE = Registry.register(Registries.BLOCK, new Identifier(FoolsGold.MOD_ID, "jono_plushie"),
            new JonoPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));


    /*
    public static Block UNDER_PLUSHIE = registerBlock("under_plushie",
            new UnderPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));
    public static Block JONATHAN_PLUSHIE = registerBlock("jonathan_plushie",
            new JonathanPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));
    public static Block FRIZZ_PLUSHIE = registerBlock("frizz_plushie",
            new FrizzPlushie(FabricBlockSettings.copyOf(Blocks.GRAY_WOOL).nonOpaque()));


     */

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FoolsGold.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FoolsGold.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FoolsGold.LOGGER.info("Registering Mod Blocks for " + FoolsGold.MOD_ID);
    }

}
