package org.shan.lab3.mode1;

import org.shan.lab3.mode1.shape.*;

public class Factory {

    public static Shape createShape(String shapeName) throws UnSupportedShapeException {
        switch (shapeName) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Triangle":
                return new Triangle();
            default:
                throw new UnSupportedShapeException();
        }
    }

}

