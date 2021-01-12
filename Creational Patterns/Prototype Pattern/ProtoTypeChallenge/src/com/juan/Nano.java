package com.juan;

public class Nano extends BasicCar{
    public Nano() {
        modelName = "Nano";
        price = 1500;
    }

    @Override
    public void carSound() {
        System.out.println("Zoom...");
    }

    @Override
    public void accelerate() {
        System.out.println(modelName + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(modelName + " is accelerating");
    }
}
