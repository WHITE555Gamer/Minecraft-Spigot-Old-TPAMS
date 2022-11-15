package msspl.tpams.assets.command;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static msspl.tpams.assets.msg.msg.*;
import static msspl.tpams.assets.info.info.*;
import static org.bukkit.Bukkit.getServer;
import static org.bukkit.ChatColor.*;

public class fakemsg implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (args.length == 2) {
                String faker = ("<" + args[0] + "...?> " + args[1]);
                getServer().broadcastMessage(faker);
                sender.sendMessage(im_line_n +
                        GREEN + "Command succeeded: " + faker + RESET + "\n" +
                        im_line);
                return true;
            } else {
                sender.sendMessage(Msg_joins(non_enough_arg_n,fakemsg_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}