package msspl.tpams.assets.msg;

import org.bukkit.GameMode;

import static msspl.tpams.assets.info.info.*;
import static org.bukkit.ChatColor.*;
import static org.bukkit.GameMode.*;

public class classic_gamemode_msg {

    public static String SURVIVAL_Base = GREEN + "Command succeeded: Set own game mode to Survival mode." + RESET + "\n";
    public static String CREATIVE_Base = GREEN + "Command succeeded: Set own game mode to Creative mode." + RESET + "\n";
    public static String ADVENTURE_Base = GREEN + "Command succeeded: Set own game mode to Adventure mode." + RESET + "\n";
    public static String SPECTATOR_Base = GREEN + "Command succeeded: Set own game mode to Spectator mode." + RESET + "\n";

    public static String Feed_Msg(GameMode mode){
        if (mode == SURVIVAL){
            return im_line_n + SURVIVAL_Base + im_line;
        } else if (mode == CREATIVE){
            return im_line_n + CREATIVE_Base + im_line;
        } else if (mode == ADVENTURE){
            return im_line_n + ADVENTURE_Base + im_line;
        } else if (mode == SPECTATOR){
            return im_line_n + SPECTATOR_Base + im_line;
        } else {
            return RED + "Error: Function\'s error." + RESET;
        }
    }
}
