package com.github.white555gamer.tpams.assets.functions.commands;

import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.functions.float_check_func.IsParsableStr2Float;
import static com.github.white555gamer.tpams.assets.functions.float_check_func.IsUsableFloat;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.MissingArg;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.NoOperatorPermissions;

public class fly_speed_func {

    public static boolean Fly_Speed_IsConditionMatching(CommandSender sender, String[] args) {

        if (sender.isOp()) {
            if (args.length == 2) {
                return true;
            }
            else if (args.length == 3) {
                return true;
            } else {
                sender.sendMessage(MissingArg);
                return false;
            }
        }
        else {
            sender.sendMessage(NoOperatorPermissions);
            return false;
        }
    }

    public static boolean Fly_Speed_IsProsessable(CommandSender sender, String[] args) {

        if (args.length == 3) {
            if (IsParsableStr2Float(sender, args[2])) {
                if (IsUsableFloat(sender, Float.parseFloat(args[2]))) {

                    return true;

                }
            }
        } else {

            sender.sendMessage(MissingArg);
            return false;

        }

        return false;

    }

}
