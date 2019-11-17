package com.Bloodnight.JDATool.CommandSystem;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class helpCommand extends Command {


    @Override
    public String getCommandName() {
        return "=help";
    }

    @Override
    public String getDescription() {
        return "Just A Test ";
    }

    @Override
    public void onCommand(GuildMessageReceivedEvent e, String[] args) {

    }
}
