package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;

public class ComputerMove {

    public static void moveComputer(ListOfHeaps h) {
        int[] heaps = h.getListOfHeaps();
        int nimSum = 0;
        for (int i : heaps) {
            nimSum ^= heaps[i];
        }
        if (nimSum != 0){
            for (int i : heaps) {
                int j = nimSum^heaps[i];
                if (j < heaps[i]) {
                    h.setListOfHeaps(i,j);
                    break;
                }
            }
        } else {
            MadComputerMove.moveMadComputer(h);
        }
    }

}
