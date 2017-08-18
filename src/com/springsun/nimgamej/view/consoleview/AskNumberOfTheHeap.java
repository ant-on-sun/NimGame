package com.springsun.nimgamej.view.consoleview;

import com.springsun.nimgamej.model.ListOfHeaps;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskNumberOfTheHeap {

    public static int askNumberOfTheHeap(ListOfHeaps h) {
        int result;
        int quantityOfHeaps = h.getListOfHeaps().length;
        do {
            System.out.println("Please enter the number of HEAP, from witch you want to withdraw Stones: ");
            result = readInt();
            if (result < 1 || result > quantityOfHeaps) {
                System.out.println("The number must be from 1 to " + quantityOfHeaps);
            } else {
                if (h.getListOfHeaps()[result - 1] == 0) {
                    System.out.println("The HEAP must be nonempty");
                }
            }
        } while (result < 1 || result > quantityOfHeaps || h.getListOfHeaps()[result - 1] == 0);
        return result - 1;
    }


}
