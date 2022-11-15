package msspl.tpams.assets.msg;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class fakename_reset_msg {

    public static String Default_Base = im_line_n + GREEN + "Command succeeded: Fake name reset." + RESET + "\n" + im_line;
    public static String Default_Base_se(String s){
        return im_line_n + GREEN + "Command succeeded: "+s+"\'s fake name reset." + RESET + "\n" + im_line;
    }
    public static String Default_Base_pl(String s){
        return im_line_n + GREEN + "Command succeeded: Fake name reset by " + s + "." + RESET + "\n" + im_line;
    }
}
