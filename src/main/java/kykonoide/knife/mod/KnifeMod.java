package kykonoide.knife.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KnifeMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("knifemod");

	public static final Item WOODEN_KNIFE = new SwordItem(WoodToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item STONE_KNIFE = new SwordItem(StoneToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item IRON_KNIFE = new SwordItem(IronToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item GOLDEN_KNIFE = new SwordItem(GoldToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item DIAMOND_KNIFE = new SwordItem(DiamondToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	public static final Item NETHERITE_KNIFE = new SwordItem(NetheriteToolMaterial.INSTANCE, 1, -1.8F,
			new Item.Settings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("knifemod", "wooden_knife"), WOODEN_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("knifemod", "stone_knife"), STONE_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("knifemod", "iron_knife"), IRON_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("knifemod", "golden_knife"), GOLDEN_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("knifemod", "diamond_knife"), DIAMOND_KNIFE);
		Registry.register(Registry.ITEM, new Identifier("knifemod", "netherite_knife"), NETHERITE_KNIFE);
	}
}
