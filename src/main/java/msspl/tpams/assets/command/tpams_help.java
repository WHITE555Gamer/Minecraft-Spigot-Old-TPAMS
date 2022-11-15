package msspl.tpams.assets.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static msspl.tpams.assets.msg.msg.*;

public class tpams_help implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        /*if (args[0].equalsIgnoreCase("autosneaking")) {

            sender.sendMessage(im_line_n+
                    "    <Auto-Sneaking Command>    \n"+
                    autosneaking_ud[0] + autosneaking_ud[1] + "\n" +
                    "e.g.\n/autosneaking EXAMPLE true\n/autosneaking EXAMPLE false\n/autosneaking EXAMPLE toggle\n/autosneaking EXAMPLE getboolean\n" +
                    "→result: EXAMPLE\'s autosneaking: true\n→result: EXAMPLE\'s autosneaking: false\n"+
                    im_line);

        *//*} else */if (args[0].equalsIgnoreCase("classic_gamemode")) {

            sender.sendMessage(im_line_n+
                    "    <Classic Game Mode Command>    \n"+
                    classic_gm_ud[0] + classic_gm_ud[1] + "\n" +
                    "e.g.\n/classic_gamemode 0\n/classic_gamemode c EXAMPLE\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("fakemsg")) {

            sender.sendMessage(im_line_n+
                    "    <Fake Message Command>    \n"+
                    fakemsg_ud[0] + fakemsg_ud[1] + "\n" +
                    "e.g.\n/fakemsg EXAMPLE Hi, There.\n" +
                    "result: <EXAMPLE...?> Hi There.\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("fakename")) {

            sender.sendMessage(im_line_n+
                    "    <Fake Name Command>    \n"+
                    fakename_ud[0] + fakename_ud[1] + "\n" +
                    "e.g.\n/fakename EXAMPLE SECOND\nresult: SECOND...?\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("fakename_reset")) {

            sender.sendMessage(im_line_n+
                    "    <Fake Name Reset Command>    \n" +
                    fakename_reset_ud[0] + fakename_reset_ud[1] + "\n" +
                    "e.g.\n/fakename_reset EXAMPLE\nresult: EXAMPLE\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("fly")) {

            sender.sendMessage(im_line_n+
                    "    <Fly Command>    \n"+
                    fly_ud[0] + fly_ud[1] + "\n" +
                    "e.g.\n/fly EXAMPLE true\n/fly EXAMPLE false\n/fly EXAMPLE toggle\n/fly EXAMPLE getboolean\n" +
                    "→result: EXAMPLE\'s flightable: true\n→result: EXAMPLE\'s flightable: false\n"+
                    im_line);

        } else if (args[0].equalsIgnoreCase("fly_speed")) {

            sender.sendMessage(im_line_n+
                    "    <Fly Speed Command>    \n"+
                    fly_speed_ud[0] + fly_speed_ud[1] + "\n"+
                    "e.g.\n/fly_speed EXAMPLE reset\n/fly_speed EXAMPLE set 0.4\n/fly_speed EXAMPLE min\n/fly_speed EXAMPLE max\n" +
                    "/fly_speed EXAMPLE add 0.2\n/fly_speed EXAMPLE sub 0.1\n/fly_speed EXAMPLE getspeed\n" +
                    "→result: EXAMPLE\'s flight speed: 0.1\n"+
                    im_line);

        } else if (args[0].equalsIgnoreCase("walk_speed")) {

            sender.sendMessage(im_line_n+
                    "    <Walk Speed Command>    \n" +
                    walk_speed_ud[0] + walk_speed_ud[1] + "\n" +
                    "e.g.\n/walk_speed EXAMPLE reset\n/walk_speed EXAMPLE set 0.4\n/walk_speed EXAMPLE min\n/walk_speed EXAMPLE max\n" +
                    "/walk_speed EXAMPLE add 0.2\n/walk_speed EXAMPLE sub 0.1\n/walk_speed EXAMPLE getspeed\n" +
                    "→result: EXAMPLE\'s walk speed: 0.2\n"+
                    im_line);

        } else if (args[0].equalsIgnoreCase("health")) {

            sender.sendMessage(im_line_n+
                    "    <Health Command>    \n" +
                    health_ud[0] + health_ud[1] + "\n"+
                    "e.g.\n/health EXAMPLE set 10\n/health EXAMPLE kill\n/health EXAMPLE min\n/health EXAMPLE max\n" +
                    "/health EXAMPLE add 10\n/health EXAMPLE sub 5\n/health EXAMPLE gethealth\n" +
                    "→result: EXAMPLE\'s health: 10\n"+
                    im_line);

        } else if (args[0].equalsIgnoreCase("nickname")) {

            sender.sendMessage(im_line_n+
                    "    <Nick Name Command>    \n"+
                    nickname_ud[0] + nickname_ud[1] + "\n" +
                    "e.g.\n/nickname EXAMPLE SECOND\n" +
                    "result: EXAMPLE(SECOND)\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("nickname_reset")) {

            sender.sendMessage(im_line_n+
                    "    <Nick Name Reset Command>    \n"+
                    nickname_reset_ud[0] + nickname_reset_ud[1] + "\n"+
                    "e.g.\n/nickname_reset EXAMPLE\n" +
                    "result: EXAMPLE\n"+
                    im_line);

        } else if (args[0].equalsIgnoreCase("quick_fullfood")) {

            sender.sendMessage(im_line_n+
                    "    <Quick Full Food Command>    \n"+
                    quick_fullfood_ud[0] + quick_fullfood_ud[1] + "\n"+
                    "e.g.\n/quick_fullfood\n/quick_fullfood EXAMPLE\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("quick_fullhealth")) {

            sender.sendMessage(im_line_n+
                    "    <Quick Full Health Command>    \n"+
                    quick_fullhealth_ud[0] + quick_fullhealth_ud[1] + "\n" +
                    "e.g.\n/quick_fullhealth\n/quick_fullhealth EXAMPLE\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("quick_recovery")) {

            sender.sendMessage(im_line_n+
                    "    <Quick Recovery Command>    \n"+
                    quick_recovery_ud[0] + quick_recovery_ud[1] + "\n" +
                    "e.g.\n/quick_recovery\n/quick_recovery EXAMPLE\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("tpams_changelog")) {

            sender.sendMessage(im_line_n+
                    "    <TPAMS ChangeLog Command>    \n"+
                    tpams_changelog_ud[0] + tpams_changelog_ud[1] + "\n"+
                    "e.g.\n/tpams_changelog 0.0.1-ALPHA 1\n/tpams_changelog 0.1.5-RELEASE 1\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("tpams_help")) {

            sender.sendMessage(im_line_n+
                    "    <TPAMS Help Command>    \n"+
                    tpams_help_ud[0] + tpams_help_ud[1] + "\n"+
                    "e.g.\n/tpams_help fly\n/tpams_help health\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("tpams_playerdata_debug")) {

            sender.sendMessage(im_line_n+
                    "    <TPAMS Player Data Debug Command>    \n"+
                    tpams_playerdata_debug_ud[0] + tpams_playerdata_debug_ud[1] + "\n"+
                    "e.g.\n/tpams_playerdata_debug EXAMPLE flight\n/tpams_playerdata_debug internet\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("tpams_serverdata_debug")) {

            sender.sendMessage(im_line_n+
                    "    <TPAMS Server Data Debug Command>    \n"+
                    tpams_serverdata_debug_ud[0] + tpams_serverdata_debug_ud[1] + "\n"+
                    "e.g.\n/tpams_serverdata_debug EXAMPLE serverinfo\n" +
                    im_line);

        } else if (args[0].equalsIgnoreCase("tpams_runningtest")) {

            sender.sendMessage(im_line_n+
                    "    <TPAMS Running Test Command>    \n"+
                    tpams_runningtest_ud[0] + tpams_runningtest_ud[1] + "\n"+
                    "e.g.\n/tpams_runningtest\n" +
                    im_line);

        }

        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("tpams_help")){

            if (args.length == 1) {

                if (args[0].length() == 0) {

                    return Arrays.asList("classic_gamemode","fakemsg","fakename","fakename_reset","fly","fly_speed","walk_speed","health","nickname","nickname_reset",
                            "quick_fullfood","quick_fullhealth","quick_recovery","tpams_changelog","tpams_help");

                } else {

                    if ("classic_gamemode".startsWith(args[0])) {
                        return Collections.singletonList(("classic_gamemode"));
                    } else if ("f".startsWith(args[0])) {
                        return Arrays.asList("fakemsg","fakename","fakename_reset","fly","fly_speed");
                    } else if ("fake".startsWith(args[0])) {
                        return Arrays.asList("fakemsg","fakename","fakename_reset");
                    } else if ("fakemsg".startsWith(args[0])) {
                        return Collections.singletonList(("fakemsg"));
                    } else if ("fakename".startsWith(args[0])) {
                        return Collections.singletonList(("fakename"));
                    } else if ("fakename_reset".startsWith(args[0])) {
                        return Collections.singletonList(("fakename_reset"));
                    } else if ("fly".startsWith(args[0])) {
                        return Arrays.asList("fly","fly_speed");
                    } else if ("fly_speed".startsWith(args[0])) {
                        return Collections.singletonList(("fly_speed"));
                    } else if ("walk_speed".startsWith(args[0])) {
                        return Collections.singletonList(("walk_speed"));
                    } else if ("health".startsWith(args[0])) {
                        return Collections.singletonList(("health"));
                    } else if ("nickname".startsWith(args[0])) {
                        return Arrays.asList("nickname","nickname_reset");
                    } else if ("nickname_reset".startsWith(args[0])) {
                        return Collections.singletonList(("nickname_reset"));
                    } else if ("quick_".startsWith(args[0])) {
                        return Arrays.asList("quick_fullfood","quick_fullhealth","quick_recovery");
                    } else if ("quick_fullfood".startsWith(args[0])) {
                        return Collections.singletonList(("quick_fullfood"));
                    } else if ("quick_fullhealth".startsWith(args[0])) {
                        return Collections.singletonList(("quick_fullhealth"));
                    } else if ("quick_recovery".startsWith(args[0])) {
                        return Collections.singletonList(("quick_recovery"));
                    } else if ("tpams_".startsWith(args[0])) {
                        return Arrays.asList("tpams_changelog","tpams_help","tpams_playerdata_debug","tpams_serverdata_debug","tpams_runningtest");
                    } else if ("tpams_changelog".startsWith(args[0])) {
                        return Collections.singletonList(("tpams_changelog"));
                    } else if ("tpams_help".startsWith(args[0])) {
                        return Collections.singletonList(("tpams_help"));
                    } else if ("tpams_playerdata_debug".startsWith(args[0])) {
                        return Collections.singletonList(("tpams_playerdata_debug"));
                    } else if ("tpams_serverdata_debug".startsWith(args[0])) {
                        return Collections.singletonList(("tpams_serverdata_debug"));
                    } else if ("tpams_runningtest".startsWith(args[0])) {
                        return Collections.singletonList(("tpams_runningtest"));
                    }

                }

            }

        }
        return null;
    }
}
