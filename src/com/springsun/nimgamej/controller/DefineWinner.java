package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.model.Players;

public class DefineWinner {

    static String defineWinner(ListOfPlayers players, int i) {
        Players winnerName = players.getPlayers().get(i);
        int j = players.getPlayers().indexOf(winnerName);
        j = i - j +1;
        return "" + winnerName + " - " + j;
    }

}
