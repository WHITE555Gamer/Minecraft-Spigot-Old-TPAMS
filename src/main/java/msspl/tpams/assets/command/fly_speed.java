package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static msspl.tpams.assets.msg.fly_speed_msg.*;
import static msspl.tpams.assets.msg.msg.*;
import static org.bukkit.ChatColor.*;

public class fly_speed implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()){
            if (args.length == 0) {
                sender.sendMessage(Msg_joins(non_enough_arg_n,fly_speed_ud));
                return true;
            } else if (args.length == 1) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    sender.sendMessage(Msg_joins(note_enough_arg_n,fly_speed_ud));
                    sender.sendMessage(Getspeed_Base(pl));
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n,fly_speed_ud));
                    return true;
                }
            } else if (args.length == 2) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    if (args[1].equalsIgnoreCase("reset")){
                        pl.setFlySpeed((float) 0.1);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(RESET_BASE);
                            return true;
                        } else {
                            sender.sendMessage(RESET_BASE.replace("The",pl.getName() + "\'s"));
                            pl.sendMessage(RESET_BASE.replace("reset.","reset by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("max")){
                        pl.setFlySpeed((float) 1.0);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(MAX_BASE);
                            return true;
                        } else {
                            sender.sendMessage(MAX_BASE.replace("The",pl.getName()+"\'s"));
                            pl.sendMessage(MAX_BASE.replace("."," by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("min")){
                        pl.setFlySpeed((float) 0.1);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(MIN_BASE);
                            return true;
                        } else {
                            sender.sendMessage(MIN_BASE.replace("The",pl.getName()+"\'s"));
                            pl.sendMessage(MIN_BASE.replace("."," by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("getspeed")){
                        sender.sendMessage(Getspeed_Base(pl));
                        return true;
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,fly_speed_ud));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n, fly_speed_ud));
                    return true;
                }
            } else if (args.length == 3) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    try {
                        float Num = Float.parseFloat(args[2]);
                    } catch (NullPointerException|NumberFormatException e){
                        sender.sendMessage(Msg_joins(non_correct_arg_n,fly_speed_ud));
                        return true;
                    }
                    float Num = Float.parseFloat(args[2]);
                    if (Num < 0.1){
                        Num = (float) 0.1;
                        sender.sendMessage(Msg_joins(note_correct_value_n,fly_speed_ud));
                    } else if (Num > 1.0){
                        Num = (float) 1.0;
                        sender.sendMessage(Msg_joins(note_correct_value_n,fly_speed_ud));
                    }

                    if (args[1].equalsIgnoreCase("set")){
                        pl.setFlySpeed(Num);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(SAS_Base(Num));
                            return true;
                        } else {
                            sender.sendMessage(SAS_Base(Num).replace("The",pl.getName()+"\'s"));
                            pl.sendMessage(SAS_Base(Num).replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("add")){
                        float after = pl.getFlySpeed() + Num;
                        if (after < 0.1){
                            after = (float) 0.1;
                        } else if (after > 1.0){
                            after = (float) 1.0;
                        }
                        pl.setFlySpeed(after);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(SAS_Base(after));
                            return true;
                        } else {
                            sender.sendMessage(SAS_Base(after).replace("The",pl.getName()+"\'s"));
                            pl.sendMessage(SAS_Base(after).replace(".", " by " + sender.getName() + "."));
                            return true;
                        }

                    } else if (args[1].equalsIgnoreCase("sub")){
                        float after = pl.getFlySpeed() - Num;
                        if (after < 0.1){
                            after = (float) 0.1;
                        } else if (after > 1.0){
                            after = (float) 1.0;
                        }
                        pl.setFlySpeed(after);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(SAS_Base(after));
                            return true;
                        } else {
                            sender.sendMessage(SAS_Base(after).replace("The",pl.getName()+"\'s"));
                            pl.sendMessage(SAS_Base(after).replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,fly_speed_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,fly_speed_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,fly_speed_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("fly_speed")) {

            if (args.length == 2) {

                if (args[1].length() == 0) {

                    return Arrays.asList("reset","set","min","max","add","sub","getspeed");

                } else {

                    if ("reset".startsWith(args[1])) {

                        return Collections.singletonList(("reset"));

                    } else if ("set".startsWith(args[1])) {

                        return Collections.singletonList(("set"));

                    } else if ("min".startsWith(args[1])) {

                        return Collections.singletonList(("min"));

                    } else if ("max".startsWith(args[1])) {

                        return Collections.singletonList(("max"));

                    } else if ("add".startsWith(args[1])) {

                        return Collections.singletonList(("add"));

                    } else if ("sub".startsWith(args[1])) {

                        return Collections.singletonList(("sub"));

                    } else if ("getspeed".startsWith(args[1])) {

                        return Collections.singletonList(("getspeed"));

                    }

                }

            }

        }

        return null;
    }
}
