package com.pkmn;

import com.Frames.FramePrincipal;

public class Main {
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new FramePrincipal().setVisible(true);
        });
    }
}