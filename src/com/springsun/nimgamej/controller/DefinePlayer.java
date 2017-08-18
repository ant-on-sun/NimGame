package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.model.Players;

public class DefinePlayer {

    static String definePlayer(ListOfPlayers players, int i) {
        Players playerName = players.getPlayers().get(i);
        int j = players.getPlayers().indexOf(playerName);
        j = i - j +1;
        return "" + playerName + "-" + j;
    }

}
