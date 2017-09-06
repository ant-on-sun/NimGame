package com.springsun.nimgamej.view.consoleview;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfComputers {
    private static Logger log = Logger.getLogger(AskNumberOfComputers.class.getName());

    public static void askNumberOfComputers(ConsoleView v) {
        System.out.println("Please enter number of computer players: ");
        int numberOfComputers = readInt();
        v.setNumberOfComputers(numberOfComputers);
        log.fine("Method askNumberOfComputers");
    }

}
