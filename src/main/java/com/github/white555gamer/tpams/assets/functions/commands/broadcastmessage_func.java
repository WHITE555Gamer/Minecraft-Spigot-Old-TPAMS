package com.github.white555gamer.tpams.assets.functions.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.messages.errormsgs.MissingArg;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.NoOperatorPermissions;

public class broadcastmessage_func {

    public static boolean BCMSG_IsConditionMatching(CommandSender sender, String[] args) {

        if (sender.isOp()) {
            if (args.length == 0) {
                sender.sendMessage(MissingArg);
                return false;
            }
            else {
                return true;
            }
        }
        else {
            sender.sendMessage(NoOperatorPermissions);
            return false;
        }

    }

    public static void BCMSG_Process(String[] args) {

        String Result = "";
        for (int i = 1; i <= args.length; i++) {
            if (i == 1) {
                Result = args[ i - 1 ];
            }
            else {
                Result = Result + " " + args[ i - 1 ];
            }

        }
        Bukkit.getServer().broadcastMessage(Result);

    }

}
