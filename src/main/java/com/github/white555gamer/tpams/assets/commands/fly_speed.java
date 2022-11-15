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

import static com.github.white555gamer.tpams.assets.functions.commands.fly_speed_func.Fly_Speed_IsConditionMatching;
import static com.github.white555gamer.tpams.assets.functions.commands.fly_speed_func.Fly_Speed_IsProsessable;
import static com.github.white555gamer.tpams.assets.functions.player_check_func.IsPlayerExist;
import static com.github.white555gamer.tpams.assets.messages.commands.fly_speed_msg.*;
import static com.github.white555gamer.tpams.assets.messages.errormsgs.IncorrectArg;

public class fly_speed implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (Fly_Speed_IsConditionMatching(sender, args) && IsPlayerExist(sender, args[0])) {

            Player pl = Bukkit.getPlayer(args[0]);
            switch (args[1]) {
                case "reset":
                    pl.setFlySpeed(0.1F);
                    Fly_Speed_ResetMessageFeed(sender, pl);
                    return true;
                case "min":
                    pl.setFlySpeed(0.1F);
                    Fly_Speed_MinimumMessageFeed(sender, pl);
                    return true;
                case "max":
                    pl.setFlySpeed(1.0F);
                    Fly_Speed_MaximumMessageFeed(sender, pl);
                case "getspeed":
                    sender.sendMessage(Fly_Speed_GetSpeed(pl));
                    return true;
                case "set":
                    if (Fly_Speed_IsProsessable(sender, args)) {

                        float Num = Float.parseFloat(args[2]);
                        pl.setFlySpeed(Num);
                        Fly_Speed_SetMessageFeed(sender, pl, Num);

                    }
                    return true;
                case "add":
                    if (Fly_Speed_IsProsessable(sender, args)) {
                        float Num = pl.getFlySpeed() + Float.parseFloat(args[2]);
                        if (0F <= Num && Num <= 1.0F) {

                            pl.setFlySpeed(Num);
                            Fly_Speed_SetMessageFeed(sender, pl, Num);

                        } else if (0F > Num) {

                            pl.setFlySpeed(0F);
                            Fly_Speed_SetMessageFeed(sender, pl, 0F);

                        } else if (Num > 1.0F) {

                            pl.setFlySpeed(1.0F);
                            Fly_Speed_SetMessageFeed(sender, pl, 1.0F);

                        }
                    }
                    return true;
                case "sub":
                    if (Fly_Speed_IsProsessable(sender, args)) {
                        float Num = pl.getFlySpeed() - Float.parseFloat(args[2]);
                        if (0F <= Num && Num <= 1.0F) {

                            pl.setFlySpeed(Num);
                            Fly_Speed_SetMessageFeed(sender, pl, Num);

                        } else if (0F > Num) {

                            pl.setFlySpeed(0F);
                            Fly_Speed_SetMessageFeed(sender, pl, 0F);

                        } else if (Num > 1.0F) {

                            pl.setFlySpeed(1.0F);
                            Fly_Speed_SetMessageFeed(sender, pl, 1.0F);

                        }
                    }
                    return true;
                default:
                    sender.sendMessage(IncorrectArg);
                    return true;
            }
        }
        else {
            return true;
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("fly_speed")) {

            if (args.length == 2) {

                if (args[1].length() == 0) {
                    return Arrays.asList("reset","set","min","max","add","sub","getspeed");
                } else {
                    if ("reset".startsWith(args[1])) {
                        return Collections.singletonList(("reset"));
                    } else if ("m".startsWith(args[1])) {
                        return Arrays.asList("min","max");
                    } else if ("min".startsWith(args[1])) {
                        return Collections.singletonList(("min"));
                    } else if ("max".startsWith(args[1])) {
                        return Collections.singletonList(("max"));
                    } else if ("add".startsWith(args[1])) {
                        return Collections.singletonList(("add"));
                    } else if ("s".startsWith(args[1])) {
                        return Arrays.asList("set","sub");
                    } else if ("set".startsWith(args[1])) {
                        return Collections.singletonList(("set"));
                    } else if ("sub".startsWith(args[1])) {
                        return Collections.singletonList(("sub"));
                    } else if ("getspeed".startsWith(args[1])) {
                        return Collections.singletonList(("getspeed"));
                    }
                }

            } else if (args.length == 3) {

                if (args[2].length() == 0) {
                    if  ((args[1] == "set" || args[1] == "add" || args[1] == "sub")) {
                        return Arrays.asList("0.1","0.2","0.3","0.4","0.5","0.6","0.7","0.8","0.9","1.0");
                    }
                } else if (args[1] == "set" || args[1] == "add" || args[1] == "sub"){
                    if  ("0.".startsWith(args[2])) {
                        return Arrays.asList("0.1","0.2","0.3","0.4","0.5","0.6","0.7","0.8","0.9","1.0");
                    } else if ("0.1".startsWith(args[2])) {
                        return Collections.singletonList(("0.1"));
                    } else if ("0.2".startsWith(args[2])) {
                        return Collections.singletonList(("0.2"));
                    } else if ("0.3".startsWith(args[2])) {
                        return Collections.singletonList(("0.3"));
                    } else if ("0.4".startsWith(args[2])) {
                        return Collections.singletonList(("0.4"));
                    } else if ("0.5".startsWith(args[2])) {
                        return Collections.singletonList(("0.5"));
                    } else if ("0.6".startsWith(args[2])) {
                        return Collections.singletonList(("0.6"));
                    } else if ("0.7".startsWith(args[2])) {
                        return Collections.singletonList(("0.7"));
                    } else if ("0.8".startsWith(args[2])) {
                        return Collections.singletonList(("0.8"));
                    } else if ("0.9".startsWith(args[2])) {
                        return Collections.singletonList(("0.9"));
                    } else if ("1.0".startsWith(args[2])) {
                        return Collections.singletonList(("1.0"));
                    }
                }

            }

        }
        return null;
    }
}
