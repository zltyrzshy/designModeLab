package org.shan.lab3.mode1.shape;

public class Triangle extends Shape {
    private double a, b;

    @Override
    public void draw() {
        System.out.println("draw a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase a Triangle");
    }
}
