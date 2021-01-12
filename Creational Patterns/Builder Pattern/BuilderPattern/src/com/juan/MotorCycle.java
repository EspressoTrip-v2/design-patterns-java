package com.juan;

public class MotorCycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlight added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
