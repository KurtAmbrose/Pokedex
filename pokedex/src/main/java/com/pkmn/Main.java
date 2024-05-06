package com.pkmn;
import java.sql.*;

import com.Frames.FramePrincipal;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/pokedex";
    static final String usr = "root";
    static final String passwd = "";
    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(URL, usr, passwd);
            Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet res = stmnt.executeQuery("SELECT p.id_pokemon, p.pokemon, p.tipo, p.peso, p.altura, p.foto, e.nombre as dueno from pokedex.pokemones p INNER JOIN pokedex.entrenadores e ON e.id_entrenador = p.id_entrenador;");

            java.awt.EventQueue.invokeLater(() -> {
                new FramePrincipal(res).setVisible(true);
            });
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}