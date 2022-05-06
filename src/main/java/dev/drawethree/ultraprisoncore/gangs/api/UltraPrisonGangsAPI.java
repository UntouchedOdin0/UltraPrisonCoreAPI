package dev.drawethree.ultraprisoncore.gangs.api;

import dev.drawethree.ultraprisoncore.gangs.model.Gang;
import org.bukkit.OfflinePlayer;

import java.util.Optional;

public interface UltraPrisonGangsAPI {
    Optional<Gang> getPlayerGang(OfflinePlayer paramOfflinePlayer);

    Optional<Gang> getByName(String paramString);
}
