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

import static msspl.tpams.assets.msg.fly_msg.*;
import static msspl.tpams.assets.msg.msg.*;

public class fly implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (args.length == 2) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                        if (args[1].equalsIgnoreCase("true")) {
                            pl.setAllowFlight(true);
                            if (sender.getName() == pl.getName()) {
                                pl.sendMessage(Default_Enable);
                                return true;
                            } else {
                                sender.sendMessage(Default_Enable.replace("The",pl.getName() + "\'s"));
                                pl.sendMessage(Default_Enable.replace("ed.","ed by " + sender.getName() + "."));
                                return true;
                            }

                        } else if (args[1].equalsIgnoreCase("false")) {
                            pl.setAllowFlight(false);
                            if (sender.getName() == pl.getName()) {
                                pl.sendMessage(Default_Disable);
                                return true;
                            } else {
                                sender.sendMessage(Default_Disable.replace("The",pl.getName() + "\'s"));
                                pl.sendMessage(Default_Disable.replace("ed.","ed by " + sender.getName() + "."));
                                return true;
                            }

                        } else if (args[1].equalsIgnoreCase("toggle")) {

                            pl.setAllowFlight(!(pl.getAllowFlight()));
                            if (sender.getName() == pl.getName()) {
                                pl.sendMessage(Default_Toggle(pl.getAllowFlight()));
                                return true;
                            } else {
                                sender.sendMessage(Default_Toggle(pl.getAllowFlight()).replace("The",pl.getName()+"\'s"));
                                pl.sendMessage(Default_Toggle(pl.getAllowFlight()).replace("toggled.","toggled by " + sender.getName() + "."));
                                return true;
                            }

                        } else if (args[1].equalsIgnoreCase("getboolean")) {
                            sender.sendMessage(Default_Getboolean(pl));
                        } else {
                            sender.sendMessage(Msg_joins(non_correct_arg_n,fly_ud));return true;
                        }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,fly_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_enough_arg_n,fly_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("fly")){

            if (args.length == 2) {

                if (args[1].length() == 0) {

                    return Arrays.asList("true","false","toggle","getboolean");

                } else {

                    if ("true".startsWith(args[1])) {

                        return Collections.singletonList(("true"));

                    } else if ("false".startsWith(args[1])) {

                        return Collections.singletonList(("false"));

                    } else if ("toggle".startsWith(args[1])) {

                        return Collections.singletonList(("toggle"));

                    } else if ("getboolean".startsWith(args[1])) {

                        return Collections.singletonList(("getboolean"));

                    }

                }

            }

        }

        return null;
    }
}
