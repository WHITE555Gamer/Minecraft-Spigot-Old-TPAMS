package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static msspl.tpams.assets.msg.fakename_msg.Feed_Msg;
import static msspl.tpams.assets.msg.msg.*;

public class fakename implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()){
            if (args.length == 2) {
                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {

                    String faker = args[1]+"...?";
                    pl.setCustomName(faker);
                    pl.setDisplayName(faker);
                    pl.setPlayerListName(faker);

                    if (sender.getName() == pl.getName()) {
                        pl.sendMessage(Feed_Msg(faker));
                        return true;
                    } else {
                        sender.sendMessage(Feed_Msg(faker).replace("own", pl.getName()));
                        pl.sendMessage(Feed_Msg(faker).replace(".", " by " + sender.getName() + "."));
                        return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,fakename_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_enough_arg_n,fakename_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }
}
