package com.juan;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Adapter Pattern Demo ***");
        Triangle t = new Triangle(20, 10);
        Rectangle r = new Rectangle();

        CalculatorInterface adapter = new CalculatorAdapter(t);
        System.out.println("Area of the triangle is: ");
        System.out.println(adapter.getArea(null));

    }
}
