package org.shan.lab2.mode5.way1;

public class VirtualUserGenerator {
    public static VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();

    private VirtualUserGenerator() {

    }

    public static VirtualUserGenerator getInstance() {
        return virtualUserGenerator;
    }
}
