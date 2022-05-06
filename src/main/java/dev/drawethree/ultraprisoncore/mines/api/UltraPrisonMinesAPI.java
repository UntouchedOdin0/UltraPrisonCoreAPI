package dev.drawethree.ultraprisoncore.mines.api;

import dev.drawethree.ultraprisoncore.mines.model.mine.Mine;
import org.bukkit.Location;

public interface UltraPrisonMinesAPI {
    Mine getMineByName(String paramString);

    Mine getMineAtLocation(Location paramLocation);
}
