package com.Bloodnight.JDATool.CommandSystem;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

public abstract class Command{

    public static HashMap hMap=new HashMap<String,Command>();

    /*
    @Override
    public final void onGuildMessageReceived(GuildMessageReceivedEvent e){




        /*
        if(e.getMessage().getContentRaw().indexOf(this.getCommandName()) == 0 || !e.getMessage().getAuthor().isBot()) {
            this.onCommand(e,e.getMessage().getContentRaw().split(" "));


        }



    }

    */

    public abstract String getCommandName();

    public abstract String getDescription();

    public abstract void onCommand(GuildMessageReceivedEvent e,String[] args);

}
