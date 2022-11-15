package msspl.tpams.assets.command;

import msspl.tpams.assets.info.info;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static org.bukkit.ChatColor.*;

public class tpams_runningtest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(im_line_n+
                GREEN+"TPAMS-"+ info.Version+" is running."+RESET+"\n"+
                im_line);
        return true;
    }
}
