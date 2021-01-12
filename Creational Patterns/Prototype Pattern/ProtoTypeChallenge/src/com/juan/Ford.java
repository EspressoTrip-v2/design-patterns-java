package com.juan;

public class Ford extends BasicCar{
    public Ford() {
        modelName = "Ford";
        price = 2500;
    }

    @Override
    public void carSound() {
        System.out.println("Vroom...");
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
