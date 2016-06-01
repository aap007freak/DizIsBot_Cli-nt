package com.antonleagre.dizisbotclient.bot;

/**
 * Created by Anton Leagre on 4/05/2016.
 * You can contact me on: anton.leagre@hotmail.com
 * All rights reserved
 */

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.PircBot;

import java.io.IOException;

/**
 * This class will be the main bot with its rought edges,
 * using the Pircbot library
 */
public class Bot extends PircBot{
    /**
     * This constructor will set the name of the bot
     * @param username the username of the bot, is going to be the username of its account
     */
    public Bot(String username){
        this.setName(username);
    }
    public void connToWwitch(String channelname, String oauthkey, boolean verbose) throws IOException, IrcException {
        this.setVerbose(verbose);
        this.connect("irc.twitch.tv", 6667, oauthkey);
        this.joinChannel(channelname);


    }
    @Override
    protected void onMessage(String channel, String sender, String login, String hostname, String message) {

        switch (message) {
            case "!time":
                String time = new java.util.Date().toString();
                sendMessage(channel, sender + ": The time is now " + time);


        }
    }

}
