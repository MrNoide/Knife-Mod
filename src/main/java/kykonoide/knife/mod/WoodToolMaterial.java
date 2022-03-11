package kykonoide.knife.mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WoodToolMaterial implements ToolMaterial {

    public static final WoodToolMaterial INSTANCE = new WoodToolMaterial();

    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0F;
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
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OAK_PLANKS, Items.DARK_OAK_PLANKS, Items.SPRUCE_PLANKS, Items.JUNGLE_PLANKS,
                Items.ACACIA_PLANKS, Items.BIRCH_PLANKS, Items.CRIMSON_PLANKS, Items.WARPED_PLANKS);
    }
}