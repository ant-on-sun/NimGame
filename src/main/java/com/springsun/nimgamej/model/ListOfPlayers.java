package com.springsun.nimgamej.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ListOfPlayers {
    private static Logger log = Logger.getLogger(ListOfPlayers.class.getName());

    private List<Players> players;

    public ListOfPlayers(int numberOfHumans, int numberOfComputers, int numberOfMadComputers){
        int length = numberOfHumans + numberOfComputers + numberOfMadComputers;
        List<Players> players = new ArrayList(length);

        if (numberOfHumans > 0) {
            for (int i = 0; i < numberOfHumans; i++){
                players.add(Players.HUMAN);
            }
        }
        if (numberOfComputers > 0) {
            for (int i = 0; i < numberOfComputers; i++) {
                players.add(Players.COMPUTER);
            }
        }
        if (numberOfMadComputers > 0) {
            for (int i = 0; i < numberOfMadComputers; i++) {
                players.add(Players.MAD_COMPUTER);
            }
        }

        this.players = players;
        log.fine("Filling list of players");
    }

    public static class Builder {
        private int numberOfHumans;
        private int numberOfComputers;
        private int numberOfMadComputers;

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
        public ListOfPlayers createListOfPlayers() {
            return new ListOfPlayers(numberOfHumans, numberOfComputers, numberOfMadComputers);
        }
    }



    public List<Players> getPlayers() {
        return players;
    }
}
