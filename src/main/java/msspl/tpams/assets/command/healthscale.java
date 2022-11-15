package msspl.tpams.assets.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class healthscale implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender.isOp()){

            if (args.length == 0) {

                sender.sendMessage("------------------------------\n" +
                        ChatColor.RED + "Error: Please enter a enough arguments." + ChatColor.RESET + "\n" +
                        "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                        "Description: You can set|get the player health scale.\n" +
                        "------------------------------");
                return true;

            } else {

                if (args[0] != null && !(args[0].isEmpty())) {

                    Player pl = Bukkit.getPlayer(args[0]);
                    if (pl != null) {

                        if (args[1].equalsIgnoreCase("gethealthscale")){

                            sender.sendMessage("------------------------------\n" +
                                    ChatColor.GREEN + "Command succeeded: The " + pl.getName() + "\'s health scale is " + pl.getHealthScale() + ChatColor.RESET + "\n" +
                                    "------------------------------");
                            return true;

                        } else if (args[1].equalsIgnoreCase("set") || args[1].equalsIgnoreCase("add") || args[1].equalsIgnoreCase("sub")){

                            try {

                                double Num = Double.parseDouble(args[2]);

                            } catch (NullPointerException|NumberFormatException e){

                                sender.sendMessage("------------------------------\n" +
                                        ChatColor.RED + "Error: Please enter a correct arguments." + ChatColor.RESET + "\n" +
                                        "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                                        "Description: You can set|get the player health scale.\n\n"+
                                        "Debug: " + e.getCause().toString() +
                                        "\n------------------------------");
                                return true;

                            }

                            Double Num = Double.parseDouble(args[2]);
                            if (Num < 1){

                                Num = (double) 1;
                                sender.sendMessage("------------------------------\n"+
                                        ChatColor.RED +"Note: Please enter a value that between 0.1~1.0." + ChatColor.RESET + "\n"+
                                        "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                                        "Description: You can set|get the player health.\n" +
                                        "-------------------------------");

                            }

                            if (args[1].equalsIgnoreCase("set")){

                                pl.setHealthScale(Num);
                                pl.setHealthScaled(false);
                                if (sender.getName()==pl.getName()){

                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + Num + "." + ChatColor.RESET +"\n"+
                                            "------------------------------");
                                    return true;

                                } else {

                                    sender.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: " + pl.getName()+ "\'s health scale has been set to " + Num + "." + ChatColor.RESET + "\n" +
                                            "\n------------------------------");
                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + Num + " by "+sender.getName()+"."+ChatColor.RESET + "\n" +
                                            "------------------------------");
                                    return true;

                                }

                            } else if (args[1].equalsIgnoreCase("add")){

                                double before = pl.getHealthScale();
                                double after = before + Num;
                                if (after < 1){

                                    after = 1;

                                }
                                pl.setHealthScale(after);
                                pl.setHealthScaled(false);
                                if (sender.getName()==pl.getName()){

                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + after + "." + ChatColor.RESET +"\n"+
                                            "------------------------------");
                                    return true;

                                } else {

                                    sender.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: " + pl.getName()+ "\'s health scale has been set to " + after + "." + ChatColor.RESET + "\n" +
                                            "\n------------------------------");
                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + after + " by "+sender.getName()+"."+ChatColor.RESET + "\n" +
                                            "------------------------------");
                                    return true;

                                }

                            } else if (args[1].equalsIgnoreCase("sub")){

                                double before = pl.getHealth();
                                double after = before - Num;
                                if (after < 1){

                                    after = 1;

                                }
                                pl.setHealthScale(after);
                                pl.setHealthScaled(false);
                                if (sender.getName()==pl.getName()){

                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + after + "." + ChatColor.RESET +"\n"+
                                            "------------------------------");
                                    return true;

                                } else {

                                    sender.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: " + pl.getName()+ "\'s health scale has been set to " + after + "." + ChatColor.RESET + "\n" +
                                            "\n------------------------------");
                                    pl.sendMessage("------------------------------\n"+
                                            ChatColor.GREEN + "Command succeeded: The health scale has been set to " + after + " by "+sender.getName()+"."+ChatColor.RESET + "\n" +
                                            "------------------------------");
                                    return true;

                                }

                            } else {

                                sender.sendMessage("------------------------------\n"+
                                        ChatColor.RED +"Error: Please enter a correct arguments." + ChatColor.RESET + "\n"+
                                        "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                                        "Description: You can set|get the player health scale.\n" +
                                        "------------------------------");
                                return true;

                            }

                        }

                    } else {

                        sender.sendMessage("------------------------------\n" +
                                ChatColor.RED + "Error: No such player exists." + ChatColor.RESET + "\n" +
                                "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                                "Description: You can set|get the player health scale.\n" +
                                "------------------------------");
                        return true;

                    }

                } else {

                    sender.sendMessage("------------------------------\n" +
                            ChatColor.RED + "Error: Please enter a enough arguments." + ChatColor.RESET + "\n" +
                            "Usage: /healthscale < PlayerName > < set | add | sub | gethealthscale > < 1 or more >\n" +
                            "Description: You can set|get the player health scale.\n" +
                            "------------------------------\n");
                    return true;

                }

            }

        } else {

            sender.sendMessage("------------------------------\n"+
                    ChatColor.RED +"Error: Operator permission is required." + ChatColor.RESET + "\n"+
                    "------------------------------");
            return true;

        }
        return true;
    }
}
