package msspl.tpams.assets.msg;

import org.bukkit.entity.Player;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.*;

public class fly_msg {

    public static String Default_Enable = im_line_n + GREEN + "Command succeeded: The flight has been enabled." + RESET + "\n" + im_line;
    public static String Default_Disable = im_line_n + GREEN + "Command succeeded: The flight has been disabled." + RESET + "\n" + im_line;

    public static String Default_Toggle(Boolean b){
        if (b){
            return im_line_n + GREEN + "Command succeeded: The flight has been toggled. Now: Enable." + RESET + "\n" + im_line;
        } else {
            return im_line_n + GREEN + "Command succeeded: The flight has been toggled. Now: Disable." + RESET + "\n" + im_line;
        }
    }

    public static String Default_Getboolean(Player pl){
        return im_line_n + GREEN + "Command succeeded: " + pl.getName() + "\'s flightable: " + pl.getAllowFlight() + "." + RESET + "\n" + im_line;
    }
}
