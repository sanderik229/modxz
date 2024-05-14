package net.sander.modxz.enums;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import net.sander.modxz.ModXz;
import org.jetbrains.annotations.NotNull;

public enum ToolStats implements Tier {
    AMETHYST_MULTITOOL(4, 3922, 35, 15, 22, "amethyst_shard");


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;
    ToolStats(int harvestLevel, float efficiency, float attackDamage) {this(harvestLevel, 0, efficiency, attackDamage, 0, Items.AIR);}
    ToolStats(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability) {this(harvestLevel, maxUses, efficiency, attackDamage, enchantability, Items.AIR);}
    ToolStats(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, String repairMaterial) {this(harvestLevel, maxUses, efficiency, attackDamage, enchantability, ForgeRegistries.ITEMS.getValue(new ResourceLocation(ModXz.MOD_ID, repairMaterial)));}
    ToolStats(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Item repairMaterialIn) {
        harvestLevel = harvestLevelIn;
        maxUses = maxUsesIn;
        efficiency = efficiencyIn;
        attackDamage = attackDamageIn;
        enchantability = enchantabilityIn;
        repairMaterial = Ingredient.of(repairMaterialIn);
    }
    @Override public int getUses() {return maxUses;}
    @Override public float getSpeed() {return efficiency;}
    @Override public float getAttackDamageBonus() {return attackDamage;}
    @Override public int getLevel() {return harvestLevel;}
    @Override public int getEnchantmentValue() {return enchantability;}
    @Override public @NotNull Ingredient getRepairIngredient() {return repairMaterial;}
}
