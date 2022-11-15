package msspl.tpams.assets.msg;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.*;

public class msg {

    public static String note_enough_arg_n = RED +"Note: Please enter a enough arguments." + RESET + "\n";
    public static String note_correct_value_n = RED +"Note: Please enter a value that between 0.1~1.0." + RESET + "\n";

    public static String non_enough_arg_n = RED +"Error: Please enter a enough arguments." + RESET + "\n";
    public static String non_correct_arg_n = RED +"Error: Please enter a correct arguments." + RESET + "\n";
    public static String non_exist_pl_n = RED +"Error: No such player exists." + RESET + "\n";
    public static String non_op_pl_n = RED +"Error: Operator permission is required." + RESET + "\n";

    public static String[] autosneaking_ud = {"/autosneaking < PlayerName > < true | false | toggle | getboolean >\n","You can set/get the player sneak.\n"};
    public static String[] classic_gm_ud = {"/classic_gamemode < 0 | 1 | 2 | 3 | s | c | a | sp > < PlayerName >\n","You can set game mode using old command arguments.\n"};
    public static String[] fakemsg_ud = {"/fakemsg < PlayerName > < MsgBody >\n","You can send fake message using name of another user.\n"};
    public static String[] fakename_ud = {"/fakename < PlayerName > < fakename >\n","You can set fake name using name of another user.\n"};
    public static String[] fakename_reset_ud = {"/fakename_reset < PlayerName >\n","You can reset fake name.\n"};
    public static String[] fly_ud = {"/fly < PlayerName > < true | false | toggle | getboolean >\n","You can set/get the player flightable.\n"};
    public static String[] fly_speed_ud = {"/fly_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n","You can set/get the player flight speed.\n"};
    public static String[] health_ud = {"/health < PlayerName > < set | kill | min | max | add | sub | gethealth > < 0 or more >\n","You can set|get the player health.\n"};
    public static String[] nickname_ud = {"/nickname < PlayerName > < nickname >\n","You can set|get the player health.\n"};
    public static String[] nickname_reset_ud = {"/nickname_reset < PlayerName >\n","You can reset the player nickname.\n"};
    public static String[] quick_fullfood_ud = {"/quick_fullfood < PlayerName >\n","You can reset the player nickname.\n"};
    public static String[] quick_fullhealth_ud = {"/quick_fullhealth < PlayerName >\n","You can quick recover health point.\n"};
    public static String[] quick_recovery_ud = {"/quick_recovery < PlayerName >\n","You can quick recover health and food point.\n"};
    public static String[] tpams_changelog_ud = {"/tpams_changelog < Version > < Page >\n","You can see the TPAMS changelogs.\n"};
    public static String[] tpams_help_ud = {"/tpams_help < TPAMS Commands >\n","You can see the TPAMS command help.\n"};
    public static String[] tpams_playerdata_debug_ud = {"/tpams_playerdata_debug < PlayerName > < Commands >\n","You can set/get player data.\n"};
    public static String[] tpams_serverdata_debug_ud = {"/tpams_serverdata_debug < Commands >\n","You can set/get server data.\n"};
    public static String[] tpams_runningtest_ud = {"/tpams_runningtest\n","You can get feedback when TPAMS is running.\n"};
    public static String[] walk_speed_ud = {"/walk_speed < PlayerName > < reset | set | min | max | add | sub | getspeed > < 0.1~1.0 >\n","You can set/get the player walk speed.\n"};

    public static String Msg_joins(String s, String[] args){

        return im_line_n + s + args[0] + args[1] + im_line;

    }
    public static String Msg_pads(String s){

        return im_line_n + s + im_line;

    }

}

