package dev.drawethree.ultraprisoncore.multipliers.api;


import dev.drawethree.ultraprisoncore.multipliers.enums.MultiplierType;
import dev.drawethree.ultraprisoncore.multipliers.multiplier.GlobalMultiplier;
import dev.drawethree.ultraprisoncore.multipliers.multiplier.Multiplier;
import dev.drawethree.ultraprisoncore.multipliers.multiplier.PlayerMultiplier;
import org.bukkit.entity.Player;

public interface UltraPrisonMultipliersAPI {
    GlobalMultiplier getGlobalSellMultiplier();

    GlobalMultiplier getGlobalTokenMultiplier();

    PlayerMultiplier getSellMultiplier(Player paramPlayer);

    PlayerMultiplier getTokenMultiplier(Player paramPlayer);

    Multiplier getRankMultiplier(Player paramPlayer);

    double getPlayerMultiplier(Player paramPlayer, MultiplierType paramMultiplierType);

    default double getTotalToDeposit(Player p, double deposit, MultiplierType type) {
        return deposit * (1.0D + getPlayerMultiplier(p, type));
    }
}
