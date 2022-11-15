package msspl.tpams;

import msspl.tpams.assets.command.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TPAMS extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("TPAMS enabled...");
        getServer().broadcastMessage("TPAMS enabled...");

        getCommand("classic_gamemode").setExecutor(new classic_gamemode());
        getCommand("fakemsg").setExecutor(new fakemsg());
        getCommand("fakename").setExecutor(new fakename());
        getCommand("fakename_reset").setExecutor(new fakename_reset());
        getCommand("fly").setExecutor(new fly());
        getCommand("fly_speed").setExecutor(new fly_speed());
        getCommand("walk_speed").setExecutor(new walk_speed());
        getCommand("health").setExecutor(new health());

        getCommand("nickname").setExecutor(new nickname());
        getCommand("nickname_reset").setExecutor(new nickname_reset());

        getCommand("quick_fullfood").setExecutor(new quick_fullfood());
        getCommand("quick_fullhealth").setExecutor(new quick_fullhealth());
        getCommand("quick_recovery").setExecutor(new quick_recovery());

        getCommand("tpams_changelog").setExecutor(new tpams_changelog());
        getCommand("tpams_help").setExecutor(new tpams_help());
        getCommand("tpams_playerdata_debug").setExecutor(new tpams_playerdata_debug());
        getCommand("tpams_serverdata_debug").setExecutor(new tpams_serverdata_debug());
        getCommand("tpams_runningtest").setExecutor(new tpams_runningtest());


        //getCommand("autosneaking").setExecutor(new autosneaking());
        //autosneaking:
        //usage: /autosneaking < PlayerName > < true | false | toggle | getboolean >
        //description: You can set/get the player sneak.
        //getCommand("healthscale").setExecutor(new healthscale());
        //healthscale:
        //usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >
        //description: You can set|get the player health scale.

    }

    @Override
    public void onLoad() {
        // Plugin load logic
        getLogger().info("TPAMS loaded...");
        getServer().broadcastMessage("TPAMS loaded...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("TPAMS disabled...");
        getServer().broadcastMessage("TPAMS disabled...");
    }
}
