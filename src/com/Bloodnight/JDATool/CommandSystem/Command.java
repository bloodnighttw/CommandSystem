package com.Bloodnight.JDATool.CommandSystem;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public abstract class Command extends ListenerAdapter {

    @Override
    public final void onGuildMessageReceived(GuildMessageReceivedEvent e){

        if(e.getMessage().getContentRaw().indexOf(this.getCommandName()) == 0 || !e.getMessage().getAuthor().isBot()) {
            this.onCommand(e,e.getMessage().getContentRaw().split(" "));
        }

    }

    public abstract String getCommandName();

    public abstract String getDescription();

    public abstract void onCommand(GuildMessageReceivedEvent e,String[] args);

}
