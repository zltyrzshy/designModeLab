package org.shan.lab3.mode2.car;

public abstract class CarRace {
    protected String car = "";

    public abstract void makeBody();

    public abstract void makeEngine();

    public abstract void makeTyre();

    public String getResult() {
        return car;
    }
}
