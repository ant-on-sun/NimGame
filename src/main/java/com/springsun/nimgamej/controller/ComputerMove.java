package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;

import java.util.logging.Logger;

public class ComputerMove {
    private static Logger log = Logger.getLogger(ComputerMove.class.getName());

    public static void moveComputer(ListOfHeaps h) {
        int[] heaps = h.getListOfHeaps();
        int nimSum = 0;
        for (int i = 0; i < heaps.length; i++) {
            nimSum ^= heaps[i];
        }
        if (nimSum != 0){
            for (int i = 0; i < heaps.length; i++) {
                int j = nimSum^heaps[i];
                if (j < heaps[i]) {
                    h.setListOfHeaps(i,j);
                    break;
                }
            }
        } else {
            MadComputerMove.moveMadComputer(h);
            log.info("Computer's move. The computer did not find a suitable move and delegated its execution" +
                    " to Mad Computer");
        }
        log.fine("Computer's move");
    }

}
