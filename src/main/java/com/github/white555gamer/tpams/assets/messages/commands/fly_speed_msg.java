package com.github.white555gamer.tpams.assets.messages.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class fly_speed_msg {

    public static String Fly_Speed_Reset() {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been reset." + RESET;
    }

    public static String Fly_Speed_ResetSomeone(Player pl) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight speed has been reset." + RESET;
    }

    public static String Fly_Speed_ResetBy(CommandSender sender) {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been reset by " + sender.getName() + "." + RESET;
    }

    public static void Fly_Speed_ResetMessageFeed(CommandSender sender, Player pl) {

        if (sender.getName().equalsIgnoreCase(pl.getName())) {
            pl.sendMessage(Fly_Speed_Reset());
        }
        else {
            sender.sendMessage(Fly_Speed_ResetSomeone(pl));
            pl.sendMessage(Fly_Speed_ResetBy(sender));
        }

    }



    public static String Fly_Speed_Minimum() {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set Minimum." + RESET;
    }

    public static String Fly_Speed_MinimumSomeone(Player pl) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight speed has been set Minimum." + RESET;
    }

    public static String Fly_Speed_MinimumBy(CommandSender sender) {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set Minimum by " + sender.getName() + "." + RESET;
    }

    public static void Fly_Speed_MinimumMessageFeed(CommandSender sender, Player pl) {

        if (sender.getName().equalsIgnoreCase(pl.getName())) {
            pl.sendMessage(Fly_Speed_Minimum());
        }
        else {
            sender.sendMessage(Fly_Speed_MinimumSomeone(pl));
            pl.sendMessage(Fly_Speed_MinimumBy(sender));
        }

    }



    public static String Fly_Speed_Maximum() {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set Maximum." + RESET;
    }

    public static String Fly_Speed_MaximumSomeone(Player pl) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight speed has been set Maximum." + RESET;
    }

    public static String Fly_Speed_MaximumBy(CommandSender sender) {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set Maximum by " + sender.getName() + "." + RESET;
    }

    public static void Fly_Speed_MaximumMessageFeed(CommandSender sender, Player pl) {

        if (sender.getName().equalsIgnoreCase(pl.getName())) {
            pl.sendMessage(Fly_Speed_Maximum());
        }
        else {
            sender.sendMessage(Fly_Speed_MaximumSomeone(pl));
            pl.sendMessage(Fly_Speed_MaximumBy(sender));
        }

    }



    public static String Fly_Speed_Set(float Num) {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set to " + Num + "." + RESET;
    }

    public static String Fly_Speed_SetSomeone(Player pl, float Num) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight speed has been set to " + Num + "." + RESET;
    }

    public static String Fly_Speed_SetBy(CommandSender sender, float Num) {
        return GREEN + "COMMAND SUCCEEDED: The flight speed has been set to " + Num + " by " + sender.getName() + "." + RESET;
    }

    public static void Fly_Speed_SetMessageFeed(CommandSender sender, Player pl, float Num) {

        if (sender.getName().equalsIgnoreCase(pl.getName())) {
            pl.sendMessage(Fly_Speed_Set(Num));
        }
        else {
            sender.sendMessage(Fly_Speed_SetSomeone(pl, Num));
            pl.sendMessage(Fly_Speed_SetBy(sender, Num));
        }

    }



    public static String Fly_Speed_GetSpeed(Player pl) {
        return GREEN + "COMMAND SUCCEEDED: " + pl.getName() + "\'s flight speed: " + pl.getFlySpeed() + "." + RESET;
    }

}
