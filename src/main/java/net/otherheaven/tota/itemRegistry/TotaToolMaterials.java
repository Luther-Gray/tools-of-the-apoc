package net.otherheaven.tota.itemRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

public enum TotaToolMaterials implements ToolMaterial {
    SCRAP(85, 4.0F, 1.0F, BlockTags.INCORRECT_FOR_STONE_TOOL, 0, Ingredient.ofItems(Items.IRON_INGOT)
    ),

    TACTICAL(800, 6.0F, 2.5F, BlockTags.INCORRECT_FOR_IRON_TOOL, 15, Ingredient.ofItems(Items.IRON_INGOT)
    ),

    T1(100, 3.0F, 1.0F, BlockTags.INCORRECT_FOR_STONE_TOOL, 5, Ingredient.ofItems(Items.IRON_INGOT)
    ),

    T1WOOD(100, 3.0F, 1.0F, BlockTags.INCORRECT_FOR_STONE_TOOL, 5, Ingredient.fromTag(ItemTags.PLANKS)
    ),

    T2(500, 5.0F, 2.0F, BlockTags.INCORRECT_FOR_IRON_TOOL, 10, Ingredient.ofItems(Items.IRON_INGOT)
    ),

    T2WOOD(500, 5.0F, 2.0F, BlockTags.INCORRECT_FOR_IRON_TOOL, 10, Ingredient.fromTag(ItemTags.PLANKS)
    ),

    T3(800, 10.0F, 3.0F, BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 12, Ingredient.ofItems(Items.IRON_INGOT)
    );

    private final int durability;
    private final float miningSpeedMultiplier, attackDamage;
    private final TagKey<Block> inverseTag;
    private final int enchantability;
    private final Ingredient repairIngredient;

    TotaToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, TagKey<Block> inverseTag, int enchantability, Ingredient repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.inverseTag = inverseTag;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
