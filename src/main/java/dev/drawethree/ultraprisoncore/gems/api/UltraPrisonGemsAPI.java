package dev.drawethree.ultraprisoncore.gems.api;

import dev.drawethree.ultraprisoncore.api.enums.ReceiveCause;
import org.bukkit.OfflinePlayer;

public interface UltraPrisonGemsAPI {
    long getPlayerGems(OfflinePlayer paramOfflinePlayer);

    boolean hasEnough(OfflinePlayer paramOfflinePlayer, long paramLong);

    void removeGems(OfflinePlayer paramOfflinePlayer, long paramLong);

    void addGems(OfflinePlayer paramOfflinePlayer, long paramLong, ReceiveCause paramReceiveCause);
}