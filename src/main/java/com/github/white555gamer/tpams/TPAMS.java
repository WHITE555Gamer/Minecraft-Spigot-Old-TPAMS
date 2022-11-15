package com.github.white555gamer.tpams;

import com.github.white555gamer.tpams.assets.commands.broadcastmessage;
import com.github.white555gamer.tpams.assets.commands.fakemsg;
import com.github.white555gamer.tpams.assets.commands.fly;
import com.github.white555gamer.tpams.assets.commands.fly_speed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TPAMS extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("TPAMS enabled...");
        getServer().broadcastMessage("TPAMS enabled...");

        getCommand("broadcastmessage").setExecutor(new broadcastmessage());
        getCommand("fakemsg").setExecutor(new fakemsg());
        getCommand("fly").setExecutor(new fly());
        getCommand("fly_speed").setExecutor(new fly_speed());


    }

    @Override
    public void onLoad() {
        getLogger().info("TPAMS loaded...");
        getServer().broadcastMessage("TPAMS loaded...");
    }

    @Override
    public void onDisable() {
        getLogger().info("TPAMS disabled...");
        getServer().broadcastMessage("TPAMS disabled...");
    }


}
