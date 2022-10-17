package org.shan.lab3.mode2.car;

public class TrackCar extends CarRace {
    @Override
    public void makeBody() {
        car += "TrackBody\n";
    }

    @Override
    public void makeEngine() {
        car += "TrackEngine\n";
    }

    @Override
    public void makeTyre() {
        car += "TrackTyre\n";
    }
}
