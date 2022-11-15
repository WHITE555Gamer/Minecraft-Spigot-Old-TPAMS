package msspl.tpams.assets.msg;

import org.bukkit.entity.Player;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.*;

public class health_msg {

    public static String health_note_value = RED +"Note: Please enter a value that between 0 to player health scale" + RESET + "\n";

    public static String MIN_BASE = im_line_n + GREEN + "Command succeeded: The health has been set Minimum." + RESET + "\n" + im_line;
    public static String MAX_BASE = im_line_n + GREEN + "Command succeeded: The health has been set Maximum." + RESET + "\n" + im_line;



    public static String Set_Base(Double Num){
        return im_line_n + GREEN + "Command succeeded: The health has been set to " + Num + "." + RESET + "\n" + im_line;
    }
    public static String Kill_Base(String s){
        return im_line_n + GREEN + "Command succeeded: The health has been set to 0(Killed " + s + ")." + RESET + "\n" + im_line;
    }
    public static String Gethealth_Base(Player pl){
        return im_line_n + GREEN + "Command succeeded: The " + pl.getName() + "\'s health is " + pl.getHealth() + "." + RESET + "\n" + im_line;
    }
}
