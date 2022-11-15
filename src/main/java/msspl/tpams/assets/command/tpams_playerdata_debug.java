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

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static msspl.tpams.assets.msg.msg.*;

public class tpams_playerdata_debug implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (args.length == 0 || args.length == 1) {
                sender.sendMessage(Msg_joins(non_enough_arg_n, tpams_playerdata_debug_ud));
                return true;
            } else if (args.length == 2) {

                Player pl = Bukkit.getPlayer(args[0]);
                if (pl != null) {

                    if (args[1].equalsIgnoreCase("playername")){

                        sender.sendMessage(im_line_n+
                                pl.getName() + "\'s Name: " + pl.getName() + "\n" +
                                pl.getName() + "\'s UUID: " + pl.getUniqueId() + "\n" +
                                pl.getName() + "\'s Custom Name: " + pl.getCustomName() + "\n" +
                                pl.getName() + "\'s Display Name: " +pl.getDisplayName() + "\n" +
                                pl.getName() + "\'s List Name: " + pl.getPlayerListName() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("flight")) {

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s Flightable: " + pl.getAllowFlight() + "\n" +
                                pl.getName() + "\'s Flight Speed: " + pl.getFlySpeed() + "\n" +
                                pl.getName() + "\'s is Flying: " + pl.isFlying() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("walk")) {

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s Walk Speed: " +pl.getWalkSpeed() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("playercondition")){

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s Health: " + pl.getHealth() + "\n" +
                                pl.getName() + "\'s Health Scale: " + pl.getHealthScale() + "\n" +
                                pl.getName() + "\'s Food: " + pl.getFoodLevel() + "\n" +
                                pl.getName() + "\'s Level: " + pl.getLevel() + "\n" +
                                pl.getName() + "\'s Exp: " + pl.getExp() + "\n" +
                                pl.getName() + "\'s Game Mode :" + pl.getGameMode() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("location")){

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s XYZ: " + pl.getLocation().getX() + " / " + pl.getLocation().getY() + " / " + pl.getLocation().getZ() + "\n" +
                                pl.getName() + "\'s Block XYZ: " + pl.getLocation().getBlockX() + " / " + pl.getLocation().getBlockY() + " / " + pl.getLocation().getBlockZ() + "\n" +
                                pl.getName() + "\'s Yaw/Pitch: " + pl.getLocation().getYaw() + " / " + pl.getLocation().getPitch() + "\n" +
                                pl.getName() + "\'s Chunk XZ: " + pl.getLocation().getChunk().getX() + " / " + pl.getLocation().getChunk().getZ() + "\n" +
                                pl.getName() + "\'s World: " + pl.getLocation().getWorld().getName() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("internet")){

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s Address Host Name: " + pl.getAddress().getHostName() + "\n" +
                                pl.getName() + "\'s AddressHost String: " + pl.getAddress().getHostString() + "\n" +
                                pl.getName() + "\'s Address Port: " + pl.getAddress().getPort() + "\n" +
                                pl.getName() + "\'s Ping: " +pl.getPing() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("ping")){

                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s Ping: " +pl.getPing() + "\n" +
                                im_line);
                        return true;

                    }
                    else if (args[1].equalsIgnoreCase("serverinfo")){
                        sender.sendMessage(im_line_n +
                                pl.getName() + "\'s info:\n"+
                                "  Online: " + pl.isOnline() + "\n" +
                                "  Op: " + pl.isOp() + "\n" +
                                "  White Listed: " + pl.isWhitelisted() + "\n" +
                                "  Banned: " + pl.isBanned() + "\n" +
                                im_line);
                        return true;
                    }
                    else {
                        sender.sendMessage(Msg_joins(non_correct_arg_n, tpams_playerdata_debug_ud));return true;
                    }
                } else {
                    sender.sendMessage(Msg_joins(non_exist_pl_n,tpams_playerdata_debug_ud));return true;
                }
            } else {
                sender.sendMessage(Msg_joins(non_enough_arg_n, tpams_playerdata_debug_ud));return true;
            }
        } else {
            sender.sendMessage(Msg_pads(non_op_pl_n));return true;
        }
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("tpams_playerdata_debug")){

            if (args.length == 2) {

                if (args[1].length() == 0) {

                    return Arrays.asList("playername","flight","walk","playercondition","location","internet","ping","serverinfo");

                } else {

                    if ("playername".startsWith(args[1])) {
                        return Collections.singletonList(("playername"));
                    } else if ("flight".startsWith(args[1])) {
                        return Collections.singletonList(("flight"));
                    } else if ("walk".startsWith(args[1])) {
                        return Collections.singletonList(("walk"));
                    } else if ("playercondition".startsWith(args[1])) {
                        return Collections.singletonList(("playercondition"));
                    } else if ("location".startsWith(args[1])) {
                        return Collections.singletonList(("location"));
                    } else if ("internet".startsWith(args[1])) {
                        return Collections.singletonList(("internet"));
                    } else if ("ping".startsWith(args[1])) {
                        return Collections.singletonList(("ping"));
                    } else if ("serverinfo".startsWith(args[1])) {
                        return Collections.singletonList(("serverinfo"));
                    }

                }

            }

        }
        return null;
    }
}
