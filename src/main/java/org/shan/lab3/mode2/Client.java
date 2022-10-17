package org.shan.lab3.mode2;

import org.shan.lab3.mode2.car.FormulaCar;
import org.shan.lab3.mode2.car.TrackCar;
import org.shan.lab3.mode2.car.TruckCar;

public class Client {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        Director director = null;
        switch (args[0]) {
            case "Formula":
                director = new Director(new FormulaCar());
                break;
            case "Track":
                director = new Director(new TrackCar());
                break;
            case "Truck":
                director = new Director(new TruckCar());
                break;
            default:
                usage();
                System.exit(0);
        }

        System.out.println(director.construct());
    }

    public static void usage() {
        System.out.println("Usage: java Main Formula");
        System.out.println("Usage: java Main Track");
        System.out.println("Usage: java Main Truck");
    }
}
