package net.otherheaven.tota.itemRegistry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.otherheaven.tota.ToolsOfTheApocalypse;

public class TotaItemGroups {
    public static final ItemGroup TOTA_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(ToolsOfTheApocalypse.MOD_ID, "tota_items"),FabricItemGroup.builder().icon(() -> new ItemStack(TotaItems.TACTICAL_CROWBAR)).displayName(Text.translatable("itemgroup.tota.tota_items"))
            .entries((displayContext, entries) -> {
                entries.add(TotaItems.SCRAP_PICKAXE);
                entries.add(TotaItems.TACTICAL_PICKAXE);
                entries.add(TotaItems.BASEBALL_BAT);
                entries.add(TotaItems.BATON);
                entries.add(TotaItems.FIREAXE);
                entries.add(TotaItems.KATANA);
                entries.add(TotaItems.BUSH_KNIFE);
                entries.add(TotaItems.MACHETE);
                entries.add(TotaItems.SCRAP_CROWBAR);
                entries.add(TotaItems.SCRAP_HATCHET);
                entries.add(TotaItems.TACTICAL_CROWBAR);
                entries.add(TotaItems.TACTICAL_FIREAXE);
                entries.add(TotaItems.TACTICAL_HATCHET);
                entries.add(TotaItems.SLEDGEHAMMER);
                entries.add(TotaItems.SPIKED_BASEBALL_BAT);
            }).build());

    public static void registerItemGroups() {
        ToolsOfTheApocalypse.LOGGER.info("Initializing" + ToolsOfTheApocalypse.MOD_ID + "Item Groups");
    }
}

//The FabricItemGroup.builder() shows the icon for the Creative Tab.
//Entries are what goes into that group. Afaik, the group is NOT the tag.