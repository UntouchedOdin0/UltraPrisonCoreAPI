package dev.drawethree.ultraprisoncore.enchants.api;

import dev.drawethree.ultraprisoncore.enchants.enchants.UltraPrisonEnchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public interface UltraPrisonEnchantsAPI {
    Map<UltraPrisonEnchantment, Integer> getPlayerEnchants(ItemStack paramItemStack);

    boolean hasEnchant(Player paramPlayer, int paramInt);

    int getEnchantLevel(ItemStack paramItemStack, int paramInt);

    ItemStack setEnchantLevel(Player paramPlayer, ItemStack paramItemStack, int paramInt1, int paramInt2);

    ItemStack removeEnchant(Player paramPlayer, ItemStack paramItemStack, int paramInt);

    UltraPrisonEnchantment getById(int paramInt);

    UltraPrisonEnchantment getByName(String paramString);
}