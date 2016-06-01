package com.antonleagre.dizisbotclient.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Anton Leagre on 6/05/2016.
 * You can contact me on: anton.leagre@hotmail.com
 * All rights reserved
 */
public class LoginFrame extends JFrame{
    private JMenuBar menubar;
    private JTextField twitchUserName;

    public LoginFrame(){
        super("LOGIN");
        setupUI();
    }

    private void setupUI() {

        twitchUserName = new JTextField();
        twitchUserName.setToolTipText("TWITCH USERNAME");
        JButton connect = new JButton();
        add(connect);
        add(twitchUserName);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setVisible(true);
    }
}
