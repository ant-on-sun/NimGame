package com.springsun.nimgamej.view.consoleview;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfHumans {
    private static final int maximumNumberOfHumans = 10;
    private static Logger log = Logger.getLogger(AskNumberOfHumans.class.getName());

    public static void askNumberOfHumans(ConsoleView v) {
        int numberOfHumans;
        do {
            System.out.println("Please enter number of human players: ");
            numberOfHumans = readInt();
            if (numberOfHumans > maximumNumberOfHumans) {
                System.out.println("Guys, there are too many of you there. Let them play, say, no " +
                        "more than " + maximumNumberOfHumans + " humans");
                log.info("The user entered " + numberOfHumans + " number of humans, that is" +
                        " more than established maximum: " + maximumNumberOfHumans);
            }
        } while (numberOfHumans > maximumNumberOfHumans);
        v.setNumberOfHumans(numberOfHumans);
        log.fine("Method askNumberOfHumans");
    }

}
