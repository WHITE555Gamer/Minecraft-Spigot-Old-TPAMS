package com.github.white555gamer.tpams.assets.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static com.github.white555gamer.tpams.assets.functions.commands.fakemsg_func.FakeMsg_IsConditionMatching;
import static com.github.white555gamer.tpams.assets.functions.commands.fakemsg_func.FakeMsg_Process;

public class fakemsg implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (FakeMsg_IsConditionMatching(sender, args)) {
            FakeMsg_Process(args);
            return true;
        }
        else {
            return true;
        }
    }

}
