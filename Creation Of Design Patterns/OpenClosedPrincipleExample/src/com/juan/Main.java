package com.juan;

public class Main {
    public static void main(String[] args) {
        Shape ns1 = new Rectangle(100,150);
        Shape ns2 = new Circle(14);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateShapeArea(ns1));
        System.out.println(calculator.calculateShapeArea(ns2));


    }
}
