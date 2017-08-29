package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfComputers {

    public static void askNumberOfComputers(ConsoleView v) {
        System.out.println("Please enter number of computer players: ");
        int numberOfComputers = readInt();
        v.setNumberOfComputers(numberOfComputers);
    }

}
