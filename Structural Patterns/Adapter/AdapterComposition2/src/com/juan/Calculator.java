package com.juan;

public class Calculator implements CalculatorInterface {
    Rectangle newRectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        newRectangle = rectangle;
        return rectangle.width * rectangle.height;
    }
}
