package net.otherheaven.tota;

import net.fabricmc.api.ModInitializer;

import net.otherheaven.tota.itemRegistry.TotaItemGroups;
import net.otherheaven.tota.itemRegistry.TotaItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsOfTheApocalypse implements ModInitializer {
	public static final String MOD_ID = "tota";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("TotA loaded!");
		TotaItemGroups.registerItemGroups();
		TotaItems.registerTotaItems();
		TotaLootTableModifiers.modifyLootTables();
	}
}