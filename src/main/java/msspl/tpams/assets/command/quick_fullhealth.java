package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.msg.*;
import static msspl.tpams.assets.msg.quick_ffr_msg.Health_Msg;
import static org.bukkit.ChatColor.*;
import static org.bukkit.ChatColor.RESET;

public class quick_fullhealth implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()){

            if (args.length == 0) {

                if (sender instanceof Player){
                    Player ps = (Player) sender;
                    ps.setHealth(ps.getHealthScale());
                    ps.sendMessage(Health_Msg);
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n, quick_fullhealth_ud));
                    return true;
                }
            } else {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    pl.setHealth(pl.getHealthScale());
                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(Health_Msg);
                        return true;
                    } else {
                        sender.sendMessage(Health_Msg.replace("health", pl.getName() + "\'s health"));
                        pl.sendMessage(Health_Msg.replace(".", " by " + sender.getName() + "."));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,quick_fullhealth_ud));return true;
                }
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
