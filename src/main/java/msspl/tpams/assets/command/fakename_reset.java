package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.fakename_reset_msg.*;
import static msspl.tpams.assets.msg.msg.*;

public class fakename_reset implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0 ) {
                if (sender instanceof Player){
                    Player pl = (Player) sender;
                    pl.setCustomName(pl.getName());
                    pl.setDisplayName(pl.getName());
                    pl.setPlayerListName(pl.getName());
                    pl.sendMessage(Default_Base);
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n,fakename_reset_ud));return true;
                }
            } else if (args.length == 1) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    pl.setCustomName(pl.getName());
                    pl.setDisplayName(pl.getName());
                    pl.setPlayerListName(pl.getName());
                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(Default_Base);
                        return true;
                    } else {
                        sender.sendMessage(Default_Base_se(pl.getName()));
                        pl.sendMessage(Default_Base_pl(sender.getName()));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,fakename_reset_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_correct_arg_n,fakename_reset_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
