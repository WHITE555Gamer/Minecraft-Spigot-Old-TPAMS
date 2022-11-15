package com.github.white555gamer.tpams.assets.functions;

import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.messages.errormsgs.IncorrectArg;

public class float_check_func {

    public static boolean IsParsableStr2Float(CommandSender sender, String str) {

        try {
            float Num = Float.parseFloat(str);
        } catch (NullPointerException|NumberFormatException e){
            sender.sendMessage(IncorrectArg);
            return false;
        }
        return true;

    }

    public static boolean IsUsableFloat(CommandSender sender, float Num) {

        if (0 <= Num && Num <= 1.0) {
            return true;
        } else {
            sender.sendMessage(IncorrectArg);
            return false;
        }
    }
}
