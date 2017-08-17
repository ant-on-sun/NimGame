package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfStones {

    public static void askNumberOfStones(ConsoleView v) {
        System.out.println("Please enter initial number of Stones in each HEAP: ");
        int numberOfStones = readInt();
        v.setNumberOfStones(numberOfStones);
    }

}
