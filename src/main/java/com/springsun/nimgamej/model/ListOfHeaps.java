package com.springsun.nimgamej.model;

import java.util.logging.Logger;

public class ListOfHeaps {
    private static Logger log = Logger.getLogger(ListOfHeaps.class.getName());
    private int[] listOfHeaps;

    public ListOfHeaps(final int numberOfHeaps, final int numberOfStones) {
        int[] listOfHeaps = new int[numberOfHeaps];
        for (int i = 0; i < numberOfHeaps; i++) {
            listOfHeaps[i] = numberOfStones;
        }
        this.listOfHeaps = listOfHeaps;
        log.fine("Filling list of heaps");
    }

    public static class Builder {
        private int numberOfHeaps;
        private int numberOfStones;

        public Builder numberOfHeaps(int numberOfHeaps) {
            this.numberOfHeaps = numberOfHeaps;
            return this;
        }

        public Builder numberOfStones(int numberOfStones) {
            this.numberOfStones = numberOfStones;
            return this;
        }

        public ListOfHeaps createListOfHeaps() {
            return new ListOfHeaps(numberOfHeaps, numberOfStones);
        }
    }

    public int[] getListOfHeaps() {
        return listOfHeaps;
    }

    public void setListOfHeaps(int numberOfHeap, int numberOfStones) {
        listOfHeaps[numberOfHeap] = numberOfStones;
    }
}
