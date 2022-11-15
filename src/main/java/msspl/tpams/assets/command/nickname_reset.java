package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.msg.*;
import static msspl.tpams.assets.msg.nickname_reset_msg.RESET_BASE;
import static msspl.tpams.assets.msg.nickname_reset_msg.Reset_Player_Base;
import static org.bukkit.ChatColor.*;
import static org.bukkit.ChatColor.RESET;

public class nickname_reset implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0 ) {
                if (sender instanceof Player){
                    Player pl = (Player) sender;
                    pl.setCustomName(pl.getName());
                    pl.setDisplayName(pl.getName());
                    pl.setPlayerListName(pl.getName());
                    pl.sendMessage(RESET_BASE);
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n,nickname_reset_ud));
                    return true;
                }
            } else if (args.length == 1) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    pl.setCustomName(pl.getName());
                    pl.setDisplayName(pl.getName());
                    pl.setPlayerListName(pl.getName());
                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(RESET_BASE);
                        return true;
                    } else {
                        sender.sendMessage(Reset_Player_Base(pl.getName()));
                        pl.sendMessage(Reset_Player_Base(pl.getName()).replace(".", " by " + sender.getName() + "."));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,nickname_reset_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,nickname_reset_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
