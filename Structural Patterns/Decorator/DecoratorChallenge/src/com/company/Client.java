package com.company;

import com.company.decorators.GreenShapeDecorator;
import com.company.decorators.RedShapeDecorator;
import com.company.decorators.ShapeDecorator;

public class Client {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        rectangle.draw();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        redRectangle.draw();
        rectangle.draw();
        ShapeDecorator greenRectangle = new GreenShapeDecorator(rectangle);
        greenRectangle.draw();

        Shape circle = new Circle();
        circle.draw();
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        redCircle.draw();
        circle.draw();
        ShapeDecorator greenCircle = new GreenShapeDecorator(circle);
        greenCircle.draw();
    }
}
