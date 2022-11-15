package msspl.tpams.assets.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static msspl.tpams.assets.msg.msg.*;
import static org.bukkit.ChatColor.*;

public class tpams_changelog implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0 || args.length == 1){

            sender.sendMessage(Msg_joins(non_enough_arg_n, tpams_changelog_ud));
            return true;

        }

        if (args[0].equalsIgnoreCase("0.0.1-ALPHA")) {

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.1-ALPHA ChangeLog   PAGE   1 / 1 ----------"+
                        "This TPAMS alpha version has some differences from the commands in some displays.\n" +
                        "/ fly <playername>\n→ / fly\n/ heel <playername>\n→ / heel\n" +
                        "The command cannot be used from the server side due to the detailed unimplemented command.\n"+
                        "The command statement is in Japanese. There will be support for English later. (By Google Translate)");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 1 )\n"+RESET+
                        "------------------------------");

            }

        }
        else if (args[0].equalsIgnoreCase("0.0.1-BETA")) {

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.1-BETA ChangeLog   PAGE   1 / 3 ----------"+
                        "With this update, various commands can be set in detail and stability has been improved.\n\n" +
                        "Earlier versions of the plug-in only allowed to be enabled when using the \"fly\" command or using the \"/ fly\" setting.\n"+
                        "Now you can enable / disable with \"/ fly <true | false>\". Also, when \"true\", you can set the flight speed in detail.");

            } else if (args[1].equalsIgnoreCase("2")){

                sender.sendMessage("----------   0.0.1-BETA ChangeLog   PAGE   2 / 3 ----------"+
                        "Can be set with \"/ fly true <flyspeed>\". In addition, since some exception handling is supported,\n"+
                        "commands are no longer accepted if the description is incorrect.\n\n" +
                        "The \"heel\" command was a one-way street, just like the previous version of the plug-in, setting it to maximum health,\n"+
                        "but now it can be set or added using \"/ heel <set | add>\" To decide. \"set\" can be specified in the range of 0.0 to 20.0.");

            } else if (args[1].equalsIgnoreCase("3")){

                sender.sendMessage("----------   0.0.1-BETA ChangeLog   PAGE   3 / 3 ----------"+
                        "When adding, you can specify a number in addition to the original health. It is an experimental command because it is not clear what this number needs to be.\n"+
                        "However, if you use \"add\" to get a value greater than 20.0, the value is expected to be 20.0.\n"
                        +"This is because even large numbers can depend on the player's default maximum health.\n\n"+
                        "No other changes. This is an enhanced version of the previous functionality.");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 3 )\n"+RESET+
                        "------------------------------");

            }



        }
        else if (args[0].equalsIgnoreCase("0.0.2-ALPHA")){

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.2-ALPHA ChangeLog   PAGE   1 / 2 ----------"+
                        "This update addresses an issue where Heel & Fly was not available in previous beta versions.\n\n" +
                        "The important change is that in this update, the heel has been changed to a dedicated command that allows you to quickly recover\n"+
                        "with \"/ heel me\". The health setting command is now \"/ health\".\n\n" +
                        "In addition, the operation of the \"/ fly\" command has been changed to enable / disable only.");

            } else if (args[1].equalsIgnoreCase("2")){

                sender.sendMessage("----------   0.0.2-ALPHA ChangeLog   PAGE   2 / 2 ----------"+
                        "Speed \u200B\u200Bchanges at \"/ fly\" have been moved to \"/ fly_speed\".\n" +
                        "Also, \"/ walk_speed\" has been added as the same speed change, so you can change the walking speed.\n" +
                        "<Command>\n/ Flight <true | false> <speed>\n→ / fly <true | false>\nNewcomer\n→ / fly_speed <~ 1.0>\nNewcomer\n" +
                        "→ / walk_speed <~ 1.0>\nNewcomer\n→ Health <Set | Add> <Number>\n/ Heel <set | add> <number>\n→ / heel me ");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 2 )\n"+RESET+
                        "------------------------------");

            }

        }
        else if (args[0].equalsIgnoreCase("0.0.2-BETA")){

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.2-BETA ChangeLog   PAGE   1 / 1 ----------"+
                        "This plugin adds \"reset\" to \"/ walk_speed\", along with the stability improvements of the previous alpha plugin.\n" +
                        "In addition, the problem that does not work unless it is \"/ heel me\" has been resolved, and it now works with \"/ heel\".\n"+
                        "We have also officially implemented a secretly updated loading message.\n\n" +
                        "<Commands>\n/ walk_speed <~ 1.0>\n→ / walk_speed <~ 1.0 | reset>\n/ heel me\n→ / heel");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 1 )\n"+RESET+
                        "------------------------------");

            }



        }
        else if (args[0].equalsIgnoreCase("0.0.3-SNAPSHOT")) {

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.3-SNAPSHOT ChangeLog   PAGE   1 / 3 ----------"+
                        "This is just a snapshot of the next implementation.\n" +
                        "This feature is a test version and may not be implemented as is. Also, the snapshot version does not guarantee compatibility with other TPAMS plugins.\n" +
                        "This version implements \"config.yml\". It has existed from previous versions, but you can actually change the settings from this version. In this version,\n"+
                        "you can set a message when a member enters the server. Also, you can set and send a message during \"advancement\". If you know about this \"advancement\","+
                        "please let me know.");

            } else if (args[1].equalsIgnoreCase("2")){

                sender.sendMessage("----------   0.0.3-SNAPSHOT ChangeLog   PAGE   2 / 3 ----------"+
                        "Also, \"advancement\" does not have a function to send a message to the whole.\n" +
                        "The \"Join\" and \"advancement\" messages are set to \"false\" by default.\n" +
                        "If you change it to \"true\" in the text editor, the process will be executed. You can also make advanced settings for the message.");

            } else if (args[1].equalsIgnoreCase("3")){

                sender.sendMessage("----------   0.0.3-SNAPSHOT ChangeLog   PAGE   3 / 3 ----------"+
                        "Replacement using detailed \"replace\" is now possible, so messages can be rewritten according to variables using \"/ player /\", [/ server /], etc.\n" +
                        "In addition, you can now change using the game mode numbers used in previous versions of Minecraft. If you use this, use \"/ oldGM <number>\".\n" +
                        "Also implemented a secret command error statement. This is to make it easier to understand the errors caused by not changing the command statement each time.\n" +
                        "\n<commands>\nnew\n→/oldGM <number>");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 3 )\n"+RESET+
                        "------------------------------");

            }



        }
        else if (args[0].equalsIgnoreCase("0.0.3-ALPHA")) {

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.0.3-ALPHA ChangeLog   PAGE   1 / 3 ----------\n"+
                        "This TPAMS does not inherit the functionality of previous snapshots.\n" +
                        "Also, config.yml is generated, but it doesn't affect the configuration at all. Also, from this time,\n"+
                        "we decided to temporarily separate the English and Japanese versions.\n" +
                        "You can now also determine who has operator authority, and all commands can only be run by the operator.");

            } else if (args[1].equalsIgnoreCase("2")){

                sender.sendMessage("----------   0.0.3-ALPHA ChangeLog   PAGE   2 / 3 ----------\n"+
                        "This update allows TPAMS to execute more commands. Previously, you couldn't set \"food level\" just by setting your physical strength, but now you can.\n"+
                        "You can also set the physical fitness scale.\nThe food version of immediate recovery \"satiety\" has been implemented,\n"+
                        "and you can now use the \"recovery\" command to recover both at the same time.\n" +
                        "Also, an important command change is that you must always specify a name after selecting a command." );

            } else if (args[1].equalsIgnoreCase("3")){

                sender.sendMessage("----------   0.0.3-ALPHA ChangeLog   PAGE   3 / 3 ----------\n"+
                        "Also, the game mode command does not conflict with the original game mode command, so it has been changed to \"oldgamemode\" again.\n" +
                        "\n<commands>\n/fly (<player_name>) <true|false(|getboolean)>\n/fly_speed (<player_name>) <reset|0.1~1.0(|getspeed)>\n" +
                        "/walk_speed (<player_name>) <reset|0.1~1.0(|getspeed)>\n/health (<player_name>) <set|add(|gethealth)> <number value>\n" +
                        "/healthscale (<player_name>) <set|add(|gethealthscale)>\n/food (<player_name>) <set|add(|gethealth)> <number value>\n" +
                        "/heel (<player_name>)\n/satiety (<player_name>)\n/oldgamemode <0(SURVIVAL)|1(CREATIVE)|2(ADVENTURE)|3(SPECTATOR)>");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 3 )\n"+RESET+
                        "------------------------------");

            }


        }
        else if (args[0].equalsIgnoreCase("0.1.5-ALPHA")) {

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("----------   0.1.5-ALPHA ChangeLog   PAGE   1 / 4 ----------\n"+
                        BOLD+"TPAMS is Returned!\n" + RESET+"・Supported version 1.18.1.\n・Commands Updated.\n・New commands came.\n・Some commands deleted or renamed\n" +
                        "\nMany Commands are Updated And Came!\n\nThe following is a list of commands.\n\n\n<Classic Gamemode Command>\n\n"+
                        "/classic_gamemode < 0 | 1 | 2 | 3 | s | c | a | sp > < PlayerName >\n\nYou can set a gamemode using the old command arguments option.\n\n\n"+
                        "e.g.\n\n/classic_gamemode 0\n\n/classic_gamemode 1 EXAMPLE\n\n\n<Fake Message Command>\n\n/fakemsg < PlayerName > < MsgBody >\n\n" +
                        "You can send a fake message using the name of another user.\n\n\ne.g.\n\n/fakemsg EXAMPLE HELLO\n\nresult:\n\n<EXAMPLE...?> HELLO");

            } else if (args[1].equalsIgnoreCase("2")){

                sender.sendMessage("----------   0.1.5-ALPHA ChangeLog   PAGE   2 / 4 ----------\n"+
                        "<Fake Name Command>\n\n/fakename < PlayerName > < fakename >\n\nYou can set a fake name using the name of another user.\n\n\ne.g.\n\n" +
                        "/fakename EXAMPLE EXAMPLE2\n\nresult:\n\nEXAMPLE...?\n\n\n<Fly Command>\n\n/fly < PlayerName > < true | false | toggle | getboolean >\n" +
                        "\nYou can set/get the player flightable.\n\n\ne.g.\n\n/fly EXAMPLE true\n\n/fly EXAMPLE getboolean\n\nresult:\n\nEXAMPLE's flightable: true\n\n\n" +
                        "<Fly Speed Command>\n\n/fly_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n\n" +
                        "You can set/get the player flight speed.\n\n\ne.g.\n\n/fly_speed EXAMPLE set 1\n\n/fly_speed EXAMPLE min\n\n/fly_speed EXAMPLE getspeed");

            } else if (args[1].equalsIgnoreCase("3")){

                sender.sendMessage("----------   0.1.5-ALPHA ChangeLog   PAGE   3 / 4 ----------\n"+
                        "result:\n\nEXAMPLE's flight speed is 0.1\n\n\n<Walk Speed Command>\n\n/walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n\n"+
                        "You can set/get the player walk speed.\n\n\ne.g.\n\n\n/walk_speed EXAMPLE max\n\n/walk_speed EXAMPLE getspeed\n\nresult:\n\n" +
                        "EXAMPLE's walk speed is 0.2\n\n\n<Health Command>\n\n/health < PlayerName > < set | kill | min | max | add | sub | gethealth > < 0 or more >\n\n" +
                        "You can set|get the player health.\n\n\ne.g.\n\n/health EXAMPLE set 20\n\n/health EXAMPLE kill\n\n/health EXAMPLE gethealth\n\n" +
                        "result:\n\nEXAMPLE's health is 20.0\n\n\n<Nickname Command>\n\n/nickname < PlayerName > < nickname >\n\nYou can set the player nickname.");

            } else if (args[1].equalsIgnoreCase("4")){

                sender.sendMessage("----------   0.1.5-ALPHA ChangeLog   PAGE   4 / 4 ----------"+
                        "e.g.\n\n/nickname EXAMPLE NICKNAME\n\nresult:\n\nNICKNAME(EXAMPLE)\n\n\n<Quick Full Food Command>\n\n/quick_fullfood < PlayerName >\n\n" +
                        "You can quick recover food point.\n\n\ne.g.\n\n/quick_fullfood\n\n/quick_fullfood EXAMPLE\n\n\n<Quick Full Health Command>\n\n" +
                        "/quick_fullhealth < PlayerName >\n\nYou can quick recover health point.\n\n\ne.g.\n\n/quick_fullhealth\n\n/quick_fullhealth EXAMPLE\n\n\n" +
                        "<Quick Recovery Command>\n\n/quick_recovery < PlayerName >\n\nYou can quick recover health and food point.\n\n\ne.g.\n" +
                        "\n/quick_recovery\n\n/quick_recovery EXAMPLE");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED + "Error: Page not found. ( 1 ~ 4 )\n"+ RESET+
                        "------------------------------");

            }



        }
        else if (args[0].equalsIgnoreCase("0.1.5-BETA")){

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("\"----------   0.1.5-BETA ChangeLog   PAGE   1 / 1 ----------\n"+
                        BOLD+"Beta Update!\n\n"+RESET+"・Add /fakename_reset command.\n・Add /nickname_reset command.");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 1 )\n"+RESET+
                        "------------------------------");

            }

        }
        else if (args[0].equalsIgnoreCase("0.1.5-RELEASE")){

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("\"----------   0.1.5-RELEASE ChangeLog   PAGE   1 / 1 ----------\n"+
                        BOLD+"A FIRST TPAMS RELEASE IS HERE!\n\n"+RESET+
                        "・FIRST TPAMS RELEASE IS RELEASED!\n・Added TabComplete!!!\n・Added /tpams_changelog Command\n→/tpams_changelog < Version > < Page >\n\n" +
                        "→You can see the TPAMS changelogs.\n\n・Added /tpams_help Command\n→/tpams_help < TPAMS Commands >\n\n→You can see the TPAMS command help.");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 1 )\n"+RESET+
                        "------------------------------");

            }

        }
        else if (args[0].equalsIgnoreCase("0.1.6-ALPHA")){

            if (args[1].equalsIgnoreCase("1")){

                sender.sendMessage("\"----------   0.1.6-ALPHA ChangeLog   PAGE   1 / 1 ----------\n"+
                        "・Added /tpams_playerdata_debug < PlayerName > < Commands >\n・Added /tpams_serverdata_debug < Commands >");

            } else {

                sender.sendMessage("------------------------------\n"+
                        RED+"Error: Page not found. ( 1 ~ 1 )\n"+RESET+
                        "------------------------------");

            }

        }
        else {

            sender.sendMessage("------------------------------\n"+
                    RED+"Error: Enter the version number of TPAMS that have been released so far without spaces.\n"+
                    "e.g.\n\"0.0.1-ALPHA, 0.0.3-SNAPSHOT, 0.1.5-BETA\""+RESET+
                    "------------------------------");

        }

        return true;
    }



    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {

        if (command.getName().equalsIgnoreCase("tpams_changelog")){

            if (args.length == 1) {

                if (args[0].length() == 0) {
                    return Arrays.asList("0.0.1-ALPHA","0.0.1-BETA","0.0.2-ALPHA","0.0.2-BETA","0.0.3-SNAPSHOT","0.0.3-ALPHA",
                            "0.1.5-ALPHA","0.1.5-BETA","0.1.5-RELEASE","0.1.6-ALPHA");
                } else {

                    if ("0.".startsWith(args[0])) {
                        return Arrays.asList("0.0.1-ALPHA","0.0.1-BETA","0.0.2-ALPHA","0.0.2-BETA","0.0.3-SNAPSHOT","0.0.3-ALPHA","0.1.5-ALPHA","0.1.5-BETA","0.1.5-RELEASE","0.1.6-ALPHA");
                    } else if ("0.0.".startsWith(args[0])) {
                        return Arrays.asList("0.0.1-ALPHA","0.0.1-BETA","0.0.2-ALPHA","0.0.2-BETA","0.0.3-SNAPSHOT","0.0.3-ALPHA");
                    } else if ("0.1.".startsWith(args[0])) {
                        return Arrays.asList("0.1.5-ALPHA","0.1.5-BETA","0.1.5-RELEASE","0.1.6-ALPHA");
                    } else if ("0.0.1-".startsWith(args[0])) {
                        return Arrays.asList("0.0.1-ALPHA","0.0.1-BETA");
                    } else if ("0.0.1-ALPHA".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.1-ALPHA"));
                    } else if ("0.0.1-BETA".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.1-BETA"));
                    } else if ("0.0.2-".startsWith(args[0])) {
                        return Arrays.asList("0.0.2-ALPHA","0.0.2-BETA");
                    } else if ("0.0.2-ALPHA".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.2-ALPHA"));
                    } else if ("0.0.2-BETA".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.2-BETA"));
                    } else if ("0.0.3-".startsWith(args[0])) {
                        return Arrays.asList("0.0.3-SNAPSHOT","0.0.3-ALPHA");
                    } else if ("0.0.3-SNAPSHOT".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.3-SNAPSHOT"));
                    } else if ("0.0.3-ALPHA".startsWith(args[0])) {
                        return Collections.singletonList(("0.0.3-ALPHA"));
                    } else if ("0.1.5-".startsWith(args[0])) {
                        return Arrays.asList("0.1.5-ALPHA","0.1.5-BETA","0.1.5-RELEASE");
                    } else if ("0.1.5-ALPHA".startsWith(args[0])) {
                        return Collections.singletonList(("0.1.5-ALPHA"));
                    } else if ("0.1.5-BETA".startsWith(args[0])) {
                        return Collections.singletonList(("0.1.5-BETA"));
                    } else if ("0.1.5-RELEASE".startsWith(args[0])) {
                        return Collections.singletonList(("0.1.5-RELEASE"));
                    } else if ("0.1.6-".startsWith(args[0])) {
                        return Arrays.asList("0.1.6-ALPHA");
                    } else if ("0.1.6-ALPHA".startsWith(args[0])) {
                        return Collections.singletonList(("0.1.6-ALPHA"));
                    }

                }

            } else if (args.length == 2) {

                if (args[1].length() == 0) {

                    if (args[0].equalsIgnoreCase("0.0.1-ALPHA")) {
                        return Arrays.asList("1");
                    } else if (args[0].equalsIgnoreCase("0.0.1-BETA")) {
                        return Arrays.asList("1","2","3");
                    } else if (args[0].equalsIgnoreCase("0.0.2-ALPHA")) {
                        return Arrays.asList("1","2");
                    } else if (args[0].equalsIgnoreCase("0.0.2-BETA")) {
                        return Arrays.asList("1");
                    } else if (args[0].equalsIgnoreCase("0.0.3-SNAPSHOT")) {
                        return Arrays.asList("1","2","3");
                    } else if (args[0].equalsIgnoreCase("0.0.3-ALPHA")) {
                        return Arrays.asList("1","2","3");
                    } else if (args[0].equalsIgnoreCase("0.1.5-ALPHA")) {
                        return Arrays.asList("1","2","3","4");
                    } else if (args[0].equalsIgnoreCase("0.1.5-BETA")) {
                        return Arrays.asList("1");
                    } else if (args[0].equalsIgnoreCase("0.1.5-RELEASE")) {
                        return Arrays.asList("1");
                    } else if (args[0].equalsIgnoreCase("0.1.6-ALPHA")) {
                        return Arrays.asList("1");
                    }

                }

            }

        }

        return null;
    }
}
