package net.ika.varetymod.enchantment;

import net.ika.varetymod.VaretyMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModEnchantments {
    public static Enchantment SWIFT_EARS = register("swift_ears", new SwiftEarsEnchatment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_HEAD));

    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT,new Identifier(VaretyMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        System.out.println("Registering Enchantments for " + VaretyMod.MOD_ID);
    }
}
