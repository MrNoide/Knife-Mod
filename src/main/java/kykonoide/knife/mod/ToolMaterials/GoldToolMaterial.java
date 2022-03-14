package kykonoide.knife.mod.ToolMaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldToolMaterial implements ToolMaterial {

    public static final GoldToolMaterial INSTANCE = new GoldToolMaterial();

    @Override
    public int getDurability() {
        return 32;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }
}