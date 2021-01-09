package com.juan;

public class Square implements ShapeInterface, ManageShapeInterface{
    @Override
    public double calculate() {
        return this.area();
    }
    @Override
    public double area() {
        return 2.0;
    }
}
