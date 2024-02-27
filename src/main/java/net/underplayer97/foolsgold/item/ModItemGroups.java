package net.underplayer97.foolsgold.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;
import net.underplayer97.foolsgold.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup FOOLSGOLD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FoolsGold.MOD_ID, "foolsgold"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.foolsgold"))
                    .icon(() -> new ItemStack(Items.BARRIER)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.GRIM_PLUSHIE);
                        //entries.add(ModBlocks.UNDER_PLUSHIE);
                        //entries.add(ModBlocks.JONATHAN_PLUSHIE);
                        //entries.add(ModBlocks.FRIZZ_PLUSHIE);

                    })).build());

    public static void registerItemGroup() {
        FoolsGold.LOGGER.info("Registering Item Groups for " + FoolsGold.MOD_ID);
    }


}
