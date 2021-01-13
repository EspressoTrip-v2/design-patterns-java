package com.company;

public class Triangle extends Shape {
    public Triangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Triangle colored with: " + color.fillWithColor(border));
    }
}
