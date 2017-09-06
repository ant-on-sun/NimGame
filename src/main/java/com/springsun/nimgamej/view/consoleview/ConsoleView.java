package com.springsun.nimgamej.view.consoleview;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.view.IView;

import java.util.logging.Logger;

import static com.springsun.nimgamej.view.consoleview.AskNumberOfComputers.askNumberOfComputers;
import static com.springsun.nimgamej.view.consoleview.AskNumberOfHeaps.askNumberOfHeaps;
import static com.springsun.nimgamej.view.consoleview.AskNumberOfHumans.askNumberOfHumans;
import static com.springsun.nimgamej.view.consoleview.AskNumberOfMadComputers.askNumberOfMadComputers;
import static com.springsun.nimgamej.view.consoleview.AskNumberOfStones.askNumberOfStones;
import static com.springsun.nimgamej.view.consoleview.AskNumberOfTheHeap.askNumberOfTheHeap;
import static com.springsun.nimgamej.view.consoleview.AskQuantityOfStones.askQuantityOfStones;

public class ConsoleView implements IView {
    private int numberOfHumans;
    private int numberOfComputers;
    private int numberOfMadComputers;
    private int numberOfHeaps;
    private int numberOfStones;

    private static Logger log = Logger.getLogger(ConsoleView.class.getName());

    @Override
    public void showRules(){
        System.out.println("RULES:");
        System.out.println("The HEAPS contain some amount of Stones");
        System.out.println("(for example 'HEAP 3  [12]' means that third HEAP contains 12 Stones)");
        System.out.println("The competitors should take a number of Stones from a HEAP (only from one of the HEAPS)");
        System.out.println("At least 1 Stone must be taken from nonempty HEAP");
        System.out.println("It is impossible to take more Stones from a HEAP that it contains");
        System.out.println("The one who will take last Stones from last HEAP " +
                "(thus all the HEAPS become empty) will WIN!");
        System.out.println("So let's begin the NimGame!\n");
        log.fine("Show rules");
    }

    @Override
    public void getInitialConditions(){
        do {
            askNumberOfHumans(this);
            askNumberOfComputers(this);
            askNumberOfMadComputers(this);
            if (numberOfHumans + numberOfComputers + numberOfMadComputers == 0) {
                System.out.println("There must be at least 1 player!");
                log.info("The user entered 0 (zero) quantity of players any kind");
            }
        } while (numberOfHumans + numberOfComputers + numberOfMadComputers == 0);
        askNumberOfHeaps(this);
        askNumberOfStones(this);
        log.fine("Get initial conditions");
    }

    @Override
    public ListOfHeaps createHeaps(){
        ListOfHeaps listOfHeaps = new ListOfHeaps.Builder()
                .numberOfHeaps(numberOfHeaps)
                .numberOfStones(numberOfStones)
                .createListOfHeaps();
        log.fine("Create heaps");
        return listOfHeaps;
    }

    @Override
    public ListOfPlayers createPlayers() {
        ListOfPlayers listOfPlayers = new ListOfPlayers.Builder()
                .numberOfHumans(numberOfHumans)
                .numberOfComputers(numberOfComputers)
                .numberOfMadComputers(numberOfMadComputers)
                .createListOfPlayers();
        log.fine("Create players");
        return listOfPlayers;
    }

    @Override
    public void moveHuman(ListOfHeaps h) {
        int heap = askNumberOfTheHeap(h);
        int stones = askQuantityOfStones(h, heap);
        h.setListOfHeaps(heap, h.getListOfHeaps()[heap] - stones);
        log.fine("Human's move");
    }

    @Override
    public void showCurrentStateOfHeaps(ListOfHeaps h) {
        int[] heaps = h.getListOfHeaps();
        for (int i = 0; i < heaps.length; i++) {
            System.out.println("HEAP " + (i + 1) + "  [ " + heaps[i] + " ]");
        }
        log.fine("Show current state of heaps");

    }

    @Override
    public void showMessage(String player) {
        System.out.println(player + "'s move:");
        log.fine("Show message who must move now");
    }

    @Override
    public void winnerAnnouncement(String winner){
        System.out.println("Player " + winner + " has won!");
        log.fine("Winner announcement");
    }

    void setNumberOfHumans(int numberOfHumans) {
        this.numberOfHumans = numberOfHumans;
    }

    void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }

    void setNumberOfMadComputers(int numberOfMadComputers) {
        this.numberOfMadComputers = numberOfMadComputers;
    }

    void setNumberOfHeaps(int numberOfHeaps) {
        this.numberOfHeaps = numberOfHeaps;
    }

    void setNumberOfStones(int numberOfStones) {
        this.numberOfStones = numberOfStones;
    }
}
