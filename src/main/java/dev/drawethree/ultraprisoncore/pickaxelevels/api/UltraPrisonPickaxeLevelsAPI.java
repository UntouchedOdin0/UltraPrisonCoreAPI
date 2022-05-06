package dev.drawethree.ultraprisoncore.pickaxelevels.api;

import dev.drawethree.ultraprisoncore.pickaxelevels.model.PickaxeLevel;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface UltraPrisonPickaxeLevelsAPI {
    PickaxeLevel getPickaxeLevel(ItemStack paramItemStack);

    PickaxeLevel getPickaxeLevel(Player paramPlayer);

    void setPickaxeLevel(Player paramPlayer, ItemStack paramItemStack, PickaxeLevel paramPickaxeLevel);
}