package com.springsun.nimgamej.view.consoleview;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfMadComputers {
    private static final int maxNumMadComp = 10;
    private static Logger log = Logger.getLogger(AskNumberOfMadComputers.class.getName());

    public static void askNumberOfMadComputers(ConsoleView v) {
        int numberOfMadComputers;
        do {
            System.out.println("Please enter number of mad computer players: ");
            numberOfMadComputers = readInt();
            if (numberOfMadComputers > maxNumMadComp) {
                System.out.println("Too many MADNESS, my friend. We must limit this to a reasonable " +
                        "extent. Let's say, no more than " + maxNumMadComp + " Mad Computers in this room");
                log.info("The user entered " + numberOfMadComputers + " number of Mad Computers, " +
                        "that is more than established maximum: " + maxNumMadComp);
            }
        } while (numberOfMadComputers > maxNumMadComp);
        v.setNumberOfMadComputers(numberOfMadComputers);
        log.fine("Method askNumberOfMadComputers");
    }

}
