package msspl.tpams.assets.msg;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class nickname_msg {

    public static String Feed_Msg(String s1,String s2){
        return im_line_n + GREEN + "Command succeeded: The "+ s1 +"\'s nickname changes to " + s2 + "(" + s1 + ")" + "." + RESET + "\n" + im_line;
    }
    public static String Special_Msg(String s1,String s2){
        return im_line_n + GREEN + "Command succeeded: The "+ s1 +"\'s nickname changes to " + s2 + "." + RESET + "\n" + im_line;
    }
}
