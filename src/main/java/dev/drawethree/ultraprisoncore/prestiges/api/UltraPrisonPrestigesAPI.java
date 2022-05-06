package dev.drawethree.ultraprisoncore.prestiges.api;

import dev.drawethree.ultraprisoncore.prestiges.model.Prestige;
import org.bukkit.entity.Player;

public interface UltraPrisonPrestigesAPI {
    Prestige getPlayerPrestige(Player paramPlayer);

    void setPlayerPrestige(Player paramPlayer, Prestige paramPrestige);

    void setPlayerPrestige(Player paramPlayer, long paramLong);
}