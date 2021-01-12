package com.juan;

import java.util.Hashtable;

public class CarCache {
    protected static Hashtable<String, BasicCar> carList = new Hashtable<>();

    public static void createCarCache() {
        BasicCar ford = new Ford();
        carList.put(ford.getModelName(), ford);

        BasicCar nano = new Nano();
        carList.put(nano.getModelName(), nano);
    }

    public static BasicCar getCar(String name) {
        BasicCar car = carList.get(name);
        return (BasicCar) car.clone();
    }
}
