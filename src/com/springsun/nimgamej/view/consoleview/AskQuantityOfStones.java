package com.springsun.nimgamej.view.consoleview;

import com.springsun.nimgamej.model.ListOfHeaps;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskQuantityOfStones {

    public static int askQuantityOfStones(ListOfHeaps h, int i) {
        int result;
        int[] heaps = h.getListOfHeaps();
        int quantityOfStones = heaps[i];
        do {
            System.out.println("Please enter the quantity of Stones you want to withdraw from the chosen HEAP: ");
            result = readInt();
            if (result < 1 || result > quantityOfStones) {
                System.out.println("The number must be from 1 to " + quantityOfStones);
            }
        } while (result < 1 || result > quantityOfStones);
        return result;
    }

}
