package net.thesadpie.coinsystem;

import net.fabricmc.api.ModInitializer;

import net.thesadpie.coinsystem.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoinSystem implements ModInitializer {
	public static final String MOD_ID = "coinsystem";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}