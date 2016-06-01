package com.antonleagre.dizisbotclient;

import com.antonleagre.dizisbotclient.bot.Bot;
import com.antonleagre.dizisbotclient.ui.LoginFrame;
import org.jibble.pircbot.IrcException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Anton Leagre on 4/05/2016.
 * You can contact me on: anton.leagre@hotmail.com
 * All rights reserved
 */
public class Main {

    public static void main(String[] args){
        Bot bot = new Bot("DIZISBOT");
        LoginFrame loginFrame = new LoginFrame();
        // bot.connToWwitch("#veetf2","oauth:9emzjm72qpf3gloey4sa6v5vu4uztm", true );

    }
}
