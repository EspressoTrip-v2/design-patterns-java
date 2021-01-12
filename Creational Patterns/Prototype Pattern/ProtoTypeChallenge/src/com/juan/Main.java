package com.juan;

public class Main {

    public static void main(String[] args) {
	CarCache.createCarCache();
	BasicCar ford = CarCache.getCar("Ford");
        System.out.println("**** Ford Copy ***");
        System.out.println("Copied car is a " + ford.getModelName() + " its price is: $" + ford.getPrice());
        System.out.println();

        BasicCar nano = CarCache.getCar("Nano");
        System.out.println("**** Nano Copy ***");
        System.out.println("Copied car is a " + nano.getModelName() + " its price is: $" + nano.getPrice());
    }
}
