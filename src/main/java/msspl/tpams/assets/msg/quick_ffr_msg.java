package msspl.tpams.assets.msg;

import static msspl.tpams.assets.info.info.im_line;
import static msspl.tpams.assets.info.info.im_line_n;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.RESET;

public class quick_ffr_msg {

    public static String Food_Msg = im_line_n + GREEN + "Command succeeded: Recovered food point." + RESET + "\n" + im_line;
    public static String Health_Msg = im_line_n + GREEN + "Command succeeded: Recovered health point." + RESET + "\n" + im_line;
    public static String Recovery_Msg = im_line_n + GREEN + "Command succeeded: Recovered health and food point." + RESET + "\n" + im_line;
}
