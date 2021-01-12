package com.juan;

public class MotorCycle implements BuilderInterface {
    private CompletedProduct completedProduct = new CompletedProduct();

    @Override
    public void buildBody() {
        completedProduct.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        completedProduct.add("2 wheels added");
    }

    @Override
    public void addHeadLights() {
        completedProduct.add("1 headlight added");
    }

    @Override
    public CompletedProduct getVehicle() {
        return completedProduct;
    }
}
