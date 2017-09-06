package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.model.Players;
import com.springsun.nimgamej.view.IView;

import java.util.logging.Logger;

import static com.springsun.nimgamej.controller.ComputerMove.moveComputer;
import static com.springsun.nimgamej.controller.MadComputerMove.moveMadComputer;

class Move {
    private static Logger log = Logger.getLogger(Move.class.getName());

    static void makeMove(IView v, ListOfHeaps h, Players player, ListOfPlayers players, int i) {

        v.showMessage(DefinePlayer.definePlayer(players, i));
        switch (player) {
            case HUMAN:
                v.moveHuman(h);
                break;
            case COMPUTER:
                moveComputer(h);
                break;
            case MAD_COMPUTER:
                moveMadComputer(h);
                break;
            default:
                log.severe("No matches in method makeMove");
                break;
        }
        log.fine("Method makeMove");
    }

}
