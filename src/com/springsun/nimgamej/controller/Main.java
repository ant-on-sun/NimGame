package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.view.IView;
import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.view.consoleview.ConsoleView;

public class Main {

    public static void main(String[] args) {

        IView v = new ConsoleView();
        v.showRules();
        v.getInitialConditions();
        ListOfHeaps listOfHeaps = v.createHeaps();
        ListOfPlayers listOfPlayers = v.createPlayers();
        
    }
}
