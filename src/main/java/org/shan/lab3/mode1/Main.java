package org.shan.lab3.mode1;

import org.shan.lab3.mode1.shape.Shape;
import org.shan.lab3.mode1.shape.UnSupportedShapeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("input your shape name");
            String shapeName = scanner.next();
            try {
                Shape shape = Factory.createShape(shapeName);
                shape.draw();
                shape.erase();
            } catch (UnSupportedShapeException e) {
                System.out.println("shape not support");
            }
        }
    }
}
