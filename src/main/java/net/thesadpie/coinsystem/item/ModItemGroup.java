package net.thesadpie.coinsystem.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.thesadpie.coinsystem.CoinSystem;

public class ModItemGroup {
    public static final ItemGroup COINSYSTEM = FabricItemGroupBuilder.build(
            new Identifier(CoinSystem.MOD_ID, "coinsystem"), () -> new ItemStack(ModItems.COIN));
}
