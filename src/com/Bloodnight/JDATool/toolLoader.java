package com.Bloodnight.JDATool;

import com.Bloodnight.JDATool.CommandSystem.CommandManager;
import net.dv8tion.jda.api.JDA;

public class toolLoader {

    private static JDA jda;


    public toolLoader(JDA jda){
        toolLoader.jda =jda;
    }

    public static JDA getJDA(){
        return jda;
    }
    /*
    public static void addCommand(){

    }

     */

    public static void EnableCommandSystem(){
        new CommandManager(jda);
    }
}
