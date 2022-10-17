package org.shan.lab3.mode2;

import lombok.AllArgsConstructor;
import org.shan.lab3.mode2.car.CarRace;

@AllArgsConstructor
public class Director {
    private CarRace carRace;

    public String construct() {
        carRace.makeBody();
        carRace.makeEngine();
        carRace.makeTyre();
        return carRace.getResult();
    }

}
