package net.otherheaven.tota.itemRegistry;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.otherheaven.tota.ToolsOfTheApocalypse;

import java.util.function.Supplier;

public class TotaArmorMaterials {

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ToolsOfTheApocalypse.MOD_ID,name), material.get());
    }
}
