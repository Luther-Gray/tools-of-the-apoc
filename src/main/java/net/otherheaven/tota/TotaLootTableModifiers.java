package net.otherheaven.tota;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.otherheaven.tota.itemRegistry.TotaItems;

public class TotaLootTableModifiers {

    private static final Identifier V_ARMOR_ID = Identifier.of("minecraft", "chests/village/village_armorer");

    private static final Identifier S_DUNGEON_ID = Identifier.of("minecraft", "chests/simple_dungeon");

    private static final Identifier STRONGHOLD_ID = Identifier.of("minecraft", "chests/stronghold_crossing");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            if (V_ARMOR_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(TotaItems.SCRAP_CROWBAR))
                        .with(ItemEntry.builder(TotaItems.SCRAP_PICKAXE))
                        .with(ItemEntry.builder(TotaItems.SCRAP_HATCHET))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder);
            }

            if (S_DUNGEON_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f))
                        .with(ItemEntry.builder(TotaItems.BATON))
                        .with(ItemEntry.builder(TotaItems.BUSH_KNIFE))
                        .with(ItemEntry.builder(TotaItems.MACHETE))
                        .with(ItemEntry.builder(TotaItems.FIREAXE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder);
            }
            if (STRONGHOLD_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(TotaItems.TACTICAL_PICKAXE))
                        .with(ItemEntry.builder(TotaItems.TACTICAL_HATCHET))
                        .with(ItemEntry.builder(TotaItems.TACTICAL_FIREAXE))
                        .with(ItemEntry.builder(TotaItems.TACTICAL_CROWBAR))
                        .with(ItemEntry.builder(TotaItems.SLEDGEHAMMER))
                        .with(ItemEntry.builder(TotaItems.KATANA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
