package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfHeaps {

    public static void askNumberOfHeaps(ConsoleView v) {
        System.out.println("Please enter number of HEAPS: ");
        int numberOfHeaps = readInt();
        v.setNumberOfHeaps(numberOfHeaps);
    }

}
