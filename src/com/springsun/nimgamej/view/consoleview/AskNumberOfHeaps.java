package com.springsun.nimgamej.view.consoleview;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfHeaps {

    public static void askNumberOfHeaps(ConsoleView v) {
        int numberOfHeaps;
        do {
            System.out.println("Please enter number of HEAPS: ");
            numberOfHeaps = readInt();
            if (numberOfHeaps < 2) {
                System.out.println("There must be at least 2 HEAPS");
            }
        } while (numberOfHeaps < 2);
        v.setNumberOfHeaps(numberOfHeaps);
    }

}
