package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfMadComputers {

    public static void askNumberOfMadComputers(ConsoleView v) {
        System.out.println("Please enter number of mad computer players: ");
        int numberOfMadComputers = readInt();
        v.setNumberOfMadComputers(numberOfMadComputers);
    }

}
