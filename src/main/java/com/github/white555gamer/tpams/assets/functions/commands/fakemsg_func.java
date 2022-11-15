package com.github.white555gamer.tpams.assets.functions.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.messages.errormsgs.MissingArg;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.NoOperatorPermissions;

public class fakemsg_func {

    public static boolean FakeMsg_IsConditionMatching(CommandSender sender, String[] args) {

        if (sender.isOp()) {
            if (args.length >= 2) {
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



    public static void FakeMsg_Process(String[] args) {

        String Result = "";
        for (int i = 1; i <= args.length - 1; i++) {
            Result = Result + " " + args[ i ];
        }
        String ParsedResult = "<" + args[0] + "...?>" + Result;
        Bukkit.getServer().broadcastMessage(ParsedResult);

    }

}
