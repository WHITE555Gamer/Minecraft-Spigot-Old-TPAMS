package msspl.tpams.assets.msg;

import org.bukkit.entity.Player;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.*;

public class fly_speed_msg {

    public static String RESET_BASE = im_line_n + GREEN + "Command succeeded: The flight speed has been reset." + RESET + "\n" + im_line;
    public static String MAX_BASE = im_line_n + GREEN + "Command succeeded: The flight speed has been set Maximum." + RESET + "\n" + im_line;
    public static String MIN_BASE = im_line_n + GREEN + "Command succeeded: The flight speed has been set Minimum." + RESET + "\n" + im_line;

    public static String SAS_Base(float Num){
        return im_line_n + "Command succeeded: The flight speed has been set to " + Num + "." + RESET + "\n" + im_line;
    }

    public static String Getspeed_Base(Player pl){

        return  im_line_n + GREEN + "Command succeeded: The " + pl.getName() + "\'s flight speed is " + pl.getFlySpeed() + RESET + "\n" + im_line;

    }
}
