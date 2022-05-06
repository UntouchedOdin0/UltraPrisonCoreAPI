package dev.drawethree.ultraprisoncore.autominer.api;

import org.bukkit.entity.Player;

public interface UltraPrisonAutoMinerAPI {
    boolean isInAutoMinerRegion(Player paramPlayer);

    int getAutoMinerTime(Player paramPlayer);
}