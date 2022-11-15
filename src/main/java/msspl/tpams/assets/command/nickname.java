package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.msg.*;
import static msspl.tpams.assets.msg.nickname_msg.Feed_Msg;
import static msspl.tpams.assets.msg.nickname_msg.Special_Msg;

public class nickname implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0 || args.length == 1) {
                sender.sendMessage(Msg_joins(non_enough_arg_n,nickname_ud));
                return true;
            } else if (args.length == 2) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    pl.setCustomName(args[1]+"("+pl.getName()+")");
                    pl.setDisplayName(args[1]+"("+pl.getName()+")");
                    pl.setPlayerListName(args[1]+"("+pl.getName()+")");
                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(Feed_Msg(pl.getName(),args[1]));
                        return true;
                    } else {
                        sender.sendMessage(Feed_Msg(pl.getName(),args[1]));
                        pl.sendMessage(Feed_Msg(pl.getName(),args[1]).replace("."," by " + sender.getName() + "."));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,nickname_ud));
                    return true;
                }
            } else if (args.length == 3) {
                if (args[2].equalsIgnoreCase("Special-Key-Chain")) {
                    Player pl = Bukkit.getPlayer(args[0]);
                    if (pl != null) {
                        pl.setCustomName(args[1]);
                        pl.setDisplayName(args[1]);
                        pl.setPlayerListName(args[1]);
                        if (sender.getName() == pl.getName()) {
                            pl.sendMessage(Special_Msg(pl.getName(),args[1]));
                            return true;
                        } else {
                            sender.sendMessage(Special_Msg(pl.getName(),args[1]));
                            pl.sendMessage(Special_Msg(pl.getName(),args[1]).replace(".", " by " + sender.getName() + "."));
                            return true;
                        }
                    } else {
                        sender.sendMessage(Msg_joins(non_exist_pl_n,nickname_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_correct_arg_n,nickname_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,nickname_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
