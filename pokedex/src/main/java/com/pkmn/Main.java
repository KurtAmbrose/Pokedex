package com.pkmn;
import java.sql.Connection;
import java.sql.DriverManager;

import com.Frames.FramePrincipal;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/pokedex";
    static final String usr = "root";
    static final String passwd = "";
    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(URL, usr, passwd);

            java.awt.EventQueue.invokeLater(() -> {
                new FramePrincipal(con).setVisible(true);
            });
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}