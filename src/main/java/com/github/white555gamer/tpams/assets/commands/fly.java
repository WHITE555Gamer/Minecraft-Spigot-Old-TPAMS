package com.github.white555gamer.tpams.assets.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.github.white555gamer.tpams.assets.functions.commands.fly_func.Fly_IsConditionMatching;
import static com.github.white555gamer.tpams.assets.functions.player_check_func.IsPlayerExist;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.IncorrectArg;
import static com.github.white555gamer.tpams.assets.messages.commands.fly_msg.*;

public class fly implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (Fly_IsConditionMatching(sender, args) && IsPlayerExist(sender, args[0])) {

            Player pl = Bukkit.getPlayer(args[0]);
            switch (args[1]) {
                case "true":
                    pl.setAllowFlight(true);
                    Fly_MessageFeed(sender, pl);
                    return true;
                case "false":
                    pl.setAllowFlight(false);
                    Fly_MessageFeed(sender, pl);
                    return true;
                case "toggle":
                    pl.setAllowFlight(!pl.getAllowFlight());
                    Fly_MessageFeed(sender, pl);
                    return true;
                case "getboolean":
                    pl.sendMessage(Fly_GetBoolean(pl));
                    return true;
                default:
                    sender.sendMessage(IncorrectArg);
                    return true;
            }

        } else {
            return true;
        }

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("fly")){
            if (args.length == 2) {
                if (args[1].length() == 0) {
                    return Arrays.asList("true","false","toggle","getboolean");
                }
                else {
                    if ("true".startsWith(args[1])) {
                        return Collections.singletonList(("true"));
                    }
                    else if ("false".startsWith(args[1])) {
                        return Collections.singletonList(("false"));
                    }
                    else if ("toggle".startsWith(args[1])) {
                        return Collections.singletonList(("toggle"));
                    }
                    else if ("getboolean".startsWith(args[1])) {
                        return Collections.singletonList(("getboolean"));
                    }

                }

            }

        }
        return null;
    }
}
