package dev.drawethree.ultraprisoncore.tokens.api;

import dev.drawethree.ultraprisoncore.api.enums.LostCause;
import dev.drawethree.ultraprisoncore.api.enums.ReceiveCause;
import org.bukkit.OfflinePlayer;

public interface UltraPrisonTokensAPI {
    long getPlayerTokens(OfflinePlayer paramOfflinePlayer);

    boolean hasEnough(OfflinePlayer paramOfflinePlayer, long paramLong);

    void removeTokens(OfflinePlayer paramOfflinePlayer, long paramLong, LostCause paramLostCause);

    void addTokens(OfflinePlayer paramOfflinePlayer, long paramLong, ReceiveCause paramReceiveCause);
}