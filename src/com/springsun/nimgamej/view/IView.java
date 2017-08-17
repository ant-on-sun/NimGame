package com.springsun.nimgamej.view;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;

public interface IView {
    void showRules();
    void getInitialConditions();
    ListOfHeaps createHeaps();
    ListOfPlayers createPlayers();
}
