package com.unamba.cinemagicoabancay.main;

import com.unamba.cinemagicoabancay.body.home;

public class main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    } 
}
