package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;

public class CreateModel {
    private int numberOfHumans;
    private int numberOfComputers;
    private int numberOfMadComputers;
    private int numberOfHeaps;
    private int numberOfStones;

    public CreateModel(int numberOfHumans, int numberOfComputers,
                       int numberOfMadComputers, int numberOfHeaps, int numberOfStones) {
        this.numberOfHumans = numberOfHumans;
        this.numberOfComputers = numberOfComputers;
        this.numberOfMadComputers = numberOfMadComputers;
        this.numberOfHeaps = numberOfHeaps;
        this.numberOfStones = numberOfStones;
    }

    ListOfHeaps listOfHeaps = new ListOfHeaps.Builder()
            .numberOfHeaps(numberOfHeaps)
            .numberOfStones(numberOfStones)
            .createListOfHeaps();

    ListOfPlayers listOfPlayers = new ListOfPlayers.Builder()
            .numberOfHumans(numberOfHumans)
            .numberOfComputers(numberOfComputers)
            .numberOfMadComputers(numberOfMadComputers)
            .createListOfPlayers();

    public static class Builder {
        private int numberOfHumans;
        private int numberOfComputers;
        private int numberOfMadComputers;
        private int numberOfHeaps;
        private int numberOfStones;

        public Builder numberOfHumans(final int numberOfHumans) {
            this.numberOfHumans = numberOfHumans;
            return this;
        }
        public Builder numberOfComputers(final int numberOfComputers) {
            this.numberOfComputers = numberOfComputers;
            return this;
        }
        public Builder numberOfMadComputers(final int numberOfMadComputers) {
            this.numberOfMadComputers = numberOfMadComputers;
            return this;
        }
        public Builder numberOfHeaps(final int numberOfHeaps) {
            this.numberOfHeaps = numberOfHeaps;
            return this;
        }
        public Builder numberOfStones(final int numberOfStones) {
            this.numberOfStones = numberOfStones;
            return this;
        }
        public CreateModel buildModel() {
            return new CreateModel(numberOfHumans, numberOfComputers, numberOfMadComputers, numberOfHeaps,numberOfStones);
        }

    }
}
