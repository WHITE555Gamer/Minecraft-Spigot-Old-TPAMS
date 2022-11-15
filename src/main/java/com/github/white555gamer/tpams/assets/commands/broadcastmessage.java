package com.github.white555gamer.tpams.assets.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.functions.commands.broadcastmessage_func.BCMSG_IsConditionMatching;
import static com.github.white555gamer.tpams.assets.functions.commands.broadcastmessage_func.BCMSG_Process;

public class broadcastmessage implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (BCMSG_IsConditionMatching(sender, args)) {
            BCMSG_Process(args);
            return true;
        }
        else {
            return true;
        }
    }
}
