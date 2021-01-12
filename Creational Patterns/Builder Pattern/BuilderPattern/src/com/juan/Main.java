package com.juan;

public class Main {

    public static void main(String[] args) {
        System.out.println("**** Builder Pattern ****");
        // Create Director
        Director director = new Director();

        // Concrete Builders
        BuilderInterface carBuilder = new Car();
        BuilderInterface mcBuilder = new MotorCycle();

        System.out.print("**** New Car ****");
        // Build car with the director
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();
        System.out.println();

        System.out.print("**** New Motorcycle ****");
        // Build motorcycle with director
        director.construct(mcBuilder);
        Product p2 = mcBuilder.getVehicle();
        p2.show();

    }
}
