package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfStones {

    public static void askNumberOfStones(ConsoleView v) {
        int numberOfStones;
        do {
            System.out.println("Please enter initial number of Stones in each HEAP: ");
            numberOfStones = readInt();
            if (numberOfStones < 1) {
                System.out.println("There must be at least 1 Stone in each HEAP at the start");
            }
        } while (numberOfStones < 1);
        v.setNumberOfStones(numberOfStones);
    }

}
