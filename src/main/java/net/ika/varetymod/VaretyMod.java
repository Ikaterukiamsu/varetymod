package net.ika.varetymod;

import net.fabricmc.api.ModInitializer;

import net.ika.varetymod.enchantment.ModEnchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VaretyMod implements ModInitializer {
	public static final String MOD_ID = "varetymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEnchantments.registerModEnchantments();
	}
}