package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static msspl.tpams.assets.msg.msg.*;
import static org.bukkit.Bukkit.getServer;

public class tpams_serverdata_debug implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()) {

            if (args.length == 0) {

                sender.sendMessage(Msg_joins(non_enough_arg_n, tpams_serverdata_debug_ud));
                return true;

            } else if (args.length == 1) {

                if (args[0].equalsIgnoreCase("serverinfo")) {

                    sender.sendMessage(im_line_n +
                            "Server Name: " + getServer().getName() + "\n" +
                            "Server IP:Port: " + getServer().getIp() + ":" + getServer().getPort() + "\n" +
                            "Server Allow Flight: " + getServer().getAllowFlight() + "\n" +
                            "Server Allow Nether/End: " + getServer().getAllowNether() + "/" + getServer().getAllowEnd() + "\n" +
                            "Server Bukkit Version: " + getServer().getBukkitVersion() + "\n" +
                            "Server Max Players: " + getServer().getMaxPlayers() + "\n" +
                            "Server Max World Size: " + getServer().getMaxWorldSize() + "\n" +
                            "Server Default Game Mode: " + getServer().getDefaultGameMode() + "\n" +
                            "Server Is Resource Pack Required: " + getServer().isResourcePackRequired() + "\n" +
                            im_line);
                    return true;

                }else {

                    sender.sendMessage(Msg_joins(non_correct_arg_n,tpams_serverdata_debug_ud));
                    return true;

                }

            } else {

                sender.sendMessage(Msg_joins(non_enough_arg_n, tpams_serverdata_debug_ud));
                return true;

            }

        } else {

            sender.sendMessage(Msg_pads(non_op_pl_n));
            return true;

        }
    }
}
