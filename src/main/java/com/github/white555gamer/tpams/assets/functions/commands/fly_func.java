package com.github.white555gamer.tpams.assets.functions.commands;


import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.messages.errormsgs.MissingArg;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.NoOperatorPermissions;

public class fly_func {

    public static boolean Fly_IsConditionMatching(CommandSender sender, String[] args) {

        if (sender.isOp()) {
            if (args.length == 2) {
                return true;
            }
            else {
                sender.sendMessage(MissingArg);
                return false;
            }
        }
        else {
            sender.sendMessage(NoOperatorPermissions);
            return false;
        }
    }
}
