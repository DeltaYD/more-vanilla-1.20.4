package net.storm.morevanilla;

import net.fabricmc.api.ModInitializer;

import net.storm.morevanilla.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreVanilla implements ModInitializer {
		public static final String MOD_ID = "more-vanilla";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}