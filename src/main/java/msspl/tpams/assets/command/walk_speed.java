package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.bukkit.ChatColor.*;
import static org.bukkit.ChatColor.RESET;

public class walk_speed implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()){

            if (args.length == 0) {

                sender.sendMessage("------------------------------\n" +
                        RED + "Error: Please enter a enough arguments." + RESET + "\n" +
                        "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                        "Description: You can set/get the player walk speed.\n" +
                        "------------------------------");
                return true;

            } else if (args.length == 1) {

                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {

                    sender.sendMessage("------------------------------\n"+
                            RED +"Note: Please enter a enough arguments." + RESET + "\n"+
                            "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                            "Description: You can set/get the player walk speed.\n" +
                            "------------------------------");
                    sender.sendMessage("------------------------------\n" +
                            GREEN + "Command succeeded: The " + pl.getName() + "\'s walk speed is " + pl.getWalkSpeed() + RESET + "\n" +
                            "------------------------------");
                    return true;

                } else {

                    sender.sendMessage("------------------------------\n"+
                            RED +"Error: Please enter a enough arguments." + RESET + "\n"+
                            "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                            "Description: You can set/get the player walk speed.\n" +
                            "------------------------------");
                    return true;

                }

            } else if (args.length == 2) {

                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {

                    if (args[1].equalsIgnoreCase("reset")){

                        pl.setWalkSpeed((float) 0.2);
                        if (sender.getName()==pl.getName()){

                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been reset." + RESET + "\n" +
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: " + pl.getName()+ "\'s walk speed has been reset." + RESET + "\n" +
                                    "------------------------------");
                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been reset by "+sender.getName()+"."+ RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else if (args[1].equalsIgnoreCase("max")){

                        pl.setWalkSpeed((float) 1.0);
                        if (sender.getName() == pl.getName()) {

                            pl.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: The walk speed has been set Maximum" + RESET + "\n" +
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: " + pl.getName() + "\'s walk speed has been set Maximum." + RESET + "\n" +
                                    "------------------------------");
                            pl.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: The walk speed has been set Maximum by " + sender.getName() + "." + RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else if (args[1].equalsIgnoreCase("min")){

                        pl.setWalkSpeed((float) 0.2);
                        if (sender.getName() == pl.getName()) {

                            pl.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: The walk speed has been set Minimum" + RESET + "\n" +
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: " + pl.getName() + "\'s walk speed has been set Minimum." + RESET + "\n" +
                                    "------------------------------");
                            pl.sendMessage("------------------------------\n" +
                                    GREEN + "Command succeeded: The walk speed has been set Minimum by " + sender.getName() + "." + RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else if (args[1].equalsIgnoreCase("getspeed")){

                        sender.sendMessage("------------------------------\n" +
                                GREEN + "Command succeeded: The " + pl.getName() + "\'s walk speed is " + pl.getWalkSpeed() + RESET + "\n" +
                                "------------------------------");
                        return true;

                    } else {

                        sender.sendMessage("------------------------------\n" +
                                RED + "Error: Please enter a correct arguments." + RESET + "\n" +
                                "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                                "Description: You can set/get the player walk speed.\n" +
                                "------------------------------");
                        return true;

                    }

                } else {

                    sender.sendMessage("------------------------------\n" +
                            RED + "Error: No such player exists." + RESET + "\n" +
                            "Usage: /fly_speed < PlayerName > < reset | set | min | max | add | sub | getspeed> < 0.1~1.0 >\n" +
                            "Description: You can set/get the player flight speed.\n" +
                            "------------------------------");
                    return true;

                }

            } else if (args.length == 3) {

                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {

                    try {

                        float Num = Float.parseFloat(args[2]);

                    } catch (NullPointerException|NumberFormatException e){

                        sender.sendMessage("------------------------------\n" +
                                RED + "Error: Please enter a correct arguments." + RESET + "\n" +
                                "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                                "Description: You can set/get the player walk speed.\n\n"+
                                "Debug: " + e.getCause().toString() +
                                "\n------------------------------");
                        return true;

                    }

                    float Num = Float.parseFloat(args[2]);
                    if (Num < 0.1){

                        Num = (float) 0.1;
                        sender.sendMessage("------------------------------\n"+
                                RED +"Note: Please enter a value that between 0.1~1.0." + RESET + "\n"+
                                "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                                "Description: You can set/get the player walk speed.\n" +
                                "-------------------------------");

                    } else if (Num > 1.0){

                        Num = (float) 1.0;
                        sender.sendMessage("------------------------------\n"+
                                RED +"Note: Please enter a value that between 0.1~1.0." + RESET + "\n"+
                                "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                                "Description: You can set/get the player walk speed.\n" +
                                "-------------------------------");

                    }

                    if (args[1].equalsIgnoreCase("set")){

                        pl.setWalkSpeed(Num);
                        if (sender.getName()==pl.getName()){

                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + Num + "." + RESET +"\n"+
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: " + pl.getName()+ "\'s walk speed has been set to " + Num + "." + RESET + "\n" +
                                    "\n------------------------------");
                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + Num + " by "+sender.getName()+"."+ RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else if (args[1].equalsIgnoreCase("add")){

                        float after = pl.getWalkSpeed() + Num;
                        if (after < 0.1){

                            after = (float) 0.1;

                        } else if (after > 1.0){

                            after = (float) 1.0;

                        }
                        pl.setWalkSpeed(after);
                        if (sender.getName()==pl.getName()){

                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + after + "." + RESET +"\n"+
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: " + pl.getName()+ "\'s walk speed has been set to " + after + "." + RESET + "\n" +
                                    "\n------------------------------");
                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + after + " by "+sender.getName()+"."+ RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else if (args[1].equalsIgnoreCase("sub")){

                        float after = pl.getWalkSpeed() - Num;
                        if (after < 0.1){

                            after = (float) 0.1;

                        } else if (after > 1.0){

                            after = (float) 1.0;

                        }
                        pl.setWalkSpeed(after);
                        if (sender.getName()==pl.getName()){

                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + after + "." + RESET +"\n"+
                                    "------------------------------");
                            return true;

                        } else {

                            sender.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: " + pl.getName()+ "\'s walk speed has been set to " + after + "." + RESET + "\n" +
                                    "\n------------------------------");
                            pl.sendMessage("------------------------------\n"+
                                    GREEN + "Command succeeded: The walk speed has been set to " + after + " by "+sender.getName()+"."+ RESET + "\n" +
                                    "------------------------------");
                            return true;

                        }

                    } else {

                        sender.sendMessage("------------------------------\n"+
                                RED +"Error: Please enter a correct arguments." + RESET + "\n"+
                                "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                                "Description: You can set/get the player walk speed.\n" +
                                "------------------------------");
                        return true;

                    }

                } else {

                    sender.sendMessage("------------------------------\n" +
                            RED + "Error: No such player exists." + RESET + "\n" +
                            "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                            "Description: You can set/get the player walk speed.\n" +
                            "------------------------------");
                    return true;

                }

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED +"Error: Please enter a correct arguments." + RESET + "\n"+
                        "Usage: /walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n" +
                        "Description: You can set/get the player walk speed.\n" +
                        "------------------------------");
                return true;

            }

        } else {

            sender.sendMessage("------------------------------\n"+
                    RED +"Error: Operator permission is required." + RESET + "\n"+
                    "------------------------------");
            return true;

        }
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("walk_speed")){

            if (args.length == 2) {

                if (args[1].length() == 0) {

                    return Arrays.asList("reset","set","min","max","add","sub","getspeed");

                } else {

                    if ("reset".startsWith(args[1])) {

                        return Collections.singletonList(("reset"));

                    } else if ("set".startsWith(args[1])) {

                        return Collections.singletonList(("set"));

                    } else if ("min".startsWith(args[1])) {

                        return Collections.singletonList(("min"));

                    } else if ("max".startsWith(args[1])) {

                        return Collections.singletonList(("max"));

                    } else if ("add".startsWith(args[1])) {

                        return Collections.singletonList(("add"));

                    } else if ("sub".startsWith(args[1])) {

                        return Collections.singletonList(("sub"));

                    } else if ("getspeed".startsWith(args[1])) {

                        return Collections.singletonList(("getspeed"));

                    }

                }

            }

        }

        return null;
    }
}
