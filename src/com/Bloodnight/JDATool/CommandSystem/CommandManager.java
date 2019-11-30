package com.Bloodnight.JDATool.CommandSystem;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

public class CommandManager  extends ListenerAdapter {

    private static JDA jda;
    private HashMap hMap =new HashMap<String ,Command>();


    public CommandManager(JDA jda){
        CommandManager.jda =jda;
        jda.addEventListener(this);
        addCommand(new helpCommand());
    }

    public void addCommand(Command command){
        //jda.addEventListener(command);
        hMap.put(command.getCommandName(),command);

    }

    public final void onGuildMessageReceived(GuildMessageReceivedEvent e){

        String[] args=e.getMessage().getContentRaw().split(" ");
        Command cm= (Command) hMap.get(args[0]);
        //System.out.println("bangbangbang");


        try {
            cm.onCommand(e,args);
        }
        catch (NullPointerException event){
            return;
        }




    }





}
