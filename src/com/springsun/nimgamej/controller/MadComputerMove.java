package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;
import java.util.concurrent.ThreadLocalRandom;

public class MadComputerMove {

    public static void moveMadComputer(ListOfHeaps h) {
        int[] heaps = h.getListOfHeaps();
        int randomNumHeap;
        do {
            randomNumHeap = ThreadLocalRandom.current().nextInt(0, heaps.length);
        } while (heaps[randomNumHeap] == 0);
        int randomNumStones = ThreadLocalRandom.current().nextInt(1,heaps[randomNumHeap] + 1);
        h.setListOfHeaps(randomNumHeap,heaps[randomNumHeap] - randomNumStones);
    }

}
