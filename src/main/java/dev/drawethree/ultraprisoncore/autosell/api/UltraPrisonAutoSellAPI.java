package dev.drawethree.ultraprisoncore.autosell.api;

import dev.drawethree.ultraprisoncore.autosell.SellRegion;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Collection;

public interface UltraPrisonAutoSellAPI {

    double getCurrentEarnings(Player paramPlayer);

    double getPriceForBlock(String paramString, Block paramBlock);

    boolean hasAutoSellEnabled(Player paramPlayer);

    Collection<SellRegion> getSellRegions();

    SellRegion getSellRegionAtLocation(Location paramLocation);
}