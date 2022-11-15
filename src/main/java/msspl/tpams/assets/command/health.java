package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static msspl.tpams.assets.msg.health_msg.*;
import static msspl.tpams.assets.msg.msg.*;
import static org.bukkit.ChatColor.*;

public class health implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0) {
                sender.sendMessage(Msg_joins(non_enough_arg_n,health_ud));
                return true;
            } else if (args.length == 1) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    sender.sendMessage(Msg_joins(note_enough_arg_n,health_ud));
                    sender.sendMessage(Gethealth_Base(pl));
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n,health_ud));
                    return true;
                }
            } else if (args.length == 2) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    if (args[1].equalsIgnoreCase("kill")){
                        pl.setHealth(0);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Kill_Base(pl.getName()));
                            return true;
                        } else {
                            sender.sendMessage(Kill_Base(pl.getName()).replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(Kill_Base(pl.getName()).replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("min")){
                        pl.setHealth(1);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(MIN_BASE);
                            return true;
                        } else {
                            sender.sendMessage(MIN_BASE.replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(MIN_BASE.replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("max")){
                        pl.setHealth(pl.getHealthScale());
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(MAX_BASE);
                            return true;
                        } else {
                            sender.sendMessage(MAX_BASE.replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(MAX_BASE.replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("gethealth")){
                        sender.sendMessage(Gethealth_Base(pl));
                        return true;
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,health_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,health_ud));return true;
                }
            } else if (args.length == 3) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    try {
                        double Num = Double.parseDouble(args[2]);
                    } catch (NullPointerException|NumberFormatException e){
                        sender.sendMessage(Msg_joins(non_correct_arg_n,health_ud));
                        return true;
                    }
                    Double Num = Double.parseDouble(args[2]);
                    if (Num < 0){
                        Num = (double) 0;
                        sender.sendMessage(Msg_joins(health_note_value,health_ud));
                    } else if (Num > pl.getHealthScale()){
                        Num = pl.getHealthScale();
                        sender.sendMessage(Msg_joins(health_note_value,health_ud));
                    }
                    if (args[1].equalsIgnoreCase("set")){
                        pl.setHealth(Num);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(Set_Base(Num));
                            return true;
                        } else {
                            sender.sendMessage(Set_Base(Num).replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(Set_Base(Num).replace("."," by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("add")) {
                        double after = pl.getHealth() + Num;
                        if (after < 0) {
                            after = 0;
                        } else if (after > pl.getHealthScale()) {
                            after = pl.getHealthScale();
                        }
                        pl.setHealth(after);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Set_Base(after));
                            return true;
                        } else {
                            sender.sendMessage(Set_Base(after).replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(Set_Base(after).replace("."," by " + sender.getName() + "."));
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("sub")){
                        double after = pl.getHealth() - Num;
                        if (after < 0){
                            after = 0;
                        } else if (after > pl.getHealthScale()){
                            after = pl.getHealthScale();
                        }
                        pl.setHealth(after);
                        if (sender.getName()==pl.getName()){
                            pl.sendMessage(Set_Base(after));
                            return true;
                        } else {
                            sender.sendMessage(Set_Base(after).replace("The", pl.getName() + "\'s"));
                            pl.sendMessage(Set_Base(after).replace("."," by " + sender.getName() + "."));
                            return true;
                        }
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,health_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,health_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,health_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("health")){

            if (args.length == 2) {

                if (args[1].length() == 0) {

                    return Arrays.asList("set","kill","min","max","add","sub","gethealth");

                } else {

                    if ("set".startsWith(args[1])) {

                        return Collections.singletonList(("set"));

                    } else if ("kill".startsWith(args[1])) {

                        return Collections.singletonList(("kill"));

                    } else if ("min".startsWith(args[1])) {

                        return Collections.singletonList(("min"));

                    } else if ("max".startsWith(args[1])) {

                        return Collections.singletonList(("max"));

                    } else if ("add".startsWith(args[1])) {

                        return Collections.singletonList(("add"));

                    } else if ("sub".startsWith(args[1])) {

                        return Collections.singletonList(("sub"));

                    } else if ("getspeed".startsWith(args[1])) {

                        return Collections.singletonList(("gethealth"));

                    }

                }

            }

        }

        return null;
    }

}
