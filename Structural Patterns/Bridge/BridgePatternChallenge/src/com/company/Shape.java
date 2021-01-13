package com.company;

abstract public class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    abstract void drawShape(int border);

    protected void modifyBorder(int border) {
        color.fillWithColor(border);
        drawShape(border);
    }
}
