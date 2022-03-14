package kykonoide.knife.mod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class KnifeMod {

	public static final String MOD_ID = "knifemod";

	public static final Logger LOGGER = LoggerFactory.getLogger("knifemod");

	public class ModItemGroup {
		public static final ItemGroup KNIFE_MOD = FabricItemGroupBuilder.build(
				new Identifier((MOD_ID), "general"),
				() -> new ItemStack(ModItems.IRON_KNIFE));

	}

	@Override
    public void onInitialize() {

        ModItems.registerItems();
    }

}

