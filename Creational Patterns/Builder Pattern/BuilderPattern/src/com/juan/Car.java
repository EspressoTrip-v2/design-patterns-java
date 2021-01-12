package com.juan;

public class Car implements BuilderInterface{
    private CompletedProduct completedProduct = new CompletedProduct();

    @Override
    public void buildBody() {
        completedProduct.add("This is a body of a Car");
    }

    @Override
    public void insertWheels() {
        completedProduct.add("4 wheels added");
    }

    @Override
    public void addHeadLights() {
        completedProduct.add("2 headlights added");
    }

    @Override
    public CompletedProduct getVehicle() {
        return completedProduct;
    }
}
