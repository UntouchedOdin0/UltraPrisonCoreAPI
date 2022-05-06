package dev.drawethree.ultraprisoncore.ranks.api;

import dev.drawethree.ultraprisoncore.ranks.model.Rank;
import org.bukkit.entity.Player;

public interface UltraPrisonRanksAPI {
    Rank getPlayerRank(Player paramPlayer);

    Rank getNextPlayerRank(Player paramPlayer);

    int getRankupProgress(Player paramPlayer);

    void setPlayerRank(Player paramPlayer, Rank paramRank);
}