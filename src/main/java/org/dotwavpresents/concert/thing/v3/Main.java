package org.dotwavpresents.concert.thing.v3;

import com.github.puregero.multilib.MultiLib;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new Timer().runTaskTimer(this, 10, 10);
    }
}
