package net.sander.modxz.item.costum;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.EquipmentSlot;

import net.minecraft.sounds.SoundEvent;


import java.util.function.Supplier;


public enum AmethystArmorMaterials implements ArmorMaterial {
	AMETHYST("amethyst", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
		return Ingredient.of(new ItemLike[]{Items.AMETHYST_SHARD});
	});

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyLoadedValue<Ingredient> repairIngredient;

	private AmethystArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier p_40481_) {
		this.name = p_40474_;
		this.durabilityMultiplier = p_40475_;
		this.slotProtections = p_40476_;
		this.enchantmentValue = p_40477_;
		this.sound = p_40478_;
		this.toughness = p_40479_;
		this.knockbackResistance = p_40480_;
		this.repairIngredient = new LazyLoadedValue(p_40481_);
	}

	public int getDurabilityForSlot(EquipmentSlot p_40484_) {
		return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
	}

	public int getDefenseForSlot(EquipmentSlot p_40487_) {
		return this.slotProtections[p_40487_.getIndex()];
	}

	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	public SoundEvent getEquipSound() {
		return this.sound;
	}

	public Ingredient getRepairIngredient() {
		return (Ingredient)this.repairIngredient.get();
	}

	public String getName() {
		return this.name;
	}

	public float getToughness() {
		return this.toughness;
	}

	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}