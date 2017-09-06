package com.springsun.nimgamej.view.consoleview;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfHeaps {
    private static final int minimumNumberOfHeaps = 2;
    private static final int maximumNumberOfHeaps = 7;
    private static Logger log = Logger.getLogger(AskNumberOfHeaps.class.getName());

    public static void askNumberOfHeaps(ConsoleView v) {
        int numberOfHeaps;
        do {
            System.out.println("Please enter number of HEAPS: ");
            numberOfHeaps = readInt();
            if (numberOfHeaps < minimumNumberOfHeaps) {
                System.out.println("There must be at least " + minimumNumberOfHeaps + " HEAPS");
                log.info("The user entered " + numberOfHeaps + " number of HEAPS, that is less " +
                        "than the minimum: " + minimumNumberOfHeaps);
            }
            if (numberOfHeaps > maximumNumberOfHeaps) {
                System.out.println("There must be no more than " + maximumNumberOfHeaps + " HEAPS");
                log.info("The user entered " + numberOfHeaps + " number of HEAPS, that is more " +
                        "than the maximum: " + maximumNumberOfHeaps);
            }
        } while (numberOfHeaps < minimumNumberOfHeaps || numberOfHeaps > maximumNumberOfHeaps);
        v.setNumberOfHeaps(numberOfHeaps);
        log.fine("Method askNumberOfHeaps");
    }

}
