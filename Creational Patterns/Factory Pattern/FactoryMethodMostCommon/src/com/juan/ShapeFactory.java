package com.juan;

import java.util.Locale;

public class ShapeFactory {
    public Shape getShape(String shape) {
        switch (shape.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
