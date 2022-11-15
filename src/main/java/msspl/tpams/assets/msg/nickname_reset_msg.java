package msspl.tpams.assets.msg;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class nickname_reset_msg {

    public static String RESET_BASE = im_line_n + GREEN + "Command succeeded: Nickname reset." + RESET + "\n" + im_line;
    public static String Reset_Player_Base(String s){
        return im_line_n + GREEN + "Command succeeded: " + s + "\'s nickname reset."+ RESET + "\n" + im_line;
    }
}
