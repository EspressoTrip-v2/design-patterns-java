package com.juan;

public abstract class BasicCar implements Cloneable {
     protected String modelName;
     protected float price = 5000;

    public abstract void carSound();

    public abstract void accelerate();

    public abstract void brake();

    public String getModelName() {
        return modelName;
    }

    public String getPrice() {
        return String.format("%.2f",price);
    }

    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
