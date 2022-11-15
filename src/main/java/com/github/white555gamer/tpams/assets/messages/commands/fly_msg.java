package com.github.white555gamer.tpams.assets.messages.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class fly_msg {

    public static String Fly_DefaultEnabling(){
        return GREEN + "COMMAND SUCCEEDED: The flight has been enabled." + RESET;
    }

    public static String Fly_DefaultEnablingSomeone(Player pl){
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight has been enabled." + RESET;
    }

    public static String Fly_DefaultEnablingBy(CommandSender sender){
        return GREEN + "COMMAND SUCCEEDED: The flight has been enabled by " + sender.getName() + "." + RESET;
    }



    public static String Fly_DefaultDisabling(){
        return GREEN + "COMMAND SUCCEEDED: The flight has been disabled." + RESET;
    }

    public static String Fly_DefaultDisablingSomeone(Player pl){
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight has been disabled." + RESET;
    }

    public static String Fly_DefaultDisablingBy(CommandSender sender){
        return GREEN + "COMMAND SUCCEEDED: The flight has been disabled by " + sender.getName() + "." + RESET;
    }



    public static void Fly_MessageFeed(CommandSender sender, Player pl) {

        if (pl.getAllowFlight()) {

            if (sender.getName().equalsIgnoreCase(pl.getName())) {
                pl.sendMessage(Fly_DefaultEnabling());
            }
            else {
                sender.sendMessage(Fly_DefaultEnablingSomeone(pl));
                pl.sendMessage(Fly_DefaultEnablingBy(sender));
            }

        }
        else {

            if (sender.getName().equalsIgnoreCase(pl.getName())) {
                pl.sendMessage(Fly_DefaultDisabling());
            }
            else {
                sender.sendMessage(Fly_DefaultDisablingSomeone(pl));
                pl.sendMessage(Fly_DefaultDisablingBy(sender));
            }

        }

    }

    public static String Fly_GetBoolean(Player pl) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flightable: " + pl.getAllowFlight() + "." + RESET;
    }

}
