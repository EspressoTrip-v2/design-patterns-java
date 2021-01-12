package com.juan;

public class FactoryPatternDemo {
    public static void main(String[] args){
        // Create Factory
        ShapeFactory factory = new ShapeFactory();
        // Circle
        Shape shape1 = factory.getShape("Circle");
        shape1.draw();
        // Rectangle
        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
        // Square
        Shape shape3 = factory.getShape("Square");
        shape3.draw();

    }
}
