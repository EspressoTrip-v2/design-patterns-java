package com.juan;

public class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a Car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
