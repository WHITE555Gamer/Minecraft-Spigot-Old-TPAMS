package msspl.tpams.assets.msg;

import org.bukkit.entity.Player;

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class autosneaking_msg {

    public static String AutoSneaking_Enable = im_line_n + GREEN + "Command succeeded: The Auto-Sneaking has been enabled." + RESET + "\n" + im_line;
    public static String AutoSneaking_Disable = im_line_n + GREEN + "Command succeeded: The Auto-Sneaking has been disabled." + RESET + "\n" + im_line;

    public static String AutoSneaking_Toggle(Boolean b){
        if (b){
            return im_line_n + GREEN + "Command succeeded: The Auto-Sneaking has been toggled. Now: Enable." + RESET + "\n" + im_line;
        } else {
            return im_line_n + GREEN + "Command succeeded: The Auto-Sneaking has been toggled. Now: Disable." + RESET + "\n" + im_line;
        }
    }
    public static String AutoSneaking_Getboolean(Player pl){
        return im_line_n + GREEN + "Command succeeded: " + pl.getName() + "\'s Auto-Sneaking: " + pl.getAllowFlight() + "." + RESET + "\n" + im_line;
    }
}
