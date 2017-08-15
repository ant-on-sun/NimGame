package com.springsun.nimgamej.controller;

public class CreateModel {
    private int numberOfHumans;
    private int numberOfComputers;
    private int numberOfMadComputers;
    private int numberOfStones;

    public CreateModel(int numberOfHumans, int numberOfComputers, int numberOfMadComputers, int numberOfStones) {
        this.numberOfHumans = numberOfHumans;
        this.numberOfComputers = numberOfComputers;
        this.numberOfMadComputers = numberOfMadComputers;
        this.numberOfStones = numberOfStones;
    }

    public CreateModel numberOfHumans(final int numberOfHumans) {
        this.numberOfHumans = numberOfHumans;
        return this;
    }
    public CreateModel numberOfComputers(final int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
        return this;
    }
    public CreateModel numberOfMadComputers(final int numberOfMadComputers) {
        this.numberOfMadComputers = numberOfMadComputers;
        return this;
    }
    public CreateModel numberOfStones(final int numberOfStones) {
        this.numberOfStones = numberOfStones;
        return this;
    }
    public CreateModel build(CreateModel model) {
        return new CreateModel(numberOfHumans, numberOfComputers, numberOfMadComputers, numberOfStones);
    }


}

