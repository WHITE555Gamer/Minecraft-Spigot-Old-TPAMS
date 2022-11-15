package com.github.white555gamer.tpams.assets.functions;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static com.github.white555gamer.tpams.assets.messages.errormsgs.NonExistentPlayer;

public class player_check_func {

    public static boolean IsPlayerExist(CommandSender sender, String str) {
        Player pl = Bukkit.getPlayer(str);
        if (pl == null) {
            sender.sendMessage(NonExistentPlayer);
            return false;
        }
        else {
            return true;
        }
    }

}
