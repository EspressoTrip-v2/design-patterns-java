package com.company;

public class Rectangle extends Shape{
    public Rectangle(IColor color) {
        super(color);
    }
    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle colored with: " + color.fillWithColor(border));
    }
}
