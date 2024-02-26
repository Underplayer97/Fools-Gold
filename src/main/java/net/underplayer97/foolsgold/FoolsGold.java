package net.underplayer97.foolsgold;

import net.fabricmc.api.ModInitializer;

import net.underplayer97.foolsgold.blocks.ModBlocks;
import net.underplayer97.foolsgold.items.ModItemGroups;
import net.underplayer97.foolsgold.items.ModItems;
import net.underplayer97.foolsgold.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoolsGold implements ModInitializer {

	public static final String MOD_ID = "foolsgold";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Found Fools Gold!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();

		ModItemGroups.registerItemGroup();



	}
}