package org.dotwavpresents.concert.thing.v3;

import com.github.puregero.multilib.MultiLib;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.Collection;

public class Timer extends BukkitRunnable {

    public static final ArrayList<String> names;

    static {
        names = new ArrayList<>();

        names.add("Lobjectif_Ezra");
        names.add("L’objectif_Dan");
        names.add("LBullock");
        names.add("lobjectif_Saul");
        names.add("MatildaMann");
        names.add("CoachPartyJess");
        names.add("CoachParty_Steph");
        names.add("CoachParty_Guy");
        names.add("CoachParty_Joe");
        names.add("ToddRundgren");
        names.add("PhoebeGreen");
        names.add("EE_Jon");
        names.add("EE_Jeremy");
        names.add("EE_Alex");
        names.add("EEMike");
        names.add("IamSIRUP");
        names.add("ThomasHeadon0");
        names.add("Vaccines_Justin");
        names.add("Vaccines_Yoann");
        names.add("Vaccines_Arni");
        names.add("Vaccines_Timothy");
        names.add("Vaccines_Freddie");
        names.add("AlfieTempleman");
        names.add("AyliasTheCoder");
//        names.add("");
//        names.add("");
//        names.add("");
//        names.add("");
//        names.add("");
//        names.add("");
    }

    @Override
    public void run() {
        Collection<? extends Player> all = MultiLib.getAllOnlinePlayers();
        Collection<? extends Player> local = MultiLib.getLocalOnlinePlayers();

        local.forEach(player -> {
            for (String name : names) {
                if (player.getName().equalsIgnoreCase(name)) return;
            }

            all.forEach(p2 -> {
                if (!MultiLib.isLocalPlayer(p2)) {
                    p2.hidePlayer(Main.getPlugin(Main.class), player);
                }
            });
        });
    }
}
