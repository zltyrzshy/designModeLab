package org.shan.lab3.mode2.car;

public class TruckCar extends CarRace {
    @Override
    public void makeBody() {
        car += "TruckBody\n";
    }

    @Override
    public void makeEngine() {
        car += "TruckEngine\n";
    }

    @Override
    public void makeTyre() {
        car += "TruckTyre\n";
    }
}
