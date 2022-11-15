package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

import static msspl.tpams.assets.info.info.*;
import static msspl.tpams.assets.msg.classic_gamemode_msg.Feed_Msg;
import static msspl.tpams.assets.msg.msg.*;
import static org.bukkit.ChatColor.*;
import static org.bukkit.GameMode.*;

public class classic_gamemode implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()){
            if (args.length == 0) {
                sender.sendMessage(Msg_joins(non_enough_arg_n,classic_gm_ud));return true;
            } else if (args.length == 1) {
                if (sender instanceof Player){
                    Player pl = (Player) sender;
                    if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("s")){
                        pl.setGameMode(SURVIVAL);
                        pl.sendMessage(Feed_Msg(SURVIVAL));
                        return true;
                    } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("c")) {
                        pl.setGameMode(CREATIVE);
                        pl.sendMessage(Feed_Msg(CREATIVE));
                        return true;
                    } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("a")) {
                        pl.setGameMode(ADVENTURE);
                        pl.sendMessage(Feed_Msg(ADVENTURE));
                        return true;
                    } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("sp")) {
                        pl.setGameMode(SPECTATOR);
                        pl.sendMessage(Feed_Msg(SPECTATOR));
                        return true;
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,classic_gm_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n,classic_gm_ud));return true;
                }
            } else if (args.length == 2) {

                Player pl = Bukkit.getPlayer(args[1]);
                if (pl != null) {
                    if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("s")) {
                        pl.setGameMode(SURVIVAL);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Feed_Msg(SURVIVAL));
                            return true;
                        } else {
                            sender.sendMessage(Feed_Msg(SURVIVAL).replace("own",pl.getName()+"\'s"));
                            pl.sendMessage(Feed_Msg(SURVIVAL).replace("mode.","mode by "+sender.getName()+"."));
                            return true;
                        }
                    } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("c")) {
                        pl.setGameMode(CREATIVE);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Feed_Msg(CREATIVE));
                            return true;
                        } else {
                            sender.sendMessage(Feed_Msg(CREATIVE).replace("own",pl.getName()+"\'s"));
                            pl.sendMessage(Feed_Msg(CREATIVE).replace("mode.","mode by "+sender.getName()+"."));
                            return true;
                        }
                    } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("a")) {
                        pl.setGameMode(ADVENTURE);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Feed_Msg(ADVENTURE));
                            return true;
                        } else {
                            sender.sendMessage(Feed_Msg(ADVENTURE).replace("own",pl.getName()+"\'s"));
                            pl.sendMessage(Feed_Msg(ADVENTURE).replace("mode.","mode by "+sender.getName()+"."));
                            return true;
                        }
                    } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("sp")) {
                        pl.setGameMode(SPECTATOR);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Feed_Msg(SPECTATOR));
                            return true;
                        } else {
                            sender.sendMessage(Feed_Msg(SPECTATOR).replace("own",pl.getName()+"\'s"));
                            pl.sendMessage(Feed_Msg(SPECTATOR).replace("mode.","mode by "+sender.getName()+"."));
                            return true;
                        }
                    } else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n,classic_gm_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n, classic_gm_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,classic_gm_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
            if (command.getName().equalsIgnoreCase("classic_gamemode")) {
                if (args.length == 1) {
                    if (args[0].length() == 0) {
                        return Arrays.asList("0", "1", "2", "3", "s", "c", "a", "sp");
                    }
                }
            }
            return null;
    }
}
