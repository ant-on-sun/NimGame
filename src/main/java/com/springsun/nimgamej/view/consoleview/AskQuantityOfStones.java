package com.springsun.nimgamej.view.consoleview;

import com.springsun.nimgamej.model.ListOfHeaps;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.ReadInteger.readInt;

public class AskQuantityOfStones {
    private static Logger log = Logger.getLogger(AskQuantityOfStones.class.getName());

    public static int askQuantityOfStones(ListOfHeaps h, int i) {
        int result;
        int[] heaps = h.getListOfHeaps();
        int quantityOfStones = heaps[i];
        do {
            System.out.println("Please enter the quantity of Stones you want to withdraw from the chosen HEAP: ");
            result = readInt();
            if (result < 1 || result > quantityOfStones) {
                System.out.println("The number must be from 1 to " + quantityOfStones);
                log.info("The user entered " + result + " quantity of Stones, " +
                        "that is not in the proper range from 1 to " + quantityOfStones);
            }
        } while (result < 1 || result > quantityOfStones);
        log.fine("Method askQuantityOfStones");
        return result;
    }

}
