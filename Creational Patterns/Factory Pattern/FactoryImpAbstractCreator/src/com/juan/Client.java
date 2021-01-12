package com.juan;

public class Client {

    public static void main(String[] args) {
        // Circle Factory
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        // Square Factory
        Shape shape2 = new SquareFactory().getShape();
        shape2.draw();

        // Rectangle Factory
        Shape shape3 = new RectangleFactory().getShape();
        shape3.draw();
    }
}
