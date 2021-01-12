package com.company;

public class Main {

    public static void main(String[] args) {
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("*** Class Adapter and Object Adapter Demo ***");
        System.out.println("Class Adapter is returning: " + ca1.getInteger());
        System.out.println("");
        ObjectAdapter obj1 = new ObjectAdapter(new IntergerValue());
        System.out.println("Object Adapter is returning: " + obj1.getInteger());

    }
}
