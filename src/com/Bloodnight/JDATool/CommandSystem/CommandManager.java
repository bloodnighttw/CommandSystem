package com.Bloodnight.JDATool.CommandSystem;

import net.dv8tion.jda.api.JDA;

public class CommandManager {

    private static JDA jda;

    public CommandManager(JDA jda){
        CommandManager.jda =jda;
        addCommand(new helpCommand());
    }

    public void addCommand(Command command){
        jda.addEventListener(command);
    }

}
