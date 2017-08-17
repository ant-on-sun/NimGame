package com.springsun.nimgamej.model;

public class ListOfHeaps {
    private int[] listOfHeaps;

    public ListOfHeaps(final int numberOfHeaps, final int numberOfStones) {
        int[] listOfHeaps = new int[numberOfHeaps];
        for (int i = 0; i < numberOfHeaps; i++) {
            listOfHeaps[i] = numberOfStones;
        }
        this.listOfHeaps = listOfHeaps;
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

    public void setListOfHeaps(final int numberOfHeap, final int numberOfStones) {
        listOfHeaps[numberOfHeap] = numberOfStones;
    }
}
