package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfHumans {

    public static void askNumberOfHumans(ConsoleView v) {
        System.out.println("Please enter number of human players: ");
        int numberOfHumans = readInt();
        v.setNumberOfHumans(numberOfHumans);
    }

}
