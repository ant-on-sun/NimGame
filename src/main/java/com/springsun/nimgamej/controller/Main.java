package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.view.IView;
import com.springsun.nimgamej.view.consoleview.ConsoleView;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {

        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not set up logger configuration: " + e.toString());
        }

        try {
            IView v = new ConsoleView();
            v.showRules();
            v.getInitialConditions();
            ListOfHeaps listOfHeaps = v.createHeaps();
            ListOfPlayers listOfPlayers = v.createPlayers();
            int i = 0;
            v.showCurrentStateOfHeaps(listOfHeaps);
            do {
                Move.makeMove(v, listOfHeaps, listOfPlayers.getPlayers().get(i), listOfPlayers, i);
                v.showCurrentStateOfHeaps(listOfHeaps);
                i++;
                if (i == listOfPlayers.getPlayers().size()) {
                    i = 0;
                }
            } while (ViktoryCondition.nobodyHasWonYet(listOfHeaps.getListOfHeaps()));
            if (i == 0) {
                i = listOfPlayers.getPlayers().size() - 1;
            } else {
                i--;
            }
            v.winnerAnnouncement(DefinePlayer.definePlayer(listOfPlayers, i));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Exception caught in Main: ", e);
        }

    }
}
