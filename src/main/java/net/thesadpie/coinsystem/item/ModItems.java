package net.thesadpie.coinsystem.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thesadpie.coinsystem.CoinSystem;

public class ModItems {


    public static final Item  COIN = registerItem("coin",
            new Item(new FabricItemSettings().group(ModItemGroup.COINSYSTEM)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CoinSystem.MOD_ID, name), item);
    }

    public static void registerModItems(){
        CoinSystem.LOGGER.debug("Registering Mod Items for " + CoinSystem.MOD_ID);
    }
}
