package hexagonnico.reworkedmetals.content.item;

import hexagonnico.reworkedmetals.registry.ItemsRegistry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

/**
 * Tool tier enum.
 * 
 * @author Nico
 */
public enum ModToolTiers implements IItemTier {
    COPPER(1, 190, 5.0f, 1.5f, 12, Ingredient.of(ItemsRegistry.COPPER_INGOT.get())),
    BRONZE(2, 250, 6.0f, 2.0f, 15, Ingredient.of(ItemsRegistry.BRONZE_INGOT.get())),
    IRON(2, 700, 7.0f, 2.5f, 12, Ingredient.of(Items.IRON_INGOT)),
    IRON_DIAMOND(3, 1125, 5.0f, 2.5f, 12, Ingredient.of(Items.IRON_INGOT)),
    IRON_EMERALD(2, 450, 8.5f, 2.5f, 16, Ingredient.of(Items.IRON_INGOT)),
    SILVER(1, 100, 10.0f, 1.0f, 18, Ingredient.of(ItemsRegistry.SILVER_INGOT.get())),
    SILVER_RUBY(2, 250, 10.0f, 3.0f, 18, Ingredient.of(ItemsRegistry.SILVER_INGOT.get())),
    SILVER_DIAMOND(2, 300, 8.0f, 1.0f, 18, Ingredient.of(ItemsRegistry.SILVER_INGOT.get())),
    STEEL(3, 1561, 8.0f, 3.0f, 10, Ingredient.of(ItemsRegistry.STEEL_INGOT.get())),
    STEEL_DIAMOND(4, 1970, 6.0f, 3.0f, 10, Ingredient.of(ItemsRegistry.STEEL_INGOT.get())),
    STEEL_EMERALD(3, 1000, 9.5f, 3.0f, 14, Ingredient.of(ItemsRegistry.STEEL_INGOT.get())),
    GOLD_RUBY(1, 200, 12.0F, 2.0F, 22, Ingredient.of(Items.GOLD_INGOT));
    
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;
    
    ModToolTiers(int level, int uses, float speed, float damage, int enchantmentValue, Ingredient repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }
    
    @Override
    public int getLevel() {
        return this.level;
    }
    
    @Override
    public int getUses() {
        return this.uses;
    }
    
    @Override
    public float getSpeed() {
        return this.speed;
    }
    
    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }
    
    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }
    
    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
