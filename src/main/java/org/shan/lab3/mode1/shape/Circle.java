package org.shan.lab3.mode1.shape;

public class Circle extends Shape {

    private double radius = 10;

    @Override
    public void draw() {
        System.out.println("draw a Circle radius=" + radius);
    }

    @Override
    public void erase() {
        System.out.println("erase a Circle radius=" + radius);
    }
}
