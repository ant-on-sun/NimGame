package com.springsun.nimgamej.view.consoleview;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfStones {
    private static final int maxNumStones = 100;
    private static Logger log = Logger.getLogger(AskNumberOfStones.class.getName());

    public static void askNumberOfStones(ConsoleView v) {
        int numberOfStones;
        do {
            System.out.println("Please enter initial number of Stones in each HEAP: ");
            numberOfStones = readInt();
            if (numberOfStones < 1) {
                System.out.println("There must be at least 1 Stone in each HEAP at the start");
                log.info("The user entered " + numberOfStones + " number of " +
                        "stones, that is less than 1");
            }
            if (numberOfStones > maxNumStones) {
                System.out.println("Too many stones. The maximum is " + maxNumStones);
                log.info("The user entered " + numberOfStones + " number of stones, " +
                        "that is more than established maximum: " + maxNumStones);
            }
        } while (numberOfStones < 1 || numberOfStones > maxNumStones);
        v.setNumberOfStones(numberOfStones);
        log.fine("Method askNumberOfStones");
    }

}
