package dev.drawethree.ultraprisoncore.history.api;

import dev.drawethree.ultraprisoncore.UltraPrisonModule;
import dev.drawethree.ultraprisoncore.history.model.HistoryLine;
import org.bukkit.OfflinePlayer;

import java.util.List;

public interface UltraPrisonHistoryAPI {
    List<HistoryLine> getPlayerHistory(OfflinePlayer paramOfflinePlayer);

    void createHistoryLine(OfflinePlayer paramOfflinePlayer, UltraPrisonModule paramUltraPrisonModule, String paramString);
}