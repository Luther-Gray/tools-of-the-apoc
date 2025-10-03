package net.otherheaven.tota.itemRegistry;


import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.otherheaven.tota.ToolsOfTheApocalypse;

public class TotaItems {
    public static final Item SCRAP_PICKAXE = registerItem("scrap_pickaxe", new PickaxeItem(TotaToolMaterials.SCRAP,new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(TotaToolMaterials.SCRAP, 1.0F, -2.8F))));

    public static final Item TACTICAL_PICKAXE = registerItem("tactical_pickaxe", new PickaxeItem(TotaToolMaterials.TACTICAL,new Item.Settings().maxCount(1).attributeModifiers(PickaxeItem.createAttributeModifiers(TotaToolMaterials.TACTICAL, 2.0F, -2.4F))));

    public static final Item SCRAP_HATCHET = registerItem("scrap_hatchet", new AxeItem(TotaToolMaterials.SCRAP,new Item.Settings().maxCount(1).attributeModifiers(AxeItem.createAttributeModifiers(TotaToolMaterials.SCRAP, 1.0F, -1.0F))));

    public static final Item TACTICAL_HATCHET = registerItem("tactical_hatchet", new AxeItem(TotaToolMaterials.TACTICAL, new Item.Settings().maxCount(1).attributeModifiers(AxeItem.createAttributeModifiers(TotaToolMaterials.TACTICAL, 2.0F, -1.5F))));

    public static final Item SCRAP_CROWBAR = registerItem("scrap_crowbar", new SwordItem(TotaToolMaterials.SCRAP,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.SCRAP, 2, -2.4F))));

    public static final Item TACTICAL_CROWBAR = registerItem("tactical_crowbar", new SwordItem(TotaToolMaterials.TACTICAL,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.TACTICAL, 3, -1.5F))));

    public static final Item BASEBALL_BAT = registerItem("baseball_bat", new SwordItem(TotaToolMaterials.T1,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T1WOOD, 3, -2.0F))));

    public static final Item SPIKED_BASEBALL_BAT = registerItem("spiked_baseball_bat", new SwordItem(TotaToolMaterials.T2,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T2WOOD, 4, -2.2F))));

    public static final Item FIREAXE = registerItem("fireaxe", new AxeItem(TotaToolMaterials.T2,new Item.Settings().maxCount(1).attributeModifiers(AxeItem.createAttributeModifiers(TotaToolMaterials.T2, 5.0F, -3.0F))));

    public static final Item TACTICAL_FIREAXE = registerItem("tactical_fireaxe", new AxeItem(TotaToolMaterials.T3,new Item.Settings().maxCount(1).attributeModifiers(AxeItem.createAttributeModifiers(TotaToolMaterials.T3, 6.0F, -2.6F))));

    public static final Item BATON = registerItem("baton", new SwordItem(TotaToolMaterials.T3,new Item.Settings().maxCount(1)
            .attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T3, 2, -1.5F))));

    public static final Item KATANA = registerItem("katana", new SwordItem(TotaToolMaterials.T3,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T3, 3, 1.0F))));

    public static final Item BUSH_KNIFE = registerItem("bush_knife", new SwordItem(TotaToolMaterials.T1,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T1, 1, 0.5F))));

    public static final Item MACHETE = registerItem("machete", new SwordItem(TotaToolMaterials.T3,new Item.Settings().maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(TotaToolMaterials.T3, 4, -0.5F))));

    public static final Item SLEDGEHAMMER = registerItem("sledgehammer", new AxeItem(TotaToolMaterials.T3,new Item.Settings().maxCount(1).attributeModifiers(AxeItem.createAttributeModifiers(TotaToolMaterials.T3, 7.0F, -3.0F))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ToolsOfTheApocalypse.MOD_ID, name), item);
    }

    public static void registerTotaItems(){
        ToolsOfTheApocalypse.LOGGER.info("Initializing " + ToolsOfTheApocalypse.MOD_ID + "items...");
    }
}

