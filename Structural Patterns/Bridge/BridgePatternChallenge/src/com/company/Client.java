package com.company;

import javax.print.attribute.standard.SheetCollate;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Bridge Pattern Demo ***");

        System.out.println("Create Rectangle:");
        Shape rectangle = new Rectangle(new RedColor());
        rectangle.drawShape(20);
        System.out.println("--- Change rectangle border ---");
        rectangle.modifyBorder(30);

        System.out.println("\nCreate Triangle:");
        Shape triangle = new Triangle(new GreenColor());
        triangle.drawShape(40);
        System.out.println("---- Change triangle border ---");
        triangle.modifyBorder(60);
    }
}
