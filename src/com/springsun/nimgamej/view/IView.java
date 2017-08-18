package com.springsun.nimgamej.view;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.model.Players;

public interface IView {
    void showRules();
    void getInitialConditions();
    ListOfHeaps createHeaps();
    ListOfPlayers createPlayers();
    void showCurrentStateOfHeaps(ListOfHeaps h);
    void moveHuman(ListOfHeaps h);
    void showMessage(Players player);
    void winnerAnnouncement(String winner);
}
