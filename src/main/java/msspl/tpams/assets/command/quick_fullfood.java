package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.msg.*;
import static msspl.tpams.assets.msg.quick_ffr_msg.Food_Msg;
import static org.bukkit.ChatColor.*;
import static org.bukkit.ChatColor.RESET;

public class quick_fullfood implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 0 ) {
                if (sender instanceof Player){
                    Player ps = (Player) sender;
                    ps.setFoodLevel(20);
                    ps.sendMessage(Food_Msg);
                    return true;
                } else {
                    sender.sendMessage(Msg_joins(non_enough_arg_n, quick_fullfood_ud));
                    return true;
                }
            } else if (args.length == 1 ) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {
                    pl.setFoodLevel(20);
                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(Food_Msg);
                        return true;
                    } else {
                        sender.sendMessage(Food_Msg.replace("food", pl.getName() + "\'s food"));
                        pl.sendMessage(Food_Msg.replace("."," by " + sender.getName() + "."));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n, quick_fullfood_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_enough_arg_n, quick_fullfood_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
